package com.login.usuarios.service;

import com.login.usuarios.vo.ServiceResponseObject;

public interface AdminSistemasService {
	ServiceResponseObject consulta_Administradores();
	ServiceResponseObject consulta_Usu_estatus(String status);
	ServiceResponseObject consultar_info_administrador_id(String dUO_ID);
	ServiceResponseObject baja_usuario(String login);
}
