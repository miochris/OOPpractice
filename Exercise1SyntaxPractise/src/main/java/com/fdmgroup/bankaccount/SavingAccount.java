package com.fdmgroup.bankaccount;

import java.util.ArrayList;

public abstract class SavingAccount extends BankAccount {
	
	double interestRate = 0.0;

	private int checkNumber;
	public SavingAccount(int accountBalance) {
		super(accountBalance);

	}

	@Override
	public void decreaseBalance(int withDrawAmount) {

		if (getAccountBalance() >= withDrawAmount) {
			super.decreaseBalance(withDrawAmount);
		}

		else {
			System.out.println("Cannot be over drawn.");
		}

	}
	
	
	 
	 
//	private void assignCheck(Check checkId){
//		
//		checkBook = new ArrayList<Check>();
//		
//	}
//	
	
	
//	private void addCheckToCheckBook(Check checkId){
//		checkBook.add(checkId);
//	}
//	
//	public void issueCheck(Check checkId){
//		decreaseBalance();
//	}


}
