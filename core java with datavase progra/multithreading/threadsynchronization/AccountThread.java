//Program to demonstrate Thread Synchronization - Account Thread Class
package com.tns.multithreading.threadsynchronization;

public class AccountThread extends Thread {
	private Account acc;
	private int amt;

	public AccountThread(Account acc, int amt) {
		this.acc = acc;
		this.amt = amt;
		start();
	}

	@Override
	public void run() {
		// Using Synchronized Block - withdraw() is non synchronized
		try {
			synchronized (acc) {
				acc.withdraw(amt);
			}
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}

		/*
		 * try { acc.withdraw(amt); } catch (InsufficientBalanceException e) {
		 * System.err.println(e.getMessage()); }
		 */
	}
}
