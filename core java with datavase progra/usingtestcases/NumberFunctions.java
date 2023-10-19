//Program to define functions for test cases
package com.tns.testcasesexamples;

public class NumberFunctions {

	// function to return factorial of a given number

	public static int getFactorial(int n) {
		int f = 1;
		while (n != 0) {
			f = f * n;
			if (n < 0)
				n++;
			else
				n--;
		}
		return f;
	}

	// function to check whether given number is palindrome or not?
	public static int isPalindrome(int no) {
		int d, rev = 1, no1 = no;
		while (no != 0) {
			d = no % 10;
			no = no / 10;
			rev = rev * 10 + d;
		}
		if (no1 == rev)
			return 1;
		else
			return 0;

	}

	// function to return percentage
	public static float getPer(int s1, int s2, int s3) {
		float per = 0.0f;
		if ((s1 >= 0 && s1 <= 100) && (s2 >= 0 && s2 <= 100) && (s3 >= 0 && s3 <= 100))
			per = (s1 + s2 + s3) / 3.0f;
		return per;
	}
}
