package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingPayments {
 WebDriver ldriver;
 
 public BillingPayments(WebDriver rdriver) {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver,this);
 }
@FindBy(xpath="//a[@href='http://cls-medsol.in/accounts']")
WebElement clickbillingmodule;

@FindBy(xpath="//a[@href='http://cls-medsol.in/invoices']")
WebElement clickinvoiceoption;

@FindBy(xpath="//a[.='New Invoice']")
WebElement clicknewinvoice;

@FindBy(xpath="//span[@aria-controls='select2-patient_id-container']")
WebElement clickonselectpatient;

@FindBy(xpath="//input[@role='searchbox']")
WebElement selectpatientsearchbox;

@FindBy(id="invoice_date")
WebElement clickinvoicedate;

@FindBy(xpath="//input[@aria-label='Year']")
WebElement enteryear;

@FindBy(xpath="//select[@aria-label='Month']")
WebElement entermonth;

@FindBy(xpath="//div[@class='dayContainer']")
List<WebElement> enterdate;

@FindBy(id="discount")
WebElement enterdiscount;

@FindBy(xpath="//span[@title='Pending']")
WebElement selectstatus;

@FindBy(xpath="//input[@role='searchbox']")
WebElement statussearchbox;

@FindBy(xpath="//span[.='Select Account']")
WebElement selectaccount;

@FindBy(xpath="//input[@role='searchbox']")
WebElement selectaccountsearchbox;

@FindBy(name="description[]")
WebElement enterdescription;

@FindBy(name="quantity[]")
WebElement enterquantity;

@FindBy(name="price[]")
WebElement enterprice;

@FindBy(xpath="//input[@id='btnSave']")
WebElement clicksavebtn;

@FindBy(xpath="//a[.='Back']")
WebElement backbtn;


//Edit 


@FindBy(xpath="//a[@title='Edit']")
WebElement editbtn;

@FindBy(xpath="//span[@aria-controls='select2-patient_id-container']")
WebElement clickoneditselectpatient;

@FindBy(xpath="//input[@aria-controls='select2-account_id-my-results']")
WebElement selecteditpatientsearchbox;

@FindBy(id="editInvoiceDate")
WebElement editinvoicedate;

@FindBy(xpath="//input[@aria-label='Year']")
WebElement enteredityear;

@FindBy(xpath="//select[@aria-label='Month']")
WebElement entereditmonth;

@FindBy(xpath="//div[@class='dayContainer']")
List<WebElement> entereditdate;

@FindBy(id="discount")
WebElement entereditdiscount;

@FindBy(xpath="//span[@title='Paid']")
WebElement editstatus;

@FindBy(xpath="//input[@role='searchbox']")
WebElement editstatussearchbox;

@FindBy(xpath="//span[@aria-controls='select2-account_id-yw-container']")
WebElement editselectaccount;

@FindBy(xpath="//input[@role='searchbox']")
WebElement editselectaccountsearchbox;

@FindBy(name="description[]")
WebElement editenterdescription;

@FindBy(name="quantity[]")
WebElement editenterquantity;

@FindBy(name="price[]")
WebElement editenterprice;

@FindBy(xpath="//input[@id='btnSave']")
WebElement editclicksavebtn;


//Delete

@FindBy(xpath="//a[@title='Delete']")
WebElement deletebtn;

@FindBy(xpath="//button[.='Yes, Delete']")
WebElement yesbtn;

public void clickbillingmodule() {
	clickbillingmodule.click();
}
public void clickinvoiceoption() {
	clickinvoiceoption.click();
}
public void clicknewinvoice() {
	clicknewinvoice.click();
}
public void clickonselectpatient() {
	clickonselectpatient.click();
}
public void setselectpatientsearchbox(String name) {
	selectpatientsearchbox.sendKeys(name);
	selectpatientsearchbox.sendKeys(Keys.ENTER);
}
public void setinvoicedate(String year,String month,String date)
{
	clickinvoicedate.click();
	enteryear.click();
	enteryear.sendKeys(year);
	 Select month_drp= new Select(entermonth);
     month_drp.selectByVisibleText(month);
     List<WebElement> alldate= enterdate;
   
     for(WebElement ele:alldate)

     {

                   String dt= ele.getText();

                   if(dt.equals(date))

                   {

                                 ele.click();

                                 break;

                   }

     }
}
public void setenterdiscount(String num) {
	enterdiscount.sendKeys(num);
}
public void selectstatus() {
	selectstatus.click();
}

public void setstatussearchbox(String status) {
	statussearchbox.sendKeys(status);
}
public void selectaccount() {
	selectaccount.click();
}
public void setselectaccountsearchbox(String accountno) {
	selectaccountsearchbox.sendKeys(accountno);
	selectaccountsearchbox.sendKeys(Keys.ENTER);
}
public void setenterdescription(String description) {
	enterdescription.sendKeys(description);
}
public void setenterquantity(String quant) {
	enterquantity.sendKeys(quant);
}
public void setenterprice(String price) {
	enterprice.sendKeys(price);
}
public void scrolldown1()
{
	JavascriptExecutor js = (JavascriptExecutor) ldriver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
public void clicksavebtn() {
	clicksavebtn.click();
}
public void backbutton() {
	backbtn.click();
}


//Edit


public void editbutton() {
	editbtn.click();
}
public void clickoneditselectpatient() {
	clickoneditselectpatient.click();
}
public void setselecteditpatientsearchbox(String name) {
	selecteditpatientsearchbox.sendKeys(name);
	selecteditpatientsearchbox.sendKeys(Keys.ENTER);
}
public void seteditinvoicedate(String year,String month,String date)
{
	editinvoicedate.click();
	enteredityear.click();
	enteredityear.sendKeys(year);
	 Select month_drp= new Select(entereditmonth);
     month_drp.selectByVisibleText(month);
     List<WebElement> alldate= entereditdate;
   
     for(WebElement ele:alldate)

     {

                   String dt= ele.getText();

                   if(dt.equals(date))

                   {

                                 ele.click();

                                 break;

                   }

     }
}
public void seteditdiscount(String dis) throws InterruptedException, AWTException {
	entereditdiscount.click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_X);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_X);
	Thread.sleep(1000);
	entereditdiscount.sendKeys(dis);
}
/*public void editstatus() {
	editstatus.click();
}
public void editstatussearchbox() {
	editstatussearchbox.sendKeys("Paid");
}*/
public void editselectaccount() {
	editselectaccount.click();
}
public void seteditselectaccountsearchbox(String account) {
	editselectaccountsearchbox.sendKeys(account);
}
public void seteditenterdescription(String descrip) throws AWTException, InterruptedException {
	editenterdescription.click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_X);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_X);
	Thread.sleep(1000);
	editenterdescription.sendKeys(descrip);
}
public void seteditenterquantity(String num) throws AWTException, InterruptedException {
	editenterquantity.click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_X);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_X);
	Thread.sleep(1000);
	editenterquantity.sendKeys(num);
}
public void seteditenterprice(String pric) throws AWTException, InterruptedException {
	editenterprice.click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_X);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_A);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_X);
	Thread.sleep(1000);
	editenterprice.sendKeys(pric);
}
public void editsavebtn() {
	editclicksavebtn.click();
}

//Delete


public void clickdeletebtn() {
	deletebtn.click();
}
public void clickyesbtn() {
	yesbtn.click();
}
}
