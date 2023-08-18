package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingPayments;
import com.medol1.pageobjects.Loginpage;

public class TC_Billings_Delete extends Baseclass{
	@Test
	 public void billing_test_delete() throws InterruptedException {
    	 Loginpage l=new Loginpage(driver);
    	 l.clickonlogin();
    	 l.setemail(username);
    	 l.setpassword(password);
    	 l.clickonloginsubmit();
    	 BillingPayments b=new BillingPayments(driver);
    	 b.clickbillingmodule();
    	 Thread.sleep(1000);
    	 b.clickinvoiceoption();
    	 Thread.sleep(1000);
    	
    	 b.clickdeletebtn();
 		Thread.sleep(1000);
 		b.clickyesbtn();
}
}