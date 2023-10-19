package com.tns.usestatic;

public class Student {
	private int rollNo;
	private String name;
	private float per;
	private static String classTeacher;
	private static int cnt;
	static {
		System.out.println("Static block is executed...");
		cnt=202000;
		classTeacher="Sonal Borse";
	}
    static void show()
    {
    	System.out.println("counter is "+cnt);
    	//Nonstatic members can't be accessible within static block
		/*
		 * System.out.println(this.rollNo); System.out.println(rollNo);
		 * System.out.println(getRollNo());
		 */
    }
	public Student() {
		System.out.println("Default Constructor");
		cnt++;
		rollNo=cnt;
	}

	public int getRollNo() {
		return rollNo;
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
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + ", Class Teacher="+classTeacher+"]";
	}

}
