package com.fdmgroup.bankaccount;

public class PersonalCurrentAccount extends CurrentAccount implements PersonalAccountInterface{

	public PersonalCurrentAccount(int accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}
	
	public void setBalanceToZero(){

		correctBalance(0);
			
		
	}

	@Override
	public String toString() {
		return "PersonalCurrentAccount [getAccountId()=" + getAccountId() + "]";
	};
	
	

	 
	 
	 
	 

}
