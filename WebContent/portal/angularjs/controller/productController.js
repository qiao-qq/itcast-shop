//商品详情页
app.controller("productController", function($scope, $controller, $location,
		productService) {

	$controller("searchController", {
		$scope : $scope
	});

	$scope.prodImgs="";
	// 根据商品id获取商品信息
	$scope.findProductById = function() {
		var productId = $location.search().pId;
		productService.findProductById(productId).success(function(response) {
			$scope.product = response;
			var smallPic = response.smallPic;
			if(smallPic!=null){
				$scope.prodImgs=smallPic.split(",");
			}
		})
	}

});