package com.tns.inheritance;

public class Manager extends Employee{
	private String authority;
	private int teamSize;
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public Manager(String name, String city, int salary, String dept, String authority, int teamSize) {
		super(name, city, salary, dept);
		this.authority = authority;
		this.teamSize = teamSize;
		System.out.println("Manager class parameterized constructor");
	}
	public Manager() {
		super();
		System.out.println("Manager class Default constructor");
	}
	public Manager(String name, String city, int salary, String dept) {
		super(name, city, salary, dept);
		System.out.println("Manager class parameterized constructor");
	}
	@Override
	public String toString() {
		return "Manager [authority=" + authority + ", teamSize=" + teamSize + ", getSalary()=" + getSalary()
				+ ", getDept()=" + getDept() + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
	
	@Override
	public void show()
	{
		System.out.println("In Manager show()");
		//super.show();
	}
	

}
