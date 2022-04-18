<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/Generics/Generic.css"/>">
		<link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>">
        <title>login</title>
    </head>
    <body>
	<input type="hidden" value="${userLT}" id="idUserLT"/>
	<input type="hidden" value="${credencialLT}" id="idCredencialLT"/>
		<div class="container">
			<div class="row box-shadow pt-5">
				<div class="col-xl-4"></div>
				<div class="col-xl-4 text-center">
					<div class="fa-lg">
						<i class="font-50 fas fa-spinner fa-pulse"></i>
						<span id="MensajeLoad" class="font-18 regular"></span>
					</div>
				</div>
				<div class="col-xl-4"></div>
				<form action="<c:url value='/perform_login'/>" method='post' autocomplete="off">
					<input id="empleadoLogin"  type="hidden" name="usuario"></input>
					<input id="credencialLogin" type="hidden" name="clave"></input>
					<button id="accesologin" class="d-none" formmethod="post" type="submit">Iniciar sesión</button>
				</form>	
			</div>
		</div>
	<script type="text/javascript" src="<c:url value="/resources/jquery/js/jquery.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/fontawesome/svg-with-js/js/all.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/login/login.js"/>"></script>
    </body>
</html>
