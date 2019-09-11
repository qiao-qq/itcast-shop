//网站搜索
app.controller("searchController", function($scope, $location, searchService) {

	$scope.searchEntity = {};// 搜索条件实体类
	$scope.search = function() {
		var url = window.location.href;
		if (url.indexOf("search.html" == -1)) {
			location.href = "/itcast-shop/portal/search.html#?pName="
				+ $scope.searchEntity.productName;
		} else {
			$scope.searchResult();
			//window.location.reload();//重新加载页面
		}
		
	}

	$scope.searchResult = function() {
		var searchEntity = $location.search().pName;// 获取url
		if ($scope.searchEntity.productName != null
				&& $scope.searchEntity.productName != "") {
			searchEntity = $scope.searchEntity.productName;
		}

		searchService.search(searchEntity).success(function(response) {
			$scope.productList = response;
		});
	}

});