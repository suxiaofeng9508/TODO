<%--
  Created by IntelliJ IDEA.
  User: WL
  Date: 2017-04-23
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>首页</title>
    </head>
    <body>
    <%
        String info = request.getParameter("info");
        if(info == null) {
            info = "guest";
        }
        out.println("Welcome " + info + "!");
    %>
    </body>
</html>
