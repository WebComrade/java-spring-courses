<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 12.03.2021
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/save-user" modelAttribute="user">
        <h2>Registration</h2>
        <form:hidden path="id"/>
        Nickname <form:input path="nick"/><br>
        Password <form:password path="password"/><br><br>
        <input type="submit" value="OK"/>
    </form:form>
</body>
</html>
