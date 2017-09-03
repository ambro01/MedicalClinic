<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html lang="pl-PL">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Medical Clinic</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
</head>
<body>
<div class="container" id="header">
    <div class="row">
        <div class="col-md-2">
            <a href="#">
                <img src="<c:url value="/resources/images/medical_clinic.png"/>" height="100px" alt="logo medical clinic">
            </a>
        </div>
        <!-- nav -->
        <div class="col-md-2 col-md-offset-4">
            <a href="/team_doctors" class="btn btn-primary" role="button">Zespol lekarzy</a>
        </div>
        <div class="col-md-2">
            <a href="/team_doctors" class="btn btn-primary" role="button">Kontakt</a>
        </div>
        <div class="col-md-2" >
            <a href="/login" class="btn btn-primary" role="button">Logowanie</a>
        </div>
    </div>
</div>

</body>
</html>
