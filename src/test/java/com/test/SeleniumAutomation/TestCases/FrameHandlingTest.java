package com.test.SeleniumAutomation.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class FrameHandlingTest {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\drivers\\geckodriver.exe");
//		FirefoxOptions options = new FirefoxOptions();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
//		options.addArguments("incognito");
//		options.addArguments("headless");
		options.addArguments("disable-extensions");
//		options.addArguments("make-default-browser");
		options.addArguments("disable-popup-blocking");
		options.addArguments("version");
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/frames");
//		List<WebElement> framesList = driver.findElements(By.tagName("iFrame"));
//		System.out.println("Number of frames:"+framesList.size());
//		driver.switchTo().frame("frame1");
//		Assert.assertEquals(true, driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).isDisplayed());
//		driver.switchTo().defaultContent();
	}

}
