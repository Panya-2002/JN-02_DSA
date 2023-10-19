package com.tns.multithreading;

public class FirstThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread()+" : "+i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
