package testngexample;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ExpTestng1 
{
//	@Test 
//	public void abcde() {
//		System.out.println("abcde");
//	}
	@Test 
	public void bcde()
	{
		System.out.println("bcde");
	}
	@BeforeMethod
	public void cde() {
		System.out.println("cde");
	}
	@AfterMethod
	public void de()
	{
		System.out.println("de");
	}
}
