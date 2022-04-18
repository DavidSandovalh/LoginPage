<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
<link rel="stylesheet" href="<c:url value="/resources/css/Generics/Generic.css"/>">
<link rel="stylesheet" href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat:400,500,600,700,800&display=swap"/>">
<link rel="stylesheet" href="<c:url value="/resources/DataTables/DataTables-1.10.16/css/dataTables.bootstrap4.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/DataTables/Buttons-1.5.1/css/buttons.bootstrap4.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/DataTables/Responsive-2.2.1/css/responsive.bootstrap4.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/jquery/css/jquery-te-1.4.0.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/DataTables/DataTables-1.10.16/css/dataTables.bootstrap4.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/DataTables/Buttons-1.5.1/css/buttons.bootstrap4.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/DataTables/Responsive-2.2.1/css/responsive.bootstrap4.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/plugins/bootstrap-select/dist/css/bootstrap-select.min.css"/>">

<title>Home</title>
</head>

<style>
@font-face {
	font-family: Montserrat-Bold;
	src: url("resources/fonts/Montserrat-Bold.otf") format("opentype");
}

@font-face {
	font-family: Montserrat-SemiBold;
	src: url("resources/fonts/Montserrat-SemiBold.otf") format("opentype");
}

@font-face {
	font-family: Montserrat-Regular;
	src: url("resources/fonts/Montserrat-Regular.otf") format("opentype");
}

@font-face {
	font-family: Montserrat-Medium;
	src: url("resources/fonts/Montserrat-Medium.otf") format("opentype");
}

@font-face {
	font-family: Montserrat-ExtraBold;
	src: url("resources/fonts/Montserrat-ExtraBold.otf") format("opentype");
}

#sidebar .sidebar-header {
	background-image:
		url("${pageContext.request.contextPath}/resources/image/Generics/sideBar/bg_adm.png")
		!important;
}
</style>
<body class="background">
	<jsp:include page="../generics/header.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-xl-12 mb-3">
				<div class="row">
					<div class="col-xl-6">
						<span class="semibold font-22 genericColorBlack">Tabla de usuarios</span>
					</div>
					<div class="col-xl-6 text-right">
						<button onclick="abrirModalNuevoAdministrador()" type="button" class="btn mainButton">Nuevo</button>
					</div>
				</div>
			</div>
			<div class="col-xl-12">
				<div class="container box-shadow bg-white pb-2 contornoContenedor pt-4" style="min-height: 128px;">
					<div class="row" style="text-align: center;align-items: center;min-height: 80px !important;padding-left: 15%;">
						<div class="col-3" onclick="consultaUsuariosEstatus('A');" style="background-color: greenyellow;">
							<span class="semibold font-22" style="color: #ffffff !important; cursor: default;">Activos</span>
						</div>
						<div class="col-3" onclick="consultaUsuariosEstatus('B');" style="background-color: silver;">
							<span class="semibold font-22" style="color: #ffffff !important; cursor: default;">Inactivos</span>
						</div>
						<div class="col-3" onclick="consultaUsuariosEstatus('R');" style="background-color: orange;">
							<span class="semibold font-22" style="color: #ffffff !important; cursor: default;">Revocados</span>
						</div>
					</div>
				</div><br>
				<div class="container box-shadow bg-white pb-2 tamañocConetener contornoContenedor pt-4">
					<table id="tableAdministradores" class="table-sm" style="width: 100%">
						<thead class="medium font-14 genericColorgrayishBlue">
							<tr>
								<th>Nombre</th>
								<th>Login</th>
								<th>Fecha alta</th>
								<th>Correo electr&oacute;nico</th>
								<th>Estatus</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody class="medium font-14 genericColorBlack" id="bodytableAdministradores">

						</tbody>
						<tfoot id="foottableAdministradores">
							<tr>
								<th>Nombre</th>
								<th>Login</th>
								<th>Fecha alta</th>
								<th>Correo electr&oacute;nico</th>
								<th>Estatus</th>
								<th style="display: none;"></th>
								<th style="display: none;"></th>
							</tr>
						</tfoot>
					</table>
				</div><br>
			</div>
		</div>
	</div>
	
	<jsp:include page="../adminSistemas/modal/NuevoAdmin.jsp"></jsp:include>
	<jsp:include page="../adminSistemas/modal/ActualizarAdmin.jsp"></jsp:include>

	<script type="text/javascript" src="<c:url value="/resources/jquery/js/jquery.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/popper.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/fontawesome/svg-with-js/js/all.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/DataTables/datatables.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/DataTables/DataTables-1.10.16/js/dataTables.bootstrap4.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/DataTables/Buttons-1.5.1/js/buttons.bootstrap4.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/DataTables/datatables.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/DataTables/DataTables-1.10.16/js/dataTables.bootstrap4.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/DataTables/Buttons-1.5.1/js/buttons.bootstrap4.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/plugins/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/plugins/bootstrap-datepicker/dist/locales/bootstrap-datepicker.es.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/plugins/bootstrap-select/dist/js/bootstrap-select.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/sweetalert/sweetalert.min.js"/>"></script>

	<script src="<c:url value="/resources/js/adminSistemas/adminSistemas.js"/>" type="text/javascript"></script>

</body>
</html>