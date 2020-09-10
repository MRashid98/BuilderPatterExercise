package com.qa.main;

public class BankAccountBuilder {

	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;

	public BankAccountBuilder(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BankAccountBuilder withOwner(String owner) {
		this.owner = owner;
		return this;
	}

	public BankAccountBuilder atBranch(String branch) {
		this.branch = branch;
		return this;
	}

	public BankAccountBuilder atBalance(double balance) {
		this.balance = balance;
		return this;
	}

	public BankAccountBuilder atInterestRate(double interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public BankAccount build() {
		return new BankAccount(accountNumber, owner, branch, balance, interestRate);
	}
}
