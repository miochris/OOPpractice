package com.fdmgroup.bankaccount;

public class PersonalSavingAccount extends SavingAccount implements PersonalAccountInterface{

	public PersonalSavingAccount(int accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}
	
	public void setBalanceToZero(){

		correctBalance(0);
			
		
	}

	@Override
	public String toString() {
		return "PersonalSavingAccount [getAccountId()=" + getAccountId() + "]";
	};
	
	

	
	
}
