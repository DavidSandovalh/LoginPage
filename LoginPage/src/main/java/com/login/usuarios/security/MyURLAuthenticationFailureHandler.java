package com.login.usuarios.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class MyURLAuthenticationFailureHandler implements AuthenticationFailureHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		
		
		if(session.getAttribute("ip") == null) {
			redirectStrategy.sendRedirect(request, response, "/logeo?Error=Credenciales incorrectas");
		
		} else { 
			if(request.getRemoteAddr().equals(session.getAttribute("ip"))) { 
				redirectStrategy.sendRedirect(request, response, "/logeo?Error=Credenciales incorrectas");
			}
		
	    }

	}
}
