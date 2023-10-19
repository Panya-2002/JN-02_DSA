//Program to demonstrate Thread Synchronization
package com.tns.multithreading.threadsynchronization;

public class SynchronizationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Account a1 = new Account(101, "Amit", 50000);
		System.out.println(a1);

		// Ten account threads running parallel and sharing same resource
		AccountThread t[] = new AccountThread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new AccountThread(a1, 1000 * (i + 1));
		}
		
		  try { for (int i = 0; i < 10; i++) { t[i].join(); } } catch
		  (InterruptedException e) { System.err.println(e.getMessage()); } 
		  // waits main thread till execution of all child thread finish
		 
		System.out.println("------------------------------------");
		System.out.println(a1);

	}

}
