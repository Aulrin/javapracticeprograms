package com.niit.java.userdefinedexception;

public class MinimumBalanceException extends Exception{
	public MinimumBalanceException()
	{
		super("please maintain minimum balance 10000");
	}

}
