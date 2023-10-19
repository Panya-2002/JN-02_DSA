package com.tns.inheritance;

public class Person {
	private String name;
	private String city;

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

	public Person(String name, String city) {
		this.name = name;
		this.city = city;
		System.out.println("Person class parameterized constructor");
	}

	public Person() {
		super();
		System.out.println("Default Constructor of Person");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	public void show()
	{
		System.out.println("In Person show()");
	}
}
