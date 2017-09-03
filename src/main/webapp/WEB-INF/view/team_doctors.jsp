<<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AngularJS $http Example</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body ng-app="myApp" class="ng-cloak">
<div class="container" ng-controller="DoctorController as ctrl">
    <div class="row">
        <div class="col-md-2 col-md-offset-5">
            <div class="input-group">
                <span class="input-group-addon">Szukaj: </span>
                <input type="text" clas="form-control" placeholder="Jakiego lekarza szukasz?" ng-model="searching">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="panel-heading"><span class="lead">Lista lekarzy</span></div>
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>Imie</th>
                    <th>Nazwisko</th>
                    <th>Specjalizacja</th>
                </tr>
                </thead>
                <tbody>
                <tr ng-repeat="u in ctrl.doctors | filter : searching">
                    <td><span ng-bind="u.name"></span></td>
                    <td><span ng-bind="u.surname"></span></td>
                    <td><span ng-bind="u.specialization"></span></td>
                </tr>
                </tbody>
            </table>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
<script src="<c:url value='/resources/js/app.js' />"></script>
<script src="<c:url value='/resources/js/doctor_service.js' />"></script>
<script src="<c:url value='/resources/js/doctor_controller.js' />"></script>
</body>
</html>