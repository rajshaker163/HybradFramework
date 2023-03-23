package com.hrms.testscripts;

import com.hrms.lib.General1;

public class TC001 extends General1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		General1 g2=new General1();
		
         g2.Open();
         g2.Login();
         g2.Frames();
      //   g2.Add();
         
         g2.SearchFor();
         g2.ExitFrames();
         g2.logout();
	}

}
