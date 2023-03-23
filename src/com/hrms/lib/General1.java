package com.hrms.lib;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class General1 extends Global1 {

	public void Open()
	{
System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get(url);
		}
	public void Login()
	{
		driver.findElement(By.name(txt_un)).sendKeys(un);
		driver.findElement(By.name(txt_pw)).sendKeys(pw);
		driver.findElement(By.name(login_btn)).click();
		
	}
	public void logout()
	{
		driver.findElement(By.linkText(logout)).click();
	}
	public void Frames()
	{
		driver.switchTo().frame(Frames);
	}
	public void Add()
	{
		driver.findElement(By.xpath(Add_btn)).click();
		driver.findElement(By.name(txt_code)).clear();
		driver.findElement(By.name(txt_code)).sendKeys(code);
		driver.findElement(By.name(txt_FirstName)).sendKeys(FirstName);
		driver.findElement(By.name(txt_LastName)).sendKeys(LastName);
		driver.findElement(By.name(txt_MiddleName)).sendKeys(MiddleName);
		driver.findElement(By.name(txt_NickName)).sendKeys(NickName);
		driver.findElement(By.xpath(file)).sendKeys(photo);
		driver.findElement(By.id(btn_save)).click();
	}
	public void ExitFrames()
	{
		driver.switchTo().defaultContent();
	}
	public void Logout()
	{
	
		driver.findElement(By.linkText(logout)).click();
	
	}
	public void SearchFor()
	{
		driver.findElement(By.id(Search_by1)).sendKeys(Search_by);
		driver.findElement(By.name(serachfor)).sendKeys(searchfor);
		driver.findElement(By.xpath(search_btn)).click();
		driver.findElement(By.name(radio_btn)).click();
		driver.findElement(By.xpath(Delete_btn)).click();
	}

}
