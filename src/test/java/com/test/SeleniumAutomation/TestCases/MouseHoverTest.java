package com.test.SeleniumAutomation.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		Actions builder = new Actions(driver);
		Action mouseHouver = builder.moveToElement(link_Home).build();
		//String bgColor = td_Home.getCssValue("background-color");
        //System.out.println("Before hover: " + bgColor);        
        //bgColor = td_Home.getCssValue("background-color");
        //System.out.println("After hover: " + bgColor);
		mouseHouver.perform();
        //driver.close();
		
	}

}
