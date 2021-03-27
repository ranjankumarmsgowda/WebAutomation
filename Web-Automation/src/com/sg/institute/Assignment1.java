package com.sg.institute;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		navigate();
		createUser();
		modifyUser();
		deleteUser();
		logoutClose();

	}
	
	static void navigate()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);
			
			//navigate
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			
			//login as admin
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			Thread.sleep(2000);
			
			//create user
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
			
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oBrowser.navigate().refresh();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			// delete user
			oBrowser.navigate().refresh();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
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
