package com.tns.accessspecifiers;

import com.tns.demo.Student;

public class StudDemo
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setId(11); 
		s1.setName("Neha");
		s1.setPer(77);
		System.out.println(s1);
		
		System.out.println("---------------------");
		Student s2=new Student(22,"Rajashree",78);
		System.out.println(s2);
		
		//s1.id=12; CTE - private member can't accessible
		//s1.name="Manisha"; //protected not accessible outside the class within another package
		//s1.per=74;//default not accessible outside the class within another package
		System.out.println(s1);
		
		StudentAchievements sa=new StudentAchievements(103, "Pankaj", 72, "Sports");
		System.out.println(sa);
		//sa.id=113; CTE - private member can't accessible
		//sa.name="Manisha"; //protected not accessible outside the class within another package using object
		//sa.per=74;//default not accessible outside the class within another package
				
				
	}
}