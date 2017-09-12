<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/9
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="view/AddPeople.jsp">添加</a>
<table border="1">


    <tr>
        <td><strong>用户编号</strong>
        </td>
        <td><strong>部门标号</strong>
        </td>
        <td><strong>用户名称</strong>
        </td>
        <td><strong>用户密码</strong>
        </td>
        <td><strong>权限</strong>
        </td>

    </tr>
<c:forEach items="${list}" var="mf">
    <tr>
        <td>${mf.userid }</td>
        <td>${mf.empolyeeid}</td>
        <td>${mf.username}</td>
        <td>${mf.password}</td>
        <td>${mf.limits}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
