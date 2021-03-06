lang = {
	"sProcessing" : "正在获取数据，请稍后...",
	"sLengthMenu" : "显示 _MENU_ 条",
	"sZeroRecords" : "没有找到数据",
	"sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",
	"sInfoEmpty" : "记录数为0",
	"sInfoFiltered" : "(全部记录数 _MAX_ 条)",
	"sInfoPostFix" : "",
	"sSearch" : "搜索",
	"sUrl" : "",
	"oPaginate" : {
		"sFirst" : "第一页",
		"sPrevious" : "上一页",
		"sNext" : "下一页",
		"sLast" : "最后一页"
	}
}

function loadDefault(){
	$.extend( $.fn.dataTable.defaults, {
	    "searching": false,
	    "autoWidth": true, 
	    "destroy": true, 
	    "bServerSide": true,
	    "aLengthMenu":[10,20,30,40,50],
	    "iDisplayLength":10,
	    "ordering": false ,
	    oLanguage:lang, 
	    processing:true
	});
}