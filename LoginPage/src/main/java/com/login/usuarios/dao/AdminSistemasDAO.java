package com.login.usuarios.dao;

import java.util.List;
import java.util.Map;

public interface AdminSistemasDAO {
	List<Map<String, Object>> consulta_Administradores();
	List<Map<String, Object>> consulta_Usu_estatus(String status);
	List<Map<String, Object>> consultar_info_administrador_id(String dUO_ID);
	Integer baja_usuario(String login);
}
