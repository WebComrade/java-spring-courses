<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.spring.mvc.entities.User" %>
<%@ page import="com.spring.mvc.MyController" %><%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.03.2021
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userList</title>
    <style>
        <%@include file="styles/styles.css"%>
    </style>
</head>
<body>
    <div class="users">
        <list>
            <%
                for(User user: MyController.getUserList()){
                    out.println("<li>" +
                                user.getName()+
                                "</li>");
                }
            %>
        </list>
    </div>


    <a href="/">Add user</a>
</body>
</html>
