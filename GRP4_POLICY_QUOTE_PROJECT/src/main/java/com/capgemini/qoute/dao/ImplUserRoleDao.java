package com.capgemini.qoute.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.capgemini.quote.entity.Role;
import com.capgemini.quote.entity.User;
import com.capgemini.quote.util.JPAUtil;

public class ImplUserRoleDao implements IUserRoleDao {

	private EntityManager em;

	public ImplUserRoleDao() {
		em = JPAUtil.getEntityManager();
	}

	@Override
	public User getUserById(String userid) {
		User user= em.find(User.class, userid); 
		return user;
	}

	@Override
	public List<Role> getRoleList() {
		List<Role> list = em.createQuery("SELECT a FROM Role a", Role.class).getResultList();
		return list ;
	}

	@Override
	public void createUser(User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}

}
