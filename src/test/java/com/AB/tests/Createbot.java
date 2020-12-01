package com.AB.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AB.generic.Basetest;
import com.AB.generic.Exceldata;
import com.AB.pages.Homepage;
import com.AB.pages.Loginpage;
import com.relevantcodes.extentreports.LogStatus;

public class Createbot extends Basetest

{
	@Test 
	public void createnewbot() throws InterruptedException, IOException 
	{
		String un = Exceldata.getdata(1, 0);
		String pwd = Exceldata.getdata(1, 1);
		
		try
		{
	Loginpage lp= new Loginpage(driver);
	Homepage hp= new Homepage(driver);
	
			lp.Clicklogin();
			etest.log(LogStatus.PASS, "clicked login ");
			lp.Enteremsil(un);
			etest.log(LogStatus.PASS, "enter email");

			lp.Enterpassword(pwd);
			etest.log(LogStatus.PASS, "enter password");

			lp.Clickloginbutton();
			etest.log(LogStatus.PASS, "clicked login button");
			
			hp.newbot();
			hp.performactionsclick();
			hp.botnameenter();
			hp.selectlanguage();
			hp.nonpersonalclick();
			hp.storeclick();

		}
		catch(Exception e)
		{
			etest.log(LogStatus.FAIL, e.getMessage());
		//	getmessage method is used to print the excepetion name whenever the test case is failed

		}
		
	}
	
}


