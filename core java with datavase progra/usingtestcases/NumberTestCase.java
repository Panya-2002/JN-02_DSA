//program to demonstrate Test Cases
package com.tns.testcasesexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumberTestCase {

	@Test // factorial test for positive number 5
	void factorialTest1() {
		int expected = 120;
		int actual = NumberFunctions.getFactorial(5);
		assertEquals(expected, actual);
	}

	@Test // factorial test for zero
	void factorialTest2() {
		long expected = 1;
		long actual;
		actual = NumberFunctions.getFactorial(0);
		assertEquals(expected, actual);
	}

	@Test // factorial test for negative odd number
	void factorialTest3() {
		long expected = -120;
		long actual;
		actual = NumberFunctions.getFactorial(-5);
		assertEquals(expected, actual);
	}

	// @Disabled
	// parameterized factorial test for 6 and -6
	@ParameterizedTest
	@ValueSource(ints = { 6, -6 })
	void factorialTest4(int no) {
		long expected = 720;
		long actual;
		actual = NumberFunctions.getFactorial(no);
		assertEquals(expected, actual);
	}

	@Test 
	// palindrome test for palindrome number 
	void palindromeTest1() { int
		actual = NumberFunctions.isPalindrome(1221); 
	int expected = 1;

	assertEquals(expected, actual); }

	@Test 
	// palindrome test for non-palindrome number 
	void palindromeTest2() {
	int actual = NumberFunctions.isPalindrome(115);
	int expected = 0;

	assertEquals(expected, actual); }

	// Parameterized test for calculating percentage

	@DisplayName("Should calculate the correct percentage")

	@ParameterizedTest(name = "{index} => s1={0}, s2={1}, s3={2}")

	@CsvSource({ "-50, 60, 70", "80, 180, 80" })
	void percentageTest(int s1, int s2, int s3) {
		float expected = 0;
		float actual;
		actual = NumberFunctions.getPer(s1, s2, s3);
		assertEquals(expected, actual);
	}

	// test for calculating percentage

	@Test
	void percentageTest() {
		float expected = 60;
		float actual;
		actual = NumberFunctions.getPer(50, 60, 70);
		assertEquals(expected, actual);
	}

}
