//商品服务层
app.service('prodService',function($http){
	//添加商品
	this.addProductInfo=function(productInfo){
		return $http.post('../prod/addProd.do',productInfo);
	}
});