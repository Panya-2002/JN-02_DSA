/*Program to demonstrate HashSet using user defined objects*/
package com.tns.collections.set.userdefinedobjects;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String args[]) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		
	}

	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student("Pooja",78);
		studentSet.add(s1);
		s1 = new Student("Nikita",66);
		studentSet.add(s1);
		s1 = new Student( "Deepa",73);
		studentSet.add(s1);
		s1 = new Student("Neha",81);
		studentSet.add(s1);
		s1 = new Student("Neha",81); 
		studentSet.add(s1); //duplicate element can't insert

	}

}
