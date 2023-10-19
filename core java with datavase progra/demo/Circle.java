package com.tns.demo;

public class Circle {
	private float radius;
	static final float PI=3.14f;
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public  float calArea()
	{
		float area=radius*radius*PI;
		return area;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
		//PI=5; constant can't be modified
		// TODO Auto-generated constructor stub
	}

}
