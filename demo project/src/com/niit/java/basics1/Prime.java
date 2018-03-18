package com.niit.java.basics1;

public class Prime {
	static boolean isPrime(int x)
	{
		boolean isPrimeNumber=true;
		for(int i=2; i<x; i++)
		{
			if(x%i==0)
			{
				isPrimeNumber=false;
			}
		}
		return isPrimeNumber;
	}
	public static void main(String[] args)
	{
		System.out.println(isPrime(3));
	}

}
