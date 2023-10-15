package com.test.SeleniumAutomation.TestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.netty.handler.timeout.TimeoutException;
import utilities.ConfigFileReader;

public class TestBase {

	WebDriver driver;
	WebDriverWait wait;
	ConfigFileReader configFileReader = new ConfigFileReader();

	@BeforeSuite
	@Parameters({ "browserName" })
	public void launchAppllication(@Optional("Abc") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\java\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("...........choose the valid browser..............");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get(configFileReader.getApplicationUrl());
//   Dynamic alert handling Method-1
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
			System.out.println("Dynamic alert not present...!");
		}
			else
			{
				driver.switchTo().alert().accept();
			}
		}
		catch(Exception e)
		{
			System.out.println("No alert present");
		}
//    Dynamic alert handling Method-2
//		try {
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//			System.out.println("Alert presented...!");
//		} catch (NoAlertPresentException ne) {
//			System.out.println("Alert not presented...!");
//			// ne.printStackTrace();
//		}
//    Dynamic window alert Method-3

//		Set<String> windows = driver.getWindowHandles();
//		if(windows.size()>1)
//		{
//      System.out.println("Alert is presented...!");
//			driver.switchTo().window(windows.iterator().next());
//			try
//			{
//				WebElement element = driver.findElement(By.id("text"));
//				element.click();
//			}
//			catch(NoAlertPresentException ne)
//			{
//				System.out.println("Alert presents but could not click yes or no");
//			}
//		}

		System.out.println(".....1111111111111111");
		System.out.println(".....11111111111111112222222");
		System.out.println(".....11111111111111113333333");
		System.out.println(".....111111111111111144444444");
	}

//	
//	@AfterSuite
//	public void browserClose()
//	{
//		driver.close();
////		System.exit(0);
//	}

}
