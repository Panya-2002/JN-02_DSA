package com.tns.interfacedemo;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		Account a1 = new Account(101, "Abhijit", 240000);
		System.out.println(a1);
		/*
		 * a1.deposit(3000); System.out.println(a1); a1.withdraw(5000);
		 * System.out.println(a1); a1.deposit(30000); System.out.println(a1);
		 * a1.withdraw(280000); System.out.println(a1);
		 */
		Scanner sc = new Scanner(System.in);
		int amt;
		System.out.println("Enter amount to be deposited..");

		amt = sc.nextInt();
		a1.deposit(amt);
		System.out.println(a1);
		System.out.println("Enter amount to be withdraw..");

		amt = sc.nextInt();
		a1.withdraw(amt);
		System.out.println(a1);

	}

}
