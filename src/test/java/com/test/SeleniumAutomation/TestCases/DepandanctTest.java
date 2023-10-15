package com.test.SeleniumAutomation.TestCases;

import org.testng.annotations.Test;

public class DepandanctTest {

	public void beforeTest()
	{
		//driver.get("https://google.com");
	}
	@Test(dependsOnMethods = { "test2" },enabled=true)
	public void test1()
	{
		System.out.println("..............suite1.........test1..........................");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("................suite1.......test2..........................");
	}
	@Test
	public void test3()
	{
		System.out.println(".................suite1......test3..........................");
	}
}
