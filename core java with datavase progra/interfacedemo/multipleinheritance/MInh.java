package com.tns.interfacedemo.multipleinheritance;

public class MInh extends A implements I2 {

	@Override
	public void show() {
		System.out.println("In show()");
	}

	@Override
	public void display() {
		System.out.println("In display()");
	}

}
