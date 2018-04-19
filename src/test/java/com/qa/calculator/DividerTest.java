package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DividerTest {

	private Divider divider;

	@Test
	public void subtractTest() {
		divider = new Divider();
		int expectedValue = 2;
		int actualValue = divider.divide(4, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
