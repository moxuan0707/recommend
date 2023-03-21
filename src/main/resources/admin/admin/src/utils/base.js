const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootl07f8/",
            name: "springbootl07f8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootl07f8/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于协同过滤算法的个性化电影推荐网站"
        } 
    }
}
export default base
