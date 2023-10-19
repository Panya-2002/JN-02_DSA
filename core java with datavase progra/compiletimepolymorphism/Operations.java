package com.tns.compiletimepolymorphism;

public class Operations {
	public static void add() {
		System.out.println("Addition of Numbers");
	}

	public static void add(int n) {
		System.out.println("Addition is " + n);
	}

	public static void add(int n1, int n2) {
		System.out.println("Addition is " + (n1 + n2));
	}

	public static void add(float n) {
		System.out.println("Addition is " + n);
	}

	public static void add(float n1, float n2) {
		System.out.println("Addition is " + (n1 + n2));
	}
	
	public static void add(int n1, float n2) {
		System.out.println("Addition is " + (n1 + n2));
	}
	
	public static void add(float n1, int n2) {
		System.out.println("Addition is " + (n1 + n2));
	}


	

}
