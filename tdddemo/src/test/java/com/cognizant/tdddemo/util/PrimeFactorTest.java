package com.cognizant.tdddemo.util;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorTest {
	
	private PrimeFactor primeFactor;
	
	@Before	
	public void setup() {
		primeFactor=new PrimeFactor();
	}
	
	@Test
	public void test_calculatePimeFactor_Given1_ShouldReturn1() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(1);
		assertEquals(1, primeFactors.get(0).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given2_ShouldReturn2() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(2);
		assertEquals(2, primeFactors.get(0).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given3_ShouldReturn3() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(3);
		assertEquals(3, primeFactors.get(0).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given4_ShouldReturn1And2() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(4);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(2, primeFactors.get(1).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given5_ShouldReturn1And5() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(5);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(5, primeFactors.get(1).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given6_ShouldReturn1And2And3() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(6);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(2, primeFactors.get(1).intValue());
		assertEquals(3, primeFactors.get(1).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given7_ShouldReturn1And7() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(7);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(7, primeFactors.get(1).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given8_ShouldReturn1And2() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(8);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(2, primeFactors.get(1).intValue());
	}
	@Test
	public void test_calculatePimeFactor_Given9_ShouldReturn1And3() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(9);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(3, primeFactors.get(1).intValue());
	}

	@Test
	public void test_calculatePimeFactor_Given10_ShouldReturn1And2And5() {
		List<Integer> primeFactors = primeFactor.calculatePrimeFactor(10);
		assertEquals(1, primeFactors.get(0).intValue());
		assertEquals(2, primeFactors.get(1).intValue());
		assertEquals(5, primeFactors.get(2).intValue());
		
	}
}
