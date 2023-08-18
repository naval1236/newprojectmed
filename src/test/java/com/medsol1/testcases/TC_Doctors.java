package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Doctors;
import com.medol1.pageobjects.Loginpage;

public class TC_Doctors extends Baseclass {

	@Test
	public void doctor_test() throws AWTException {
		Loginpage l=new Loginpage(driver);
		l.clickonlogin();
		l.setemail(username);
		l.setpassword(password);
		l.clickonloginsubmit();
		Doctors d=new Doctors(driver);
		d.clickondoctoroption();
		d.clickonactionsDD();
		d.clickonnewdoctoroption();
		d.setenterfirstname("Pavan");
		d.setenterlastname("kumar");
		d.clickonselectdepartment();
		d.setselectdepartment("Neurology");
		d.setenteremail("pavankumar@gmail.com");
		d.setenterdesignation("Software");
		d.setenterphno("8765432178");
		d.setqualification("B.Tech");
		d.setdob("1993", "August", "14");
		d.selectbloodgroup();
		d.setselectsearchboxbloodgroup("AB+");
		d.maleradiobtn();
		d.setenterspecialist("child");
		d.setenterpassword("Pavan123");
		d.setenterconfirmpassword("Pavan123");
		d.uploadimage();
		d.setuploadimage("C:\\Users\\admin\\Desktop\\image01.jpeg");
		d.setaddress1("Banarghatha road");
		d.setaddress2("BTM 1 Stage");
		d.setcity("Bangalore");
		d.setzip("560076");
		d.clickonsavebtn();
		}
	
	
}