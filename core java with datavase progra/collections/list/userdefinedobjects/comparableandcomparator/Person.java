/*Program to demonstrate Person entity using Comparator interface*/
package com.tns.collections.list.userdefinedobjects.comparableandcomparator;

import java.util.Comparator;

public class Person {
	private String name;
	private String city;

	//Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	//Parameterized constructor
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}

//Sorting by Name using Comparator
class SortByName implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {

		return p1.getName().compareTo(p2.getName());
	}
}

//Sorting by City using Comparator
class SortByCity implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getCity().compareTo(p2.getCity());
	}


}
