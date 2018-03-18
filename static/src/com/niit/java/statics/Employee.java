package com.niit.java.statics;

//program to display how many employee are there

public class Employee {
	private static int count=0;
	public Employee()
	{
		count++;
	}
	public static int getcount()
	{
		return count;
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		Employee emp4=new Employee();
		Employee emp5=new Employee();
		Employee emp6=new Employee();
		Employee emp7=new Employee();
		
		System.out.println(getcount());
	}


}
