<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/10
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action ="update2" method = "get">
    挂号编号
    <input type = "text" name = "guahao_id"><br>
    医院ID
    <input type = "text" name="hospital_id">
    挂号类型string
    <input type = "text" name = "guahao_type"><br>
    姓名
    <input type="text" name="name"><br>
    年龄
    <input type = "text" name = "age"><br>
    性别
    <input type="text" name = "sex"><br>
    挂号人编号
    <input type = "text" name = "people_id" value = "${people_id}">
    挂号日期
    <input type="date" name = "date">
    <input type = "submit" value = "修改 ">

</form>


</body>
</html>
