package com.fdmgroup.bankaccount;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		// test increase account of Person 1 Account1
		PersonalCurrentAccount personalCurrentAccountOfPerson1A1 = new PersonalCurrentAccount(2000);
		PersonalCurrentAccount personalCurrentAccountOfPerson1A2 = new PersonalCurrentAccount(5000);
		PersonalSavingAccount personalSavingAccountOfPerson1A3 = new PersonalSavingAccount(25000);
		BizSavingAccount bizSavingAccountOfCompany1B1 = new BizSavingAccount(400000);
		BizSavingAccount bizSavingAccountOfCompany1B2 = new BizSavingAccount(530000);
		BizSavingAccount bizCurrentAccountOfCompany1B3 = new BizSavingAccount(8900000);

		
		// increase balance
		System.out.println("before deposit");
		System.out.println("balance of Person 1 " + personalSavingAccountOfPerson1A3.getAccountBalance());
		personalSavingAccountOfPerson1A3.increaseBalance(100);
		System.out.println("after deposit 100");
		System.out.println("balance of Person 1 " + personalSavingAccountOfPerson1A3.getAccountBalance());

		
		
		PersonCustomer person1 = new PersonCustomer("Tom", "2 Stw Street", 125);
		

		
		//person1.addAccount(personalCurrentAccountOfPerson1A1);

		
		person1.addAccountToCustomer(person1, personalCurrentAccountOfPerson1A1);
		person1.addAccountToCustomer(person1, personalSavingAccountOfPerson1A3);
		person1.addAccountToCustomer(person1, bizSavingAccountOfCompany1B1);
		
		
		
		CompanyCustomer comp1 = new CompanyCustomer("TDL", "1 Mars", 45885);
		

		comp1.addAccountToCustomer(comp1, bizSavingAccountOfCompany1B1);
		comp1.addAccountToCustomer(comp1, bizSavingAccountOfCompany1B2);
		comp1.addAccountToCustomer(comp1, bizCurrentAccountOfCompany1B3);
		comp1.addAccountToCustomer(comp1, personalSavingAccountOfPerson1A3);
		for (BankAccount b : comp1.accountList){
			System.out.println(b.toString() + " " + b.getAccountId() + " " + b.getAccountBalance());
		}
		
		// show account of customer Person1   name format not right  need to convert to string
		System.out.println("show account of Person1 Tom");
		
		System.out.println("customerId" + person1.getCustomerID());
		System.out.println("show account ID: " + personalCurrentAccountOfPerson1A2.getAccountId());
		System.out.println("show account2 ID: " + personalSavingAccountOfPerson1A3.getAccountId());
		for (BankAccount b : person1.accountList){
			System.out.println(b);
		}
		
		System.out.println("===================");
		System.out.println("show account of Company1 TDL");
		System.out.println("customerId" + comp1.getCustomerID());
		for (BankAccount b : comp1.accountList){
			System.out.println(b.toString() + " " + b.getAccountId() + " " + b.getAccountBalance());
		}
//		System.out.println("===================");
//		System.out.println("show account ID" + bizSavingAccountOfCompany1B1.getAccountId());
		
		
		System.out.println("===================");
		person1.setAllAccountsTo0();
		for (BankAccount b : person1.accountList){
			System.out.println(b.toString() + " " + b.getAccountId() + " " + b.getAccountBalance());
		}
		System.out.println("===================add money to all biz account of comp1");
		comp1.addMoneyToAllAccount(300);
		for (BankAccount c : comp1.accountList){
			System.out.println(c.toString() + " " + c.getAccountId() + " " + c.getAccountBalance());
		}
	
	}

}
