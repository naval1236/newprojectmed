package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Beds_Management_Beds;
import com.medol1.pageobjects.Loginpage;

public class TC_Beds_Management_Beds_Created extends Baseclass {
	@Test
	public void Beds_Management_Beds_test() throws InterruptedException {
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
		bmb.newbedclick();
		Thread.sleep(2000);
		bmb.bedtext();
		Thread.sleep(2000);
		bmb.selectbedtype();
		Thread.sleep(2000);
		bmb.setSelectbedtype("Bed2");
		Thread.sleep(2000);
		bmb.bedcharge();
		Thread.sleep(2000);
		bmb.description();
		Thread.sleep(2000);
		bmb.savebutton();
	}
}
