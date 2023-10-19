package com.tns.exceptionhandling;

public class UsingFinally2 {

	public static void main(String[] args) {
		try
		{
			System.out.println("in try block");
			/*
			 * while(true) {
			 * 
			 * }
			 */
			System.out.println("-----------------");
			System.exit(0);			
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
