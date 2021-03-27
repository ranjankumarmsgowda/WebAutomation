package com.sg.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		navigate();
		logoutClose();
	}

	static void navigate()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);

			//navigate
			oBrowser.get("https://www.google.com/");
			Thread.sleep(2000);

			//search Sg Testing Institute
			oBrowser.findElement(By.xpath("//input[@name='q']")).sendKeys("Sg Testing Institute");
			Thread.sleep(2000);
			//select Sg Testing Institute drop down
			oBrowser.findElement(By.xpath("(//*[@class='sbtc']/div)[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("(//*[@class='LC20lb DKV0Md'])[1]")).click();
			Thread.sleep(2000);
			String strUrl = oBrowser.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrl);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logoutClose()
	{
		try
		{
			//close browser
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
