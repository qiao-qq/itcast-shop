//品牌服务层
app.service('brandService',function($http){
	//查询品牌
	this.findAllBrand=function(){
		return $http.post('../brand/findAllBrand.do');
	}
});