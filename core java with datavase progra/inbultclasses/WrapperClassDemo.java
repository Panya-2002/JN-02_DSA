//Program to demonstrate WrapperClasses
package com.tns.inbultclasses;

public class WrapperClassDemo {
	public static void main(String[] args) {
		// Unboxing
		//Integer i = new Integer(10);
		Integer i=10;
		System.out.println(i);
		int b = i.intValue();
		System.out.println(b);

		// Without using intValue()
		int c = i;
		System.out.println(c);
		
		//Autoboxing
		int a = 100;
		Integer i1 = a;
		System.out.println(i1);
	}
}