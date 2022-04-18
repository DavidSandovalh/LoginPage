package com.login.usuarios.security;

import java.io.UnsupportedEncodingException;
import java.util.Collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.login.usuarios.service.impl.UserServiceImpl;
import com.login.usuarios.util.Crypto;
import com.login.usuarios.vo.UserVO;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{
	
	private static final Logger logger =  LogManager.getLogger(CustomAuthenticationProvider.class);
	
	@Autowired
	private UserServiceImpl usuario;
	
	Crypto crypto = new Crypto();

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String credencial = authentication.getCredentials().toString();
		
		try {
			credencial = new String(credencial.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new BadCredentialsException("Contraseña incorrecta. causa : " + e.getMessage() );
		}
		
		logger.info("Usuario: " + username);
		
		UserVO user = usuario.getLoginRol(username);
		
		//Descencriptar credencial obtenida de la BD
		String credencialDecencriptada = "";
		try {
			credencialDecencriptada = crypto.Desencriptar(user.getCredencial());
			user.setCredencial(credencialDecencriptada);
			
		} catch (Exception e) {
			throw new BadCredentialsException("Contraseña incorrecta. causa : " + e.getMessage() );
		}
		
		
		if (user.getNumEmpleado() == null) {
			logger.info("Usuario no encontrado.");
			throw new BadCredentialsException("Usuario no encontrado.");
		}
		
		Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
		Authentication authenticationToken = new UsernamePasswordAuthenticationToken(user, user.getPassword(), authorities);
		credencial=null;
		return authenticationToken;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}