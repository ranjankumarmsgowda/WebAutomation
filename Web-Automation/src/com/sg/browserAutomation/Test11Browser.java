package com.sg.browserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11Browser {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForPersonSachinTendulkar();
		enterSalaryWhoIsNextToRahulDravid();
	//	makeStatusActiveForIndianFreedomFighter();
	//makeStatusActiveForPersonWhoIsPrecedingToRahulDravid();
	//	basedOnChildElementIdentifyAncestor();
		//decendantExample();
	}
	
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.get("D:\\Class2\\HTML_Pages\\WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}

	static void enterSalaryWhoIsNextToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/td[6]/input")).sendKeys("15000");
	}
	
	static void makeStatusActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	
	static void makeStatusActiveForPersonWhoIsPrecedingToRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	
	static void basedOnChildElementIdentifyAncestor()
	{
		oBrowser.findElement(By.xpath("//input[@id='edit2']/ancestor::td/preceding-sibling::td[5]/input")).click();
	}
	
	static void decendantExample()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[6]/td[6]/input")).sendKeys("15000");
	}
}
