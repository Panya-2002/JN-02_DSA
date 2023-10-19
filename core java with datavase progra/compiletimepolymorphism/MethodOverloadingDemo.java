package com.tns.compiletimepolymorphism;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Operations.add();
		System.out.println("----------------------");
		Operations.add(10);
		System.out.println("----------------------");
		Operations.add(10,20);
		System.out.println("----------------------");
		Operations.add(12.5f, 67);
		System.out.println("----------------------");
		Operations.add(10.60F);
		System.out.println("----------------------");
		Operations.add(10.50f,20.50f);
		System.out.println("----------------------");
		Operations.add(10,20.50f);
		System.out.println("----------------------");
	}

}
