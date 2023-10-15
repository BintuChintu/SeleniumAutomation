package com.test.SeleniumAutomation.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.ConfigFileReader;

public class DropDownWithOutSelect {
	
	ConfigFileReader configFileReader;
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		configFileReader = new ConfigFileReader();
	}

	@Test
	public void LaunchApplication() throws InterruptedException {
		System.out.println("Url :" + configFileReader.getApplicationUrl());
		//driver.get(configFileReader.getApplicationUrl());
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement dropDown = driver.findElement(By.xpath("//*[contains(text(),'Select Option')]"));
        dropDown.click();
        WebElement dropDownSelection = driver.findElement(By.xpath("//*[contains(text(),'Group 1, option 1')]"));
        dropDownSelection.click();
	}

	@AfterClass
	public void afterClass() {
		configFileReader = null;
	}

}
