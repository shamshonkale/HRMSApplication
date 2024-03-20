package com.hrms.utility;
import org.apache.log4j.Logger;
public class Log 
{
	//To initialize log4j
	private static Logger Log=Logger.getLogger(Log.class.getName());
	
	//Need to create this method to print message
	public static void info(String message)
	{
		Log.info(message);
	}
}
