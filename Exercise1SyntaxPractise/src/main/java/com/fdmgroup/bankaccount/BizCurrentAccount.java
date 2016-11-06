package com.fdmgroup.bankaccount;

public class BizCurrentAccount extends CurrentAccount implements BizAccountInterface{

	public BizCurrentAccount(int accountBalance) {
		super(accountBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BizCurrentAccount [getAccountId()=" + getAccountId() + "]";
	}
	

	

}
