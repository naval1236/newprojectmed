package com.medsol1.testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.medol1.pageobjects.Documents;
import com.medol1.pageobjects.Loginpage;

public class TC_Document_Modify extends Baseclass{
	@Test
	public void editdocument_test() throws InterruptedException, AWTException {
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

}
