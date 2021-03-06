<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Medical Clinic - rejestracja</title>
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
</head>

<body>
<div class="login-page">
    <div class="form">
        <form:form method="POST" modelAttribute="userDto" action="/register">
            <form:input type="text" path="username" placeholder="Nazwa" id="registerUsername"/>
            <form:input type="password" path="password" placeholder="Haslo" id="registerPassword"/>
            <form:input type="email" path="email" placeholder="Email" id="registerEmail"/>
            <button id="registerButton">create</button>
            <p class="message">Masz konto? <a href="login">Zaloguj sie</a></p>
        </form:form>

    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

<script type="text/javascript" src="<c:url value="/resources/js/register.js" />"></script>

</body>
</html>
