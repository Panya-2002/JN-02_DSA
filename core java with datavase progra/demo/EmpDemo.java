package com.tns.demo;

public class EmpDemo {
	public static void main(String args[]) {
		Employee e1=new Employee();
		e1.setName("Nitin");
		e1.setCity("Pune");
		e1.setSalary(67000);
		e1.setDept("Sales");
		System.out.println(e1);
		Employee e2=new Employee("Dhruv","Mumbai",78000,"IT");
		System.out.println(e2);
		
	}
}
