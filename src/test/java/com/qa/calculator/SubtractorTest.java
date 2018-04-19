package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

import com.qa.calculator.Subtractor;

public class SubtractorTest {
	
	private Subtractor subtractor;

	@Test
	public void subtractTest() {
		subtractor = new Subtractor();
		int expectedValue = 2;
		int actualValue = subtractor.subtract(4, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
