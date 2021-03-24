<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
            <%@include file='styles/style.css' %>
        </style>
    </head>
    <body>
        <h2>All users</h2>
        <br>
        <table class="user-table">
            <tr>
                <th>Nickname</th>
                <th>Password</th>
                <th>Operations</th>
            </tr>
            <c:forEach var="user" items="${allUsers}">

                <c:url var="updateButton" value="/update-info"> <%-- создание ссылки --%>
                    <c:param name="userId" value="${user.id}"/>
                </c:url>

                <c:url var="deleteButton" value="/delete-info">
                    <c:param name="userId" value="${user.id}"/>
                </c:url>

                <tr>
                    <td>${user.nick}</td>
                    <td>${user.password}</td>
                    <td>
                        <input type="button" value="update" onclick="window.location.href='${updateButton}'">
                        <input type="button" value="delete" onclick="window.location.href='${deleteButton}'">
                    </td>
                </tr>

            </c:forEach>
        </table>
        <br>
        <input type="button" value="Add" onclick="window.location.href='/registration';"/>
    </body>
</html>