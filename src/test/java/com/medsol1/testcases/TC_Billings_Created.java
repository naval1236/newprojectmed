package com.medsol1.testcases;

import org.testng.annotations.Test;

import com.medol1.pageobjects.BillingPayments;
import com.medol1.pageobjects.Loginpage;

public class TC_Billings_Created extends Baseclass{
	@Test
	  public void billing_test_created() throws InterruptedException {
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
}
