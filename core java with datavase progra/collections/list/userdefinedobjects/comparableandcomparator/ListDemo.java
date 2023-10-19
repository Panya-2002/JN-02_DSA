/*Program to demonstrate List collection for user defined objects and*/ 
//sort elements using comparable and comparator
package com.tns.collections.list.userdefinedobjects.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new Student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new Student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new Student(41, "Neha", 72);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);

		// Using Comparable interface
		System.out.println("\n---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		Collections.sort(studentList);

		System.out.println("\n---------------Student Details After Sorting-------------------");
		System.out.println(studentList);
		
		System.out.println("\n\n");

		// Adding Person objects into ArrayList
		List<Person> personList = new ArrayList<Person>();
		Person p1 = new Person("Abhijit", "Mumbai");
		personList.add(p1);

		p1 = new Person("Milind", "Pune");
		personList.add(p1);

		p1 = new Person("Saurav", "Bangalore");
		personList.add(p1);

		p1 = new Person("Madhur", "Delhi");
		personList.add(p1);

		System.out.println("Person list is as follows\n" + personList);

		// Using Comparator interface
		System.out.println("\n---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		//Collections.sort(personList); CTE
		Collections.sort(personList, new SortByName());

		System.out.println("\n---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);
		
		Collections.sort(personList, new SortByCity());

		System.out.println("\n---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
		
		Collections.reverse(personList);
		System.out.println(personList);
		
		Comparator<Person> comp = (person2, person1) -> person1.getName().compareTo(person2.getName());
		Collections.sort(personList,comp);
		System.out.println(personList);
	}

}
