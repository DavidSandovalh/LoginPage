package com.login.usuarios.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.usuarios.dao.AdminSistemasDAO;
import com.login.usuarios.service.AdminSistemasService;
import com.login.usuarios.vo.ServiceResponseObject;

@Service
public class AdminSistemasServiceImpl implements AdminSistemasService{

	
	private static final Logger logger =  LogManager.getLogger(UserServiceImpl.class);
	@Autowired
	AdminSistemasDAO adminSistemasDAO;

	@Override
	public ServiceResponseObject consulta_Administradores() {
		logger.info("consulta_Administradores");
		ServiceResponseObject result = new ServiceResponseObject();
		try {
			List<Map<String, Object>> administradores = adminSistemasDAO.consulta_Administradores();
			logger.info("catalogo.size:: "+administradores.size());
			result.setResult(administradores);
			if(administradores.size()>0) {
				result.setSuccess(true);
			}else {
				result.setSuccess(false);
				result.setMensaje("Ha ocurrido un problema al consultar datos de la BD, vuelva a intentarlo mas tarde.");
			}
		} catch (Exception e) {
			logger.info("Error al consultar administradores: "+e.getMessage()+"\n"+e);
			result.setSuccess(false);
			result.setMensaje("Error al crear registro de administrador code: "+e.getMessage());
		}
		return result;
	}
	
	@Override
	public ServiceResponseObject consulta_Usu_estatus(String status) {
		logger.info("consulta_Usu_estatus");
		ServiceResponseObject result = new ServiceResponseObject();
		try {
			List<Map<String, Object>> administradores = adminSistemasDAO.consulta_Usu_estatus(status);
			logger.info("catalogo.size:: "+administradores.size());
			result.setResult(administradores);
			if(administradores.size()>0) {
				result.setSuccess(true);
			}else {
				result.setSuccess(false);
				result.setMensaje("No existen datos en la Base de datos.");
			}
		} catch (Exception e) {
			logger.info("Error al consultar administradores: "+e.getMessage()+"\n"+e);
			result.setSuccess(false);
			result.setMensaje("Error al crear registro de administrador code: "+e.getMessage());
		}
		return result;
	}
	
	@Override
	public ServiceResponseObject consultar_info_administrador_id(String DUO_ID) {
		logger.info("consultar_info_administrador_id(DUO_ID : "+DUO_ID+")");
		ServiceResponseObject result = new ServiceResponseObject();
		try {
			List<Map<String, Object>> admin = adminSistemasDAO.consultar_info_administrador_id(DUO_ID);
			logger.info("admin.size:: "+admin.size());
			
			if(admin.size()>0) {
				result.setSuccess(true);
				result.setResult(admin.get(0));
			}else {
				result.setSuccess(false);
				result.setMensaje("Ha ocurrido un problema al consultar datos de la BD, vuelva a intentarlo mas tarde.");
			}
		} catch (Exception e) {
			logger.info("Error al consultar administradores: "+e.getMessage()+"\n"+e);
			result.setSuccess(false);
			result.setMensaje("Error al consultar registro de administrador code: "+e.getMessage());
		}
		return result;
	}
	
	@Override
	public ServiceResponseObject baja_usuario(String login) {
		logger.info("baja_usuario(login : "+login+")");
		ServiceResponseObject result = new ServiceResponseObject();
		try {
			Integer valueDelete = adminSistemasDAO.baja_usuario(login);
			logger.info("admin.size:: "+valueDelete);
			
			if(valueDelete>0) {
				result.setSuccess(true);
				result.setResult(valueDelete);
			}else {
				result.setSuccess(false);
				result.setMensaje("Ha ocurrido un problema al consultar datos de la BD, vuelva a intentarlo mas tarde.");
			}
		} catch (Exception e) {
			logger.info("Error al eliminar usuario: "+e.getMessage()+"\n"+e);
			result.setSuccess(false);
			result.setMensaje("Error al eliminar registro code: "+e.getMessage());
		}
		return result;
	}
}
