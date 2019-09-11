//广告管理
app
		.controller(
				"adController",
				function($scope, $controller, $location, adService) {

					$controller("baseController", {
						$scope : $scope
					});

					// 查询所有广告分类
					$scope.findAllAdCat = function() {
						adService.findAllAdCat().success(
								function(response) {
									$.fn.zTree.init($("#treeDemo"),
											$scope.setting, response);
								});
					}

					$scope.findAdsByCatId = function() {
						var adCatId = $location.search().cid;
						loadDataTable(adCatId);
					}

					loadDataTable = function(adCatId) {
						var t = $('#sample-table')
								.DataTable(
										{
											ajax : {
												// 指定数据源
												url : "../ad/findAdsById.do?id="+adCatId
											},
											// 每页显示10数据
											pageLength : 10,
											columns : [ {
												"data" : null
											}, {
												"data" : "id"
											}, {
												"data" : "sort"
											}, {
												"data" : "categoryname3"
											}, {
												"data" : "img"
											}, {
												"data" : "imgSize"
											}, {
												"data" : "url"
											}, {
												"data" : "createTime"
											}, {
												"data" : "id"
											} ],
											"columnDefs" : [ // 每列定义

													{
														"orderable" : false,// 复选框不排序
														"targets" : 0,
														"render" : function(
																data, type,
																row, meta) {
															return '<td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>';
														}
													},
													{
														"orderable" : false,// 分类名称不排序
														"targets" : 3,
													},
													{
														"render" : function(
																data, type,
																row, meta) {
															return '<td><span class="ad_img"><img src="'
																	+ data
																	+ '" width="202px" height="91px" /></span></td>';
														},
														"orderable" : false,
														"targets" : 4,
													},
													{
														"orderable" : false,
														"targets" : 5,
														"render" : function(
																data, type,
																row, meta) {
															return "<td>"
																	+ data
																	+ "</td>";
														}
													},
													{
														"orderable" : false,
														"targets" : 6,
														"render" : function(
																data, type,
																row, meta) {
															return '<td><a href="http://'
																	+ data
																	+ '" target="_blank">'
																	+ data
																	+ '</a></td>';
														}
													},
													{
														"orderable" : false,
														"targets" : 7,
														"render" : function(
																data, type,
																row, meta) {
															return "<td>"
																	+ data
																	+ "</td>";
														}
													},
													{
														"orderable" : false,// 状态不排序
														"targets" : 8,
														"render" : function(
																data, type,
																row, meta) {
															return "<td>"
																	+ "<span class=\"label label-success radius td-status\">显示</span></td>";
														},

													},
													{
														"orderable" : false,// 操作不排序
														"targets" : 9,
														"render" : function(
																data, type,
																row, meta) {
															return "<td><a onClick=\"member_stop(this,"
																	+ data
																	+ ")\" href=\"javascript:;\" title=\"停用\" class=\"btn btn-xs btn-success td-manage\"><i class=\"fa fa-check bigger-120\"></i></a>"
																	+ "<a title=\"编辑\" onclick=\"member_edit(\"编辑\",\"member-add.html\","
																	+ data
																	+ ",'','510')\"href=\"javascript:;\" class=\"btn btn-xs btn-info\"><i class=\"fa fa-edit bigger-120\"></i></a>"
																	+ "<a title=\"删除\" href=\"javascript:;\" onclick=\"member_del(this,"
																	+ data
																	+ ")\" class=\"btn btn-xs btn-warning\"><i class=\"fa fa-trash  bigger-120\"></i></a></td>";
														},
													},

											],
											"lengthMenu" : [ 10, 25, 50, 75,
													100 ]
										// 指定每页数量
										});
					}
				});