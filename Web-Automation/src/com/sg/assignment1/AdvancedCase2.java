package com.sg.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCase2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchNav();
		login();
		createUsers();
		loginUsers();
		modifyPwd();
		loginUsers2();
		deleteUser();
		logoutClose();
		
	}
	static void launchNav()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(1000);
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("USERS")).click();
			Thread.sleep(2000);
			
			//create user 1
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.name("email")).sendKeys("user1@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.name("password")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			
			//create user 2
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.name("email")).sendKeys("user2@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.name("password")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			
			//create user 3
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.name("lastName")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.name("email")).sendKeys("user3@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.name("password")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUsers()
	{
		try
		{
			//login user1
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			//login user 2
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			//login user3
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			
			
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPwd()
	{
		try
		{
			//login as admin
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
			//modify user1 password
			oBrowser.findElement(By.linkText("USERS")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			
			//modify user2 password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			
			//modify user3 password
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUsers2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			//login user1
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			//login user 2
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			
			//login user3
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
			//logout
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			//login as admin
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.linkText("USERS")).click();
			Thread.sleep(2000);
			
			//delete user1
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			//delete user2
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			//delete user3
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutClose()
	{
		try
		{
			//logout and close browser
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
