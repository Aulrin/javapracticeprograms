package com.niit.java.interfaces;

public class CurrentAccount extends Abstract{

	@Override
	public void openAccount() {
		System.out.println("open account");
	}

	@Override
	public void closeAccount() {
		System.out.println("close account");
	}

	@Override
	public void withdraw(int amount) {
		System.out.println(amount+"amount withdraw");
	}

	@Override
	public void deposit(int amount) {
		if(amount>5000)
		{
			amount=amount-100;
			System.out.println(amount+"amount deposit");
		}
	}

}
