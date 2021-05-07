package com.capgemini.quote.user;

import java.util.Scanner;

import com.capgemini.qoute.dao.IAccountDao;
import com.capgemini.qoute.dao.IUserRoleDao;
import com.capgemini.qoute.dao.ImplAccountDao;
import com.capgemini.qoute.dao.ImplUserRoleDao;
import com.capgemini.quote.entity.Account;

import com.capgemini.quote.entity.User;

public class TestUser {
	static IUserRoleDao dao = new ImplUserRoleDao();
	static IAccountDao daoAccount = new ImplAccountDao();
	static Account acc;
	static String userName = null, cont = null;
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

//		System.out.println(dao.getRoleList());
//		String userType = sc.next();
//
//		System.out.println("Please Enter Your RoleCode");		
//		if (userType.equals("1")) {
//			methodInsured();
//		} else if (userType.equals("2")) {
//			methodAgent();
//		} else if(userType.equals("3")) {
//			methodAdmin();
//		}
		
		User user = new User("Monu","Monu123","1");
//		dao.createUser(user);
//		System.out.println(dao.getUserById("Monu"));
		
		acc = new Account(5525252,"ABC","street","mumbai","maharastra","424001","BUSINESSAUTO","jay");
		daoAccount.createAccount(acc);
		
	}

	public static void methodInsured() {
		do {
			System.out.println("1. Create Account");
			System.out.println("2. View Ploicy");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				String insuredName,insuredStreet,insuredCity,insuredState,busSegName;
				int insuredZip;
				double accountNumber;
				
				User userName;

				System.out.println("Enter Name : ");
				insuredName = sc.next();
				System.out.println("Enter Street : ");
				insuredStreet = sc.next(); 
 
				System.out.println("Enter City : ");
				insuredCity = sc.next();
				System.out.println("Enter State : ");
				insuredState = sc.next();
				System.out.println("Enter Business Segment Name: ");
				busSegName = sc.next();
				System.out.println("Enter Zip Code : ");
				insuredZip = sc.nextInt();
				System.out.println("Enter Account Number : ");
				accountNumber = sc.nextDouble();
				break;
			default:
				System.out.print("You have entered wrong choice\nPlease try again...");
				methodAdmin();
				break;
			}
			System.out.println("Do you want to continue enter 'yes' or 'no'");
			cont = sc.next();
		} while (cont.equals("yes"));

		System.out.println("Thank You For Using Our System");
	}

	public static void methodAgent() {

	}

	public static void methodAdmin() {
		do {
			System.out.println("1. Role List");
			System.out.println("2. Get User Details");
			System.out.println("3. Login");
			System.out.println("4. Create User");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Role List:\n" + dao.getRoleList());
				break;
			case 2:
				System.out.println("Enter User Name : ");
				userName = sc.next();
				User u = dao.getUserById(userName);
				if (u == null) {
					System.out.println("User Not Found");
				} else {
					System.out.println(u);
				}
				break;
			case 3:
				System.out.print("Enter User Name : ");
				userName = sc.next();
				System.out.print("Enter Password : ");
				String password = sc.next();
				System.out.print("Enter RoleCode : ");
				String roleCode = sc.next();
				break;
			case 4:
				
				break;
			default:
				System.out.print("You have entered wrong choice\nPlease try again...");
				methodAdmin();
				break;
			}
			System.out.println("Do you want to continue enter 'yes' or 'no'");
			cont = sc.next();
		} while (cont.equals("yes"));

		System.out.println("Thank You For Using Our System");
	}
}
