/*Program to demonstrate TreeSet class*/
package com.tns.collections.map;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// String TreeSet
		TreeSet<String> courses = new TreeSet<String>();
		courses.add("Core Java");
		courses.add("Python");
		courses.add("Hibernate");
		courses.add("C++");
		courses.add("Springboot");
		courses.add("JavaScript");
		// courses.add(null); //RTE - Null values not allowed in TreeSet

		System.out.println("Courses are : " + courses);

		// Backed Collection SortedSet<String>
		Set<String> coursesSubSet = courses.subSet("JavaScript", true, "Springboot", true);
		System.out.println("Course Subset is " + coursesSubSet);

		System.out.println("After adding HTML and React in main course set\n");
		courses.add("HTML");
		courses.add("React");
		System.out.println("Courses are " + courses);
		System.out.println("Course Subset is " + coursesSubSet);

		System.out.println("After removing Python from main course set\n");
		coursesSubSet.remove("Python");
		System.out.println("Courses are " + courses);
		System.out.println("Course Subset is " + coursesSubSet);

		// Adding User defined objects in TreeSet
		TreeSet<Student> students = new TreeSet<Student>();
		students.add(new Student(101, "Harshita", 87));
		students.add(new Student(104, "Pallavi", 71));
		students.add(new Student(103, "Anisha", 67));
		students.add(new Student(102, "Sheetal", 72));
		System.out.println("Student details are as follows\n" + students);

		// Integer TreeSet
		TreeSet<Integer> numberSet = new TreeSet<Integer>();
		numberSet.add(10);
		numberSet.add(20);
		numberSet.add(60);
		numberSet.add(80);
		numberSet.add(30);
		System.out.println(numberSet);

		SortedSet<Integer> numberSet1 = numberSet.subSet(30, false, 60, true);
		System.out.println(numberSet);
		System.out.println(numberSet1);

		numberSet.add(400);
		numberSet.add(50);
		System.out.println(numberSet);
		System.out.println(numberSet1);

		numberSet1.add(35);
		// numberSet1.add(90);// RTE IllegalArgumentException - Key out of range
		System.out.println(numberSet);
		System.out.println(numberSet1);
	}
}
