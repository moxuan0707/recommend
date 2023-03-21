<template>
<div class="home-preview" :style='{"width":"100%","margin":"10px auto"}'>

	<div class="recommend" :style='{"padding":"10px 0","margin":"10px 0 10px","backgroundSize":"100% 100%","backgroundImage":"url(http://codegen.caihongy.cn/20220914/11e43848ddb044afa556a24b7d7ceb58.png)","height":"1170px"}'>
		<div v-if="true" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'>
				<!-- <marquee id="scrollArea" :style='{"lineHeight":"80px","textAlign":"center","height":"80px","color":"#2B65EC","font-size":"30px","font-family": "STKaiti"}' loop="-1" scrollamount="1" scrolldelay="50" direction="left" onMouseOver=scrollArea.stop() onMouseOut=scrollArea.start() behavior=scroll>个性化电影推荐网站</marquee>  -->
			</div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'>
				<!-- <marquee id="scrollArea" :style='{"lineHeight":"80px","textAlign":"center","height":"80px","color":"#2B65EC","font-size":"30px","font-family": "STKaiti"}' loop="-1" scrollamount="1" scrolldelay="50" direction="left" onMouseOver=scrollArea.stop() onMouseOut=scrollArea.start()>个性化电影推荐网站</marquee>  -->
			</div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'>
				<!-- <marquee id="scrollArea" :style='{"lineHeight":"80px","textAlign":"center","height":"80px","color":"#2B65EC","font-size":"30px","font-family": "STKaiti"}' loop="-1" scrollamount="1" scrolldelay="50" direction="left" onMouseOver=scrollArea.stop() onMouseOut=scrollArea.start()>个性化电影推荐网站</marquee>  -->
			</div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'>
				<!-- <marquee id="scrollArea" :style='{"lineHeight":"80px","textAlign":"center","height":"80px","color":"#2B65EC","font-size":"30px","font-family": "STKaiti"}' loop="-1" scrollamount="1" scrolldelay="50" direction="left" onMouseOver=scrollArea.stop() onMouseOut=scrollArea.start()>个性化电影推荐网站</marquee>  -->
			</div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>

		<div class="title" :style='{"width":"200px","margin":"10px auto","lineHeight":"54px","textAlign":"center"}'>
			<span :style='{"color":"#000","fontSize":"30px","fontWeight":"600"}'>电影信息推荐</span>
		</div>
 
	<!-- 样式七 -->
	<div class="list list7 index-pv1" :style='{"width":"100%","padding":"10px 180px","position":"relative","display":"flex","height":"88%"}'>
		<div :style='{"width":"1200px","position":"absolute","top":"10px","display":"flex","height":"250px"}' class="list-body">
			<div v-if="dianyingxinxiRecommend.length>0" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[0])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px","overflow":"hidden","borderRadius":"15px","background":"#fff","width":"400px","position":"relative","height":"400px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-if="dianyingxinxiRecommend[0].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[0].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[1].dianyingfengmian?dianyingxinxiRecommend[0].dianyingfengmian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"overflow":"hidden","color":"#000","padding":"15px","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"18px","height":"25%"}'>
				<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;">电影名称:{{dianyingxinxiRecommend[0].dianyingmingcheng}}</div>
				<div>电影类型:{{dianyingxinxiRecommend[0].dianyingleixing}}</div>
			</div>
			</div>
			 <div v-if="dianyingxinxiRecommend.length>1" class="list-item animation-box" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[1])" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","top":"100px","margin":"0 10px","overflow":"hidden","borderRadius":"15px","background":"#fff","width":"400px","position":"relative","height":"400px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-if="dianyingxinxiRecommend[1].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[1].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[1].dianyingfengmian?dianyingxinxiRecommend[1].dianyingfengmian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"overflow":"hidden","color":"#000","padding":"15px","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"18px","height":"25%"}'>
  				<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;">电影名称:{{dianyingxinxiRecommend[1].dianyingmingcheng}}</div>
 				<div>电影类型:{{dianyingxinxiRecommend[1].dianyingleixing}}</div>
			</div>
			</div>
			<div v-if="dianyingxinxiRecommend.length>2" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[2])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px","overflow":"hidden","borderRadius":"15px","background":"#fff","width":"400px","position":"relative","height":"400px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-if="dianyingxinxiRecommend[2].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[2].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-else :src="baseUrl +  (dianyingxinxiRecommend[2].dianyingfengmian?dianyingxinxiRecommend[2].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"overflow":"hidden","color":"#000","padding":"15px","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"18px","height":"25%"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;">电影名称:{{dianyingxinxiRecommend[2].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[2].dianyingleixing}}</div>
				</div>
			</div>
		
			<div v-if="dianyingxinxiRecommend.length>3" class="list-item animation-box" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[3])" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","top":"100px","margin":"0 10px","overflow":"hidden","borderRadius":"15px","background":"#fff","width":"400px","position":"relative","height":"400px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-if="dianyingxinxiRecommend[3].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[3].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[3].dianyingfengmian?dianyingxinxiRecommend[3].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"overflow":"hidden","color":"#000","padding":"15px","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"18px","height":"25%"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;">电影名称:{{dianyingxinxiRecommend[3].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[3].dianyingleixing}}</div>
				</div>
			</div>
			<div v-if="dianyingxinxiRecommend.length>2" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[4])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"0 10px","overflow":"hidden","borderRadius":"15px","background":"#fff","width":"400px","position":"relative","height":"400px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-if="dianyingxinxiRecommend[4].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[4].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"15px","float":"left","height":"75%"}' v-else :src="baseUrl +  (dianyingxinxiRecommend[4].dianyingfengmian?dianyingxinxiRecommend[4].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="list-4-item-title line1" :style='{"overflow":"hidden","color":"#000","padding":"15px","textAlign":"center","width":"100%","lineHeight":"40px","fontSize":"18px","height":"25%"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;">电影名称:{{dianyingxinxiRecommend[4].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[4].dianyingleixing}}</div>
				</div>
			</div>
		</div>
		<div :style='{"margin":"0 10px","top":"250px","left":"180px","flexWrap":"wrap","display":"flex","width":"275px","position":"absolute","height":"275px"}' class="list-body">
			<div v-if="dianyingxinxiRecommend.length>5" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[5])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"15px","margin":"20px 0 0","overflow":"hidden","top":"260px","borderRadius":"15px","width":"550px","position":"absolute","height":"205px"}'>
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"left","height":"100%"}' v-if="dianyingxinxiRecommend[5].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[5].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"left","height":"100%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[5].dianyingfengmian?dianyingxinxiRecommend[5].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"overflow":"hidden","color":"#000","textAlign":"center","width":"55%","lineHeight":"80px","fontSize":"18px","height":"180px"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;" >电影名称:{{dianyingxinxiRecommend[5].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[5].dianyingleixing}}</div>
				</div>
			</div>
			<div v-if="dianyingxinxiRecommend.length>6" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[6])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"15px","margin":"20px 625px ","overflow":"hidden","top":"260px","borderRadius":"15px","width":"550px","position":"absolute","height":"205px"}'>
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"right","height":"100%"}' v-if="dianyingxinxiRecommend[6].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[6].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"right","height":"100%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[6].dianyingfengmian?dianyingxinxiRecommend[6].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"overflow":"hidden","color":"#000","textAlign":"center","width":"55%","lineHeight":"80px","fontSize":"18px","height":"180px"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;" >电影名称:{{dianyingxinxiRecommend[6].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[6].dianyingleixing}}</div>
				</div>
			</div>
			<div v-if="dianyingxinxiRecommend.length>7" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[7])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"15px","margin":"20px 0 0","overflow":"hidden","top":"480px","borderRadius":"15px","width":"550px","position":"absolute","height":"205px"}'>
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"left","height":"100%"}' v-if="dianyingxinxiRecommend[7].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[7].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"left","height":"100%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[7].dianyingfengmian?dianyingxinxiRecommend[7].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"overflow":"hidden","color":"#000","textAlign":"center","width":"55%","lineHeight":"80px","fontSize":"18px","height":"180px"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;" >电影名称:{{dianyingxinxiRecommend[7].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[7].dianyingleixing}}</div>
				</div>
			</div>
			<div v-if="dianyingxinxiRecommend.length>8" @click="toDetail('dianyingxinxiDetail', dianyingxinxiRecommend[8])" class="list-item animation-box" :style='{"boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","padding":"15px","margin":"20px 625px ","overflow":"hidden","top":"480px","borderRadius":"15px","width":"550px","position":"absolute","height":"205px"}'>
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"right","height":"100%"}' v-if="dianyingxinxiRecommend[8].dianyingfengmian.substr(0,4)=='http'" :src="dianyingxinxiRecommend[8].dianyingfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"40%","objectFit":"cover","borderRadius":"15px","float":"right","height":"100%"}' v-else :src="baseUrl + (dianyingxinxiRecommend[8].dianyingfengmian?dianyingxinxiRecommend[8].dianyingfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"overflow":"hidden","color":"#000","textAlign":"center","width":"55%","lineHeight":"80px","fontSize":"18px","height":"180px"}'>
					<div style="display:block;overflow:hidden;word-break:keep-all;white-space:nowrap;text-overflow:ellipsis;" >电影名称:{{dianyingxinxiRecommend[8].dianyingmingcheng}}</div>
					<div>电影类型:{{dianyingxinxiRecommend[8].dianyingleixing}}</div>
				</div>
			</div>
		</div>
	</div>
	
	<div @click="moreBtn('dianyingxinxi')" :style='{"border":"0","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"-10px auto","borderRadius":"10px","textAlign":"center","display":"block","width":"150px","lineHeight":"40px"}'>
		<span id="more" :style='{"color":"#000","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#000","fontSize":"14px"}' class="el-icon-d-arrow-right"></i>
	</div>

