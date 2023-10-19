//Program to demonstrate Thread class methods
package com.tns.multithreading;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(5, "First"); // creating child thread object
		ChildThread t2 = new ChildThread(10, "Second"); // creating child thread object
		System.out.println("Current Thread : " + Thread.currentThread());// returns current thread

		t1.start();
		t2.start();
		Thread.currentThread().setName("Parent Thread"); // assign name to thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing priority of the thread
		System.out.println("Current Thread : " + Thread.currentThread());// returns current thread

		try {
			t1.join(); // wait current thread until t1 is dead
			t2.join(300); // wait current thread until t2 is dead or time period is over
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("-----------------------End of Main--------------------------");
	}
}
