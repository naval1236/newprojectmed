package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Documents {
	WebDriver ldriver;
	File f;
	Robot r;

	public Documents(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//span[.='Documents']/../span[2]")
	WebElement clickondocumentmodule;
	
	@FindBy(xpath="//a[.='New Document']")
	WebElement clickonnewdocument;
	
	@FindBy(id="title")
	WebElement entertitletext;
	
	@FindBy(xpath="//span[@aria-controls='select2-documentTypeId-container']")
	WebElement clickondocumenttype;
	
	@FindBy(xpath="//input[@aria-controls='select2-documentTypeId-results']")
	WebElement searchboxdocumenttype;
	
	@FindBy(xpath="//span[@aria-controls='select2-documentPatientId-container']")
	WebElement clickonpatient;
	
	@FindBy(xpath="//input[@aria-controls='select2-documentPatientId-results']")
	WebElement searchboxpatientname;
	
	@FindBy(xpath="//span[@title='Attachment']")
	WebElement clickonimageattachicon;
	
	@FindBy(id="notes")
	WebElement enterdescription;
	
	@FindBy(id="documentSave")
	WebElement clickonsavebtn;
	
	@FindBy(xpath="//button[.='Cancel']")
	WebElement clickoncancelbtn;
	
	@FindBy(xpath="//a[@title='Edit']")
	WebElement editBtn;
	
	@FindBy(id="editDocumentTitle")
	WebElement edittitletext;
	
	@FindBy(xpath="//span[@aria-controls='select2-editDocumentTypeId-container']")
	WebElement editclickdocumenttype;
	
	@FindBy(xpath="//input[@aria-controls='select2-editDocumentTypeId-results']")
	WebElement editsearchboxdocumenttype;
	
	@FindBy(xpath="//span[@aria-controls='select2-editDocumentPatientId-container']")
	WebElement editclickpatient;
	
	@FindBy(xpath="//input[@aria-controls='select2-editDocumentPatientId-results']")
	WebElement editsearchboxpatient;
	
	@FindBy(xpath="//span[@title='Change Attachment']")
	WebElement editclickonimageattachicon;
	
	@FindBy(id="editDocumentNotes")
	WebElement editdescription;
	
	@FindBy(id="editDocumentSave")
	WebElement editsavebtn;
	
	@FindBy(xpath="//a[@title='Save']")
	WebElement downloaddetails;
	
	@FindBy(xpath="//a[@title='Delete']")
	WebElement deletebtn;
	
	@FindBy(xpath="//button[.='Yes, Delete']")
	WebElement yesdeletebtn;
	
	

	
	public void clickondocumentmodule() {
		clickondocumentmodule.click();
	}
	public void clickonnewdocument() {
		clickonnewdocument.click();
	}
	public void entertitletext() {
		entertitletext.sendKeys("Rahul");
	}
	public void clickondocumenttype() {
		clickondocumenttype.click();
	}
    public void setclickondocumenttype(String abc) {
    	searchboxdocumenttype.sendKeys(abc);
    	searchboxdocumenttype.sendKeys(Keys.ENTER);
    	
    }
    public void clickonpatient() {
    	clickonpatient.click();
    }
    public void setpatientname(String name) {
    	searchboxpatientname.sendKeys(name);
    	searchboxpatientname.sendKeys(Keys.ENTER);
    	
    }
    public void clickonimageattachicon() {
    	clickonimageattachicon.click(); 	
    }
    public void setattachment(String path) throws AWTException
	{
		Robot rb= new Robot();
		rb.delay(1000);
		
		StringSelection ss= new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(1000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
    public void enterdescription() {
    	enterdescription.sendKeys("Document done");
    }
    public void clickonsavebtn() {
    	clickonsavebtn.click();
    }
    public void editBtn() {
    	editBtn.click();
    }
    public void edittitletext() throws AWTException {
    	edittitletext.click();
    	r=new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.delay(1000);
    	r.keyPress(KeyEvent.VK_A);
    	r.delay(1000);
    	r.keyPress(KeyEvent.VK_X);
    	r.delay(1000);
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.delay(1000);
    	r.keyRelease(KeyEvent.VK_A);
    	r.delay(1000);
    	r.keyRelease(KeyEvent.VK_X);
    	
    	edittitletext.sendKeys("Rahul Sen");
    }
    public void editclickdocumenttype() {
    	editclickdocumenttype.click();
    }
    public void seteditdocumentsearchbox(String docuname) {
    	editsearchboxdocumenttype.sendKeys(docuname);
    	editsearchboxdocumenttype.sendKeys(Keys.ENTER);
    }
    public void editclickpatient() {
    	editclickpatient.click();
    }
    public void seteditpatientname(String name) {
    	editsearchboxpatient.sendKeys(name);
    	editsearchboxpatient.sendKeys(Keys.ENTER);
    	
    }
    public void editclickonimageattachicon(){
    	editclickonimageattachicon.click();
    
    }
    public void seteditattachment(String path) throws AWTException
   	{
   		Robot rb= new Robot();
   		rb.delay(1000);
   		
   		StringSelection ss= new StringSelection(path);
   		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
   		rb.keyPress(KeyEvent.VK_CONTROL);
   		rb.delay(1000);
   		rb.keyPress(KeyEvent.VK_V);
   		rb.delay(1000);
   		
   		rb.keyRelease(KeyEvent.VK_CONTROL);
   		rb.delay(1000);
   		rb.keyRelease(KeyEvent.VK_V);
   		rb.delay(1000);
   		
   		rb.keyPress(KeyEvent.VK_ENTER);
   		rb.delay(1000);
   		rb.keyRelease(KeyEvent.VK_ENTER);
   		
   	}
    public void editdescription() throws AWTException {
    	r=new Robot();
    	editdescription.click();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.delay(1000);
    	r.keyPress(KeyEvent.VK_A);
    	r.delay(1000);
    	r.keyPress(KeyEvent.VK_X);
    	r.delay(1000);
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.delay(1000);
    	r.keyRelease(KeyEvent.VK_A);
    	r.delay(1000);
    	r.keyRelease(KeyEvent.VK_X);
    	
    	editdescription.sendKeys("Edited Document details");
    }
    public void editsavebtn() {
    	editsavebtn.click();
    }
    public void downloaddetails() {
    	downloaddetails.click();
    }
    public void deletebutton() {
    	deletebtn.click();
    }
    public void yesdeletebutton() {
    	yesdeletebtn.click();
    }

}
