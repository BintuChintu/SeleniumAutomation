package com.test.SeleniumAutomation.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.SeleniumAutomation.pages.PageFactoryPage;

import utilities.ConfigFileReader;
import utilities.ExcelRead;

public class DataDrivernTest extends TestBase{
	
	//WebDriver driver;
	PageFactoryPage pageFact;
	ConfigFileReader configFileReader;
	@BeforeTest
	public void beforTest()
	{
		pageFact = new PageFactoryPage(driver);
		configFileReader = new ConfigFileReader();
	}
	@Test
	public void testDataRead() throws IOException
	{
		driver.get(configFileReader.getApplicationUrl());
		ExcelRead excelRead = new ExcelRead();
		System.out.println("result string........:"+excelRead.getCellValue(1, "Second Name"));
		pageFact.login(excelRead.getCellValue(1, "Second Name"), excelRead.getCellValue(1, "Second Name"));
	}

}
