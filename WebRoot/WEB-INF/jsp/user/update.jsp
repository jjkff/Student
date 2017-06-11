<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <h1>修改用户：</h1>
  
  <body>
    <sf:form method="post" modelAttribute="user">
        姓名:<sf:input path="username"/><sf:errors path="username"></sf:errors>
        昵称:<sf:input path="nickname"/><sf:errors path="nickname"></sf:errors>
        邮箱:<sf:input path="email"/><sf:errors path="email"></sf:errors>
       <input type="submit" value="修改"/>
    </sf:form>
  </body>
</html>
