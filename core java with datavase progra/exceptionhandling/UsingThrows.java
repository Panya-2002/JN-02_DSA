package com.tns.exceptionhandling;

public class UsingThrows {
	public static int count(String s) throws NullPointerException
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if ( Character.isWhitespace(ch))
				c++;
		}
		return c;
	}
	public static void main(String[] args) {
		String s=null;
		try
		{
		System.out.println("No of spaces = "+count("Hello!\t How are you?"));
		System.out.println("No of spaces = "+count(s));
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}

}
