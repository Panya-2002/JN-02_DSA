//demonstrate JUnit life cycle 
package com.tns.basictestcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycle {

	@BeforeEach
	default
	 void beforeEachTest() {
		System.out.println("Before each test");
	}

	@AfterEach
	default
	 void afterEachTest() {
		System.out.println("After each test");
	}

	@BeforeAll
	default
	void beforeAllTests() {
		System.out.println("Before all tests");
	}

	@AfterAll
	default
	void afterAllTests() {
		System.out.println("After all tests");
	}

	@Test
	default
	 void testMethod1() {
		System.out.println("this is test method1...");
	}

	@Test
	default
	 void testMethod2() {
		System.out.println("this is test method2...");
	}	
}