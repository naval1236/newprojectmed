package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beds_Management_Beds {
	WebDriver ldriver;
	public Beds_Management_Beds(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//span[.='Bed Management']")
	WebElement bedmanagebtn;
	
	@FindBy(xpath="//a[@href='http://cls-medsol.in/beds']")
	WebElement Bedsbtn;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement searchbox;
	
	@FindBy(xpath="//span[.='All']")
	WebElement filters;
	
	
	@FindBy(xpath="(//button[@id='dropdownMenuButton1'])[4]")
	WebElement actionbtn;
	
	@FindBy(xpath="//a[.='New Bed']")
	WebElement newBedbtn;
	
	@FindBy(id="BedName")
	WebElement bedTbx;
	
	@FindBy(xpath="//span[@id='select2-bedType-container']")
	WebElement selectBedTypeDD;
	
	@FindBy(xpath="//input[@role='searchbox']")
    WebElement txtenterselectbedtype;
	
	@FindBy(id="bedCharges")
	WebElement bedChargetbx;
	
	@FindBy(id="BedDescription")
	WebElement bedDescripTbx;
	
	@FindBy(xpath="//button[@id='BedSaveBtn']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[.='Cancel']")
	WebElement cancelBtn;
	
	
	//Edit
	@FindBy(xpath="//a[@title='Edit']")
	WebElement editBtn;
	
	@FindBy(xpath="//input[@id='editBedName']")
	WebElement editbedTbx;
	
	@FindBy(xpath="//span[@id='select2-editBedType-container']")
	WebElement editselectbedtype;
	
	@FindBy(xpath="//input[@aria-controls='select2-editBedType-results']")
	WebElement edittextenterselectbedtype;
	
	@FindBy(xpath="//input[@id='editBedCharge']")
	WebElement editbedcharge;
	
	@FindBy(xpath="//textarea[@id='editBedDescription']")
	WebElement editbeddescription;
	
	@FindBy(id="btnEditSave")
	WebElement editsavebtn;
	
	//Delete
	@FindBy(xpath="//a[@title='Delete']")
	WebElement deletebtn;
	
	@FindBy(xpath="//button[.='Yes, Delete']")
	WebElement yesdeletebtn;
	
	@FindBy(xpath="//button[.='No, Cancel']")
	WebElement nocancelbtn;
	
	
	
	@FindBy(xpath="//a[@href='http://cls-medsol.in/bulk-beds']")
	WebElement newbulkbedbtn;
	
	@FindBy(xpath="//a[.='Back']")
	WebElement newbulkbedbackbtn;
	
	@FindBy(xpath="//input[@class='form-control bedName']")
	WebElement newbulkbedtext;
	
	@FindBy(xpath="//span[@role='combobox']")
	WebElement newbulkbedDD;
	
	@FindBy(xpath="//input[@aria-controls='select2-BulkBedType-results']")
	WebElement newbulkbedsearchbox;
	
	@FindBy(xpath="//input[@class='form-control charge price-input']")
	WebElement newbulkbedcharge;
	
	@FindBy(xpath="//textarea[@class='form-control description']")
	WebElement newbulkbeddescription;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement newbulkbedsavebtn;
	
	@FindBy(xpath="//a[.='Cancel']")
	WebElement newbulkbedcancelbtn;
	
	
	
public void clickonbedmanagement() {
	bedmanagebtn.click();
}
public void bedoption() {
	Bedsbtn.click();
}
public void actionbutton() {
	actionbtn.click();
}
public void newbedclick() {
	newBedbtn.click();
}
public void bedtext() {
	bedTbx.sendKeys("two");
}
public void bedtext1() {
	bedTbx.sendKeys("three");
}
public void selectbedtype() {
	selectBedTypeDD.click();
}
public void setSelectbedtype(String Bed)
{
	txtenterselectbedtype.sendKeys(Bed);
	txtenterselectbedtype.sendKeys(Keys.ENTER);
}

public void bedcharge() {
	bedChargetbx.sendKeys("3500");
	
}
public void description() {
	bedDescripTbx.sendKeys("hello");
}
public void savebutton() {
	saveBtn.click();
}




//Edit
public void editbutton() {
	editBtn.click();
}
public void edittextbox()  {
	editbedTbx.sendKeys("three");
	
}
public void editselectbedtype() {
	editselectbedtype.click();
}
public void seteditselectbedtype(String b) {
	edittextenterselectbedtype.sendKeys(b);
	edittextenterselectbedtype.sendKeys(Keys.ENTER);
}
public void editbedcharge(){
	
	editbedcharge.sendKeys("5000");
}
public void editbeddescription() {
	
	editbeddescription.sendKeys("Edited Description");
}
public void editsavebutton() {
	editsavebtn.click();
}
public void deletebutton() {
	deletebtn.click();
}
public void yesdeletebutton() {
	yesdeletebtn.click();
}

public void clickonnewbulkbed() {
	newbulkbedbtn.click();
}
public void enternewbluktextname() {
	newbulkbedtext.sendKeys("Rohan");
}
public void clickonselecttypeDD() {
	newbulkbedDD.click();
}
public void setnewbulkbedselecttyoeDD(String newbulk) {
	newbulkbedsearchbox.sendKeys(newbulk);
	newbulkbedsearchbox.sendKeys(Keys.ENTER);
}
public void newbulkcharge() {
	newbulkbedcharge.sendKeys("4500");
}
public void newbulkdescriptionarea() {
	newbulkbeddescription.sendKeys("Hello NewBulk");
}
public void newbulkbedsave() {
	newbulkbedsavebtn.click();
}
	}
