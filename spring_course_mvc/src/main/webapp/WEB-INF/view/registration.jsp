<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="org.springframework.ui.Model" %><%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 03.03.2021
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Enter your information</h2>
<%--    <form action="/info" method="get">--%>
<%--        <input type="text" name="userName" placeholder="Write your name"/><br>--%>
<%--        <input type="text" name="userSurname" placeholder="Write your surname"/><br>--%>
<%--        <input type="text" name="userAge" placeholder="Write your age"/><br>--%>
<%--        <input type="submit"/>--%>
<%--    </form>--%>

    <form:form action="info" modelAttribute="user">
        Name    <form:input path="name"/>
        <form:errors path="name"/><br>
        Phone    +7<form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/><br>

        Mail    <form:input path="mail"/>
        <form:errors path="mail"/><br>
        <br>
        <input type="submit" value="Send">

    </form:form>
</body>
</html>
