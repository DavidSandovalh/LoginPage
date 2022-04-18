$(document).ready(function() {
	console.log("Entramos a la pagina adminSistemas.js");
	
	
	setTimeout(function(){ 
		consultaAdministradores();
	}, 500);
});

function consultaUsuariosEstatus(status){
	$.ajax({
		url : 'consulta_Usu_estatus',
		type : "post",
		dataType : "json",
		data : {
			'status' : status
		},
		success : function(response) {
			if(response.success){
				console.log("Consulta usuarios estatus::: ",response);
				$('#bodytableAdministradores').html("");
				crearTablaAdministradores(response.result);
			}else{
				swal({
					html : response.mensaje,
					type : 'info',
					showConfirmButton : true
				})
			}
			complete: {
				 console.log("Correcto");
			}

		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log("Error", "Intentelo de nuevo");
		}
	});
}

function consultaAdministradores(){
	$.ajax({
		url : 'consulta_Administrador',
		type : "post",
		dataType : "json",
		success : function(response) {
			if(response.success){
				console.log("Consulta administradores::: ",response);
				$('#bodytableAdministradores').html("");
				crearTablaAdministradores(response.result);
			}else{
				swal({
					html : response.mensaje,
					type : 'info',
					showConfirmButton : true
				})
			}
			complete: {
				 console.log("Correcto");
			}

		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log("Error", "Intentelo de nuevo");
		}
	});
}

function crearTablaAdministradores(response){
	$('#tableAdministradores').DataTable().destroy();
	$('#foottableAdministradores').html("");
	var tr = "";
	var pagina = "";
	$.each(response, function( index, value ) {
		tr += '<tr>';
		tr += '<td>'+value.NOMBRE+' '+value.APELLIDO+'</td>';
		tr += '<td>'+value.DUO_USER_NAME+'</td>';
		tr += '<td>'+value.FECHAALTA+'</td>';
		tr += '<td>'+value.EMAIL+'</td>';
		tr += '<td>'+value.STATUS+'</td>';
		tr += '<td onclick="consultarInfoAdminEditar(\''+value.DUO_USER_NAME+'\')"><a href="#">Editar</a></td>';
		tr += '<td onclick="bajaUsuario(\''+value.DUO_USER_NAME+'\')"><a href="#">Baja</a></td>';
		tr += '</tr>';
	});
	if(tr.length > 0){
		$('#bodytableAdministradores').html(tr);
		var tfoot = '<tr>'+
			'<th>Nombre</th>'+
	    	'<th>Login</th>'+
	    	'<th>Fecha alta</th>'+
	    	'<th>Correo electr&oacute;nico</th>'+
	    	'<th>Estatus</th>'+
	    	'<th style="display: none;"></th>'+
	    	'<th style="display: none;"></th>'+
    	'</tr>';
		
		$('#foottableAdministradores').html(tfoot);
		
		$('#tableAdministradores tfoot th').each( function () {
	        var title = $(this).text();
	        $(this).html( '<input type="text" placeholder="'+title+'" />' );
	    } );
		
		 var table = $('#tableAdministradores').DataTable({
			 "lengthMenu" : [[10, 15, 50, -1 ],[10, 15, 50, 'Todos' ]],
			 "language" : {
			 		"url" : "resources/DataTables/Spanish.json"
			 },
			 "order": [[ 0, "desc" ]],
		     initComplete: function () {
		    	 this.api().columns().every( function () {
		    		 var that = this;
		    		 $( 'input', this.footer() ).on( 'keyup change clear', function () {
		    			 if ( that.search() !== this.value ) {
		    				 that.search( this.value ).draw();
		                 }
		             });
		         });
		     }
		 });	
	}
}

function abrirModalNuevoAdministrador(){
	limpiarDatosNuevoAdmin();
	$('#modalNuevoAdmin').modal({
		keyboard : true,
		backdrop : 'static'
	});
}

