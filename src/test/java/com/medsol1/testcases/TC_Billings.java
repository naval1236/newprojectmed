package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingPayments;
import com.medol1.pageobjects.Loginpage;

public class TC_Billings extends Baseclass {
	
	@Test(priority=0)
     public void billing_test() throws InterruptedException {
    	 Loginpage l=new Loginpage(driver);
    	 l.clickonlogin();
    	 l.setemail(username);
    	 l.setpassword(password);
    	 l.clickonloginsubmit();
    	 BillingPayments bp=new BillingPayments(driver);
    	 bp.clickbillingmodule();
    	 Thread.sleep(1000);
    	 bp.clickinvoiceoption();
    	 bp.clicknewinvoice();
    	 bp.clickonselectpatient();
    	 Thread.sleep(1000);
    	 bp.setselectpatientsearchbox("Sai sharan");
    	 Thread.sleep(1000);
    	 bp.setinvoicedate("2023", "August", "05");
    	 Thread.sleep(1000);
    	 bp.setenterdiscount("10");
    	 Thread.sleep(1000);
    	 bp.selectstatus();
    	 Thread.sleep(1000);
    	 bp.setstatussearchbox("Pending");
    	 Thread.sleep(1000);
    	 bp.selectaccount();
    	 Thread.sleep(1000);
    	 bp.setselectaccountsearchbox("3342619884");
    	 Thread.sleep(1000);
    	 bp.setenterdescription("Billing Payments");
    	 Thread.sleep(1000);
    	 bp.scrolldown1();
         Thread.sleep(1000);
    	
    	 bp.setenterquantity("2");
    	 Thread.sleep(1000);
    	 bp.setenterprice("2000");
    	 Thread.sleep(1000);
    	 bp.clicksavebtn();
    	 Thread.sleep(1000);
    	 bp.backbutton();
    	 Thread.sleep(2000);
    	 bp.backbutton();
    	    }
	@Test(priority=1,dependsOnMethods = "billing_test")
	public void editbilling_test() throws InterruptedException, AWTException {
		BillingPayments b=new BillingPayments(driver);
		b.editbutton();
		Thread.sleep(1000);
		b.clickoneditselectpatient();
		Thread.sleep(1000);
		b.setselectpatientsearchbox("Ma J");
		Thread.sleep(1000);
		b.seteditinvoicedate("2023", "August", "04");
		Thread.sleep(1000);
		b.seteditdiscount("15");
		Thread.sleep(1000);
		//b.editstatus();
		//Thread.sleep(1000);
		//b.editstatussearchbox();
		//Thread.sleep(1000);
		 b.scrolldown1();
         Thread.sleep(1000);
    	/*
		b.editselectaccount();
		Thread.sleep(1000);
		b.seteditselectaccountsearchbox("1455294628432");
		Thread.sleep(1000);
		
		b.seteditenterdescription("Edited Description");
		Thread.sleep(1000);
		b.seteditenterquantity("3");
		Thread.sleep(1000);
		b.seteditenterprice("2500");
		Thread.sleep(1000);
		*/
		b.editsavebtn();
		Thread.sleep(1000);
		b.backbutton();
		Thread.sleep(2000);
		b.backbutton();
		Thread.sleep(2000);
	}
	@Test(priority=2,dependsOnMethods = {"billing_test","editbilling_test"})
	public void deleteilling_test() throws InterruptedException {
		BillingPayments b=new BillingPayments(driver);
	
		b.clickdeletebtn();
		Thread.sleep(1000);
		b.clickyesbtn();
	}
}
