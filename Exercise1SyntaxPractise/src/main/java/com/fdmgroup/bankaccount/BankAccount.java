package com.fdmgroup.bankaccount;

public abstract class BankAccount {

	private static int accountIdCounter = 1000;

	private int accountId;
	private int accountBalance;

	public BankAccount(int accountBalance) {
		accountIdCounter = accountIdCounter + 5;
		accountId = accountIdCounter;
		increaseBalance(accountBalance);
	}

	public void increaseBalance(int depositAmount) {
		accountBalance = accountBalance + depositAmount;
	}

	public void decreaseBalance(int withDrawAmount) {
		accountBalance = accountBalance - withDrawAmount;

	}

	public void correctBalance(int newBalance) {
		accountBalance = newBalance;

	}

	public int getAccountId() {
		return accountId;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

}
