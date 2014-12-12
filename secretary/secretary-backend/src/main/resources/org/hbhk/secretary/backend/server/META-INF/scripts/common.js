function tips(selector, msg) {
	$(selector).attr("title", msg);
	var tips = $(selector).tooltip({
		position : {
			my : "left top",
			at : "right+5 top-5"
		}
	});
	tips.tooltip("open");
	setTimeout(function() {
		tips.tooltip("destroy");
		$(selector).removeAttr("title");
	}, 3000);
};
function ctips(obj, msg) {
	obj.attr("title", msg);
	var tips = obj.tooltip({
		position : {
			my : "left top",
			at : "right+5 top-5"
		}
	});
	tips.tooltip("open");
	setTimeout(function() {
		tips.tooltip("destroy");
		obj.removeAttr("title");
	}, 3000);
};
function checkEmpty(selector, msg) {
	var val = $(selector).val();
	if (val == null || val == "") {
		tips(selector, msg);
		return false;
	}
	return true;
}

function allTips(obj, msg) {
	obj.attr("title", msg);
	var tips = obj.tooltip({
		position : {
			my : "left top",
			at : "right+5 top-5"
		}
	});
	tips.tooltip("open");
	setTimeout(function() {
		tips.tooltip("destroy");
		obj.removeAttr("title");
	}, 3000);
};
function checkALlEmpty(selector, msg) {
	var obj = $(selector);
	for ( var i = 0; i < obj.length; i++) {
		var me = obj.eq(i);
		var val = me.val();
		if (val == null || val == "") {
			allTips(me, msg);
			return false;
		}
	}
	return true;
}
$(document).ready(function() {
/*	$("body").on("click", ".home", function() {
		window.location.href = base;
	});
	$("body").on("click", ".jhs", function() {
		window.location.href = base + "user/jyh.htm";
	});
	$("body").on("click", ".about", function() {
		window.location.href = base+ "user/aboutus.htm";
	});
	$("body").on("click", ".myTheme", function() {
		window.location.href = base+"user/myTheme.htm";
	});*/
	$("body .fb").mouseover(function() {
		$(this).css("background-color", "#F2F2F2");
	}).mouseout(function() {
		$(this).css("background-color", "");
	});
	
	$('body').on("click",".care_user",function(){
		var me = $(this);
		if(UserContext.user==null || UserContext.user==""){
			ctips(me,"你需要登陆才能关注!");
			return ;
		}
		var user= me.attr("tuser");
		$.ailiAjax({
			url : base + "user/care.htm",
			type : "POST",
			data:{'user':user},
			success : function(data, textStatus) {
				ctips(me,"关注成功");
			},
			exception : function(data, textStatus) {
				ctips(me,data.msg);
			}
		});
	});
	
	$('body').on("click",".user-commemt",function(){
		var me = $(this);
		window.location.href=me.attr("burl");
	});
	
/*	$('body').on("click",".mycare",function(){
		var me = $(this);
		window.location.href= base+"user/myCare.htm"
	});
	$('body').on("click",".collect-href",function(){
		var me = $(this);
		window.location.href= base+"user/collect.htm"
	});*/
	
	var ifheigth = $("#mainFrame").contents().find("body").css("height");
	$("#mainFrame").css("height",ifheigth);
});

Date.prototype.format = function(format) {  
    /* 
     * eg:format="yyyy-MM-dd hh:mm:ss"; 
     */  
    var o = {  
        "M+" : this.getMonth() + 1, // month  
        "d+" : this.getDate(), // day  
        "h+" : this.getHours(), // hour  
        "m+" : this.getMinutes(), // minute  
        "s+" : this.getSeconds(), // second  
        "q+" : Math.floor((this.getMonth() + 3) / 3), // quarter  
        "S" : this.getMilliseconds()  
        // millisecond  
    };  
  
    if (/(y+)/.test(format)) {  
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4  
                        - RegExp.$1.length));  
    }  
  
    for (var k in o) {  
        if (new RegExp("(" + k + ")").test(format)) {  
            format = format.replace(RegExp.$1, RegExp.$1.length == 1  
                            ? o[k]  
                            : ("00" + o[k]).substr(("" + o[k]).length));  
        }  
    }  
    return format;  
};
function customDateFmatter(cellvalue, options, rowObject){
	var date = new Date(cellvalue);
	if(cellvalue==null || cellvalue==""){
		return "";
	}
	return date.format("yyyy-MM-dd hh:mm:ss");
};

