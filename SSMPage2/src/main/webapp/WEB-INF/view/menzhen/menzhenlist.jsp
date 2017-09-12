<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/11
  Time: 21:18
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
<form action="menzhen" method="get">


    <input type = "text" name="guahao_id">
    <input type = "submit" value="chaxun">
</form>

<table border="1">

    <tr>
        <td><strong>挂号id</strong>
        </td>
        <td><strong>医院id</strong>
        </td>
        <td><strong>挂号种类id</strong>
        </td>
        <td><strong>名字</strong>
        </td>
        <td><strong>性别</strong>
        </td>
        <td><strong>年龄</strong>
        </td>
        <td><strong>日期</strong>
        </td>
        <td><strong>人编号</strong>
        </td>
    </tr>
    <c:forEach items = "${list}" var="l">
        <tr>
            <td><strong>${l.guahao_id}</strong>
            </td>
            <td><strong>${l.hospital_id}</strong>
            </td>
            <td><strong>${l.guahao_type}</strong>
            </td>
            <td><strong>${l.name}</strong>
            </td>
            <td><strong>${l.sex}</strong>
            </td>
            <td><strong>${l.age}</strong>
            </td>
            <td><strong>${l.date}</strong>
            </td>
            <td><strong>${l.people_id}</strong>
            </td>
            <td><strong><a href="<%=basePath%>kanbing/${l.guahao_id}">看病</a> </strong>
            </td>
        </tr>



    </c:forEach>









</table>


</body>
</html>
