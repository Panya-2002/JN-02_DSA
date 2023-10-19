package com.tns.interfacedemo;

public class Account implements Bank {
	private int accNo;
	private String name;
	private float balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String name, float balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		if(amount>DEPOSIT_LIMIT)
			System.err.println("Deposit not possible.. exceeds Deposit Limit");
		else
			balance+=amount;		
	}

	@Override
	public void withdraw(int amount) {
		if(balance-amount>=MIN_BALANCE)
			balance-=amount;
		else
			System.err.println("Withdraw not possible...below Minimum balance");
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	
}
