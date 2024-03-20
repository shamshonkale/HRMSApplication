package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 
{
	@Test
	public void tc002()
	{
		DOMConfigurator.configure("log4j.xml");
		General ob=new General();
		ob.openApplication();
		ob.login();
		ob.enterFrame();
		ob.addNewEmp();
		ob.exitFrame();
		ob.logout();
		ob.closeApplication();
	}
}
