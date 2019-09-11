//广告分类服务层
app.service('adService',function($http){
	//查询所有广告分类
	this.findAllAdCat=function(){
		return $http.post('../ad/findAllAdCat.do');
	}
});