package com.hrms.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rajshaker extends ManuKumar  {
	
	public void Open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
	
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(n);
	driver.get(url);
	

	    Reporter.log("opened");
		
		
		
	}
	
	public void close()
	{
		driver.close();
		Reporter.log("close");
	}
	
	public void Login()
	{
		driver.findElement(By.name(txt_username)).sendKeys(username);
		driver.findElement(By.name(txt_Password)).sendKeys(Password);
		driver.findElement(By.name(Login_btn)).click();
		Reporter.log("login");
	}
	
	public void Logout()
	{
		driver.findElement(By.xpath(Logout)).click();
		Reporter.log("logout");
	}
	
	
		public void EnterFrames()
		{
			driver.switchTo().frame(Frames);
			Reporter.log("enter");
		}
		
		public void ExitFrames()
		{
			driver.switchTo().defaultContent();
			Reporter.log("exit");
		}
		public void Add()
		{
			driver.findElement(By.xpath(Add_btn)).click();
		}
		
		public void enterdetails()
		{
			
			driver.findElement(By.name(txt_code)).clear();
			driver.findElement(By.name(txt_code)).sendKeys(code);
			driver.findElement(By.name(txt_Fname)).sendKeys(Fname);
			driver.findElement(By.name(txt_Lname)).sendKeys(Lname);
			driver.findElement(By.name(txt_Mname)).sendKeys(Mname);
			driver.findElement(By.name(txt_NName)).sendKeys(Nname);
			driver.findElement(By.xpath( file)).sendKeys(photo);
			driver.findElement(By.id(save_btn)).click();
			Reporter.log("sucessfully enter");
			
			
			
	}

}
