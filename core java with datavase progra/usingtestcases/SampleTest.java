package com.tns.usingtestcases;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleTest {
	@Test
	public void testOne() {
		int a,b;
		a=5;
		b=a+a;
		assertEquals(25, b);
	}
}
