package com.niit.java.exceptionhandling;

public class ExceptionFinallyDemo {
	public void display()
	{
		Employee emp1;
	
		try {
			 emp1 = new Employee();
			
			
			emp1.setId(101);
			emp1.setName("Yogender");
			emp1.setSalary(20000);
			
			System.out.println(emp1.getId());
			System.out.println(emp1.getName());
			System.out.println(emp1.getSalary());
		} catch (NullPointerException e) {
			System.out.println("employee does not exit");
		}
		finally {
			System.out.println("emp1 going to set null");
			emp1=null;
			
		}
	}
	public static void main(String[] args) {
		ExceptionFinallyDemo demo = new ExceptionFinallyDemo();
		demo.display();
		
	}

}
