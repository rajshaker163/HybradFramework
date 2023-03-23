package com.hrms.testng.testscripts;

import org.testng.annotations.Test;

import com.hrms.testng.Rajshaker;


public class TC0001 extends Rajshaker {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test
	public void tc0001()
	{
		Rajshaker m1=new Rajshaker();
		m1.Open();
		m1.Login();
        m1.EnterFrames();
		m1.Add();
		m1.enterdetails();
		m1.ExitFrames();
		m1.Logout();
		m1.close();
		
		
	}
}
