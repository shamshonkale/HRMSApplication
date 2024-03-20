package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	//STD Rule-To Provide TestData & objects related to whole application
	public WebDriver driver;
	//Test data
	public String url="http://183.82.103.245/nareshit/login.php";
	public String username="nareshit";
	public String password="nareshit";
	//objects/elements
	public String txt_username="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String efn="selenium";
	public String eln="sureshsir";
	public String frame_empinfo="rightMenu";
	public String btn_add="//input[@value='Add']";
	public String txt_efn="txtEmpFirstName";
	public String txt_eln="txtEmpLastName";
	public String btn_save="btnEdit";
}
