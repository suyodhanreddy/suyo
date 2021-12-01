package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	        //test data
	public String url="http://183.82.125.5/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String empfstname="suyodhan";
	public String emplstname="reddy";

	
	        //obj info

	public String untext="txtUserName";
	public String pwtxtname="txtPassword";
	public String loginname="Submit";
	public String logoutlink="Logout";
	public String addvalue="//input[@value='Add'][@type='button']";
	public String lstname="txtEmpLastName";
	public String fstname="txtEmpFirstName";
	public String saveid="btnEdit";
	public String frame="rightMenu";
	public String paremplink="suyodhan";
	public String editbtnid="btnEditPers";
	public String editfstid="txtEmpFirstName";
	public String editlstid="txtEmpLastName";
	public String esavename="EditMain";
}
