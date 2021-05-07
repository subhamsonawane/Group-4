package com.capgemini.quote.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {

	@Id
	@Column(name="RoleCode")
	int RoleCode;
	
	@Column(name="RoleName")
	String RoleName;
	public Role(int roleCode, String roleName) {
		super();
		RoleCode = roleCode;
		RoleName = roleName;
	}
	public Role() {
		super();
	}
	public int getRoleCode() {
		return RoleCode;
	}
	public void setRoleCode(int roleCode) {
		RoleCode = roleCode;
	}
	public String getRoleName() {
		return RoleName;
	}
	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
	@Override
	public String toString() {
		return "\nRoleCode=" + RoleCode + ", RoleName=" + RoleName;
	}
	
	
}
