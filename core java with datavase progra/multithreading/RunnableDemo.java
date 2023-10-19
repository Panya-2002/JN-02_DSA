//executor class
package com.tns.multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		//UsingRunnable ur = new UsingRunnable(100, 20, "Hello");

		/*
		 * Runnable r1 = new Runnable() {
		 * 
		 * @Override public void run() { // anonymous class for(int i=1;i<=5;i++)
		 * System.out.println("Runnable with Anonymous Class"); } }; Thread t1=new
		 * Thread(r1); t1.start();
		 */
		
		Runnable r2 = () -> { // lambda expression
			System.out.println("Runnable with Lambda Expression");
		};
		new Thread(r2).start();
		 

		System.out.println("-------------------------------------------------------");
	}
}