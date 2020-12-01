package com.AB.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Genericutils extends Basetest
{
	public static void selectbyindex(WebElement ele, int index)
	{
		Select sel = new Select(ele);
		sel.selectByIndex(index);
		
	}
	
	public void selectbyvisibletext(WebElement ele, String text)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void movetoelement(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).build();
				
	}
	public void draganddrop(WebElement src, WebElement dest)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		
	}
	
	public void accept()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public void dismiss()
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void gettext()
	{
		Alert alert = driver.switchTo().alert();
		alert.getText();
		
	}
	public void sendkey(String xyz)
	{
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(xyz);
		
	}
	public void Switchframebyindex(int index) 
	{
		driver.switchTo().frame(index);
		
	}
	public void Switchframebyindex(String name) 
	{
		driver.switchTo().frame(name);
		
	}
	public void Switchframebyindex(WebElement ele	) 
	{
		driver.switchTo().frame(ele);
		
	}

}
