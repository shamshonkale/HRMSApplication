package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 
{
	@Test
	public void tcoo1()
	{
		DOMConfigurator.configure("log4j.xml");
		General ob=new General();
		ob.openApplication();
		ob.login();
		ob.logout();
		ob.closeApplication();
	}
}
