package com.niit.java.datahiding;

public class TestEmployee {
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.setId(100);
		emp.setName("anand");
		emp.setSalary(20000);
	
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}

