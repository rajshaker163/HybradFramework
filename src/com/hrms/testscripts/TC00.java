package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General1;

public class TC00  extends General1{

	//public static void main(String[] args) {
	@Test	// TODO Auto-generated method stub
	public void tc00 ()
	{

		General1 g1=new General1();
		g1.Open();
		g1.Login();
		g1.Frames();
		g1.Add();
		g1.ExitFrames();
		g1.Logout();
		
	}

}
