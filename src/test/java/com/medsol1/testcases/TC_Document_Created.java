package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Documents;
import com.medol1.pageobjects.Loginpage;

public class TC_Document_Created extends Baseclass{
	@Test
	public void documents_test_created() throws InterruptedException, AWTException {
		Loginpage lp=new Loginpage(driver);
		Thread.sleep(1000);
		lp.clickonlogin();
		Thread.sleep(1000);
		lp.setemail(username);
		Thread.sleep(1000);
		lp.setpassword(password);
		lp.clickonloginsubmit();
		Thread.sleep(4000);
		Documents d=new Documents(driver);
		d.clickondocumentmodule();
		Thread.sleep(1000);
		d.clickonnewdocument();
		Thread.sleep(1000);
		d.entertitletext();
		Thread.sleep(1000);
		d.clickondocumenttype();
		Thread.sleep(1000);
		d.setclickondocumenttype("csv");
		Thread.sleep(1000);
		d.clickonpatient();
		Thread.sleep(1000);
		d.setpatientname("M 1");
		Thread.sleep(1000);
		d.clickonimageattachicon();
		Thread.sleep(1000);
		d.setattachment("C:\\Users\\admin\\Desktop\\image01.jpeg");
		d.enterdescription();
		Thread.sleep(1000);
		d.clickonsavebtn();
		Thread.sleep(1000);

		
}

}
