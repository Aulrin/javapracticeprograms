package com.niit.java.interfaces;

public class TestAccount {
	public static void main(String[] args) {
		Account da=new DepositAccount();
		Account ca=new CurrentAccount();
		
		da.openAccount();
		da.deposit(8000);
		da.withdraw(1000);
		da.closeAccount();
		da.getBalance();
		
		ca.openAccount();
		ca.deposit(8000);
		ca.withdraw(2000);
		ca.closeAccount();
		ca.getBalance();
	}

}
