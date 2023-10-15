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
public class DragAndDropTest{

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
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement from = driver.findElement(By.xpath("//*[contains(text(),'BANK')]"));
        WebElement to = driver.findElement(By.xpath("//*[@id='bank']/li"));
        Actions action = new Actions(driver);
        //action.dragAndDrop(from, to).build().perform();
        action.dragAndDropBy(from, 181,40).build().perform();
        //right click
        action.contextClick(from).build().perform();
	}

	@AfterClass
	public void afterClass() {
		configFileReader = null;
	}
}
