package com.capgemini.quote.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

	@Id
	double Account_Number;
	String Insured_Name;
	String Insured_Street;
	String Insured_City;
	String Insured_State ;
	String Insured_Zip;
	String Business_Segment_Name; 
	String User_Name;


	public Account(double account_Number, String insured_Name, String insured_Street, String insured_City,
			String insured_State, String insured_Zip, String business_Segment_Name, String user_Name) {
		super();
		Account_Number = account_Number;
		Insured_Name = insured_Name;
		Insured_Street = insured_Street;
		Insured_City = insured_City;
		Insured_State = insured_State;
		Insured_Zip = insured_Zip;
		Business_Segment_Name = business_Segment_Name;
		User_Name = user_Name;
	}

	public Account() {
		super();
	}
	
	public double getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(double account_Number) {
		Account_Number = account_Number;
	}
	public String getInsured_Name() {
		return Insured_Name;
	}
	public void setInsured_Name(String insured_Name) {
		Insured_Name = insured_Name;
	}
	public String getInsured_Street() {
		return Insured_Street;
	}
	public void setInsured_Street(String insured_Street) {
		Insured_Street = insured_Street;
	}
	public String getInsured_City() {
		return Insured_City;
	}
	public void setInsured_City(String insured_City) {
		Insured_City = insured_City;
	}
	public String getInsured_State() {
		return Insured_State;
	}
	public void setInsured_State(String insured_State) {
		Insured_State = insured_State;
	}
	public String getInsured_Zip() {
		return Insured_Zip;
	}
	public void setInsured_Zip(String insured_Zip) {
		Insured_Zip = insured_Zip;
	}
	public String getBusiness_Segment_Name() {
		return Business_Segment_Name;
	}
	public void setBusiness_Segment_Name(String business_Segment_Name) {
		Business_Segment_Name = business_Segment_Name;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	@Override
	public String toString() {
		return "Account [Account_Number=" + Account_Number + ", Insured_Name=" + Insured_Name + ", Insured_Street="
				+ Insured_Street + ", Insured_City=" + Insured_City + ", Insured_State=" + Insured_State
				+ ", Insured_Zip=" + Insured_Zip + ", Business_Segment_Name=" + Business_Segment_Name + ", User_Name="
				+ User_Name + "]";
	}

	
}
