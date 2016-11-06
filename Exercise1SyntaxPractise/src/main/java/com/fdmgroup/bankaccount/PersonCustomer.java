package com.fdmgroup.bankaccount;

import java.util.ArrayList;

public class PersonCustomer extends Customer{

	public PersonCustomer(String newCustomerName, String newCustomerAddress, int newTexIdNumber) {
		super(newCustomerName, newCustomerAddress, newTexIdNumber);
		
		//accountList = new ArrayList<BankAccount>();
	}
	
	
	public void setAllAccountsTo0 (){

	for (BankAccount b : accountList){
		

			b.correctBalance(0);
			
		
		
	}
	}
//	public PersonCustomer(String newCustomerName, String newCustomerAddress, int newTexIdNumber, ArrayList<BankAccount> bankAccountList) {
//		super(newCustomerName, newCustomerAddress, newTexIdNumber);
//		// TODO Auto-generated constructor stub
//	}
//	
	
// PersonCustomer pC1 = PersonCustomer("","",2); 
	
	

}
