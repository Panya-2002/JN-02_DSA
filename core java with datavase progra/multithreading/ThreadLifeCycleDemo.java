//Program to demonstrate Thread life cycle
package com.tns.multithreading;

public class ThreadLifeCycleDemo extends Thread {
	public void run() {
		System.out.println("In side run() Thread is alive or not? " + this.isAlive());
		int num = 0;
		while (num < 4) {
			num++;
			System.out.println("num = " + num);
			try {
				sleep(500);
				System.out.println("In not runnable stage, Thread is alive or not? " + this.isAlive());
			} catch (InterruptedException exp) {
				System.err.println("Thread Interrupted ...");
			}
		}
	}

	public static void main(String[] args) {
		Thread myThread = new ThreadLifeCycleDemo();
		System.out.println("Before Runnable stage Thread is alive or not? " + myThread.isAlive());
		myThread.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException exp) {
			System.err.println("Thread is interrupted !");
		}

		System.out.println("After complete execution of Thread ,it is alive or not? " + myThread.isAlive());
	}
}
