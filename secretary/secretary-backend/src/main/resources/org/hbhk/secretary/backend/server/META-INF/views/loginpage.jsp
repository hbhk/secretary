<%@ page language="java" pageEncoding="UTF-8" info="米客网"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="common.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎登录后台管理系统</title>
<link href="${styles}/index/style.css" type="text/css" rel="stylesheet" />
<script src="js/cloud.js" type="text/javascript"></script>

<script language="javascript">
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		})
	});
</script>

</head>

<body
	style="background-color: #1c77ac; background-image: url(images/light.png); background-repeat: no-repeat; background-position: center top; overflow: hidden;">



	<div id="mainBody">
		<div id="cloud1" class="cloud"></div>
		<div id="cloud2" class="cloud"></div>
	</div>


	<div class="logintop">
		<span>欢迎登录后台管理界面平台</span>
		<ul>
			<li><a href="#">回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>

	<div class="loginbody">

		 <span class="systemlogo"></span> 

		<div class="loginbox" style="">

			<ul>
				<li><input name="" type="text" class="loginuser" value="admin"
					 /></li>
				<li><input name="" type="text" class="loginpwd" value="密码"
					/></li>
				<li><input name="" type="button" class="loginbtn" value="登录"
					onclick="javascript:window.location='${base}backend/index.htm'" /><label><input
						name="" type="checkbox" value="" checked="checked" />记住密码</label><label><a
						href="#">忘记密码？</a></label></li>
			</ul>

		</div>

	</div>

	<div class="loginbm">
		版权所有 2013 HBHK
	</div>


</body>

</html>
