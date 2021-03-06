<%@ page language="java" pageEncoding="UTF-8" info="买客网"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link rel="shortcut icon" href="${base}favicon.png">
<link rel="Bookmark" href="${base}favicon.png">
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="keywords" content="${siteInfo.keywords}">
<meta name="description" content="${siteInfo.description}">
<link href="${styles}/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${styles}/bootstrap.min.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript">
	var host = window.location.host;
	var file_server = "${file_server}";
	//var $j = jQuery.noConflict();
	var base = "${base}";
	var returnUrl = '${returnUrl}';
	var UserContext = {
		'user' : '${cuser}',
		'name' : '${cuserName}',
		'head' : '${head}'
	};
</script>
<script src="${scripts}/jquery-1.9.1.js"></script>
<script src="${scripts}/bootstrap.min.js"></script>
<script src="${scripts}/jquery-ui.js"></script>
<script src="${scripts}/jquery-exp.js"></script>
<script src="${scripts}/common.js"></script>
<link href="${styles}/backTop.css" type="text/css" rel="stylesheet" />
<script src="${scripts}/backTop.js"></script>
<link rel="stylesheet" href="${scripts}/jqgrid/ui.jqgrid.css" >
<script src="${scripts}/jqgrid/i18n/grid.locale-cn.js" type="text/javascript"></script>
<script src="${scripts}/jqgrid/jquery.jqGrid.min.js" type="text/javascript"></script>
</head>
</html>