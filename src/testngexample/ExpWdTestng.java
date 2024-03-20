package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExpWdTestng 
{
	WebDriver driver;
	@BeforeClass
	public void startUp()
	{
		driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void Tc001() throws Exception
	{
		driver.get("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
	}
}
