/*产品-停用*/
function member_stop(obj, id) {
	layer
			.confirm(
					'确认要停用吗？',
					function(index) {
						$(obj)
								.parents("tr")
								.find(".td-manage")
								.parents("td")
								.prepend(
										'<a style="text-decoration:none" class="btn btn-xs td-manage" onClick="member_start(this,'
												+ id
												+ ')" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
						$(obj)
								.parents("tr")
								.find(".td-status")
								.parents("td")
								.html(
										'<span class="label label-defaunt radius td-status">已停用</span>');
						$(obj).remove();
						layer.msg('已停用!', {
							icon : 5,
							time : 1000
						});
					});
}

/* 产品-启用 */
function member_start(obj, id) {
	layer
			.confirm(
					'确认要启用吗？',
					function(index) {
						$(obj)
								.parents("tr")
								.find(".td-manage")
								.parents("td")
								.prepend(
										'<a style="text-decoration:none" class="btn btn-xs btn-success td-manage" onClick="member_stop(this,'+id+')" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
						$(obj)
								.parents("tr")
								.find(".td-status")
								.parents("td")
								.html(
										'<span class="label label-success radius td-status">已启用</span>');
						$(obj).remove();
						layer.msg('已启用!', {
							icon : 6,
							time : 1000
						});
					});
}
/* 产品-编辑 */
function member_edit(title, url, id, w, h) {
	layer_show(title, url, w, h);
}

/* 产品-删除 */
function member_del(obj, id) {
	layer.confirm('确认要删除吗？', function(index) {
		$(obj).parents("tr").remove();
		layer.msg('已删除!', {
			icon : 1,
			time : 1000
		});
	});
}
