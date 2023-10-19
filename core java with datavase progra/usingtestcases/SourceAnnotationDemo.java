package com.tns.basictestcases;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class SourceAnnotationDemo {

	@DisplayName("Roman numeral")
	@ParameterizedTest(name = "\"{0}\" should be {1}")
	@CsvSource({ "I, 1", "II, 2", "V, 5" })
	void withNiceName(String word, int n) {
		System.out.println(word + " : " + n);
	}

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void withAllEnumValues(TimeUnit unit) {
		System.out.println(unit);
	}

	@ParameterizedTest
	@EnumSource(value = TimeUnit.class, names = { "NANOSECONDS", "MICROSECONDS" })
	void withSomeEnumValues(TimeUnit unit) {
		// executed once for TimeUnit.NANOSECONDS
		// and once for TimeUnit.MICROSECONDS
	}

	@ParameterizedTest
	@MethodSource("getWords")
	void withMethodSource(String word) {
		System.out.println(word);
	}

	private static String[] getWords() {
		String s = "Hello! How are you?";
		return s.split(" ");
	}

}
