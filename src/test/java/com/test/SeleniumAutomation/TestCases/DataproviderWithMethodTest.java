package com.test.SeleniumAutomation.TestCases;

import java.lang.reflect.Method;

import org.apache.poi.ss.formula.atp.Switch;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderWithMethodTest {
	
	@Test(dataProvider = "testDp")
	public void test1(String message)
	{
		System.out.println("Message :"+message);
	}
	@Test(dataProvider = "testDp")
	public void test2(String message)
	{
		System.out.println("Message :"+message);
	}

	@DataProvider(name="testDp")
	public Object[][] byMethod(Method m)
	{
	switch(m.getName())
		{
		case "test1":
		return new Object[][] {{"test11111111"}};
		case "test2":
			return new Object[][]{{"test22222222"}};
		}
	return null;
	}
}
