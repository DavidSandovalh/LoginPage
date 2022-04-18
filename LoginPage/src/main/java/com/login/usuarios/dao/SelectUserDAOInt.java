package com.login.usuarios.dao;

import org.apache.ibatis.annotations.Param;

import com.login.usuarios.vo.UserVO;

public interface SelectUserDAOInt {
	String getDummy();
	
	//FIN INICIO MODULO DE VENDEDORES
	UserVO getLoginRol(@Param("user") String user);
	
	Integer updateUltimaSesion(@Param("id") String id);
}
