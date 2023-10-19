package com.tns.usestatic;

public class UsingConstatnts {
	final int N=1000;
	static final int STATIC_N;
	static
	{
		STATIC_N=5000;
	}
	public static void main(String args[])
	{
		UsingConstatnts o=new UsingConstatnts();
		System.out.println(o.N);
		//o.N++;
		System.out.println(STATIC_N);
		//STATIC_N++;
	}
}