function limpiarDatosNuevoAdmin(){
	$('#nuevoAdminNombre').val("");
	$('#nuevoAdminApellido').val("");
	$('#nuevoAdminNumeroEmpleado').val("");
	$('#nuevoAdminCorreoElectronico').val("");
	$('#nuevoAdminCorreoElectronicoValidarCorreo').val("");
	$('#nuevoRol').html("");
	$('#nuevoRol').selectpicker('refresh');
	
	$('#nuevoAdminCorreoElectronicoValidarCorreo').bind("cut copy paste",function(e) {
		e.preventDefault();
	});
}

function consultarInfoAdminEditar(login){
	$('#btnActualizarAdmin').unbind();
	$.ajax({
		url : 'consultar_info_administrador_llave',
		type : "post",
		dataType : "json",
		data : {
			"login" : login 
		},
		success : function(response) {
			if(response.success){
				console.log("consultarInfoAdminEditar::response:: ",response);
				abrirModalActualizacionAdmin(response.result, login);
			}else{
				swal({
					html : response.mensaje,
					type : 'info',
					showConfirmButton : true
				})
			}
			complete: {
				 console.log("Correcto");
			}

		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log("Error", "Intentelo de nuevo");
		}
	});
}

function abrirModalActualizacionAdmin(response, login){
	$('#btnActualizarAdmin').unbind();
	$('#btnActualizarAdmin').on("click", function(){
		var nuevoEstatus = $('#actualizarAdminEstatus').val();
		editarInformacionAdmin(nuevoEstatus, login);
	});
	limpiarActualizarAdmin();
	llenarDatosActualizaAdmin(response);
	$('#modalActualizarAdmin').modal({
		keyboard : true,
		backdrop : 'static'
	});
}

function editarInformacionAdmin(nuevoEstatus, idAdmin){
	$.ajax({
		url : 'aplicar_Actualizacion_Admin',
		type : "post",
		dataType : "json",
		data : {
			"nuevoEstatus" : nuevoEstatus,
			"idAdmin" : idAdmin 
		},
		success : function(response) {
			if(response.success){
				console.log("editarInformacionAdmin::response:: ",response);
				swal({
					html : "Estatus de administrador actualizado con &eacute;xito",
					type : 'info',
					showConfirmButton : true
				})
				$('#modalActualizarAdmin').modal('hide');
				consultaAdministradores();
			}else{
				swal({
					html : response.mensaje,
					type : 'info',
					showConfirmButton : true
				})
			}
			complete: {
				 console.log("Correcto");
			}

		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log("Error", "Intentelo de nuevo");
		}
	});
}

function limpiarActualizarAdmin(){
	$('#actualizarAdminNombre').val("");
	$('#actualizarAdminApellidos').val("");
	$('#actualizarAdminNumeroEmpleado').val("");
	$('#actualizarAdminCorreoElectronico').val("");
	$('#actualizarAdminRol').html("");
	$('#actualizarAdminRol').selectpicker('refresh');
}

function llenarDatosActualizaAdmin(response){
	$('#actualizarAdminNombre').val(response.NOMBRE);
	$('#actualizarAdminApellidos').val(response.APELLIDO);
	$('#actualizarAdminNumeroEmpleado').val(response.DUO_USER_NAME);
	$('#actualizarAdminCorreoElectronico').val(response.EMAIL);
	//LLENAR LISTA ESTATUS
	$('#actualizarAdminEstatus').val(response.STATUS);
	$('#actualizarAdminEstatus').selectpicker('refresh');
	
}

function bajaUsuario(login){
	$.ajax({
		url : 'baja_usuario',
		type : "post",
		dataType : "json",
		data : {
			"login" : login 
		},
		success : function(response) {
			if(response.success){
				console.log("baja_usuario::response:: ",response);
				consultaAdministradores();
			}else{
				swal({
					html : response.mensaje,
					type : 'info',
					showConfirmButton : true
				})
			}
			complete: {
				 console.log("Correcto");
			}

		},
		error : function(jqXHR, textStatus, errorThrown) {
			console.log("Error", "Intentelo de nuevo");
		}
	});
}