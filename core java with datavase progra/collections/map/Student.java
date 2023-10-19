/*Program to demonstrate Student entity*/  

package com.tns.collections.map;

public class Student //implements Comparable 
{
	private int rollNo;
	private String name;
	private float per;

	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result * (int) per + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	// if both the object references are
	// referring to the same object.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// type casting of the argument.
		Student other = (Student) obj;

		// comparing the state of argument with
		// the state of 'this' Object
		if (rollNo != other.rollNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//@Override
	public int compareTo(Object o) {
		Student s2 = (Student) o;
		//return (int) (this.rollNo - s2.rollNo);
		return this.name.compareTo(s2.name);
	}
}
