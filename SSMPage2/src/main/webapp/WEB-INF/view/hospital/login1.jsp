<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/8
  Time: 13:42
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
    <title>His系统</title>
</head>
<body>
<h1>His 系统</h1>
<form action="login1 " method = "get"><br>
   用户编号
    <input type = "text" name = "userid">
    部门编号
    <input type = "text" name = "empolyeeid">

    用户名字
    <input type = "text" name = "username"><br>
    用户密码
    <input type = "text" name = "password"><br>
   <select name="" id="">
        <option value="0">门诊挂号人员</option>
        <option value="1">门诊划价人员</option>
        <option value="2">门诊收费人员</option>
        <option value="3">住院部管理员</option>
        <option value="4">药房管理</option>
       <option value="5">药库管理</option>
        <option value="6">人事部</option>
   </select>

    <input type = "submit" value="登陆">
    <a href="<%=basePath%>xiugai">修改密码</a>
</form>
</body>
</html>
