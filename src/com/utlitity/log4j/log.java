package com.utlitity.log4j;


	//import org.openqa.selenium.bidi.log.Log;
import org.testng.log4testng.Logger;



	public class log {

		//public static void info(String string) {
			// TODO Auto-generated method stub
		private static  Logger log1=Logger.getLogger(log.class.getName());
		
		public static void info(String Message) 
		{
			log1.info(Message);
		}
		
		public static void error(String message)
		{
			log1.error(message);
		
		}


		
	}



