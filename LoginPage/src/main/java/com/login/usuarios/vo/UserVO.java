package com.login.usuarios.vo;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

public class UserVO implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String numEmpleado;
	private String credencial;
	private String nombre;
	private String apellido;
	private String rol;
	private String email;
	private String FECHAALTA;
	private String FECHABAJA;
	private char STATUS;
	private float INTENTOS;
	private String FECHAREVOCADO;
	private String FECHA_VIGENCIA;
	private Integer NO_ACCESO;
	private String FECHAMODIFICACION;


	/* Spring Security related fields */
	private List<Role> authorities;
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;
	private Integer dcr_reset_pass;

	private Integer duo_id;
	private String duo_user_name;
	private Integer duo_enable;
	private String duo_first_name;
	private String duo_last_name;
	private String duo_id_distribuidor_sf;
	private String duo_email;
	private Integer dpu_id;
	private String duo_last_login_date;
	private String duo_created_date;
	private String duo_credencial;
	private Integer dou_id_parent;
	private String duo_distribuidor_salesforce;

	private String VE_POSICION;

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getCredencial() {
		return credencial;
	}

	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Role> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<Role> authorities) {
		this.authorities = authorities;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getDuo_id() {
		return duo_id;
	}

	public void setDuo_id(Integer duo_id) {
		this.duo_id = duo_id;
	}

	public String getDuo_user_name() {
		return duo_user_name;
	}

	public void setDuo_user_name(String duo_user_name) {
		this.duo_user_name = duo_user_name;
	}

	public Integer getDuo_enable() {
		return duo_enable;
	}

	public void setDuo_enable(Integer duo_enable) {
		this.duo_enable = duo_enable;
	}

	public String getDuo_first_name() {
		return duo_first_name;
	}

	public void setDuo_first_name(String duo_first_name) {
		this.duo_first_name = duo_first_name;
	}

	public String getDuo_last_name() {
		return duo_last_name;
	}

	public void setDuo_last_name(String duo_last_name) {
		this.duo_last_name = duo_last_name;
	}

	public String getDuo_id_distribuidor_sf() {
		return duo_id_distribuidor_sf;
	}

	public void setDuo_id_distribuidor_sf(String duo_id_distribuidor_sf) {
		this.duo_id_distribuidor_sf = duo_id_distribuidor_sf;
	}

	public String getDuo_email() {
		return duo_email;
	}

	public void setDuo_email(String duo_email) {
		this.duo_email = duo_email;
	}

	public Integer getDpu_id() {
		return dpu_id;
	}

	public void setDpu_id(Integer dpu_id) {
		this.dpu_id = dpu_id;
	}

	public String getDuo_last_login_date() {
		return duo_last_login_date;
	}

	public void setDuo_last_login_date(String duo_last_login_date) {
		this.duo_last_login_date = duo_last_login_date;
	}

	public String getDuo_created_date() {
		return duo_created_date;
	}

	public void setDuo_created_date(String duo_created_date) {
		this.duo_created_date = duo_created_date;
	}

	public String getDuo_credencial() {
		return duo_credencial;
	}

	public void setDuo_credencial(String duo_credencial) {
		this.duo_credencial = duo_credencial;
	}

	public Integer getDou_id_parent() {
		return dou_id_parent;
	}

	public void setDou_id_parent(Integer dou_id_parent) {
		this.dou_id_parent = dou_id_parent;
	}

	public String getDuo_distribuidor_salesforce() {
		return duo_distribuidor_salesforce;
	}

	public void setDuo_distribuidor_salesforce(String duo_distribuidor_salesforce) {
		this.duo_distribuidor_salesforce = duo_distribuidor_salesforce;
	}

	public Integer getDcr_reset_pass() {
		return dcr_reset_pass;
	}

	public void setDcr_reset_pass(Integer dcr_reset_pass) {
		this.dcr_reset_pass = dcr_reset_pass;
	}

	public String getVE_POSICION() {
		return VE_POSICION;
	}

	public void setVE_POSICION(String vE_POSICION) {
		VE_POSICION = vE_POSICION;
	}

	public String getFECHAALTA() {
		return FECHAALTA;
	}

	public void setFECHAALTA(String fECHAALTA) {
		FECHAALTA = fECHAALTA;
	}

	public String getFECHABAJA() {
		return FECHABAJA;
	}

	public void setFECHABAJA(String fECHABAJA) {
		FECHABAJA = fECHABAJA;
	}

	public char getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(char sTATUS) {
		STATUS = sTATUS;
	}

	public float getINTENTOS() {
		return INTENTOS;
	}

	public void setINTENTOS(float iNTENTOS) {
		INTENTOS = iNTENTOS;
	}

	public String getFECHAREVOCADO() {
		return FECHAREVOCADO;
	}

	public void setFECHAREVOCADO(String fECHAREVOCADO) {
		FECHAREVOCADO = fECHAREVOCADO;
	}

	public String getFECHA_VIGENCIA() {
		return FECHA_VIGENCIA;
	}

	public void setFECHA_VIGENCIA(String fECHA_VIGENCIA) {
		FECHA_VIGENCIA = fECHA_VIGENCIA;
	}

	public Integer getNO_ACCESO() {
		return NO_ACCESO;
	}

	public void setNO_ACCESO(Integer nO_ACCESO) {
		NO_ACCESO = nO_ACCESO;
	}

	public String getFECHAMODIFICACION() {
		return FECHAMODIFICACION;
	}

	public void setFECHAMODIFICACION(String fECHAMODIFICACION) {
		FECHAMODIFICACION = fECHAMODIFICACION;
	}

}
