<template>
<div :style='{"padding":"20px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"20px auto 30px","borderRadius":"20px","background":"#fff","width":"1100px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="排名" prop="paiming">
            <el-input v-model="ruleForm.paiming" 
                placeholder="排名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影名称" prop="dianyingmingcheng">
            <el-select  @change="dianyingmingchengChange" v-model="ruleForm.dianyingmingcheng" placeholder="请选择电影名称">
              <el-option
                  v-for="(item,index) in dianyingmingchengOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影类型" prop="dianyingleixing">
            <el-input v-model="ruleForm.dianyingleixing" 
                placeholder="电影类型" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影封面" v-if="type!='cross' || (type=='cross' && !ro.dianyingfengmian)" prop="dianyingfengmian">
            <file-upload
            tip="点击上传电影封面"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.dianyingfengmian?ruleForm.dianyingfengmian:''"
            @change="dianyingfengmianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' class="upload" v-else label="电影封面" prop="dianyingfengmian">
                <img v-if="ruleForm.dianyingfengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.dianyingfengmian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.dianyingfengmian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影片段" prop="dianyingpianduan">
            <file-upload
            tip="点击上传电影片段"
            action="file/upload"
            :limit="1"
            :multiple="true"
            :fileUrls="ruleForm.dianyingpianduan?ruleForm.dianyingpianduan:''"
            @change="dianyingpianduanUploadChange"
            ></file-upload>
          </el-form-item> 
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="点赞量" prop="dianzanliang">
            <el-input v-model="ruleForm.dianzanliang" 
                placeholder="点赞量" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="收藏量" prop="shouzangliang">
            <el-input v-model="ruleForm.shouzangliang" 
                placeholder="收藏量" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="评分平均分" prop="pingfenpingjunfen">
            <el-input v-model="ruleForm.pingfenpingjunfen" 
                placeholder="评分平均分" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影内容" prop="dianyingneirong">
            <editor 
                :style='{"padding":"0","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.dianyingneirong" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"rgba(67, 144, 165, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid rgba(67, 144, 165, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"rgba(67, 144, 165, 1)","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            paiming : false,
            dianyingmingcheng : false,
            dianyingleixing : false,
            dianyingfengmian : false,
            dianyingpianduan : false,
            dianzanliang : false,
            shouzangliang : false,
            pingfenpingjunfen : false,
            dianyingneirong : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          paiming: '',
          dianyingmingcheng: '',
          dianyingleixing: '',
          dianyingfengmian: '',
          dianyingpianduan: '',
          dianzanliang: '',
          shouzangliang: '',
          pingfenpingjunfen: '',
          dianyingneirong: '',
        },
        dianyingmingchengOptions: [],
        rules: {
          paiming: [
          ],
          dianyingmingcheng: [
          ],
          dianyingleixing: [
          ],
          dianyingfengmian: [
          ],
          dianyingpianduan: [
          ],
          dianzanliang: [
          ],
          shouzangliang: [
          ],
          pingfenpingjunfen: [
          ],
          dianyingneirong: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='paiming'){
              this.ruleForm.paiming = obj[o];
              this.ro.paiming = true;
              continue;
            }
            if(o=='dianyingmingcheng'){
              this.ruleForm.dianyingmingcheng = obj[o];
              this.ro.dianyingmingcheng = true;
              continue;
            }
            if(o=='dianyingleixing'){
              this.ruleForm.dianyingleixing = obj[o];
              this.ro.dianyingleixing = true;
              continue;
            }
            if(o=='dianyingfengmian'){
              this.ruleForm.dianyingfengmian = obj[o].split(",")[0];
              this.ro.dianyingfengmian = true;
              continue;
            }
            if(o=='dianyingpianduan'){
              this.ruleForm.dianyingpianduan = obj[o];
              this.ro.dianyingpianduan = true;
              continue;
            }
            if(o=='dianzanliang'){
              this.ruleForm.dianzanliang = obj[o];
              this.ro.dianzanliang = true;
              continue;
            }
            if(o=='shouzangliang'){
              this.ruleForm.shouzangliang = obj[o];
              this.ro.shouzangliang = true;
              continue;
            }
            if(o=='pingfenpingjunfen'){
              this.ruleForm.pingfenpingjunfen = obj[o];
              this.ro.pingfenpingjunfen = true;
              continue;
            }
            if(o=='dianyingneirong'){
              this.ruleForm.dianyingneirong = obj[o];
              this.ro.dianyingneirong = true;

            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/dianyingxinxi/dianyingmingcheng', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.dianyingmingchengOptions = res.data.data;
          }
        });
      },
      // 下二随
      dianyingmingchengChange () {
        this.$http.get('follow/dianyingxinxi/dianyingmingcheng?columnValue=' + this.ruleForm.dianyingmingcheng, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            if(res.data.data.dianyingleixing){
              this.ruleForm.dianyingleixing = res.data.data.dianyingleixing
            }
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('dianyingtuijian/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('dianyingtuijian/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('dianyingtuijian/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('dianyingtuijian/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      dianyingfengmianUploadChange(fileUrls) {
          this.ruleForm.dianyingfengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      dianyingpianduanUploadChange(fileUrls) {
          this.ruleForm.dianyingpianduan = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 12px;
	  box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.302);
	  outline: none;
	  color: #333;
	  width: 300px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 10px;
	  box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.302);
	  outline: none;
	  color: #333;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.302);
	  outline: none;
	  color: #333;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #666;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #666;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #666;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #666;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #666;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #666;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 0;
	  border-radius: 4px;
	  padding: 12px;
	  box-shadow: 0px 4px 10px 0px rgba(0,0,0,0.302);
	  outline: none;
	  color: #333;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
