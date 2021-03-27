package com.sg.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCase2OwnXpath {
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
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='USERS']")).click();
			Thread.sleep(2000);
			
			//create user 1
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("user1@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[text()='Create User']")).click();
			Thread.sleep(2000);
			
			//create user 2
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("user2@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[text()='Create User']")).click();
			Thread.sleep(2000);
			
			//create user 3
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='firstName']")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='email']")).sendKeys("user3@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='username']")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[text()='Create User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[starts-with(text(),'Start')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			
			//login user 2
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[starts-with(text(),'Start')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			
			//login user3
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[starts-with(text(),'Start')]")).click();
			Thread.sleep(2000);
			
			
			//logout
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
			//modify user1 password
			oBrowser.findElement(By.xpath("//*[text()='USERS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Demo, user1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle'][contains (text(),'Save')]")).click();
			Thread.sleep(2000);
			
			//modify user2 password
			oBrowser.findElement(By.xpath("//span[text()='Demo, user2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle'][contains (text(),'Save')]")).click();
			Thread.sleep(2000);
			
			//modify user3 password
			oBrowser.findElement(By.xpath("//span[text()='Demo, user3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@name='password']")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='passwordCopy']")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@class='buttonTitle'][contains (text(),'Save')]")).click();
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
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			
			//login user1
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			
			//login user 2
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			
			//login user3
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
			//logout
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[text()='USERS']")).click();
			Thread.sleep(2000);
			
			//delete user1
			oBrowser.findElement(By.xpath("//span[text()='Demo, user1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[contains(text(),'Delete')]")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			//delete user2
			oBrowser.findElement(By.xpath("//span[text()='Demo, user2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[contains(text(),'Delete')]")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
			//delete user3
			oBrowser.findElement(By.xpath("//span[text()='Demo, user3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[contains(text(),'Delete')]")).click();
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
			oBrowser.findElement(By.xpath("//*[text()='Logout']")).click();
			Thread.sleep(2000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
