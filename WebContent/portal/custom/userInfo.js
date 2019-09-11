$(function(){
	
	//如果用户登录显示用户登录名
	
	if($.cookie("ITCAST_USER")){
		var user=$.parseJSON($.cookie("ITCAST_USER"));
		$(".message-l").html();
		$(".message-l").html("<div class=\"topMessage\"><div class=\"menu-hd\"><a href=\"index.html\" target=\"_top\" class=\"h\">商城欢迎您，【"+user.username+"】</a></div></div>");
		$(".mod-vip").html();
		$(".mod-vip").html("<div class=\"m-baseinfo\"><a href=\"index.html\"><img src=\"images/getAvatar.do.jpg\"></a><em>Hi,<span class=\"s-name\">【"+user.username+"】</span><a href=\"javascript:void(0)\"><p>点击更多优惠活动</p></a></em></div>");
		$(".status_login").html();
		$(".status_login").html("<div class=\"avatar_box \"><p class=\"avatar_imgbox \"><img src=\"images/getAvatar.do.jpg\"></p><ul class=\"user_info \"><li>Hi,你好</li><li>用户：【"+user.username+"】</li></ul></div>");
		$(".message-r").html();
		$(".message-r").html("<div class=\"topMessage home\"><div class=\"menu-hd\"><a href=\"index.html\" target=\"_top\" class=\"h\">商城首页</a></div></div><div class=\"topMessage my-shangcheng\"><div class=\"menu-hd MyShangcheng\"><a href=\"userInfo.html\" target=\"_top\"><i class=\"am-icon-user am-icon-fw\"></i>个人中心</a></div></div><div class=\"topMessage mini-cart\"><div class=\"menu-hd\"><a id=\"mc-menu-hd\" href=\"shopcart.html\" target=\"_top\"><i class=\"am-icon-shopping-cart  am-icon-fw\"></i><span>购物车</span><strong id=\"J_MiniCartNum\" class=\"h\">0</strong></a></div></div><div class=\"topMessage favorite\"><div class=\"menu-hd\"><a href=\"collection.html\" target=\"_top\"><i class=\"am-icon-heart am-icon-fw\"></i><span>收藏夹</span></a></div></div>");
		$(".m-userinfo").html();
		$(".m-userinfo").html("<div class=\"m-baseinfo\"><a href=\"information.html\"><img src=\"images/getAvatar.do.jpg\"></a><em class=\"s-name\">【"+user.username+"】<span class=\"vip1\"></em><div class=\"s-prestige am-btn am-round\"></span>会员福利</div></div>");
	}
});