package com.login.usuarios.vo;

import java.io.Serializable;

import com.google.gson.Gson;

public class UsuarioVO implements Serializable{

	/**
	 * ID CLASS
	 */
	private static final long serialVersionUID = 3357992610800335875L;
	
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
	private Integer dcr_reset_pass;
	
	private String VE_POSICION;
	
	
	/**
	 * complemento para el flujo
	 */
	private Integer duo_idD;
	private String duo_first_nameD;
	private Integer duo_idAd;
	private String duo_first_nameAd;
	
	/**
	 * Complementos para cambio de credencial
	 */
	private String credencial;
	private String credencialConfirm;
	private Integer duo_id_reasignacion;
	
	public UsuarioVO() {
		super();
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
	public Integer getDuo_idD() {
		return duo_idD;
	}
	public void setDuo_idD(Integer duo_idD) {
		this.duo_idD = duo_idD;
	}
	public String getDuo_first_nameD() {
		return duo_first_nameD;
	}
	public void setDuo_first_nameD(String duo_first_nameD) {
		this.duo_first_nameD = duo_first_nameD;
	}
	public String getCredencial() {
		return credencial;
	}
	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
	public String getCredencialConfirm() {
		return credencialConfirm;
	}
	public void setCredencialConfirm(String credencialConfirm) {
		this.credencialConfirm = credencialConfirm;
	}
	public Integer getDcr_reset_pass() {
		return dcr_reset_pass;
	}
	public void setDcr_reset_pass(Integer dcr_reset_pass) {
		this.dcr_reset_pass = dcr_reset_pass;
	}
	public Integer getDuo_id_reasignacion() {
		return duo_id_reasignacion;
	}
	public void setDuo_id_reasignacion(Integer duo_id_reasignacion) {
		this.duo_id_reasignacion = duo_id_reasignacion;
	}
	
	public String getVE_POSICION() {
		return VE_POSICION;
	}
	public void setVE_POSICION(String vE_POSICION) {
		VE_POSICION = vE_POSICION;
	}
	
	public Integer getDuo_idAd() {
		return duo_idAd;
	}
	public void setDuo_idAd(Integer duo_idAd) {
		this.duo_idAd = duo_idAd;
	}
	public String getDuo_first_nameAd() {
		return duo_first_nameAd;
	}
	public void setDuo_first_nameAd(String duo_first_nameAd) {
		this.duo_first_nameAd = duo_first_nameAd;
	}
	
	@Override
	public String toString() {
		try {
			return new Gson().toJson(this);
		} catch (Exception e) {
			return super.toString();
		}
		
	}
}
