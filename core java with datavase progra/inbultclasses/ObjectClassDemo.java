//Program to Demonstrate Object class
package com.tns.inbultclasses;

class Sample {

}

class Demo {
	public Demo() {
		// resource allocate
		System.out.println("In Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		// resource cleanup code
		System.out.println("In Finalize");
	}

}

public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		Sample s1 = new Sample();
		System.out.println(s.getClass().getName());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		Demo d = new Demo();
		System.out.println(d.hashCode());
		Demo d1=d;
		//Demo d1 = new Demo();
		System.out.println(d1.hashCode());
		d = null;
		System.gc();
		System.out.println(d1);
		
	

	}
}