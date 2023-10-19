/*Program to demonstrate Student entity*/  
package com.tns.collections.set.userdefinedobjects;

public class Student {
	int marks;
	String name;
	// Constructor
	public Student(String name, int marks)
	{
		this.marks = marks;
		this.name = name;
	}
	// Getters and Setters
	public int getMarks() { 
		return marks; 
		}
	public String getName() { 
		return name; 
		}
	public void setName(String name) { 
		this.name = name; 
		}
	public void setMarks(int marks) { 
		this.marks = marks; 
		}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

}
