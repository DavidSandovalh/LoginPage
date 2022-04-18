/**
 * 
 */
 function loadingShow(mensaje){
	$('#MensajeLoad').html(mensaje);
	$('#modalLoading').modal({
		keyboard : false,
		backdrop : 'static'
	});
}

function loadingHide(){
	setTimeout(function(){
		$('#MensajeLoad').text('');
		$('#modalLoading').modal('hide');
	}, 700);
}

function loadingHideWait(){
	try {
		var def = $.Deferred();
		setTimeout(function(){
		   	$('#MensajeLoad').text('');
		   	$('#modalLoading').modal('hide');
		   	setTimeout(function(){
		   		def.resolve(true);
			}, 350);
	   }, 600);
	} catch (e) {
		def.reject(e)
	}
	return def.promise();
}

function getContextPath() {
	  return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	}

function getUrlParameter(sParam) {
    var sPageURL = window.location.search.substring(1), sURLVariables = sPageURL.split('&'), sParameterName, i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);
        }
    }
};
