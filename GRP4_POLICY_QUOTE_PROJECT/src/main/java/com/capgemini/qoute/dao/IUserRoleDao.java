package com.capgemini.qoute.dao;

import java.util.List;

import com.capgemini.quote.entity.Role;
import com.capgemini.quote.entity.User;

public interface IUserRoleDao {

	public User getUserById(String userid);
	public abstract List<Role> getRoleList();
	public void createUser(User user);
    
	
}
