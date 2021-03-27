package com.sg.assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCase1OwnCssSelector {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchNav();
		login();
		createUser1();
		createUser2();
		createUser3();
		changePwdUser1();
		deleteUsers();
		closeBrowser();

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
	static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("div.gettingStartedShortcutsLabel")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
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
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("span.startExploringText")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("div.addUserButton")).click();
			Thread.sleep(2000);
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
			oBrowser.navigate().refresh();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(2) > td.userNameCell.first > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("span.startExploringText")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("div.addUserButton")).click();
			Thread.sleep(2000);
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
			
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void changePwdUser1()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.userNameCell.first > div > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("input[name='password']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='passwordCopy']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("div#userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUsers()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user2");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password22");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			//delete user 3
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(3) > td.userNameCell.first > table > tbody > tr > td > div.name ")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("button#userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			//delete user 2
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("user1");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("password11");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(2) > td.userNameCell.first > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("button#userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
			//delete user 1
			oBrowser.findElement(By.cssSelector("input#username")).sendKeys("admin");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			Thread.sleep(500);
			oBrowser.findElement(By.cssSelector("a#loginButton>div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a[href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("table > tbody > tr:nth-child(1) > td.userNameCell.first > div > table > tbody > tr > td > div.name")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("button#userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oBrowser.findElement(By.cssSelector("a#logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeBrowser()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
