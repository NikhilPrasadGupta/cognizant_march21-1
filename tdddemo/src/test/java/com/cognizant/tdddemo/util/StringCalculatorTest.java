package com.cognizant.tdddemo.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

	private static String ANY_SINGLE_NUMBER_IN_STRING = "300";
	private static int SAME_NUMBER_AS_INTEGER = 300;
	private StringCalculator stringCalculator;
	
	@Before
	public void setup() {
		stringCalculator=new StringCalculator();
	}
	
	@Test
	public void test_caculate_GivenEmptyString_ShouldReturnZero() {
		int result =stringCalculator.calculate("");
		assertEquals(0, result);
	}
	
	@Test
	public void test_caculate_GivenAnySingleNumberAsString_ShouldReturnSameNumberAsInteger() {
		int result =stringCalculator.calculate(ANY_SINGLE_NUMBER_IN_STRING);
		assertEquals(SAME_NUMBER_AS_INTEGER, result);
	}
	
	@Test
	public void test_caculate_Given10And20SeparatedByCommaAsString_ShouldReturn30AsInteger() {
		int result =stringCalculator.calculate("10,20");
		assertEquals(30, result);
	}
	
	@Test
	public void test_caculate_Given100And200SeparatedByCommaAsString_ShouldReturn300AsInteger() {
		int result =stringCalculator.calculate("100,200");
		assertEquals(300, result);
	}
	@Test
	public void test_caculate_Given100And200And300SeparatedByCommaAsString_ShouldReturn600AsInteger() {
		int result =stringCalculator.calculate("100,200,300");
		assertEquals(600, result);
	}


}
