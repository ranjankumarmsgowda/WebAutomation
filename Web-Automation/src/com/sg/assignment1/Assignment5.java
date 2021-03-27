package com.sg.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		navigate();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
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
	
	static void createCustomer()
	{
		try
		{
			//create customer
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("body > div.dropdownContainer.addNewMenu > div.item.createNewCustomer.ellipsis")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createProject()
	{
		try
		{
			//create Project
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.cssSelector("body > div.dropdownContainer.addNewMenu > div.item.createNewProject.ellipsis")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try
		{
			// delete Project
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	static void deleteCustomer()
	{
		try
		{
			// delete customer
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
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
