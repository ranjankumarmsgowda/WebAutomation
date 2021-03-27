package com.sg.assignment2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7 {
	public static WebDriver oBrowser=null;
	public static PageModelForActiTime oPage=null;
	public static void main(String[] args) {
		
		launchNavigate();
		login();
		createCustomer();
		createProject();
		createTasks();
		deleteTask();
		deleteProject();
		deleteCustomer();
		logoutClose();
	}
	
	static void launchNavigate()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(1000);
			oBrowser.manage().window().maximize();
			oPage=new PageModelForActiTime(oBrowser);
			Thread.sleep(2000);
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try {
			oPage.getUser().sendKeys("admin");
			Thread.sleep(500);
			oPage.getPWD().sendKeys("manager");
			Thread.sleep(500);
			oPage.clickLogin().click();
			Thread.sleep(2000);
			oPage.minimizeFlyOut().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createCustomer()
	{
		try {
			oPage.clickTasks().click();
			Thread.sleep(1000);
			oPage.clickAddNew().click();
			Thread.sleep(1000);
			oPage.clickAddNewCustomer().click();
			Thread.sleep(1000);
			oPage.customerName().sendKeys("Customer1");
			Thread.sleep(1000);
			oPage.createCustomerButton().click();	
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createProject()
	{
		try {
			oPage.clickAddNew().click();
			Thread.sleep(1000);
			oPage.clickAddNewProject().click();
			Thread.sleep(1000);
			oPage.projectName().sendKeys("Project1");
			Thread.sleep(1000);
			oPage.createProjectButton().click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void createTasks()
	{
		try {
			oPage.clickAddNewTask().click();
			Thread.sleep(1000);
			oPage.clickCreateNewTask().click();
			Thread.sleep(1000);
			oPage.enterTask1().sendKeys("task1");
			Thread.sleep(1000);
			oPage.enterTask2().sendKeys("task2");
			Thread.sleep(1000);
			oPage.enterTask3().sendKeys("task3");
			Thread.sleep(1000);
			oPage.enterTask4().sendKeys("task4");
			Thread.sleep(1000);
			oPage.enterTask5().sendKeys("task5");
			Thread.sleep(1000);
			oPage.clickCreateTask().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteTask()
	{
		try {
			oPage.clickDeleteTask().click();
			Thread.sleep(1000);
			oPage.clickDeleteTaskButton().click();
			Thread.sleep(1000);
			oPage.confirmDelete().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try {
			oPage.clickProjectSettings().click();
			Thread.sleep(1000);
			oPage.projectActionPanel().click();
			Thread.sleep(1000);
			oPage.deleteProject().click();
			Thread.sleep(1000);
			oPage.acceptDeleteProject().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try {
			oPage.clickCustomerSettings().click();
			Thread.sleep(1000);
			oPage.customerActionPanel().click();
			Thread.sleep(1000);
			oPage.deleteCustomer().click();
			Thread.sleep(1000);
			oPage.acceptDeleteCustomer().click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void logoutClose()
	{
		try {
			oPage.getLogoutLink().click();
			Thread.sleep(1000);
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
