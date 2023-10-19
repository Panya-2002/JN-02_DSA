package com.tns.demo;

public class Demo{
	
	void main()
	{
		System.out.println("In main()");
	}
	public static void main(int a[])
	{
		System.out.println("In psv main(int[])");
	}
	public static void main(String args[])
	{
		System.out.println("In java main()");
		int a[]= {1,2,3};
		main(a);
	}

}
