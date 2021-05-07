package com.capgemini.quote.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRole")
public class User {

	@Id
	public String UserName;
	public String Password;
	public String Rolecode;

	public User(String userName, String password, String roleCode) {
		super();
		UserName = userName;
		Password = password;
		Rolecode = roleCode;
	}
	public User() {
		super();
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRoleCode() {
		return Rolecode;
	}
	public void setRoleCode(String roleCode) {
		Rolecode = roleCode;
	}
	@Override
	public String toString() {
		return "UserRole [UserName=" + UserName + ", Password=" + Password + ", RoleCode=" + Rolecode + "]";
	}
	
	
}
