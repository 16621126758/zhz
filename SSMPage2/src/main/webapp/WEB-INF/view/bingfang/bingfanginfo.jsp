<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/14
  Time: 19:09
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
</head>
<body>

<form action="">
    <input type = "text" name = "guahao_id">
    <<input type="submit" value="chaxun">
</form>
<table border="1">
    
    <tr>
        <td><strong>病人ID</strong>
        </td>
        <td><strong>病人挂号id</strong>
        </td>
        <td><strong>病人姓名</strong>
        </td>
        <td><strong>病情</strong>
        </td>
        <td><strong>是否住院</strong>
        </td>
    </tr>
   <c:forEach items = "${list}" var="list">
        <tr><td><strong>${list.people_id}</strong>
        </td>
            <td><strong>${list.guahao_id}</strong>
            </td>
            <td><strong>${list.name}</strong>
            </td>
            <td><strong>${list.bingqing}</strong>
            </td>
            <td><strong>${list.room}</strong>
            </td>
            
            <td><strong><a href="<%=basePath%>deletebingfang/${list.people_id}">退房</a> </strong>
            </td>
            <td><strong><a href="updatemed?mid=${m.mid}">结算</a></strong>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
