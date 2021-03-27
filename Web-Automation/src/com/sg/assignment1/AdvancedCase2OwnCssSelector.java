package com.sg.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCase2OwnCssSelector {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchNav();
		loginAdmin();
		createUsers();
		loginUsers();
		loginAdmin();
		modifyPwd();
		loginUsers2();
		loginAdmin();
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
	static void loginAdmin()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
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
			oBrowser.findElement(By.cssSelector("div.gettingStartedShortcutsLabel")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			
			//create user 1
			oBrowser.findElement(By.cssSelector("div.addUserButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("input[name='firstName']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='email']")).sendKeys("user1@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='username']")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
			//create user 2
			oBrowser.findElement(By.cssSelector("div.addUserButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("input[name='firstName']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='email']")).sendKeys("user2@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='username']")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
			//create user 3
			oBrowser.findElement(By.cssSelector("div.addUserButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("input[name='firstName']")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Demo");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='email']")).sendKeys("user3@mail.com");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='username']")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
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
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("span.startExploringText")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			//login user 2
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("span.startExploringText")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			//login user3
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("span.startExploringText")).click();
			Thread.sleep(2000);
			
			
			//logout
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
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
			//modify user1 password
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.userNameCell.first > div > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
			//modify user2 password
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(2) > td.userNameCell.first > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
			//modify user3 password
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(3) > td.userNameCell.first > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);
			
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
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
			//login user1
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			//login user 2
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			//login user3
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user3");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password33");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			
			
			//logout
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
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
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			
			//delete user 1
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.userNameCell.first > div > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("button#userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);	

			//delete user 2
			oBrowser.navigate().refresh();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.userNameCell.first > div > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("button#userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);	
			
			//delete user 3
			oBrowser.navigate().refresh();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.userNameCell.first > div > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("button#userDataLightBox_deleteBtn")).click();
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
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
