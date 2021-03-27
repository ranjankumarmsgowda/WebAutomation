package com.sg.assignment2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModelForActiTime {
	
	public PageModelForActiTime(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//username
	private WebElement username;
	public WebElement getUser()
	{
		return username;
	}
	
	//password
	private WebElement pwd;
	public WebElement getPWD()
	{
		return pwd;
	}
	
	//login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement clickLogin()
	{
		return oLogin;
	}
	
	//minimize flyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement minimizeFlyOut()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//click on USERS
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement users;
	public WebElement clickUsers()
	{
		return users;
	}
	
	//add User
	@FindBy (xpath="//*[@class='addUserButton beigeButton useNativeActive']")
	private WebElement addUserButton;
	public WebElement addUsers()
	{
		return addUserButton;
	}
	
	//firstName
	private WebElement firstName;
	public WebElement fn()
	{
		return firstName;
	}

	// lastName
	private WebElement lastName;
	public WebElement ln() 
	{
		return lastName;
	}

	//email
	private WebElement email;
	public WebElement eMail() 
	{
		return email;
	}
	
	//userName
	private WebElement userDataLightBox_usernameField;
	public WebElement uName() 
	{
		return userDataLightBox_usernameField;
	}

	//password
	private WebElement password;
	public WebElement pwd() 
	{
		return password;
	}

	//retype password
	private WebElement passwordCopy;
	public WebElement rePwd() 
	{
		return passwordCopy;
	}
	
	//click create user or save changes
	private WebElement userDataLightBox_commitBtn;
	public WebElement clickCreateUser() 
	{
		return userDataLightBox_commitBtn;
	}
	
	//skip intro video 
	@FindBy(xpath="//*[@class='startExploringText']")
	private WebElement skip;
	public WebElement skipIntro()
	{
		return skip;
	}
	
	//click user1
	@FindBy(xpath="//*[@class='userNameSpan'][text()='Demo, user1']")
	private WebElement user1;
	public WebElement clickUser1()
	{
		return user1;
	}
	
	//click user2
	@FindBy(xpath="//*[@class='userNameSpan'][text()='Demo, user2']")
	private WebElement user2;
	public WebElement clickUser2()
	{
		return user2;
	}
	
	//click user3
	@FindBy(xpath="//*[@class='userNameSpan'][text()='Demo, user3']")
	private WebElement user3;
	public WebElement clickUser3()
	{
		return user3;
	}
	
	//click delete
	private WebElement userDataLightBox_deleteBtn;
	public WebElement clickDelete()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//click on tasks
	@FindBy(xpath="//*[text()='TASKS']")
	private WebElement tasks;
	public WebElement clickTasks()
	{
		return tasks;
	}
	
	//click add new (customer/project)
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	public WebElement clickAddNew()
	{
		return addNew;
	}
	
	//click on add new Customer
	@FindBy(xpath="//*[@class='item createNewCustomer ellipsis']")
	private WebElement addNewCustomer;
	public WebElement clickAddNewCustomer()
	{
		return addNewCustomer;
	}
	
	//click on add new Project
	@FindBy(xpath="//*[@class='item createNewProject ellipsis']")
	private WebElement addNewProject;
	public WebElement clickAddNewProject()
	{
		return addNewProject;
	}
	
	//enter customer name 
	private WebElement customerLightBox_nameField;
	public WebElement customerName()
	{
		return customerLightBox_nameField;
	}
	
	//create customer button 
	private WebElement customerLightBox_commitBtn;
	public WebElement createCustomerButton()
	{
		return customerLightBox_commitBtn;
	}
	
	//enter project name 
	private WebElement projectPopup_projectNameField;
	public WebElement projectName()
	{
		return projectPopup_projectNameField;
	}
	
	//create project button 
	private WebElement projectPopup_commitBtn;
	public WebElement createProjectButton()
	{
		return projectPopup_commitBtn;
	}
	
	//add new task button 
	@FindBy(xpath="//*[text()='Add New Task']")
	private WebElement addNewTask;
	public WebElement clickAddNewTask()
	{
		return addNewTask;
	}
	
	//create task button
	@FindBy(xpath="//*[@class='item createNewTask ellipsis']")
	private WebElement createNewTask;
	public WebElement clickCreateNewTask()
	{
		return createNewTask;
	}
	
	//task1 
	@FindBy(xpath="//tbody//tr[1]//td[1]//input[@class='inputFieldWithPlaceholder']")
	private WebElement task1;
	public WebElement enterTask1()
	{
		return task1;
	}
	
	//task2 
	@FindBy(xpath="//tbody//tr[2]//td[1]//input[@class='inputFieldWithPlaceholder']")
	private WebElement task2;
	public WebElement enterTask2()
	{
		return task2;
	}
		
	//task3 
	@FindBy(xpath="//tbody//tr[3]//td[1]//input[@class='inputFieldWithPlaceholder']")
	private WebElement task3;
	public WebElement enterTask3()
	{
		return task3;
	}
		
	//task4 
	@FindBy(xpath="//tbody//tr[4]//td[1]//input[@class='inputFieldWithPlaceholder']")
	private WebElement task4;
	public WebElement enterTask4()
	{
		return task4;
	}
		
	//task5 
	@FindBy(xpath="//tbody//tr[5]//td[1]//input[@class='inputFieldWithPlaceholder']")
	private WebElement task5;
	public WebElement enterTask5()
	{
		return task5;
	}
	
	//click create task
	private WebElement createTasksPopup_commitBtn;
	public WebElement clickCreateTask()
	{
		return createTasksPopup_commitBtn;
	}
	
	//check delete tasks 
	@FindBy(css="table.headerRowTable>tbody>tr>td.selection")
	private WebElement deleteTasks;
	public WebElement clickDeleteTask()
	{
		return deleteTasks;
	}
	
	//click delete for tasks
	@FindBy(css="div.deleteButton>span")
	private WebElement delete;
	public WebElement clickDeleteTaskButton()
	{
		return delete;
	}
	
	//accept delete tasks
	private WebElement deleteTaskPopup_deleteConfirm_submitBtn;
	public WebElement confirmDelete()
	{
		return deleteTaskPopup_deleteConfirm_submitBtn;
	}
	
	//project settings 
	@FindBy(xpath="(//div[@class='editButton available'])[2]")
	private WebElement projectSettings;
	public WebElement clickProjectSettings()
	{
		return projectSettings;
	}
	
	//click before rename of project
	@FindBy(css="div.projectNamePlaceholder>div>div.nameLabel")
	private WebElement clickProject;
	public WebElement clickProjectName()
	{
		return clickProject;
	}
	
	//clear or rename project
	@FindBy(css="div.nameInput>input[placeholder='Enter Project Name']")
	private WebElement clearRenameProject;
	public WebElement clearOrRenameProject()
	{
		return clearRenameProject;
	}
	
	//close project panel
	@FindBy(xpath="//div[@class='headerBlock hideTabs']//div[@class='closeButton']")
	private WebElement closeProject;
	public WebElement closeProjectPanel()
	{
		return closeProject;
	}
	
	//project panel action 
	@FindBy(xpath="(//*[text()='ACTIONS'])[3]")
	private WebElement projectAction;
	public WebElement projectActionPanel()
	{
		return projectAction;
	}
	
	//delete project 
	@FindBy(xpath="(//div[text()='Delete'])[3]")
	private WebElement clickDeleteProject;
	public WebElement deleteProject()
	{
		return clickDeleteProject;
	}
	
	//accept delete project 
	private WebElement projectPanel_deleteConfirm_submitBtn;
	public WebElement acceptDeleteProject()
	{
		return projectPanel_deleteConfirm_submitBtn;
	}
	
	//customer setting
	@FindBy(xpath="(//div[@class='editButton available'])[1]")
	private WebElement clickCustSetting;
	public WebElement clickCustomerSettings()
	{
		return clickCustSetting;
	}
	
	//click before rename of customer
	@FindBy(css="div.customerNamePlaceHolder>div>div.nameLabel")
	private WebElement clickCustomer;
	public WebElement clickCustomerName()
	{
		return clickCustomer;
	}
		
	//clear or rename project
	@FindBy(css="div.nameInput>input[placeholder='Enter Customer Name']")
	private WebElement clearRenameCustomer;
	public WebElement clearOrRenameCustomer()
	{
		return clearRenameCustomer;
	}
		
	//close Customer panel
	@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='headerBlock']//div[@class='closeButton']")
	private WebElement closeCustomer;
	public WebElement closeCustomerPanel()
	{
		return closeCustomer;
	}
	
	//Customer panel action 
	@FindBy(xpath="(//*[text()='ACTIONS'])[1]")
	private WebElement customerAction;
	public WebElement customerActionPanel()
	{
		return customerAction;
	}
		
	//delete Customer 
	@FindBy(xpath="(//div[text()='Delete'])[1]")
	private WebElement clickDeleteCustomer;
	public WebElement deleteCustomer()
	{
		return clickDeleteCustomer;
	}
	
	//accept delete customer
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement acceptDeleteCustomer()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	
}
