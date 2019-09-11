app.service("loginService", function($http) {
	// 登录
	this.login = function(user) {
		return $http.post('../user/login.do',user);
	}
	
	// 注册
	this.regist = function(user) {
		return $http.post('../user/regist.do',user);
	}
});
