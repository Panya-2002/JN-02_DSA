package com.tns.inheritance;

public class MultilevelInhDemo {

	public static void main(String[] args) {
		Manager m1=new Manager();
		System.out.println(m1);
		Manager m2=new Manager("Soham","Mumbai",68000,"Purchase","Approve Leave of team members",10);
		System.out.println(m2);
		m2.show();
		System.out.println("---------------------------");
		
		Person p;
		p=new Person();
		p.show();
		
		p=new Employee();
		p.show();
		
		p=new Manager();
		p.show();
		
	}

}
