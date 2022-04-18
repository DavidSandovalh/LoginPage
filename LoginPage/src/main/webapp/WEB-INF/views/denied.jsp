<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet"> 
	
<title>Acceso Denegado</title>
</head>

<body>
	<div class="container d-flex justify-content-center mx-auto h-100 align-items-center">
		<div class="row mt-5 pt-5">
			<div class="col-md-12 text-center float-md-none mx-auto">
				<img alt="Acceso Denegado" src="${pageContext.request.contextPath}/resources/image/error/error_403.svg">
				<h2>ACCESO DENEGADO</h2>
			</div>
		</div>
	</div>
	
	<script src="<c:url value="/resources/jquery/js/jquery.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/bootstrap/js/popper.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>

</body>
</html>