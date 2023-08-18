package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Documents;
import com.medol1.pageobjects.Loginpage;

public class TC_Document_Delete extends Baseclass {
	@Test
	public void deletedocument_test() throws InterruptedException {
		Documents d=new Documents(driver);
		Loginpage lp=new Loginpage(driver);
		Thread.sleep(1000);
		lp.clickonlogin();
		Thread.sleep(1000);
		lp.setemail(username);
		Thread.sleep(1000);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(4000);
		d.clickondocumentmodule();
		Thread.sleep(1000);
		
		d.deletebutton();
		Thread.sleep(1000);
		d.yesdeletebutton();
	}

}
