package com.test.SeleniumAutomation.TestCases;

import org.testng.annotations.Test;

public class DepandanctTest2 extends TestBase {

	public void beforeTest()
	{
		driver.get("https://yahoo.com");
	}
	
	@Test(dependsOnMethods = { "test2" })
	public void test1()
	{
		System.out.println(".................suite2......test1..........................");
	}
	
	@Test
	public void test2()
	{
		System.out.println("................suite2.......test2..........................");
	}
	@Test
	public void test3()
	{
		System.out.println("...............suite2........test3..........................");
	}
}
