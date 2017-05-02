<%@ page import="java.io.UnsupportedEncodingException" %><%--
  Created by IntelliJ IDEA.
  User: WL
  Date: 2017-04-23
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
    <head>
        <title>首页</title>
    </head>
    <body>
    <h2>用户登录</h2>
    <p>sringmvc test succeed!</p>
    <%!
        /**
         * create a function in %!
         * @param str
         * @return
         */
        public String convertEncoding(String str) throws UnsupportedEncodingException {
            return new String(str.getBytes("ISO-8859-1"), "UTF-8");
        }
    %>
    <%
        // only for POST method
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
//        String info = new String(request.getParameter("info").getBytes("ISO-8859-1"), "UTF-8");
        String info = request.getParameter("info");
        if(info == null) {
            info = "guest";
        } else {
            info = convertEncoding(info);
        }
//        response.sendRedirect("/user/login");
//        out.println("Welcome " + info + "!");
    %>
    <jsp:forward page="/user/loginPage"></jsp:forward>
    </body>
</html>
