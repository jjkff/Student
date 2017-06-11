<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
 
  <body>	
  
  <div style="margin-left: 320px ; ">
  <h1 style="color: blue">用户列表</h1>
    <a href="add">添加用户</a><br/>
   
  </div>
 
   <form action="/springmvc10/queryByid" style="margin-left: 320px; margin-top: 20px;">
      <input type="text" name="id"/>
      <button type="submit">查询</button>
    </form>
  
  <hr/>
  <table width="700" align="center" border="1">
    
    <tr>
      <td>用户标识</td> 
      <td>用户名</td> 
      <td>用户昵称</td> 
      <td>用户邮箱</td>
      <td>操作</td>
    </tr>
    
      
    <c:forEach items="${page.list}" var="u">
    
    <tr>
    <td>${u.id }</td>
    <td><a href="${u.id }">${u.username }</a></td>
    <td>${u.nickname }</td>
    <td>${u.email }</td>
    <td>
      <a href="${u.id}/update">更新</a>&nbsp;<a href="${u.id}/delete">删除</a>
    </td>
    </tr>
    
    </c:forEach>
     
  </table>
  
  </body>
</html>
