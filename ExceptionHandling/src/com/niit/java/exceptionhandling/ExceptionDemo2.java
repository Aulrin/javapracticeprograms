package com.niit.java.exceptionhandling;

public class ExceptionDemo2 {
	public void display(int A[])
	{
		System.out.println(A[5]);
	}
	public static void main(String[] args) {
		ExceptionDemo2 ex = new ExceptionDemo2();
		int A[]= {1,2,3,4,5};
		ex.display(A);
		
	}

}
