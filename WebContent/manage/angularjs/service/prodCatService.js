//商品分类服务层
app.service('prodCatService',function($http){
	//查询全部商品分类
	this.findAllCat=function(){
		return $http.get('../prodCat/findAllProdCat.do');
	}
});