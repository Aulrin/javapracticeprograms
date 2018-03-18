package com.niit.java.multi;

public class TestMyThread {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		for(int i=1;i<=100;i++)
		{
			System.out.println("Main thread"+i);
		}
	}

}
