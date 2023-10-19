package com.tns.demo;

//final public class Student - final classes can't be inherited
public class Student {
	
	private int id; //private member
	protected String name; //protected member
	float per; //default

	
	public Student() {
	//	super();
		System.out.println("Default Constructor");
	}

	 public Student(int id, String name, float per) {
		this();
		this.id = id;
		this.name = name;
		this.per = per;
		
		System.out.println("Parameterised Constructor");
	}

	public int getId() {
		return id;
	}

	 public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

	
}
