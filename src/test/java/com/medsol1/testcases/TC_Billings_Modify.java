package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingPayments;
import com.medol1.pageobjects.Loginpage;

public class TC_Billings_Modify extends Baseclass{
	@Test
	  public void billing_test_modify() throws InterruptedException, AWTException {
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
}

