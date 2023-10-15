package com.test.SeleniumAutomation.TestCases;

import org.testng.annotations.DataProvider;

public class DP {
	
	@DataProvider(name = "test-dp")
	public Object[][] testDataProvider()
	{
		return new Object[][] {{"value-based"}};
	}

}
