const menu = {
    list() {
        return [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"电影类型","menuJump":"列表","tableName":"dianyingleixing"}],"menu":"电影类型管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除","查看评论"],"menu":"电影信息","menuJump":"列表","tableName":"dianyingxinxi"}],"menu":"电影信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除","查看评论"],"menu":"电影评分","menuJump":"列表","tableName":"dianyingpingfen"}],"menu":"电影评分管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除","查看评论"],"menu":"电影推荐","menuJump":"列表","tableName":"dianyingtuijian"}],"menu":"电影推荐管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","评分"],"menu":"电影信息列表","menuJump":"列表","tableName":"dianyingxinxi"}],"menu":"电影信息模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"电影评分列表","menuJump":"列表","tableName":"dianyingpingfen"}],"menu":"电影评分模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"电影推荐列表","menuJump":"列表","tableName":"dianyingtuijian"}],"menu":"电影推荐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","评分"],"menu":"电影信息列表","menuJump":"列表","tableName":"dianyingxinxi"}],"menu":"电影信息模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看"],"menu":"电影评分列表","menuJump":"列表","tableName":"dianyingpingfen"}],"menu":"电影评分模块"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看"],"menu":"电影推荐列表","menuJump":"列表","tableName":"dianyingtuijian"}],"menu":"电影推荐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;