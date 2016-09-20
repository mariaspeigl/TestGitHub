package de.zollner;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSales {

	@Test
	public void test() {
		SalesData data = new SalesData();
		String test = data.getStringTest();
		assertTrue("test" == test);
	}

}
