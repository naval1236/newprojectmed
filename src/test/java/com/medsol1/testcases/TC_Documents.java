package com.medsol1.testcases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.medol1.pageobjects.Documents;
import com.medol1.pageobjects.Loginpage;

public class TC_Documents extends Baseclass {
	@Test(priority=0)
	public void documents_test() throws InterruptedException, AWTException {
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
	@Test(priority=1,dependsOnMethods = "documents_test")
	public void editdocument_test() throws InterruptedException, AWTException {
		Documents d=new Documents(driver);
		d.editBtn();
		Thread.sleep(1000);
		d.edittitletext();
		Thread.sleep(1000);
		d.editclickdocumenttype();
		Thread.sleep(1000);
		d.seteditdocumentsearchbox("World");
		Thread.sleep(1000);
		d.editclickpatient();
		Thread.sleep(1000);
		d.seteditpatientname("Ma J");
		Thread.sleep(1000);
		d.editclickonimageattachicon();
		Thread.sleep(1000);
		d.seteditattachment("C:\\Users\\admin\\Desktop\\image02.jpeg");
		Thread.sleep(1000);
		d.editdescription();
		Thread.sleep(1000);
		d.editsavebtn();
		Thread.sleep(1000);

	}
	@Test(priority=2,dependsOnMethods = {"documents_test","editdocument_test"})
	public void downloaddocument_test() {
		Documents d=new Documents(driver);
		d.downloaddetails();
	}
	@Test(priority=3,dependsOnMethods = {"documents_test","editdocument_test"})
	public void deletedocument_test() throws InterruptedException {
		Documents d=new Documents(driver);
		d.deletebutton();
		Thread.sleep(1000);
		d.yesdeletebutton();
	}
}