package com.fdmgroup.bankaccount;

public class BizSavingAccount extends SavingAccount implements BizAccountInterface{

	public BizSavingAccount(int accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BizSavingAccount [getAccountId()=" + getAccountId() + "]";
	}
	

	
//	public BizSavingAccount(int accountId,int accountBalance){
//		this.accountId = accountId;
//		this.accountBalance = accountBalance;
//	}

	
}