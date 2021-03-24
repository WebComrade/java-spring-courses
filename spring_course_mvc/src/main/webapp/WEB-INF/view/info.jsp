<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 03.03.2021
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--    <link rel="stylesheet" href="styles/styles.css">--%>
    <style>
        <%@include file="styles/styles.css"%>
    </style>
</head>
<body>
    <h2>Information:</h2>
    <div class="block-info">
        <p>Name: ${user.name}</p>
        <p>Phone: +7${user.phoneNumber}</p>
        <p>Mail: ${user.mail}</p>
    </div>

    <a href="userList">Check the list of users</a>
</body>
</html>
