package com.tns.abstraction;

public class Circle extends Shape {
	private float radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void calArea() {
		super.area = PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}

}
