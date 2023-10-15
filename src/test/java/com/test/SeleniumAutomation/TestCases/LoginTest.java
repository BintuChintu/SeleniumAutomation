package com.test.SeleniumAutomation.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.ConfigFileReader;

//public class LoginTest extends TestBase {
public class LoginTest extends TestBase{

	ConfigFileReader configFileReader;

	@BeforeClass
	public void beforeClass() {
		configFileReader = new ConfigFileReader();
	}

	@Test
	public void LaunchApplication() throws InterruptedException {
		System.out.println("Url :" + configFileReader.getApplicationUrl());
		driver.get(configFileReader.getApplicationUrl());
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/test/newtours/");
//		WebElement link_Home = driver.findElement(By.linkText("Home"));
//		Actions builder = new Actions(driver);
//		Action mouseHouver = builder.moveToElement(link_Home).build();
//		//String bgColor = td_Home.getCssValue("background-color");
//        //System.out.println("Before hover: " + bgColor);        
//        //bgColor = td_Home.getCssValue("background-color");
//        //System.out.println("After hover: " + bgColor);
//		Thread.sleep(5000);
//		mouseHouver.perform();
		
//		String baseUrl = "https://demo.guru99.com/test/upload/";
       

//        driver.get(baseUrl);
//        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//
//        // enter the file path onto the file-selection input field
//        uploadElement.sendKeys("C:\\Softwares\newhtml.html");
//
//        // check the "I accept the terms of service" check box
//        driver.findElement(By.id("terms")).click();
//
//        // click the "UploadFile" button
//        driver.findElement(By.name("send")).click();
        
        
	}

	@AfterClass
	public void afterClass() {
		configFileReader = null;
	}
}
