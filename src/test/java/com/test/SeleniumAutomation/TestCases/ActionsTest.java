package com.test.SeleniumAutomation.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.ConfigFileReader;

public class ActionsTest {
	ConfigFileReader configFileReader;
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		configFileReader = new ConfigFileReader();
	}

	@Test
	public void LaunchApplication() throws InterruptedException {
		//System.out.println("Url :" + configFileReader.getApplicationUrl());
		//driver.get(configFileReader.getApplicationUrl());
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.get("http://demoqa.com/auto-complete/");
        WebElement element = driver.findElement(By.xpath("//*[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
        Actions actions = new Actions(driver);
        actions.keyDown(element,Keys.SHIFT).sendKeys("red").keyUp(Keys.SHIFT).build().perform();
        System.out.println("....release key.........");
        WebElement element2 = driver.findElement(By.id("autoCompleteSingleContainer"));
        actions.sendKeys(element2,"red").build().perform();
	}

	@AfterClass
	public void afterClass() {
		configFileReader = null;
	}
}
