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