package com.login.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.login.usuarios.service.AdminSistemasService;
import com.login.usuarios.vo.ServiceResponseObject;

@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.OPTIONS}, allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method", "Access-Control-Request-Headers"}, exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"})
public class AdminSistemasController {
	
	@Autowired
	AdminSistemasService adminSistemasService;
	
	@PostMapping("/consulta_Administrador")
	@ResponseBody
	public ServiceResponseObject consulta_Administrador() {
		return adminSistemasService.consulta_Administradores();
	}
	
	@PostMapping("/consulta_Usu_estatus")
	@ResponseBody
	public ServiceResponseObject consulta_Usu_estatus(String status) {
		return adminSistemasService.consulta_Usu_estatus(status);
	}
	
	@PostMapping("/consultar_info_administrador_llave")
	@ResponseBody
	public ServiceResponseObject consultar_info_administrador_llave(String login) {
		return adminSistemasService.consultar_info_administrador_id(login);
	}
	
	@PostMapping("/baja_usuario")
	@ResponseBody
	public ServiceResponseObject baja_usuario(String login) {
		return adminSistemasService.baja_usuario(login);
	}
}
