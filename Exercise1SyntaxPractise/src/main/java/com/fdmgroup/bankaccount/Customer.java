package com.fdmgroup.bankaccount;

import java.util.ArrayList;

public abstract class Customer {

	
	public int customerID;
	public String customerName;
	public String address;
	public int texIdNumber;
	
	
	public static int idCounter = 2000000 ;

	
	
	
	
	 public ArrayList<BankAccount> accountList;
	
	
	
	public Customer(String newCustomerName, String newCustomerAddress, int newTexIdNumber){
		idCounter = idCounter + 7;
		this.customerID = idCounter;
		this.customerName = newCustomerName;
		this.address = newCustomerAddress;
		this.texIdNumber = newTexIdNumber;
		accountList = new ArrayList<BankAccount>();
		
	}
	
	
	
	private void addAccount(BankAccount account){
		accountList.add(account);
	}
	
	
	
	
	public void addAccountToCustomer (Customer customer,BankAccount account) {
		if ((customer instanceof CompanyCustomer && account instanceof BizAccountInterface) || (customer instanceof PersonCustomer
				&& account instanceof PersonalAccountInterface)){
			
			customer.addAccount(account);
			
		}
		
		
	}
	
	
	

	
	ArrayList<BankAccount> customerAccountList = new ArrayList<BankAccount>();
	
	

	public int getCustomerID() {
		return customerID;
	}


//	public void setCustomerID(int customerID) {
//		this.customerID = customerID;
//	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getTexIdNumber() {
		return texIdNumber;
	}


	public void setTexIdNumber(int texIdNumber) {
		this.texIdNumber = texIdNumber;
	}
	
	
}
