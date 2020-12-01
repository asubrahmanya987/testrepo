package com.AB.tests;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.AB.generic.Basetest;
import com.AB.generic.Exceldata;
import com.AB.pages.Loginpage;
import com.relevantcodes.extentreports.LogStatus;

public class Logintest extends Basetest
{
	
	
	@Test (enabled = true,priority= 1)
	public void loginpositive() throws InterruptedException, IOException 
	{
//		//driver.get("https://www.facebook.com/");
//		WebElement ele1= driver.findElement(By.xpath("//input[@name='email']"));
//		ele1.sendKeys("subrahmanya987@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("987sub");
//		Thread.sleep(2000);
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//		Thread.sleep(2000);
//		Thread.sleep(2000);
//		System.out.println("hiiiiiiii");
//		System.out.println("hiiiiiiii");
		//driver.findElement(By.xpath(""));
		String un = Exceldata.getdata(1, 0);
		String pwd = Exceldata.getdata(1, 1);
		System.out.println("username ="+un + "pwd"+pwd );
		
	
		try
		{
	Loginpage lp= new Loginpage(driver);
	
			lp.Clicklogin();
			etest.log(LogStatus.PASS, "clicked login ");
			lp.Enteremsil(un);
			etest.log(LogStatus.PASS, "enter email");

			lp.Enterpassword(pwd);
			etest.log(LogStatus.PASS, "enter password");

			lp.Clickloginbutton();
			etest.log(LogStatus.PASS, "clicked login button");
			

		}
		catch(Exception e)
		{
			etest.log(LogStatus.FAIL, e.getMessage());
		//	getmessage method is used to print the excepetion name whenever the test case is failed

		}
		
	}
	@Test (enabled = false, priority= 0)
	public void loginnegativee() throws InterruptedException 
	{
		//driver.get("https://www.facebook.com/");
		WebElement ele1= driver.findElement(By.xpath("//input[@name='email']"));
		ele1.sendKeys("subrahmanya9@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("987sub123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		System.out.println("hiiiiiiii");
		System.out.println("hiiiiiiii");
		//driver.findElement(By.xpath(""));
			
	}
}
