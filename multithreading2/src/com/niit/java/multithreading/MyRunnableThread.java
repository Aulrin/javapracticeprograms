package com.niit.java.multithreading;

public class MyRunnableThread implements Runnable{
	public void run()
	{
		System.out.println("In run method of Myrunnable thread");
	}
	int table=5;
	{
	for(int i=1;i<=100;i++)
	{
	System.out.println(table+"*"+i+"="+table*i);	
	}}

}
