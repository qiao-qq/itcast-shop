//商品分类管理angularjs controller
app.controller("productController", function($scope, $controller,prodCatService, prodService,brandService) {

	$controller("baseController", {
		$scope : $scope
	});

	// 查询所有商品分类
	$scope.findAllProdCat = function() {
		prodCatService.findAllCat().success(function(response) {
			$.fn.zTree.init($("#treeDemo"), $scope.setting, response);
		});
	}

	// 新增商品
	$scope.productInfo = {product : {}, productDesc : {}};
	$scope.addProductInfo = function() {
		var imgsUrl = $("#prodImgs").val();
		$scope.productInfo.product.smallPic=imgsUrl;
		prodService.addProductInfo($scope.productInfo).success(function(response) {
			alert(response.message);
		});
	}
	
	// 查询所有品牌
	$scope.findAllBrand = function() {
		brandService.findAllBrand().success(function(response) {
				$scope.brandList = response;
		});
	}
});