app.service("homeService", function($http) {
	// 首页轮播图
	this.homeSlider = function() {
		return $http.post('../ad/homeSlider.do');
	}

	// 首页今日推荐
	this.todayProm = function() {
		return $http.post('../ad/todayProm.do');
	}
});
