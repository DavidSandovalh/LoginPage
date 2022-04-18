<div class="modal fade" id="modalNuevoAdmin" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered modal-lg" style="max-width: 360px;" role="z">
		<div class="modal-content">
			<div class="modal-header">
				<span class="semibold font-16 genericColorgrayishBlue">Nuevo administrador</span>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span>&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Nombre</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="nuevoAdminNombre">
					</div>

					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Apellidos</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="nuevoAdminApellido">
					</div>

					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">N&uacute;mero de empleado</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="nuevoAdminNumeroEmpleado">
					</div>
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Correo electr&oacute;nico</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="nuevoAdminCorreoElectronico">
					</div>
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">validar correo electr&oacute;nico</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="nuevoAdminCorreoElectronicoValidarCorreo" autocomplete="off">
					</div>
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Rol Usuario</span>
					</div>
					<div class="col-12">
						<select id="nuevoRol" class="selectpicker selectClr" data-live-search="true">
						</select>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<div class="row">
					<div class="col-12">
						<button type="button" class="btn cancelButton" data-dismiss="modal">Cancelar</button>
						<button onclick="crearNuevoUsuario()" type="button" class="btn mainButton">Guardar</button>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>
