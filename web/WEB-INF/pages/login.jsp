<%--
  Created by IntelliJ IDEA.
  User: WL
  Date: 2017-05-02
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

    <form action="/user/login" method="get">
        <label for="username">用户名：</label>
        <input type="text" name="username" id="username">
        <label for="password">密  码：</label>
        <input type="password" name="password" id="password">
        <button type="submit">登录</button>
    </form>

</body>
</html>
