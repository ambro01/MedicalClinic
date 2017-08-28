<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <title>Flat HTML5/CSS3 Login Form</title>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid" id="header">
    <div class="container">
        <div class="row">
            <!-- logo -->
            <div id="logo">
                <a href="#">
                    <img src="<c:url value="/resources/images/medical_clinic.png"/>" height="100px" alt="logo medical clinic">
                </a>
            </div>
            <!-- nav -->
            <div id="nav">
                <a href="login" class="button">Log in</a>
            </div>
        </div>
    </div>
</div>
<h2>Hello World!</h2>
</body>
</html>
