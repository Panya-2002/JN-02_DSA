package com.tns.usestatic;

public class Demo {
	static
	{
		System.out.println("---------------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("--------------In Main----------");
		Student s1=new Student();
		s1.setName("Sakshi");
		s1.setPer(87);
		Student s2=new Student();
		s2.setName("Nivedita");
		s2.setPer(89);
		Student.show();
		Student.show();
		System.out.println(s1);
		System.out.println(s2);
	}

}
