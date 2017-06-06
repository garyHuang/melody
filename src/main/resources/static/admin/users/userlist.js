$(function() {
	$('#dataTable').DataTable(
					{
						"aLengthMenu" : [ 10, 20, 40, 60 ],
						 "bPaginate" : true,
						"bLengthChange" : true,// 每行显示记录数
						"iDisplayLength" : 10, // 每页显示行数
						"bProcessing" : false, // 是否显示取数据时的那个等待提示
						"bServerSide" : true, // 这个用来指明是通过服务端来取数据
						"bSort" : true, // 排序
						"bFilter" : false,
						"aoColumns" : [
								{
									"sDefaultContent" : "a0",
									"bSearchable" : false,
									"mRender" : function(data, type, full) {
										return '<input  type="checkbox" name="abc" value=\"'
												+ full.id + '\'\"></input>';
								}, {
									"data" : "id",
									'sClass' : 'left'
								}, {
									"data" : "username",
									'sClass' : 'left'
								}, {
									"data" : "name",
									'sClass' : 'left'
								} 
						],
						"fnServerData" : function(sSource, aoData, fnCallback) {
							$.ajax({
								"type" : 'post',
								"dataType" : "json" , 
								"url" : "/admin/users/lig" , 
								"data" : {
									aoData : JSON.stringify(aoData)
								},
								"success" : function(resp) {
									var jsondata = eval('(' + resp + ')');
									console.debug(jsondata);
									fnCallback(jsondata[0]);
								}
							});
						}
					})
})
})