<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.spring.mvc.MyController" %>
<!DOCTYPE html>
<hmtl>
    <head>
<%--        <link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/view/styles.css" />--%>
        <style>
            <%@include file="styles/styles.css"%>
        </style>
    </head>
    <body>
    <h2>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cupiditate, tenetur.</h2>
    <h2>
        <%
        out.println(MyController.getKek());
        %>
    </h2>
    <h3>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cumque ducimus eligendi harum in quae qui quibusdam quisquam, rem similique tenetur.</h3>
    <h4>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Autem et incidunt perferendis quaerat quasi repellat voluptas? Aut explicabo facere iste itaque nulla porro, totam voluptates. Ad, dicta, ducimus eligendi esse est, hic nemo placeat provident rem repudiandae soluta suscipit tempore.</h4>
    <form:form method="get" action="/increment">
        <button name="button1" value="sosi" class="circle" type="submit">
            <p>PRESS</p>
        </button>
    </form:form>
    </body>
</hmtl>