//登录注册
app.controller("loginController", function($scope, $controller, loginService) {

	// 登录
	$scope.login = function() {
		loginService.login($scope.user).success(function(response) {
			if (response == "\"OK\"") {
				location.href="/itcast-shop/portal/index.html";//登录成功跳转
			}

		});
	}

	// 注册
	$scope.regist = function() {
		loginService.regist($scope.user).success(function(response) {
			if (response == "\"OK\"") {
				location.href="/itcast-shop/portal/login.html" ;//注册成功跳转
			}
		});
	}

});