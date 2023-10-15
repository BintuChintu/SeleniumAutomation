package com.test.SeleniumAutomation.TestCases;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenUrlTest extends TestBase{
	HttpURLConnection huc;
	int responseCode;

	@Test
	public void testBrokenUrl()
	{
		driver.navigate().to("http://www.zlti.com");
		
		List<WebElement> urlList = driver.findElements(By.tagName("a"));
		Iterator<WebElement> urlIterator = urlList.iterator(); 
		while(urlIterator.hasNext())
		{
			String url = urlIterator.next().getAttribute("href");
			if((url == null) || (url.isEmpty()))
			{
				System.out.println("URL is either not configured for anchor tag or it is empty..!");
				continue;
			}
			else if(!(url.startsWith("http://www.zlti.com")))
			{
				System.out.println("URL belongs to another domain, skipping it.");
                continue;
			}
			else
			{
				try {
					huc = (HttpURLConnection) new URL(url).openConnection();
					huc.setRequestMethod("HEAD");
					huc.connect();
					responseCode = huc.getResponseCode();
					if(responseCode >= 400){
	                System.out.println(url+" is a broken link");
	                }
	                else{
	                	 System.out.println(url+" is a valid link");
	                }
					
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
