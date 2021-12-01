package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
	      //reusable methods or functions'
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.navigate().to(url);
	}
public void closeapp() {
	driver.close();
	
}
public void login() {
	driver.findElement(By.name(untext)).sendKeys(un);
	driver.findElement(By.name(pwtxtname)).sendKeys(pw);
	driver.findElement(By.name(loginname)).click();
}
public void logout() {
	driver.findElement(By.linkText(logoutlink)).click();
}
public void enterframe()
{
	driver.switchTo().frame(frame);
}
public void exitframe()
{
	driver.switchTo().defaultContent();
}
public void addemployee() {
	driver.findElement(By.xpath(addvalue)).click();
	driver.findElement(By.name(fstname)).sendKeys(empfstname);
	driver.findElement(By.name(lstname)).sendKeys(emplstname);
	driver.findElement(By.id(saveid)).click();
}
public void editemployee()throws Exception
{
	driver.findElement(By.partialLinkText(paremplink)).click();
	driver.findElement(By.id(editbtnid)).click();
	driver.findElement(By.id(editfstid)).clear();
	driver.findElement(By.id(editlstid)).clear();
	driver.findElement(By.id(editfstid)).sendKeys(empfstname);
	driver.findElement(By.id(editlstid)).sendKeys(emplstname);
	Thread.sleep(1000);
	driver.findElement(By.name(esavename)).click();
}
}
