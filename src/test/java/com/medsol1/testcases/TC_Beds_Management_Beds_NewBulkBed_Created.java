package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Beds_Management_Beds;
import com.medol1.pageobjects.Loginpage;

public class TC_Beds_Management_Beds_NewBulkBed_Created extends Baseclass{
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
		bmb.actionbutton();
		Thread.sleep(2000);
		bmb.clickonnewbulkbed();
		Thread.sleep(2000);
		bmb.enternewbluktextname();
		Thread.sleep(2000);
		bmb.clickonselecttypeDD();
		Thread.sleep(2000);
		bmb.setnewbulkbedselecttyoeDD("Bed2");
		Thread.sleep(2000);
		bmb.newbulkcharge();
		Thread.sleep(2000);
		bmb.newbulkdescriptionarea();
		Thread.sleep(2000);
		bmb.newbulkbedsave();
	
}
}
