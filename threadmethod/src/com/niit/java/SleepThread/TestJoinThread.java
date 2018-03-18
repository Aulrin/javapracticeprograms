package com.niit.java.SleepThread;

public class TestJoinThread {
	public static void main(String[] args) {
		
		JoinThread t1=new JoinThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int t=7;
		for(int i=0;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+t*i);
		}
	}

}
