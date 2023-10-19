//test case for development and production
package com.tns.basictestcases.testsuiteclasses;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class ClassATest {
	@Test
	@Tag("development")
	@Tag("production")
	void testCaseA(TestInfo testInfo) { //run in all environments
	}
}
