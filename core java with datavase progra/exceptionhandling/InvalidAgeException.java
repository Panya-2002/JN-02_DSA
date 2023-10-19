package com.tns.exceptionhandling;

public class InvalidAgeException extends Exception{
	public InvalidAgeException()
	{
		super("Invalid age");		
	}
	public InvalidAgeException(String s)
	{
		super(s);		
	}
}
