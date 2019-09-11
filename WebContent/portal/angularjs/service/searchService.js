app.service("searchService", function($http) {
	// 搜索
	this.search = function(search) {
		return $http.post("../prod/search.do",{"productName":search});
	}
});
