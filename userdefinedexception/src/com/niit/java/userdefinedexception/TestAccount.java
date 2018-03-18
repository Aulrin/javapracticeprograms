package com.niit.java.userdefinedexception;

public class TestAccount {
	public static void main(String[] args) {
		Account ac=new Account();
		try
		{
			ac.withdraw(5000);
			System.out.println("Your Transcation is Sucessfull");
		}catch(MinimumBalanceException e)
		{
			System.out.println("your transaction is fail");
			e.printStackTrace();
		}
		
	}

}
