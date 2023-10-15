package com.test.SeleniumAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryPage {
	 
	WebDriver driver;
	
	@FindBy(name="uid")
	WebElement userId;
	
	@FindBy(name="password")
	WebElement passWord;
	
	
	public void login(String userName,String password)
	{
		userId.sendKeys(userName);
		passWord.sendKeys(userName);
	}
	
	public PageFactoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
