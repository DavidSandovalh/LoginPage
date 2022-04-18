package com.login.usuarios.common;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PagesCommon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Value("${page.home}")
	private String home;
	
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
}
