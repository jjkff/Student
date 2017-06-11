<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<body>

		<a href="user/add">add</a>
		<br />
		<hr />
		<c:forEach items="${users}" var="user">
		      姓名：     <a href="${user.id }">${user.username } </a>
		  <br/>    
		      密码：     ${user.password }<br/>
		      邮箱:  ${user.email }<br/>
	                  昵称：     ${user.nickname }<br/>
	                  
            <a href="${user.id}/update">更新</a>
			<a href="${user.id}/delete">删除</a>
			<br />

			<hr />
		</c:forEach>
	</body>
</html>
