package com.sg.browserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		navigate();
		createDelete();

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
	
	static void createDelete()
	{
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
