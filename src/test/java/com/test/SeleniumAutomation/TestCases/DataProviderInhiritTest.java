package com.test.SeleniumAutomation.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInhiritTest {
	
	@Test(dataProvider = "test-dp", dataProviderClass= DP.class)
	public void testDp(String value)
	{
		System.out.println("value is:"+value);
	}

}
