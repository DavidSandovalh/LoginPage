<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../generics/loading.jsp"></jsp:include>

<nav class="nav navbar" style="margin-bottom: 20px; height:65px">
	<div class="col-2"></div>			
	<div class="col-5">
		<span class="genericColorgrayishBlue semibold font-14">Alta y baja de Usuarios</span>
	</div>				
	<div class="col-4">
		<div class="row">
			<div class="col-7 text-rigth">
				<span class="regular"><c:out value="${sessionScope.user.nombre}"/>&nbsp;<c:out value="${sessionScope.user.apellido}"/></span>
			</div>	
			<div class="col-2">
				<img style="width: 45px; border-radius: 50%; border: 1px solid #666;" src="<c:url value="/resources/image/Home/LogoUserAvatar.png"/>?<c:out value="${version}"/>">
			</div>	
		</div> 
	</div>
	<div class="col">
		<form action="${pageContext.request.contextPath}/exit">
      		<button class="btn btn-primary btn-sm" type="submit">Salir <i class="fas fa-sign-out-alt"></i></button>
	    </form>
	</div>
	
			
</nav>

<script src="<c:url value="/resources/js/generics/generics.js"/>" type="text/javascript"></script>