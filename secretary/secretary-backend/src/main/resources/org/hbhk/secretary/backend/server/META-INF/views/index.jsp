<%@ page language="java" pageEncoding="UTF-8" info="米客网"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="common.jsp" />
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${siteInfo.title}</title>
<link href="${styles}/index/style.css" type="text/css" rel="stylesheet" />
<script src="${scripts}/index/data.js"></script>
<style type="text/css">
.leftmenu1{
	
}
.menuson1 {
	display: none;
}
.active {
	background: url(${images}/libg.png) repeat-x;
	color: #fff;
}
.menuson1 li{
  height: 30px;
  line-height: 30px;
  text-align: left;
  
}
.title1{
	font-weight: bold;
	font-size: 9pt;
	height: 35px;
	line-height:35px;
	cursor: pointer;
	border-bottom: 1px solid #B9CAD3;
	
}
.title1 img{
	float: left;
	margin-left: 20px;
	margin-top: 8px;
	margin-right: 10px;
}

.menuson1 li cite {
	display: block;
	float: left;
	margin-left: 32px;
	background: url(/images/backend/list.gif) no-repeat;
	width: 16px;
	height: 16px;
	margin-top: 7px;
}

.menuson1 li.active cite {
	background: url(/images/backend/list1.gif) no-repeat;
}
#mainFrame{
width: 100%;
height: 100%;
min-height: 1000px;
}
</style>
</head>
<body>
	<div style="width: 100%; float: left;">
		<jsp:include page="top.jsp" />
	</div>
	<div style="width: 17%; float: left;height: 100%;background: #f0f9fd;min-height: 1000px;border-right: 2px solid #B9CAD3;">
		<jsp:include page="menu.jsp" />
	</div>
	<div style="float: left;width:83%;">
		  <iframe scrolling="No" noresize="noresize" src="${base}backend/welcome.htm" name="mainFrame" id="mainFrame" title="mainFrame" ></iframe>
	</div>
</body>
</html>
