$("#accesologin").click(function() {
	console.log("Bienvenido a login.js");
	
	if( $('#empleadoLogin').val().trim() === '' ||  $('#credencialLogin').val().trim() === ''){
		swal({
			html : "Ingrese Usuario y Contrase&ntilde;a",
			type : 'info',
			showConfirmButton : true
		})
		return false;
		
	}
	
	$(".enter").keypress(function(e) {
	    if(e.which == 13) {
	        $("#accesologin").trigger('click')
	    }
	});
	
});