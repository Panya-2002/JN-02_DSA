//Program to implement interface
package com.tns.testcasedatabaseexample.entities;

public class SavingAccount {
	private int accNo;
	private String Name;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + "]";
	}

	public SavingAccount() {
		super();

	}

	public SavingAccount(int accNo, String name, double balance) {
		this.accNo = accNo;
		Name = name;
		this.balance = balance;
	}

	

}
