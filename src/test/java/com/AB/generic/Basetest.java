package com.AB.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Basetest implements Autoconstants
{
	
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest etest;
	@BeforeClass
	public void statreport()
	{
		reports =	new ExtentReports(System.getProperty("user.dir")+ "\\Extentreport.html");
		
		etest = reports.startTest("Logintest");
		
	}
	
	@BeforeMethod
	public void Browser()
	{
		System.setProperty(chromekey, chrmevalue);
		driver = new ChromeDriver();
		driver.get("https://cai.tools.sap/");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void close()
	{
		//driver.close();		
	}
	@AfterClass
	public void endreport()
	{
	reports.endTest(etest);
	reports.flush();
	
	}
	
}

