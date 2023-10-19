package com.tns.demo;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Aniket");
		s1.setPer(68);
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Ankita");
		s2.setPer(67.87f);
		System.out.println(s1);
		System.out.println(s2);
		Student s3=new Student(3,"Pooja",78);
		System.out.println(s3);
		//s1.id=12;// CTE - private member can't accessible
		s1.name="Manisha"; //protected accessible outside the class within same package
		s1.per=74;//default accessible outside the class within same package
		System.out.println(s1);
		
		StudentResult sr=new StudentResult(101, "Pratima", 80);
		System.out.println(sr);
		//sr.id=12;// CTE - private member can't accessible
		sr.name="Manisha"; //protected accessible outside the class within same package
		sr.per=74;//default accessible outside the class within same package
	}

}
