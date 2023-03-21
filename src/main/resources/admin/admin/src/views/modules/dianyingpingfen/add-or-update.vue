<template>
	<div class="addEdit-block" style="width: 100%;">
		<el-form
			:style='{"padding":"35px 15px","boxShadow":"0 0px 0px #999","borderRadius":"0px","flexWrap":"wrap","background":"rgba(255,255,255,.3)","display":"flex","justifyContent":"space-between"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="120px"
		>
			<template >
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="电影名称" prop="dianyingmingcheng">
					<el-input v-model="ruleForm.dianyingmingcheng" placeholder="电影名称" clearable  :readonly="ro.dianyingmingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-else class="input" label="电影名称" prop="dianyingmingcheng">
					<el-input v-model="ruleForm.dianyingmingcheng" placeholder="电影名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="电影类型" prop="dianyingleixing">
					<el-input v-model="ruleForm.dianyingleixing" placeholder="电影类型" clearable  :readonly="ro.dianyingleixing"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-else class="input" label="电影类型" prop="dianyingleixing">
					<el-input v-model="ruleForm.dianyingleixing" placeholder="电影类型" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="select" v-if="type!='info'"  label="电影评分" prop="dianyingpingfen">
					<el-select :disabled="ro.dianyingpingfen" v-model="ruleForm.dianyingpingfen" placeholder="请选择电影评分" >
						<el-option
							v-for="(item,index) in dianyingpingfenOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-else class="input" label="电影评分" prop="dianyingpingfen">
					<el-input v-model="ruleForm.dianyingpingfen"
						placeholder="电影评分" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="date" v-if="type!='info'" label="评分日期" prop="pingfenriqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.pingfenriqi" 
						type="date"
						:readonly="ro.pingfenriqi"
						placeholder="评分日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="input" v-else-if="ruleForm.pingfenriqi" label="评分日期" prop="pingfenriqi">
					<el-input v-model="ruleForm.pingfenriqi" placeholder="评分日期" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="upload" v-if="type!='info' && !ro.dianyingfengmian" label="电影封面" prop="dianyingfengmian">
					<file-upload
						tip="点击上传电影封面"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.dianyingfengmian?ruleForm.dianyingfengmian:''"
						@change="dianyingfengmianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="upload" v-else-if="ruleForm.dianyingfengmian" label="电影封面" prop="dianyingfengmian">
					<img v-if="ruleForm.dianyingfengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.dianyingfengmian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.dianyingfengmian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-else class="input" label="用户账号" prop="yonghuzhanghao">
					<el-input v-model="ruleForm.yonghuzhanghao" placeholder="用户账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-else class="input" label="用户姓名" prop="yonghuxingming">
					<el-input v-model="ruleForm.yonghuxingming" placeholder="用户姓名" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-if="type!='info'"  label="评分内容" prop="pingfenneirong">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.pingfenneirong" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"margin":"0 0 30px 0","flexWrap":"wrap","textAlign":"left","background":"none","display":"block","width":"100%","float":"left","justifyContent":"flex-start"}' v-else-if="ruleForm.pingfenneirong" label="评分内容" prop="pingfenneirong">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"#fff","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.pingfenneirong"></span>
                </el-form-item>
			<el-form-item :style='{"width":"100%","padding":"0","margin":"20px 0"}' class="btn">
				<el-button :style='{"cursor":"pointer","padding":"0 34px","margin":"0 20px 0 0","borderColor":"#1fbfae","color":"#1fbfae","outline":"none","borderRadius":"20px","background":"#e9faf8","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}'  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 34px","margin":"0","borderColor":"#dc333b","color":"#dc333b","outline":"none","borderRadius":"20px","background":"#fbeced","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}' v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
				<el-button :style='{"cursor":"pointer","padding":"0 34px","margin":"0","borderColor":"#dc333b","color":"#dc333b","outline":"none","borderRadius":"20px","background":"#fbeced","borderWidth":"4px","width":"auto","lineHeight":"40px","fontSize":"14px","borderStyle":"solid double solid double","height":"44px"}' v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				dianyingmingcheng : false,
				dianyingleixing : false,
				dianyingpingfen : false,
				pingfenriqi : false,
				dianyingfengmian : false,
				pingfenneirong : false,
				yonghuzhanghao : false,
				yonghuxingming : false,
			},
			
			
			ruleForm: {
				dianyingmingcheng: '',
				dianyingleixing: '',
				dianyingpingfen: '',
				pingfenriqi: '',
				dianyingfengmian: '',
				pingfenneirong: '',
				yonghuzhanghao: '',
				yonghuxingming: '',
			},
		
			dianyingpingfenOptions: [],
			
			rules: {
				dianyingmingcheng: [
				],
				dianyingleixing: [
				],
				dianyingpingfen: [
				],
				pingfenriqi: [
				],
				dianyingfengmian: [
				],
				pingfenneirong: [
				],
				yonghuzhanghao: [
				],
				yonghuxingming: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
	created() {
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
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
						if(o=='dianyingpingfen'){
							this.ruleForm.dianyingpingfen = obj[o];
							this.ro.dianyingpingfen = true;
							continue;
						}
						if(o=='pingfenriqi'){
							this.ruleForm.pingfenriqi = obj[o];
							this.ro.pingfenriqi = true;
							continue;
						}
						if(o=='dianyingfengmian'){
							this.ruleForm.dianyingfengmian = obj[o];
							this.ro.dianyingfengmian = true;
							continue;
						}
						if(o=='pingfenneirong'){
							this.ruleForm.pingfenneirong = obj[o];
							this.ro.pingfenneirong = true;
							continue;
						}
						if(o=='yonghuzhanghao'){
							this.ruleForm.yonghuzhanghao = obj[o];
							this.ro.yonghuzhanghao = true;
							continue;
						}
						if(o=='yonghuxingming'){
							this.ruleForm.yonghuxingming = obj[o];
							this.ro.yonghuxingming = true;

						}
				}
				








			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(json.yonghuzhanghao!=''&&json.yonghuzhanghao && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
						this.ro.yonghuzhanghao = true;
					}
					if(json.yonghuxingming!=''&&json.yonghuxingming && this.$storage.get("role")!="管理员"){
						this.ruleForm.yonghuxingming = json.yonghuxingming
						this.ro.yonghuxingming = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.dianyingpingfenOptions = "9.1,9.2,9.3,9.4,9.5,9.6,9.7,9.8,9.9".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `dianyingpingfen/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.pingfenneirong = this.ruleForm.pingfenneirong.replace(reg,'../../../springbootl07f8/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {










	if(this.ruleForm.dianyingfengmian!=null) {
		this.ruleForm.dianyingfengmian = this.ruleForm.dianyingfengmian.replace(new RegExp(this.$base.url,"g"),"");
	}







var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "dianyingpingfen/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `dianyingpingfen/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.dianyingpingfenCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `dianyingpingfen/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.dianyingpingfenCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
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
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.dianyingpingfenCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    dianyingfengmianUploadChange(fileUrls) {
	    this.ruleForm.dianyingfengmian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  overflow: hidden;
	  	  text-shadow: 0 0px 0px #fff;
	  	  color: #fff;
	  	  background: none;
	  	  font-weight: 500;
	  	  display: block;
	  	  width: 120px;
	  	  clear: both;
	  	  font-size: 14px;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  padding: 0 12px;
	  	  color: #666;
	  	  clear: both;
	  	  font-size: 14px;
	  	  border-color: #366280;
	  	  border-radius: 20px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  overflow: hidden;
	  	  background: rgba(255,255,255,.9);
	  	  width: 360px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  min-width: 300px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  padding: 0 10px;
	  	  color: #666;
	  	  font-size: 14px;
	  	  border-color: #366280;
	  	  border-radius: 20px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  background: rgba(255,255,255,.9);
	  	  width: 360px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  min-width: 200px;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 0px solid #333;
	  	  padding: 0 10px 0 30px;
	  	  color: #666;
	  	  font-size: 14px;
	  	  border-color: #366280;
	  	  border-radius: 20px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  background: rgba(255,255,255,.9);
	  	  width: 360px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  min-width: 200px;
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
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  color: #366280;
	  	  font-size: 32px;
	  	  border-color: #366280;
	  	  line-height: 90px;
	  	  border-radius: 20px;
	  	  background: rgba(255,255,255,.9);
	  	  width: 200px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  color: #366280;
	  	  font-size: 32px;
	  	  border-color: #366280;
	  	  line-height: 90px;
	  	  border-radius: 20px;
	  	  background: rgba(255,255,255,.9);
	  	  width: 200px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 2px solid #ddd;
	  	  cursor: pointer;
	  	  color: #366280;
	  	  font-size: 32px;
	  	  border-color: #366280;
	  	  line-height: 90px;
	  	  border-radius: 20px;
	  	  background: rgba(255,255,255,.9);
	  	  width: 200px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  text-align: center;
	  	  height: 100px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  padding: 12px;
	  	  color: #666;
	  	  font-size: 14px;
	  	  border-color: #366280;
	  	  min-height: 150px;
	  	  border-radius: 20px;
	  	  box-shadow: 0 0 0px #4b681d;
	  	  outline: none;
	  	  background: rgba(255,255,255,.9);
	  	  width: 450px;
	  	  border-width: 4px;
	  	  border-style: solid double solid double;
	  	  min-width: 200px;
	  	  height: auto;
	  	}
</style>
