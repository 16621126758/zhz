<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/12
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<form action="<%=basePath%>save" method="get">
<input type="hidden"name="people_id " value="${kanbing.people_id}">
挂号编号 
<input type = "text" name = "guahao_id" value="${kanbing.guahao_id}"><br>
医院ID
<input type = "text" name="hospital_id" value="${kanbing.hospital_id}">
挂号类型string
<input type = "text" name = "guahao_type" value = "${kanbing.guahao_type}"><br>
姓名
<input type="text" name="name" value="${kanbing.name}"><br>
年龄
<input type = "text" name = "age" value="${kanbing.age}"> <br>
性别
<input type="text" name = "sex" value="${kanbing.sex}"><br>
    看病时间
    <input type="text" name = "date" value ="<fmt:formatDate value="${kanbing.date}" pattern="yyyy-M-d" />" ><br>
    病人编号
    <input type = "text" name = "people_id" value="${kanbing.people_id}"><br>
    病情描述
<textarea name="bingqing" id="" cols="100" rows="10"></textarea>
    是否需要住院
    是<input type = "radio" name = "room" value="1">
    否<input type = "radio" name = "room" value="0">
    
    
    <input type = "submit" value="保存信息">
</form>
<%--<a href="kaiyao">开药</a>--%>
</body>
</html>
