<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<title>Home</title>
</head>

<body ng-app="app">
	
	<div ng-controller="HomeController as vm">
		{{vm.teste}}
	</div>

    <script src="<c:url value="/resources/js/lib/angular.min.js" />"></script>
    <script src="<c:url value="/resources/js/app.js" />"></script>
    <script src="<c:url value="/resources/js/home.controller.js" />"></script>
</body>

</html>