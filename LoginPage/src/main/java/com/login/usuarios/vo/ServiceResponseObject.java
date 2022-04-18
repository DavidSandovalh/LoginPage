package com.login.usuarios.vo;

import java.io.Serializable;

public class ServiceResponseObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ServiceResponseObject() {
		super();
	}
	
	private boolean success;
	private String mensaje;
	private Object result;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}

}
