<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/21
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<table border="1">

    <a href="addmed">添加员工</a>
    <tr>
        <td><strong>员工ID</strong>
        </td>
        <td><strong>员工姓名</strong>
        </td>
        <td><strong>员工地址</strong>
        </td>
        <td><strong>员工年龄</strong>
        <td><strong>编辑</strong>
    </td>
        <td><strong>删除</strong></td>
    </tr>
<c:forEach items="${list}"  var="l">
    <tr>
        <td>${l.eid}</td>
        <td>${l.ename}</td>
        <td>${l.eaddress}</td>
        <td>${l.age}</td>
        <td><a href="<%=basePath%>deleteemp/${l.eid}">删除</a></td>
        <td><a href="<%=basePath%>updateemp/${l.eid}">编辑</a></td>
      
</c:forEach>

</body>
</html>
