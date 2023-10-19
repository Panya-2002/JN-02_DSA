package com.tns.multithreading;

public class FirstThread1 extends Thread {
	public FirstThread1(String name) {
		setName(name);
		start();
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread() + " : " + i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
