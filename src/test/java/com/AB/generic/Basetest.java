package com.AB.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoconstants
{
	
	public WebDriver driver;
	@BeforeMethod
	public void Browser()
	{
		System.setProperty(chromekey, chrmevalue);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();		
	}
}
