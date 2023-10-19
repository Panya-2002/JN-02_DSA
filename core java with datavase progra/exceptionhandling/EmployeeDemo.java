package com.tns.exceptionhandling;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) throws InvalidAgeException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee age : ");
	int age=sc.nextInt();
	if (age<18)
		throw new InvalidAgeException("Error....age should not be less than 8");
	else
		System.out.println("Employee accepted...");

	}

}
