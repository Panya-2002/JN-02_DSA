package com.tns.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		Scanner sc;
		int no1, no2;
		try {
			sc = new Scanner(System.in);
			System.out.println("enter first number : ");
			no1 = sc.nextInt();
			// System.out.println("enter second number : ");
			// no2=sc.nextInt();
			no2 = Integer.parseInt(args[0]);

			System.out.println("Division  is : " + (no1 / no2));
			sc.close();
		}

		catch (ArithmeticException | InputMismatchException e) {
			System.err.println("Error Occurred.. " + e);
		}
		/*
		 * catch(InputMismatchException e) {
		 * //System.err.println("Error Occurred..."+e);
		 * System.err.println("Invalid Input"); }
		 */

		catch (Exception e) {
			System.err.println("Error : " + e);
		}

	}

}
