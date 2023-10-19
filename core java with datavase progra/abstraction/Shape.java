package com.tns.abstraction;

abstract public class Shape {
	protected float area;
	protected static final float PI = 3.14f;

	public void show() {
		System.out.println("Area of shape is " + area);
	}

	public abstract void calArea();
}
