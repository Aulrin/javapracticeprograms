package com.niit.java.exceptionhandling;

public class ExceptionHandleDemo {
	public void divide(int x, int y)
	{
		try
		{
		System.out.println( x/y);
		}catch(ArithmeticException ex) {
			System.out.println("Please provide valid values");
			
		}
		
	}
	
	public void display(int A[])
	{
		try {
			System.out.println(A[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
	    System.out.println("This location does not exist");
		}
	}
	
	
	public static void main(String[] args) {
		ExceptionHandleDemo demo = new ExceptionHandleDemo();
		int A[]= {10,20,30,40,5};
		demo.divide(20, 0);
		demo.display(A);
	}

}
