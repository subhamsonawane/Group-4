package com.capgemini.qoute.dao;

import javax.persistence.EntityManager;

import com.capgemini.quote.entity.Policy;
import com.capgemini.quote.util.JPAUtil;

public class ImplPolicyDao implements IPolicyDao {
	private EntityManager em;
	
	public ImplPolicyDao()
	{
		em = JPAUtil.getEntityManager();	
		
	}
	
	public void createPolicy()
	{
		em.getTransaction().begin();
		
	}

	
}
