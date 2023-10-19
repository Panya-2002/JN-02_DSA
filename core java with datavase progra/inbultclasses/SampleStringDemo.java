//Program to demonstrate String Class
package com.tns.inbultclasses;

public class SampleStringDemo {

	public static void main(String args[]) {

		// Simple String Operations
		char c[] = { 'I', 'n', 'd', 'i', 'a' };
		String s1 = new String(c);
		String s2 = new String(s1);

		System.out.println(s1);
		System.out.println(s2);

		// Using concatenation to prevent long lines.
		String longStr = "This is to show " + "how string concatination " + "can happen with additional  "
				+ "operator.";

		System.out.println(longStr);
	}
}