</div>
	<div class="news" :style='{"margin":"100px 0 10px","backgroundSize":"100% 100%","backgroundImage":"url(http://codegen.caihongy.cn/20220914/0863c54d16aa49d0881cd858052fb45d.png)","height":"940px"}'>
		<div v-if="true" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","backgroundImage":"url(http://codegen.caihongy.cn/20220914/3dcc11e098f843188d36a4ab92a938e7.png)","justifyContent":"space-between","display":"flex","height":"315px","background-size":"100%,100%"}'>
			<div class="box1" :style='{"width":"0","background":"#fff","height":"0"}'></div>
			<div class="box2" :style='{"width":"0","background":"#fff","height":"0"}'></div>
			<div class="box3" :style='{"width":"0","background":"#fff","height":"0"}'></div>
			<div class="box4" :style='{"width":"0","background":"#fff","height":"0"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>

		<div class="title" :style='{"border":"5px solid rgba(67, 144, 165, 1)","width":"200px","margin":"30px auto 20px","lineHeight":"54px","textAlign":"center","background":"#fff"}'>
			<span :style='{"color":"#000","fontSize":"30px"}'>公告信息</span>
		</div>

		<!-- 样式八 -->
		<div v-if="newsList.length" class="list list8 index-pv1" :style='{"width":"100%","padding":"10px 230px","flexWrap":"wrap","display":"flex","height":"auto"}'>
			<div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" :style='{"padding":"10px","margin":"0 90px 10px 15px","borderRadius":"10px","background":"rgba(216, 216, 216, 1)","display":"flex","width":"465px","position":"relative","height":"168px"}' class="list-item animation-box">
				<div :style='{"width":"400px","padding":"10px","height":"auto"}'>
				<div :style='{"margin":"0 0 0 60px","fontSize":"16px","lineHeight":"28px","overflow":"hidden","color":"#000","height":"28px"}'>{{newsList[0].title}}</div>
				<div :style='{"margin":"0 0 0 60px","fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","height":"100px"}'>{{newsList[0].introduction}}</div>
				<div :style='{"color":"#fff","alignItems":"center","textAlign":"center","display":"flex","top":"0","borderRadius":"15px","left":"0","flexWrap":"wrap","background":"rgba(67, 144, 165, 1)","width":"70px","fontSize":"12px","lineHeight":"24px","position":"absolute","height":"100%"}'>{{newsList[0].addtime.split(" ")[0]}}</div>
				</div>
				<img :style='{"objectFit":"cover","width":"190px","height":"100%"}' :src="baseUrl + newsList[0].picture" >
			</div>
			<div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" :style='{"padding":"10px","margin":"0 10px 10px","borderRadius":"10px","background":"rgba(216, 216, 216, 1)","display":"flex","width":"465px","position":"relative","height":"168px"}' class="list-item animation-box">
				<img :style='{"objectFit":"cover","width":"190px","height":"100%"}' :src="baseUrl + newsList[1].picture" >
				<div :style='{"width":"400px","padding":"10px","height":"auto"}'>
				<div :style='{"width":"80%","fontSize":"16px","lineHeight":"28px","overflow":"hidden","color":"#000","height":"30px"}'>{{newsList[1].title}}</div>
				<div :style='{"width":"80%","fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","height":"100px"}'>{{newsList[1].introduction}}</div>
				<div :style='{"color":"#fff","alignItems":"center","textAlign":"center","display":"flex","right":"0","top":"0","borderRadius":"15px","flexWrap":"wrap","background":"#4390a5","width":"70px","fontSize":"12px","lineHeight":"24px","position":"absolute","height":"168px"}'>{{newsList[1].addtime.split(" ")[0]}}</div>
				</div>
			</div>
		</div>
		<div v-if="newsList.length" class="list list8 index-pv1" :style='{"width":"100%","padding":"10px 230px","flexWrap":"wrap","display":"flex","height":"auto"}'>
			<div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" :style='{"padding":"10px","margin":"0 90px 10px 15px","borderRadius":"10px","background":"rgba(216, 216, 216, 1)","display":"flex","width":"465px","position":"relative","height":"168px"}' class="list-item animation-box">
				<div :style='{"width":"400px","padding":"10px","height":"auto"}'>
				<div :style='{"margin":"0 0 0 60px","fontSize":"16px","lineHeight":"28px","overflow":"hidden","color":"#000","height":"30px"}'>{{newsList[2].title}}</div>
				<div :style='{"margin":"0 0 0 60px","fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","height":"100px"}'>{{newsList[2].introduction}}</div>
				<div :style='{"color":"#fff","alignItems":"center","textAlign":"center","display":"flex","top":"0","borderRadius":"15px","left":"0","flexWrap":"wrap","background":"#4390a5","width":"70px","fontSize":"12px","lineHeight":"24px","position":"absolute","height":"168px"}'>{{newsList[2].addtime.split(" ")[0]}}</div>
				</div>
				<img :style='{"objectFit":"cover","width":"190px","height":"100%"}' :src="baseUrl + newsList[2].picture" >
			</div>
			<div @click="toDetail('newsDetail', newsList[3])" v-if="newsList.length>3" :style='{"padding":"10px","margin":"0 10px","borderRadius":"10px","background":"rgba(216, 216, 216, 1)","display":"flex","width":"465px","position":"relative","height":"168px"}' class="list-item animation-box">
				<img :style='{"objectFit":"cover","width":"190px","height":"100%"}' :src="baseUrl + newsList[3].picture" >
				<div :style='{"width":"400px","padding":"10px","height":"auto"}'>
				<div :style='{"width":"80%","fontSize":"16px","lineHeight":"28px","overflow":"hidden","color":"#000","height":"30px"}'>{{newsList[3].title}}</div>
				<div :style='{"width":"80%","fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","height":"100px"}'>{{newsList[3].introduction}}</div>
				<div :style='{"color":"#fff","alignItems":"center","textAlign":"center","display":"flex","right":"0","top":"0","borderRadius":"15px","flexWrap":"wrap","background":"#4390a5","width":"70px","fontSize":"12px","lineHeight":"24px","position":"absolute","height":"168px"}'>{{newsList[3].addtime.split(" ")[0]}}</div>
				</div>
			</div>
		</div>

		<div @click="moreBtn('news')" :style='{"border":"0","margin":"50px auto","borderRadius":"10px","textAlign":"center","background":"rgba(67, 144, 165, 1)","display":"block","width":"100px","lineHeight":"40px"}'>
			<span id="more" :style='{"color":"#f5f5f5","fontSize":"15px"}'>查看更多</span>
			<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px"}' class="el-icon-d-arrow-right"></i>
		</div>
	</div>
</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        dianyingxinxiRecommend: [],

      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getList();
    },
    //方法集合
    methods: {
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 9,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;


				}
			});
		},
		getList() {
          let autoSortUrl = "";
          autoSortUrl = "dianyingxinxi/autoSort";
          if(localStorage.getItem('Token')) {
              autoSortUrl = "dianyingxinxi/autoSort2";
          }
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 9,
			}}).then(res => {
				if (res.data.code == 0) {
					this.dianyingxinxiRecommend = res.data.data.list;


					// 商品列表样式五

				}
			});

		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
#more:hover{
	cursor: pointer;
	
}
	.home-preview {

		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}

			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}

			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}

			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}

			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}

			.list5 .swiper-button-prev::after {
				
				color: rgb(64, 158, 255);
        }

        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}

			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}

			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}

				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}

				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}

			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}

			.index-pv1 .animation-box:hover {
				transform: scale(1.05) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}

			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}

			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}

		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}

			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}

			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}

			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}

			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}

			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}

			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}

			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}

			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}

			.index-pv1 .animation-box:hover {
				transform: scale(1.05) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}

			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}

			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}

		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}

			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}

			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }

        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}

			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}

			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}

			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}

			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}

			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}

				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}

				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}

			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}

			.index-pv1 .animation-box:hover {
				transform: scale(1.03) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}

			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}

			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	
</style>
