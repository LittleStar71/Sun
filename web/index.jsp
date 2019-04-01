<%--
  Created by IntelliJ IDEA.
  User: 沈歌笑
  Date: 2019/1/19
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登陆页面</title>
  </head>
  <body>
  <h1>课工场管理系统</h1>
  <form action="/login" method="post">
    用户名：<input type="text" name="username"><br/>
    密&emsp;码：<input type="password" name="password"><br/>
    <input type="submit" value="登陆"/>
  </form>
  </body>
</html>
