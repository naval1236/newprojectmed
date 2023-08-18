package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Beds_Management_Beds;
import com.medol1.pageobjects.Loginpage;

public class TC_Beds_Management_Beds_NewBulkBed_Modify extends Baseclass{
	@Test
	public void beds_Management_Beds_NewBulktest() throws InterruptedException {
		Loginpage lp=new Loginpage(driver);
		lp.clickonlogin();
		lp.setemail(username);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(4000);
		Beds_Management_Beds bmb=new Beds_Management_Beds(driver);
		bmb.clickonbedmanagement();
		Thread.sleep(2000);
		bmb.bedoption();
		Thread.sleep(2000);
		
		bmb.editbutton();
		Thread.sleep(1000);
		bmb.edittextbox();
		Thread.sleep(1000);
		bmb.editbedcharge();
		Thread.sleep(1000);
		bmb.editbeddescription();
		Thread.sleep(1000);
		bmb.editsavebutton();
	
	
}
}