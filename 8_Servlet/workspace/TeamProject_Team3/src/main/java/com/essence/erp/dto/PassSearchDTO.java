package com.essence.erp.dto;

public class PassSearchDTO {

	private String u_id;
	private String u_pwd;
	private String u_name;
	private String u_email;
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public PassSearchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassSearchDTO(String u_id, String u_pwd, String u_name, String u_email) {
		super();
		this.u_id = u_id;
		this.u_pwd = u_pwd;
		this.u_name = u_name;
		this.u_email = u_email;
	}
	
	
	
}
