package com.qa.main;

public class Main {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccountBuilder(12346789)
				.withOwner("Azwad")
				.atBranch("HSBC")
				.atBalance(10000)
				.atInterestRate(2.5)
				.build();
		
		System.out.println(acc);
				
	}

}
