package com.niit.java.basics1;

public class OddEven {
	static boolean isEven(int x)
	{
		if(x%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(isEven(10));
	}

}
