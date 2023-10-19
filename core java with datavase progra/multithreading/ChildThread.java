//Program to demonstrate creating a child Thread class - extending Thread class
package com.tns.multithreading;

public class ChildThread extends Thread {
	int n;
	String msg;

	public ChildThread(int n, String msg) {
		this.n=n;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}
