package com.Qa.testCases;

import base.TestBase;
import pageClass.FacebookLogin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;


	public class FacebookLoginTest extends  TestBase{
		FacebookLogin Login;
		
		
		public FacebookLoginTest(){
			super();
		}
		
		@BeforeClass
		public void setUp(){
			initialization();
			Login = new FacebookLogin();	
		}
		
		@Test(priority=1)
		public void EnterUserName() throws InterruptedException{
			
			//Login.usernNameEntry().sendKeys("userName");
			
			boolean b=Login.usernNameEntry().isDisplayed();
			System.out.println(b);
			
			Login.usernNameEntry().sendKeys(prop.getProperty("userName"));
			Thread.sleep(3000);
		}
			
		
		@Test(priority=2)
		public void EnterPassword() throws InterruptedException{
			Login.passwordEntry().sendKeys(prop.getProperty("password"));
			Thread.sleep(2000);
		}
		
		@Test(priority=3)
		public void clickOnLoginButton() throws InterruptedException{
			Login.LoginButtonClick().click();
			
			Thread.sleep(2000);
		}
		
		
		@AfterClass
		
		public void exit() {
			
			System.out.println("Closing driver....");
			
			
			//driver.quit();
		}
		
		
		
		
		
		
		

	}


