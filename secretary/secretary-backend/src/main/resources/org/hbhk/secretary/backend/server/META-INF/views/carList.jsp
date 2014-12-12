<%@ page language="java" pageEncoding="UTF-8"%>
<jsp:include page="common.jsp" />
<html>
<head>
<link href="${styles}/carList.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${scripts}/carList.js"></script>
<style>
.tab-page {
	float: left;
}

.ui-jqgrid-titlebar {
	height: 45px;
	line-height: 45px;
	background: url(${images}/th.gif) repeat-x;
	filter:
		"progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale')";
	-moz-background-size: 100% 100%;
	background-size: 100% 100%;
}

.ui-jqgrid-title {
	font-size: 25px;
}

.ui-jqgrid .ui-jqgrid-htable th div {
	height: 30px;
	font-size: 20px;
}

.query-form {
	font-family: '微软雅黑';
	font-size: 15px;
	float: left;
	width: 100%;
	background-image: url("${images}/righttop.gif");
	filter:
		"progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale')";
	-moz-background-size: 100% 100%;
	background-size: 100% 100%;
}

.query-form .q-line {
	width: 100%;
	margin-top: 10px;
	height: auto;
	float: left;
}

.query-form .q-line label {
	width: 25%;
	text-align: right;
}

.query-form .q-line input {
	width: 50%;
}

.query-form .q-line-input {
	width: 33%;
	float: left;
}

.query-form .q-line-button {
	width: 100%;
	float: left;
	margin-top: 20px;
	margin-bottom: 20px;
}

.query-form .q-line-button input {
	float: left;
	border: 0;
}

.query-form .q-line-button .query-btn {
	width: 60px;
	height: 35x;
}

.query-form .q-line-button .reset-btn {
	margin-left: 75%;
	margin-right: 10px;
	width: 60px;
	height: 35x;
}
</style>
</head>
<body>
	<div class="query-form">
		<div class="q-line">
			<div class="q-line-input">
				<label>汽车名称</label> <input type="text">
			</div>
			<div class="q-line-input">
				<label>汽名称</label> <input type="text">

			</div>
			<div class="q-line-input">
				<label>汽车称</label> <input type="text">
			</div>
		</div>
		<div class="q-line">
			<div class="q-line-input">
				<label>汽车名称</label> <input type="text">
			</div>
			<div class="q-line-input">
				<label>汽称</label> <input type="text">

			</div>
			<div class="q-line-input">
				<label>汽车称</label> <input type="text">
			</div>
		</div>
		<div class="q-line-button">
			<input type="button" class="reset-btn" value="重置"> <input
				type="button" class="query-btn" value="查询">
		</div>
	</div>
	<div class="tab-page" style="width: 100%">
		<table id="tab-list" class="tab-list" style="width: 100%"></table>
		<div id="gridPager"></div>
	</div>
</body>
</html>