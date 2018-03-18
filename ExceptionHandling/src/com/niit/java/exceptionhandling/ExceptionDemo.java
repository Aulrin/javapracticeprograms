package com.niit.java.exceptionhandling;

public class ExceptionDemo {

		
		//The class level object will null by default;
		
		public   float   divide(int x, int y)
		{
			//ArithmaticException
			return x/y;    //       20/0
		}
				
		public static void main(String[] args) {
			ExceptionDemo ex = new ExceptionDemo();
		  System.out.println(	ex.divide(20, 0));
			
		}

	}


