package com.niit.java.multithreading;

public class MyRunnableThreadTest {
	public static void main(String[] args) {
		MyRunnableThread rThread=new MyRunnableThread();
		Thread t1=new Thread(rThread);
		t1.start();
		
		int table=6;
		{
		for(int i=1;i<=100;i++)
		{
		System.out.println(table+"*"+i+"="+table*i);	
		}}
	}

}
