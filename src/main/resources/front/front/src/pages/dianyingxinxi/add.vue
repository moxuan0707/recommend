<template>
<div :style='{"padding":"20px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"20px auto 30px","borderRadius":"20px","background":"#fff","width":"1100px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影名称" prop="dianyingmingcheng">
            <el-input v-model="ruleForm.dianyingmingcheng" 
                placeholder="电影名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="电影类型" prop="dianyingleixing">
            <el-select v-model="ruleForm.dianyingleixing" placeholder="请选择电影类型" >
              <el-option
                  v-for="(item,index) in dianyingleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="上映年份" prop="shangyingnianfen">
            <el-input v-model="ruleForm.shangyingnianfen" 
                placeholder="上映年份" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="上映日期" prop="shangyingriqi" >
              <el-date-picker
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.shangyingriqi" 
                  type="date"
                  placeholder="上映日期">
              </el-date-picker> 
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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影时长" prop="dianyingshizhang">
            <el-input v-model="ruleForm.dianyingshizhang" 
                placeholder="电影时长" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影主演" prop="dianyingzhuyan">
            <el-input v-model="ruleForm.dianyingzhuyan" 
                placeholder="电影主演" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影导演" prop="dianyingdaoyan">
            <el-input v-model="ruleForm.dianyingdaoyan" 
                placeholder="电影导演" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="上映地区" prop="shangyingdiqu">
            <el-input v-model="ruleForm.shangyingdiqu" 
                placeholder="上映地区" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="电影详情" prop="dianyingxiangqing">
            <editor 
                :style='{"padding":"0","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.dianyingxiangqing" 
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
            dianyingmingcheng : false,
            dianyingleixing : false,
            dianyingfengmian : false,
            shangyingnianfen : false,
            shangyingriqi : false,
            dianyingpianduan : false,
            dianyingshizhang : false,
            dianyingzhuyan : false,
            dianyingdaoyan : false,
            shangyingdiqu : false,
            dianyingxiangqing : false,
            thumbsupnum : false,
            crazilynum : false,
            clicktime : false,
            clicknum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          dianyingmingcheng: '',
          dianyingleixing: '',
          dianyingfengmian: '',
          shangyingnianfen: '',
          shangyingriqi: '',
          dianyingpianduan: '',
          dianyingshizhang: '',
          dianyingzhuyan: '',
          dianyingdaoyan: '',
          shangyingdiqu: '',
          dianyingxiangqing: '',
        },
        dianyingleixingOptions: [],
        rules: {
          dianyingmingcheng: [
          ],
          dianyingleixing: [
          ],
          dianyingfengmian: [
          ],
          shangyingnianfen: [
          ],
          shangyingriqi: [
          ],
          dianyingpianduan: [
          ],
          dianyingshizhang: [
          ],
          dianyingzhuyan: [
          ],
          dianyingdaoyan: [
          ],
          shangyingdiqu: [
          ],
          dianyingxiangqing: [
          ],
          thumbsupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          crazilynum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          clicktime: [
          ],
          clicknum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
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
            if(o=='shangyingnianfen'){
              this.ruleForm.shangyingnianfen = obj[o];
              this.ro.shangyingnianfen = true;
              continue;
            }
            if(o=='shangyingriqi'){
              this.ruleForm.shangyingriqi = obj[o];
              this.ro.shangyingriqi = true;
              continue;
            }
            if(o=='dianyingpianduan'){
              this.ruleForm.dianyingpianduan = obj[o];
              this.ro.dianyingpianduan = true;
              continue;
            }
            if(o=='dianyingshizhang'){
              this.ruleForm.dianyingshizhang = obj[o];
              this.ro.dianyingshizhang = true;
              continue;
            }
            if(o=='dianyingzhuyan'){
              this.ruleForm.dianyingzhuyan = obj[o];
              this.ro.dianyingzhuyan = true;
              continue;
            }
            if(o=='dianyingdaoyan'){
              this.ruleForm.dianyingdaoyan = obj[o];
              this.ro.dianyingdaoyan = true;
              continue;
            }
            if(o=='shangyingdiqu'){
              this.ruleForm.shangyingdiqu = obj[o];
              this.ro.shangyingdiqu = true;
              continue;
            }
            if(o=='dianyingxiangqing'){
              this.ruleForm.dianyingxiangqing = obj[o];
              this.ro.dianyingxiangqing = true;
              continue;
            }
            if(o=='thumbsupnum'){
              this.ruleForm.thumbsupnum = obj[o];
              this.ro.thumbsupnum = true;
              continue;
            }
            if(o=='crazilynum'){
              this.ruleForm.crazilynum = obj[o];
              this.ro.crazilynum = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='clicknum'){
              this.ruleForm.clicknum = obj[o];
              this.ro.clicknum = true;

            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/dianyingleixing/dianyingleixing', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.dianyingleixingOptions = res.data.data;
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('dianyingxinxi/detail/${id}', {emulateJSON: true}).then(res => {
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
                 this.$http.get('dianyingxinxi/list', {
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


                          this.$http.post('dianyingxinxi/add', this.ruleForm).then(res => {
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


                  this.$http.post('dianyingxinxi/add', this.ruleForm).then(res => {
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
