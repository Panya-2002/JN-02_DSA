package com.tns.exceptionhandling;

public class WithExceptionHandling {
	public static int intDivision(int a, int b) {
		return a / b;
	}

	public static float division(int a, int b) {
		// return (float)a/b;
		return a / b;
	}

	public static float floatDivision(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Division is " + intDivision(10, 3));
			System.out.println("Division is " + division(10, 3));
			System.out.println("Division is " + floatDivision(10, 3));

			System.out.println("Division is " + intDivision(10, 200));
			System.out.println("Division is " + division(10, 200));
			System.out.println("Division is " + floatDivision(10, 200));

			System.out.println("Division is " + division(10, 0));

			System.out.println("Division is " + floatDivision(10, 0));
			System.out.println("Division is " + intDivision(10, 0));
		} catch (Exception e) {
			System.err.println("Error Occurred..." + e.getMessage());
		}
		System.out.println("------------------------------------------");
	}

}
