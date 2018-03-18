package com.niit.java.operation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	public void displayEmployee(List<Employee>emplist)
	{
		for(Employee emp:emplist)
		{
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
	}
	public List<Employee> createEmployeeList() {
		List<Employee> EmployeeList=new ArrayList<Employee>();
		Employee emp;
		
		emp=new Employee(101,"anand",10000);
		EmployeeList.add(emp);
		
		emp=new Employee(102,"amrit",30000);
		EmployeeList.add(emp);
		
		emp=new Employee(103,"rupsa",40000);
		EmployeeList.add(emp);
		
		emp=new Employee(104,"ajith",20000);
		EmployeeList.add(emp);
		
		return EmployeeList;
	}
	public boolean exist(List<Employee> empList,int id)
	{for(Employee emp:empList)
	{
		if(emp.getId()==id)
		{
			return true;
		}
	}
	return false;
	}
	public static void main(String[] args) {
		EmployeeList List=new EmployeeList();
		List<Employee> EmployeeList=List.createEmployeeList();
		List.displayEmployee(EmployeeList);
		System.out.println(List.exist(EmployeeList, 101));
				
	}

}
