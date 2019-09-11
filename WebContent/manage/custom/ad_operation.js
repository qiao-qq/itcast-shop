/*广告图片-停用*/
function member_stop(obj, id) {
	layer
			.confirm(
					'确认要关闭吗？',
					{
						icon : 0,
					},
					function(index) {
						$(obj)
								.parents("tr")
								.find(".td-manage")
								.parents("td")
								.prepend(
										'<a style="text-decoration:none" class="btn btn-xs td-manage " onClick="member_start(this,'
												+ id
												+ ')" href="javascript:;" title="显示"><i class="fa fa-close bigger-120"></i></a>');
						$(obj)
								.parents("tr")
								.find(".td-status")
								.parents("td")
								.html(
										'<span class="label label-defaunt radius td-status ">已关闭</span>');
						$(obj).remove();
						layer.msg('关闭!', {
							icon : 5,
							time : 1000
						});
					});
}
/* 广告图片-启用 */
function member_start(obj, id) {
	layer
			.confirm(
					'确认要显示吗？',
					{
						icon : 0,
					},
					function(index) {
						$(obj)
								.parents("tr")
								.find(".td-manage")
								.parents("td")
								.prepend(
										'<a style="text-decoration:none" class="btn btn-xs btn-success td-manage" onClick="member_stop(this,'
												+ id
												+ ')" href="javascript:;" title="关闭"><i class="fa fa-check  bigger-120"></i></a>');
						$(obj)
								.parents("tr")
								.find(".td-status")
								.parents("td")
								.html(
										'<span class="label label-success radius td-status">显示</span>');
						$(obj).remove();
						layer.msg('显示!', {
							icon : 6,
							time : 1000
						});
					});
}
/* 广告图片-删除 */
function member_del(obj, id) {
	layer.confirm('确认要删除吗？', {
		icon : 0,
	}, function(index) {
		$(obj).parents("tr").remove();
		layer.msg('已删除!', {
			icon : 1,
			time : 1000
		});
	});
}
/** *****添加广告******** */
$('#ads_add').on(
		'click',
		function() {
			layer.open({
				type : 1,
				title : '添加广告',
				maxmin : true,
				shadeClose : false, // 点击遮罩关闭层
				area : [ '800px', '' ],
				content : $('#add_ads_style'),
				btn : [ '提交', '取消' ],
				yes : function(index, layero) {
					var num = 0;
					var str = "";
					$(".add_adverts input[type$='text']").each(
							function(n) {
								if ($(this).val() == "") {

									layer.alert(str += ""
											+ $(this).attr("name")
											+ "不能为空！\r\n", {
										title : '提示框',
										icon : 0,
									});
									num++;
									return false;
								}
							});
					if (num > 0) {
						return false;
					} else {
						layer.alert('添加成功！', {
							title : '提示框',
							icon : 1,
						});
						layer.close(index);
					}
				}
			});
		});