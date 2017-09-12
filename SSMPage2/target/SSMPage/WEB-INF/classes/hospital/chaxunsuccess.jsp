<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/10
  Time: 10:41
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
<


    </form>

    <tr>
        <td><strong>挂号编号</strong>
        </td>
        <td><strong>医院id</strong>
        </td>
        <td><strong>挂号类型</strong>
        </td>
        <td><strong>姓名</strong>
        </td>
        <td><strong>年龄</strong>
        </td>
        <td><strong>性别</strong>
        </td>
        <td><strong>挂号人编号</strong>
        </td>
        <td><strong>日期</strong>
        </td>

    </tr>
    <c:forEach items="${newp}" var="mf">
        <tr>
            <td>${mf.guahao_id }</td>
            <td>${mf.hospital_id}</td>
            <td>${mf.guahao_type}</td>
            <td>${mf.name}</td>
            <td>${mf.age}</td>
            <td>${mf.sex}</td>
            <td>${mf.people_id}</td>
            <td>${mf.date}</td>
            <td><a href="<%=basePath%>delete?people_id=${mf.people_id}">Delete</a></td>
           <td> <a href="<%=basePath%>update1?people_id=${mf.people_id}">Update</a></td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
