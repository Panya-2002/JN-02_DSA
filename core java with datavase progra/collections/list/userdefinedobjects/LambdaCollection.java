//
package com.tns.collections.list.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollection {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new Student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new Student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new Student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println(studentList);

		System.out.println("------------------------------------------");
		System.out.println(studentList);
		System.out.println("------------------------------------------");
		
		Comparator<Student> comp1 = (st1, st2) -> (int)(st1.getPer() - st2.getPer());
		Collections.sort(studentList,comp1); 
		System.out.println("Student details in Ascending order of Per : "+studentList);

		Collections.reverse(studentList);
		System.out.println("------------------------------------------");
		System.out.println("Student details in Descending order of Per : "+studentList);
		
		System.out.println("------------------------------------------");
		comp1 = (st1, st2) -> st1.getName().compareTo(st2.getName());
		Collections.sort(studentList,comp1); 
		System.out.println("Student details in ascending order of Student Name : "+studentList);

	}

}
