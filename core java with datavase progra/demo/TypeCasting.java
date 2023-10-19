package com.tns.demo;

public class TypeCasting {

	public static void main(String[] args) {
		int a=10;
		float b=67;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a=(int)b; //explicit conversion
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		a+=10;
		b=a; //implicit conversion
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		boolean flag=false;
	//	a=(int)flag; boolean and int are non compatible types so can't convert
		System.out.println("Flag : "+flag);
		System.out.println("a = "+a);
		
	//	Integer i1=new Integer(a);
		Integer i1=a;//Autoboxing - conversion between primitive to object 
		System.out.println("i1 = "+i1);
		
		i1++;
		a=i1; //unboxing - conversion of object to primitive
		System.out.println("i1 = "+i1);
		System.out.println("a = "+a);
		
	}

}
