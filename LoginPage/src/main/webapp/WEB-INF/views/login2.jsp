<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet"> 
	<link href="<c:url value="/resources/css/login/login.css"/>" rel="stylesheet"> 
<title>Login</title>
</head>
<body>
	<input type="hidden" value="" id="idUserLT"/>
	<input type="hidden" value="" id="idCredencialLT"/>
	<div class="row col-12">
		<div class="row col-12">
			<div class="row col-6">
				<div class="row col-12">
					<div class="col-3"></div>
					<div class="col-6">
						<form id="form_dst" action="<c:url value='/perform_login'/>" method='post' autocomplete="off">
							<div class="logo px-5"></div>
							<div class="row inicia">Inicia Sesión</div>
							<div class="row email colorLetras">
								<label for="usuario">Email</label>
							</div>
							<div class="row ">
								<input id="empleadoLogin" class="colorInput form-control enter" type="text" placeholder="correo@ejemplo.com" required autocomplete="off" name="usuario"></input>
							</div>
							<div class="row credencial colorLetras">
								<label for="clave">Contraseña</label>
							</div>
							<div class="row ">
								<input id="credencialLogin" class="colorInput form-control enter" type="password" required autocomplete="off" placeholder="********" name="clave"></input>
							</div>
							<div class="row iniciaSession">
								<button id="accesologin" formmethod="post" type="submit" class="btn btn-primary form-control" >Iniciar sesión</button>
							</div>
							
						  </form>	
					</div>
					<div class="col-3"></div>
				</div>
			</div>
			<div class="row col-6">
				<div class="col-12">
					<img src="${pageContext.request.contextPath}/resources/image/login/login.png">
				</div>
			</div>
		</div>
	</div>
	
	    <script src="<c:url value="/resources/jquery/js/jquery.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/resources/bootstrap/js/popper.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/resources/js/generics/generics.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/resources/js/login/login.js"/>" type="text/javascript"></script>
</body>
</html>