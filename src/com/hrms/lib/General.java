package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global{
	//STD Rule-To provide all re-usable fun:/methods: related to whole application
	public void openApplication()
	{
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		//to print on html report
		Reporter.log("Application Opened");
		//to print on log file
		Log.info("Application Opened");
	}
	public void closeApplication()
	{
		driver.quit();
		System.out.println("Application Closed");
		//to print on html report
		Reporter.log("Application Closed");
		//to print on log file
		Log.info("Application Closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_username)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		//to print on html report
		Reporter.log("Login Completed");
		//to print on log file
		Log.info("Login Completed");
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		//to print on html report
		Reporter.log("Logout Completed");
		//to print on log file
		Log.info("Logout Completed");
	}
	public void enterFrame()
	{
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered info Frame");
		//to print on html report
		Reporter.log("Entered info Frame");
		//to print on log file
		Log.info("Entered info Frame");
	}
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit from Frame");
		//to print on html report
		Reporter.log("Exit from Frame");
		//to print on log file
		Log.info("Exit from Frame");
	}
	public void addNewEmp()
	{
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Employee added");
		//to print on html report
		Reporter.log("New Employee added");
		//to print on log file
		Log.info("New Employee added");
	}
}
