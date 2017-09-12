<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/10
  Time: 21:15
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
<form action="medlist" method="get">


    <input type = "text" name="people">
    <input type = "submit" value="chaxun">
</form>
<table border="1">

    <<a href="addmed">添加药品</a>>
    <tr>
        <td><strong>药品id</strong>
        </td>
        <td><strong>药品名字</strong>
        </td>
        <td><strong>药品数量</strong>
        </td>
        <td><strong>药品产地</strong>
        </td>
        <td><strong>药品类型</strong>
        </td>
        <td><strong>删除</strong>
        </td>
        <td><strong>修改</strong>
        </td>
    </tr>
    <c:forEach items = "${medlist}" var="m">
        <tr>
            <td><strong>${m.mid}</strong>
            </td>
            <td><strong>${m.mname}</strong>
            </td>
            <td><strong>${m.mcount}</strong>
            </td>
            <td><strong>${m.maddress}</strong>
            </td>
            <td><strong>${m.kid}</strong>
            </td>
            <td><strong><a href="deletemed?mid=${m.mid}">删除</a> </strong>
            </td>
            <td><strong><a href="updatemed?mid=${m.mid}">修改</a></strong>
            </td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
