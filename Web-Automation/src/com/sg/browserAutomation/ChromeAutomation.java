package com.sg.browserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAutomation {
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
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.get("https://www.youtube.com/");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try
		{
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-button-renderer/a/paper-button")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("identifierId")).sendKeys("19.silent.shadow.91");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("shadow@1991");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/div[2]")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
