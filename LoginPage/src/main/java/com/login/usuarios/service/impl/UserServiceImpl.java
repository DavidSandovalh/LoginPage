package com.login.usuarios.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.login.usuarios.dao.SelectUserDAOInt;
import com.login.usuarios.service.UserService;
import com.login.usuarios.util.Crypto;
import com.login.usuarios.vo.Role;
import com.login.usuarios.vo.UserVO;


@Service
public class UserServiceImpl implements UserService{
	
	private static final Logger logger =  LogManager.getLogger(UserServiceImpl.class);
	
	@Autowired
	SelectUserDAOInt selectUserDAOInt;
	
	@Autowired
	private Crypto crypto;

	
	@Override
	public String getDummy() {		
		return selectUserDAOInt.getDummy();
	}


	@Override
	public UserVO getLoginRol(String user) throws UsernameNotFoundException{
		
		UserVO logeo = new UserVO();
		
		try {
			logeo = (UserVO) selectUserDAOInt.getLoginRol(user);
			
			final String rol = logeo.getRol();
			Role r = new Role();

			if(rol.trim().toUpperCase().contains("1")) {
				r.setName("ROLE_ADMIN_SISTEMAS");
				logger.info("***** Role Administrador de Sistemas *****");
			}else{
				r.setName("NOSE");
				logger.info("***** Role X *****");
			}	/**/
			List<Role> roles = new ArrayList<Role>();
			roles.add(r);
			logeo.setAuthorities(roles);
			
		}catch (Exception e) {
			logger.info("Error: ", e);
		}
		
		return logeo;
	}
	
	public Crypto getCrypto() {
		return crypto;
	}
	
}
