package com.tns.demo;

public class FunctionDemo {

	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	public static int factorial1(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
			fact=fact*i;
		return fact;
	}
	public static int factorial2(int n)
	{
		int fact=1;
		while(n>0)
			fact=fact*n--;
		return fact;
	}
	public static int factorial3(int n)
	{
		if(n<=0)
			return 1;
		else
			return n*factorial3(--n);		
			
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial1(4));
		System.out.println(factorial2(4));
		System.out.println(factorial3(4));
	}

}
