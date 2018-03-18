package com.niit.java.multi;

public class MyThread extends Thread{
	public void run()
	{
		System.out.println("inside run method");
		for(int i=1;i<=100;i++)
		{
			System.out.println("Mythread"+i);
		}
	}

}
