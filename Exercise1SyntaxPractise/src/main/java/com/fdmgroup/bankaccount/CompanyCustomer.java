package com.fdmgroup.bankaccount;

public class CompanyCustomer extends Customer {

	public CompanyCustomer(String newCustomerName, String newCustomerAddress, int newTexIdNumber) {
		super(newCustomerName, newCustomerAddress, newTexIdNumber);
		// TODO Auto-generated constructor stub
	}

	public void addMoneyToAllAccount(int MoneyToAdd) {

		for (BankAccount c : accountList) {

			c.increaseBalance(MoneyToAdd);

		}
	}

}
