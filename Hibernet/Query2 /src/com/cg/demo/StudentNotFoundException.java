package com.cg.demo;

public class StudentNotFoundException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	StudentNotFoundException()
	{
		System.out.println("Invalid Student UID");
	}
}
