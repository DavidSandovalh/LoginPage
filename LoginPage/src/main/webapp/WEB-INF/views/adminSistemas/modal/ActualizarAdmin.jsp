<div class="modal fade" id="modalActualizarAdmin" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered modal-lg" style="max-width: 360px;" role="z">
		<div class="modal-content">
			<div class="modal-header">
				<span class="semibold font-16 genericColorgrayishBlue">Actualizar administrador</span>
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
						<input class="form-control" type="text" id="actualizarAdminNombre" disabled>
					</div>

					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue" disabled>Apellidos</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="actualizarAdminApellidos" disabled>
					</div>

					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">N&uacute;mero de empleado</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="actualizarAdminNumeroEmpleado" disabled>
					</div>
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Correo electr&oacute;nico</span>
					</div>
					<div class="col-12">
						<input class="form-control" type="text" id="actualizarAdminCorreoElectronico" disabled>
					</div>
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Rol Usuario</span>
					</div>
					<div class="col-12">
						<select id="actualizarAdminRol" class="selectpicker selectClr" data-live-search="true" disabled>
						</select>
					</div>
					<div class="col-12">
						<span class="medium font-14 genericColorgrayishBlue">Estatus</span>
					</div>
					<div class="col-12">
						<select id="actualizarAdminEstatus" class="selectpicker selectClr" data-live-search="true">
							<option value="1">Activo</option>
							<option value="0">Inactivo</option>
						</select>
					</div>

				</div>
			</div>
			<div class="modal-footer">
				<div class="row">
					<div class="col-12">
						<button type="button" class="btn cancelButton" data-dismiss="modal">Cancelar</button>
						<button id="btnActualizarAdmin" type="button" class="btn mainButton">Actualizar</button>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>
