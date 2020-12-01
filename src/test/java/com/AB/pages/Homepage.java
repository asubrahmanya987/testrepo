package com.AB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AB.generic.Genericutils;

public class Homepage
{
	@FindBy(xpath="//a[@title='Create a new bot']")
	private WebElement newbot;
	@FindBy(xpath="//p[text()='Perform Actions']")
	private WebElement performactions;
	@FindBy(xpath="//input[@placeholder='Your bot name']")
	private WebElement botname;
	@FindBy(xpath="(//div[@class='mt1'])[1]")
	private WebElement nonpersonal;
	@FindBy(xpath="(//div[@class='flex flex-center mt2'])[1]")
	private WebElement store;
	
	@FindBy(xpath="(//div[@class='Select-input'])[2]")
	private WebElement lang;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void newbot() throws InterruptedException 
	{
		newbot.click();
		Thread.sleep(20000);
	}
	public void performactionsclick() 
	{
		performactions.click();
	}
	public void botnameenter()
	{
		botname.sendKeys("zxc");
		
	}
	public void nonpersonalclick()
	{
		nonpersonal.click();
	}
	public void storeclick()
	{
		store.click();
	}
	public void selectlanguage()
	{
		Genericutils.selectbyindex(lang, 2);
	}
}
//a[@title='Create a new bot']


