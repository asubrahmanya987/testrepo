package com.AB.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(xpath="//div[text()='OK']")
	private WebElement ok; 
	
	@FindBy(xpath="//div[text()='LOG IN']")
	private WebElement login;
	@FindBy(xpath="//input[@placeholder='E-Mail, ID, or Login Name']")
	private WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	@FindBy(xpath="//button[text()='Log On']")
	private WebElement loginbutton;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Clicklogin()
	{
		ok.click();
	login.click();	
	}
	public void Enteremsil(String username) 
	{
	email.sendKeys(username);	
	}
	public void Enterpassword(String pwd)
	{
	password.sendKeys(pwd);
	
	}
	public void Clickloginbutton() 
	{
	loginbutton.click();
	}
}
