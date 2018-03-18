package com.niit.java.exceptionhandling;

public class MultiCatch {
	public static void main(String[] s) {
		int result=0;
		try {
			result=Integer.parseInt(s[0])/Integer.parseInt(s[1]);
			System.out.println(result);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("plese give valid input");
			e.printStackTrace();
		}
		
	}

}
