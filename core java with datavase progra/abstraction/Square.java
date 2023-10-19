package com.tns.abstraction;

public class Square extends Shape{
	private float side;
	
	
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Square(float side) {
		this.side = side;
	}


	public float getSide() {
		return side;
	}


	public void setSide(float side) {
		this.side = side;
	}


	@Override
	public void calArea() {
		area=side*side;		
	}


	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + area + "]";
	}

}
