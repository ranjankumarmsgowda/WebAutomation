package com.sg.assignment2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	public static WebDriver oBrowser=null;
	public static PageModelForActiTime oPage=null;
	public static void main(String[] args) {
		launchNavigate();
		login();
		createUser();
		deleteUser();
		logoutClose();
	}
	
	static void launchNavigate()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(1000);
			oBrowser.manage().window().maximize();
			oPage=new PageModelForActiTime(oBrowser);
			Thread.sleep(1000);
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try {
			oPage.getUser().sendKeys("admin");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("manager");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.minimizeFlyOut().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
			oPage.addUsers().click();
			Thread.sleep(1000);
			oPage.fn().sendKeys("user1");
			Thread.sleep(300);
			oPage.ln().sendKeys("Demo");
			Thread.sleep(300);
			oPage.eMail().sendKeys("user1@mail.com");
			Thread.sleep(300);
			oPage.uName().sendKeys("user1");
			Thread.sleep(300);
			oPage.pwd().sendKeys("password1");
			Thread.sleep(300);
			oPage.rePwd().sendKeys("password1");
			Thread.sleep(1000);
			oPage.clickCreateUser().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try {
			oPage.clickUser1().click();
			Thread.sleep(1000);
			oPage.clickDelete().click();
			Thread.sleep(1000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void logoutClose()
	{
		try {
			oPage.getLogoutLink().click();
			Thread.sleep(1000);
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
