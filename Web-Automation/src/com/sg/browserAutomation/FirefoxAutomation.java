package com.sg.browserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
	}
	
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
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
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
