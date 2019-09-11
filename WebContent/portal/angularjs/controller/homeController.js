//首页
app.controller("homeController", function($scope,$controller, homeService) {

	$controller("searchController",{$scope:$scope});//继承search...
	
	// 首页轮播
	$scope.homeSlider = function() {
		homeService.homeSlider().success(
				function(response) {
					// 根据id获取页面轮播的位置
					var homeSlider = $(".homeSlider");
					var html = "";
					var htmlStart = "<ul class=\"am-slides\">";
					var htmlEnd = "</ul>";
					for (var i = 0; i < response.length; i++) {
						html += "<li class=\"banner" + (i + 1)
								+ "\"><a href=\"" + response[i].url
								+ "\"><img src=\"" + response[i].img
								+ "\" /></a></li>";
					}
					homeSlider.html(htmlStart + html + htmlEnd);
					// 首页轮播初始化
					$(".am-slider").flexslider();
				})
	}

	// 今日推荐 样式定义
	$scope.numToEnglish = [ "one", "two", "three" ];
	$scope.todayProm = function() {
		homeService.todayProm().success(function(response) {
			$scope.contentList = response;
		})
	}

});