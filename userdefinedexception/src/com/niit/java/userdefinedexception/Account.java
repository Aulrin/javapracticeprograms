package com.niit.java.userdefinedexception;

public class Account {
	private int balance=12000;
	public void withdraw(int amount)throws MinimumBalanceException
	{
		balance=balance-amount;
		if(balance<10000)
		{
			throw new MinimumBalanceException();
		}
	}

}
