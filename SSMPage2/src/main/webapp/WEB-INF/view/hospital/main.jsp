<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/4 0004
  Time: 20:52
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
    <title></title>
</head>
<body>
                <c:if test="${newp.limits==0}">
                    门诊收费
                </c:if>
<br>
欢迎您：${newp.username}<br>
<A  href="<%=basePath%>xiugai">修改密码</A><br>
<c:if test="${newp.limits==1}">

s
    <TR>
        <TD >
            <A  href="<%=basePath%>Registration">挂号</A><br>
        </TD>
        <TD >
            <A  href="<%=basePath%>guahaoselect">查询挂号</A><br>
        <TD >
            <A  href="<%=basePath%>menzhen">门诊</A><br>
        </TD>
        <TD >
            <A  href="<%=basePath%>bingfang">病房</A><br>
        </TD>
        </TD>
        <TD width=165 height="29" bgColor=#7691c7>
            <A  href="Count.jsp">结算</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${newp.limits==2}">
    <TR>

        <TD width=165 height="29" bgColor=#7691c7>

            <A  href="newOperator.jsp">收费管理</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${newp.limits==3}">
    <TR>

        <TD width=165 height="29" bgColor=#7691c7>

            <A  href="newOperator.jsp">病人信息的管理</A><br>
        </TD>
        <TD width=165 height="29" bgColor=#7691c7>
            <A  href="newOperator.jsp">住院收费管理</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${newp.limits==4}">
    <TR>

        <TD width=165 height="29" bgColor=#7691c7>

            <A  href="<%=basePath%>medlist">查询药品</A><br>
        </TD>
        <TD width=165 height="29" bgColor=#7691c7>
            <A  href="newOperator.jsp">药品调拨</A><br>
        </TD>
    </TR>
</c:if>
<c:if test="${newp.limits==5}">
    <TR>

        <TD width=165 height="29" bgColor=#7691c7>

            <A  href="newOperator.jsp">查询药品</A><br>
        </TD>
        <TD width=165 height="29" bgColor=#7691c7>
            <A  href="newOperator.jsp">药品调拨</A><br>
        </TD>
    </TR>
</c:if>
                <c:if test="${newp.limits==6}">
                    <TR>

                        <TD width=165 height="29" bgColor=#7691c7>

                            <A  href="view/AddPeople.jsp">添加人员信息</A><br>
                        </TD>
                        <TD width=165 height="29" bgueryColor=#7691c7>
                            <A  href="view/UpDate.jsueryp">修改人员信息</A><br>
                        </TD>
                        <TD width=165 height="29" bgColor=#7691c7>
                            <A  href="view/Q.jsp">查询</A><br>
uery                    </TR>
                </c:if>
<A  href="../../../view/login.jsp">退出登录</A><br>
</body>
</html>
