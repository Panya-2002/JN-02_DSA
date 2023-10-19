package com.tns.exceptionhandling;

public class UsingFinally {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try block");
						
			throw new ArithmeticException("error");
		}
		catch(Exception e)
		{
			System.out.println("In catch block : "+e);		
		}
		finally
		{
			System.out.println("In finally block");
		}
		System.out.println("------------------------");
	}

}
