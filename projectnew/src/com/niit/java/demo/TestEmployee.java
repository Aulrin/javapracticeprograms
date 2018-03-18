package com.niit.java.demo;

public class TestEmployee {
	public static void main(String[] args) {
		ContractEmployee cEmp=new ContractEmployee();
		PermantEmployee pEmp=new PermantEmployee();
		cEmp.setEmpNo(1);
		cEmp.setEmpName("anand");
		cEmp.setEmpSalary(10000);
		cEmp.setDuration(5);
		
		pEmp.setEmpNo(2);
		pEmp.setEmpName("arpit");
		pEmp.setEmpSalary(20000);
		pEmp.setPf(400);
		
		System.out.println(cEmp.getEmpNo());
		System.out.println(cEmp.getEmpName());
		System.out.println(cEmp.getEmpSalary());
		System.out.println(cEmp.getDuration());
		
		System.out.println(pEmp.getEmpNo());
		System.out.println(pEmp.getEmpName());
		System.out.println(pEmp.getEmpSalary());
		System.out.println(pEmp.getPf());
		
	} 
}
