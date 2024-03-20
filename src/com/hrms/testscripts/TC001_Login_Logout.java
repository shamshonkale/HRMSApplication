package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC001_Login_Logout 
{
	public static void main(String[] args) 
	{
		//Test steps
		General ob=new General();
		ob.openApplication();
		ob.login();
		ob.logout();
		ob.closeApplication();
	}
}
