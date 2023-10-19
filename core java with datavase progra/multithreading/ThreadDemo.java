package com.tns.multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("--------In main()-----------");
		System.out.println(Thread.currentThread());
		/*
		 * FirstThread t1=new FirstThread(); t1.setName("First Thread"); t1.start();
		 * FirstThread t2=new FirstThread(); t2.setName("Second Thread"); //t1.start();
		 * t2.start();
		 */
		
		FirstThread1 t1=new FirstThread1("First");
		FirstThread1 t2=new FirstThread1("Second");
		Thread.sleep(50);
		System.out.println("-------End of main()---------");

	}

}
