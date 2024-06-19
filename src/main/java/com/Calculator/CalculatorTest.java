package com.Calculator;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static final double DELTA = 1e-9; // Tolerance for floating-point comparisons
	
	 @Test
	    public void testCalculatePercentage() {
	        assertEquals(50.0, Calculator.calculatePercentage(50, 100));
	    }

	    @Test
	    public void testCalculateIncrease() {
	        assertEquals(110.0, Calculator.calculateIncrease(100, 10));
	    }

	    @Test
	    public void testCalculateDecrease() {
	        assertEquals(90.0, Calculator.calculateDecrease(100, 10));
	    }


		@Test
	    public void testFindWhole() {
	        assertEquals(200.0, Calculator.findWhole(50, 25));
	    }
		
		private void assertEquals(double expected, double actual) {
	        if (Math.abs(expected - actual) > DELTA) {
	            throw new AssertionError("Expected " + expected + " but got " + actual);
	        }

		}}
