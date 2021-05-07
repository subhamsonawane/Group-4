package com.capgemini.qoute.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capgemini.quote.entity.Account;
import com.capgemini.quote.util.JPAUtil;

public class ImplAccountDao implements IAccountDao {

	private EntityManager em;	
	
	public ImplAccountDao() {
		em = JPAUtil.getEntityManager();
	}
	@Override
	public void createAccount(Account acc) {
		em.getTransaction().begin();
		em.persist(acc);
		em.getTransaction().commit();
		System.out.println("Record Added");
	}

}
