package com.capgemini.quote.entity;

public class Policy {
	
	int policy_Number;
	double premium;
	Account account_number;
	
	
	public Policy(int policy_Number, double premium, Account account_number) {
		super();
		this.policy_Number = policy_Number;
		this.premium = premium;
        this.account_number=account_number;
	    
	}
	public Policy() {
		
	}
	
	public int getPolicy_Number() {
		return policy_Number;
	}
	public void setPolicy_Number(int policy_Number) {
		this.policy_Number = policy_Number;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	@Override
	public String toString() {
		return "Policy [policy_Number=" + policy_Number + ", premium=" + premium + ", account_number=" + account_number
				+ "]";
	}
	

}
