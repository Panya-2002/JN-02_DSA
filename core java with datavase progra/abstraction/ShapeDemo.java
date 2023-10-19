package com.tns.abstraction;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape s;
		s=new Circle(5.4f);
		//dynamic binding
		s.calArea();
		//s.show();
		System.out.println(s);
		
		s=new Square(5);
		s.calArea();
		//s.show();
		System.out.println(s);
	}

}
