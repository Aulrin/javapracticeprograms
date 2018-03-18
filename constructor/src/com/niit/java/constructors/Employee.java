package com.niit.java.constructors;

public class Employee {
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	
	}
	void info()
	{
		System.out.println("Id:"+id+" Name:"+name+" Salary:"+salary);
	}
	

}
