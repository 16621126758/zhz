<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/9
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<
<form action="select">
    <<input type="submit" value="查询">
</form>
</body>
</html>
