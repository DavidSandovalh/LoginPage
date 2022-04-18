package com.login.usuarios.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.login.usuarios.dao.SelectUserDAOInt;
import com.login.usuarios.vo.UserVO;

public class MyUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
	private SelectUserDAOInt selectUserDAOInt;
	
	private static final Logger logger = LogManager.getLogger(MyUrlAuthenticationSuccessHandler.class);
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		try {
			
			UserVO user = (UserVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			
			String urlRedirect = "";
			request.getSession().setAttribute("user", user);
			
			Integer numUpdate = selectUserDAOInt.updateUltimaSesion( user.getDuo_user_name());
			if( numUpdate.equals(new Integer("1")) ){
				logger.info("Se actualizo la fecha de IS con &eacute;xito : {}.", user.getDuo_user_name() );
			}else{
				logger.info("No se puedo actualizar la fecha de IS : {}.", user.getDuo_user_name() );
			}
			
			final Collection<? extends GrantedAuthority> authorities  = authentication.getAuthorities();
			for (final GrantedAuthority grantedAuthority : authorities) {
				
				String authorityName = grantedAuthority.getAuthority();

				logger.info("Datos del authority: " + authorityName);
				
				switch (authorityName) {
				case "ROLE_ADMIN_SISTEMAS":
					urlRedirect = "/adminSistemas";
					break;
				default:
					urlRedirect = "/exit";
					break;
				}

			}

			redirectStrategy.sendRedirect(request, response, urlRedirect);

		} catch (Exception e) {
			redirectStrategy.sendRedirect(request, response, "/exit");
			logger.error("Error: ",  e);
		}
	}

}
