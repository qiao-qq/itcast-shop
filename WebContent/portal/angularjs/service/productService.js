app.service("productService", function($http) {
	// 商品详情
	this.findProductById = function(productId) {
		return $http.get("../prod/productById.do?id=" + productId);
	}
});
