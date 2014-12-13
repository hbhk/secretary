$(document).ready(function() {
	var tblw=$(".tab-page").width();
	$("#tab-list").jqGrid({
        url:base+"car/findListPage.htm",
        editurl:base+"car/editCar.htm",
        datatype: "json",
		height: 'auto',
		width:tblw,
        mtype: 'POST',  
        colNames:['id','名称', '英文名称', '价格', '卖价','详情地址','官方网址','描述','创建时间','修改时间','状态'],
        colModel:[
                {name:'id',editable: false, hidden:true,custom_value:myId},
                {name:'name',index:'q_sl_name', width:60,editable: true,required:true },
                {name:'nameEN',index:'q_sl_nameEN', width:90,editable: true ,required:true},
                {name:'price',index:'q_int_price', width:90,editable: true,required:true },
                {name:'realPrice',index:'q_int_realPrice', width:90,editable: true,required:true },
                {name:'url',index:'q_sl_url', width:90,editable: true,required:true },
                {name:'website',index:'q_sl_website', width:90,editable: true,required:true },
                {name:'description',index:'q_sl_description', width:90,editable: true,required:true },
                {name:'createTime',index:'createTime', width:125,formatter:customDateFmatter,search:false},
                {name:'updateTime',index:'updateTime', width:100,formatter:customDateFmatter,search:false},                
                {name:'status',index:'status', width:120,search:false,formatter: "select", editoptions:{value:"0:无效;1:有效;2:删除"}}       
        ],
        prmNames : {
 		   page:"page.start", // 表示请求页码的参数名称
 		   rows:"page.size", // 表示请求行数的参数名称
 		 },
        jsonReader : {
            root:"items",  
            page: "currentPage",  
            total: "totalPages",  
            records: "count",
            repeatitems: false
        },  
        sortname:'createTime',
        sortorder:'desc',
        viewrecords:true,
        rowNum:10,
        rowList:[10,20,30],
        pager:"#gridPager",
        caption: "汽车列表"
	}).navGrid('#gridPager', {
		add: true,
		addtext:'新增',
		edit: true,
		edittext:'修改',
		del: true,
		deltext: '删除',
		search:true,
		searchtext:'查询',
		refresh:true ,
		refreshtext:'刷新'
		});
});

function myId(elem) {
    return $(elem).val();
  }