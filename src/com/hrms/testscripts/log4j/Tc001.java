package com.hrms.testscripts.log4j;

import org.w3c.dom.DOMConfiguration;

import com.hrms.lib.log4j.tester;
import com.hrms.lib.log4j.testng;

public class Tc001 extends testng {
	
	
	public static void main(String[] args)
	{

//private void DOMConigurator() {
	// TODO Auto-generated method stub

	DOMConfiguration.configurator("Log4j.xlm");
	tester t1=new tester();
	t1.Open();
	t1.Login();
	//t1.Frames();
	//t1.Add();
	//t1.ExitFrames();
	t1.logout();
   
}

}
