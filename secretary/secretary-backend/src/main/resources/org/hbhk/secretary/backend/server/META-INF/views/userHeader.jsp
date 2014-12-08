<%@ page language="java" pageEncoding="UTF-8" info="买客网"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
.menu {
	font-size: 14px;
	color: #000000;
	margin-right: 25px;
	list-style-type: none;
}

.user-header {
	border: 1px solid #999999;
	border-radius:80px;
	margin-top: 3px;
}
</style>
<c:if test="${userInfo != null}">
	<div class="user-header" >

		<div style="margin-left: 30%;margin-top: 5px;width: 60%;">
			<img width="70%" height="70%" style="border: 0;" alt=""
				src="${file_server}${userInfo.userHeadImg}">
		</div>
		<div style="margin-left: 45%;">
			<span>${cuser}</span>
		</div>

	</div>
</c:if>