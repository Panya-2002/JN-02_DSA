package com.tns.interfacedemo;

public interface Bank {
	public static final float INT_RATE=7.8f;
	static final int MIN_BALANCE=1000;
	static final int DEPOSIT_LIMIT=25000;
	void deposit(int amount);
	void withdraw(int amount);
	default void display()
	{
		System.out.println("Concrete Method");
	}
}
