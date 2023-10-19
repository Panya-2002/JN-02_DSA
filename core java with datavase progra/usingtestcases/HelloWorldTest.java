//program to demonstrate child test class
package com.tns.basictestcases;

import org.junit.jupiter.api.Test;

//class HelloWorldTest extends TestLifeCycle
class HelloWorldTest implements TestLifeCycle2
{

	@Test
	void test() {
		System.out.println("HelloWorld Test Case");
	}
}
