import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import dianyingleixingList from '../pages/dianyingleixing/list'
import dianyingleixingDetail from '../pages/dianyingleixing/detail'
import dianyingleixingAdd from '../pages/dianyingleixing/add'
import dianyingxinxiList from '../pages/dianyingxinxi/list'
import dianyingxinxiDetail from '../pages/dianyingxinxi/detail'
import dianyingxinxiAdd from '../pages/dianyingxinxi/add'
import dianyingpingfenList from '../pages/dianyingpingfen/list'
import dianyingpingfenDetail from '../pages/dianyingpingfen/detail'
import dianyingpingfenAdd from '../pages/dianyingpingfen/add'
import dianyingtuijianList from '../pages/dianyingtuijian/list'
import dianyingtuijianDetail from '../pages/dianyingtuijian/detail'
import dianyingtuijianAdd from '../pages/dianyingtuijian/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'dianyingleixing',
					component: dianyingleixingList
				},
				{
					path: 'dianyingleixingDetail',
					component: dianyingleixingDetail
				},
				{
					path: 'dianyingleixingAdd',
					component: dianyingleixingAdd
				},
				{
					path: 'dianyingxinxi',
					component: dianyingxinxiList
				},
				{
					path: 'dianyingxinxiDetail',
					component: dianyingxinxiDetail
				},
				{
					path: 'dianyingxinxiAdd',
					component: dianyingxinxiAdd
				},
				{
					path: 'dianyingpingfen',
					component: dianyingpingfenList
				},
				{
					path: 'dianyingpingfenDetail',
					component: dianyingpingfenDetail
				},
				{
					path: 'dianyingpingfenAdd',
					component: dianyingpingfenAdd
				},
				{
					path: 'dianyingtuijian',
					component: dianyingtuijianList
				},
				{
					path: 'dianyingtuijianDetail',
					component: dianyingtuijianDetail
				},
				{
					path: 'dianyingtuijianAdd',
					component: dianyingtuijianAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
