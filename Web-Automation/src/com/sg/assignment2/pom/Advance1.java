package com.sg.assignment2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance1 {
	public static WebDriver oBrowser=null;
	public static PageModelForActiTime oPage=null;
	public static void main(String[] args) {
		launchNavigate();
		login();
		createUser1();
		logout();
		loginUser1();
		createUser2();	
		modifyUser2();
		logout();
		loginUser2();
		createUser3();
		logout();
		loginAdmin();
		modifyUser1();
		logout();
		loginUser11();
		logout();
		loginUser22();
		deleteUser3();
		logout();
		loginUser11();
		deleteUser22();
		logout();
		loginAdmin();
		deleteUser11();
		logout();
		close();
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
	
	static void createUser1()
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
	
	static void loginUser1()
	{
		try {
			oPage.getUser().sendKeys("user1");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("password1");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.skipIntro().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
			oPage.addUsers().click();
			Thread.sleep(1000);
			oPage.fn().sendKeys("user2");
			Thread.sleep(300);
			oPage.ln().sendKeys("Demo");
			Thread.sleep(300);
			oPage.eMail().sendKeys("user2@mail.com");
			Thread.sleep(300);
			oPage.uName().sendKeys("user2");
			Thread.sleep(300);
			oPage.pwd().sendKeys("password2");
			Thread.sleep(300);
			oPage.rePwd().sendKeys("password2");
			Thread.sleep(1000);
			oPage.clickCreateUser().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void modifyUser2()
	{
		try {
			oPage.clickUser2().click();
			Thread.sleep(1000);
			oPage.pwd().sendKeys("password22");
			Thread.sleep(300);
			oPage.rePwd().sendKeys("password22");
			Thread.sleep(1000);
			oPage.clickCreateUser().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginUser2()
	{
		try {
			oPage.getUser().sendKeys("user2");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("password22");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.skipIntro().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createUser3()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
			oPage.addUsers().click();
			Thread.sleep(1000);
			oPage.fn().sendKeys("user3");
			Thread.sleep(300);
			oPage.ln().sendKeys("Demo");
			Thread.sleep(300);
			oPage.eMail().sendKeys("user3@mail.com");
			Thread.sleep(300);
			oPage.uName().sendKeys("user3");
			Thread.sleep(300);
			oPage.pwd().sendKeys("password3");
			Thread.sleep(300);
			oPage.rePwd().sendKeys("password3");
			Thread.sleep(1000);
			oPage.clickCreateUser().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginAdmin()
	{
		try {
			oPage.getUser().sendKeys("admin");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("manager");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void modifyUser1()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
			oPage.clickUser1().click();
			Thread.sleep(1000);
			oPage.pwd().sendKeys("password11");
			Thread.sleep(300);
			oPage.rePwd().sendKeys("password11");
			Thread.sleep(1000);
			oPage.clickCreateUser().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginUser22()
	{
		try {
			oPage.getUser().sendKeys("user2");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("password22");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser3()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
			oPage.clickUser3().click();
			Thread.sleep(1000);
			oPage.clickDelete().click();
			Thread.sleep(1000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void loginUser11()
	{
		try {
			oPage.getUser().sendKeys("user1");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("password11");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser22()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
			oPage.clickUser2().click();
			Thread.sleep(1000);
			oPage.clickDelete().click();
			Thread.sleep(1000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteUser11()
	{
		try {
			oPage.clickUsers().click();
			Thread.sleep(1000);
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
	
	static void logout()
	{
		try {
			oPage.getLogoutLink().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void close()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
