package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ExpWdTestng1 
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
	public void Tc002() throws Exception
	{
		FileInputStream file = new FileInputStream("E:\\NARESH IT\\SOFTWARE TESTING\\EXCEL\\LoginExcel.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		String username = st.getCell(0,1).getContents();
		String password = st.getCell(1,1).getContents();
		Reporter.log(username);
		Reporter.log(password);
		driver.get("http://183.82.103.245/nareshit/login.php");
		Reporter.log("Application Opened");
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
	}
}
