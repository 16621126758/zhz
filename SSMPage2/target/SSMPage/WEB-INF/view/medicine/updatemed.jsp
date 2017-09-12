<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/11
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="updatemed1">
    药品id
    <input type = "text" name="mid" value="${mid}"><br>
    药品名字
    <input type = "text" name="mname"><<br>
    药品数量
    <input type = "text" name="mcount"><br>
    压迫品产地
    <input type = "text" name="maddress"><br>
    药品类型
    <input type = "text" name="kid"><br>

    <input type = "submit" value="修改">
</form>
</body>
</html>
