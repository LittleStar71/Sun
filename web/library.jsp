<%--
  Created by IntelliJ IDEA.
  User: 沈歌笑
  Date: 2019/1/19
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书管理系统</title>
</head>
<body bgcolor="#f5f5dc">
<h1 align="center">图书管理系统</h1>
<table border="1" cellspacing="0" cellpadding="10" align="center" bgcolor="#00bfff">
    <tr>
        <td>编号</td>
        <td>书名</td>
        <td>作者</td>
        <td>上架时间</td>
        <td>价格</td>
        <td>类型</td>
    </tr>
    <c:if test="${not empty sessionScope.list}">
        <c:forEach var="library" items="${sessionScope.list}" varStatus="vs">
            <tr <c:if test="${vs.index%2==0}">bgcolor="#faebd7" </c:if> >
                <td>${library.id}</td>
                <td>${library.book}</td>
                <td>${library.author}</td>
                <td>${library.date}</td>
                <td>${library.price}</td>
                <td>${library.type}</td>
            </tr>
        </c:forEach>
    </c:if>
    <tr><td colspan="11">${sessionScope.msg}</td></tr>
</table>
</body>
</html>
