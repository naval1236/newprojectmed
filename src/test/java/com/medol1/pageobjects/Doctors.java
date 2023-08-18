package com.medol1.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.Key;

public class Doctors {
 WebDriver ldriver;
 
 public Doctors(WebDriver rdriver) {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver,this);
 }
 @FindBy(xpath="//a[@href='http://cls-medsol.in/doctors']")
 WebElement clickondoctoroption;
 
 @FindBy(id="dropdownMenuButton")
 WebElement clickonactionsDD;
 
 @FindBy(xpath="//a[.='New Doctor']")
 WebElement clickonnewdoctoroption;
 
 @FindBy(id="first_name")
 WebElement enterfirstname;
 
 @FindBy(id="last_name")
 WebElement enterlastname;
 
 @FindBy(id="select2-doctorsDepartmentId-container")
 WebElement clickonselectdepartment;
 
 @FindBy(xpath="//input[@role='searchbox']")
 WebElement selectdepartmentsearchbox;
 
 @FindBy(id="createAccountantEmail")
 WebElement enteremail;
 
 @FindBy(id="designation")
 WebElement enterdesignation;
 
 @FindBy(id="phoneNumber")
 WebElement enterphno;
 
 @FindBy(id="qualification")
 WebElement enterqualification;
 
 @FindBy(id="doctorBirthDate")
 WebElement enterdob;
 
 @FindBy(xpath="//div[@class='dayContainer']/span")
 List<WebElement> enterdate;
 
 @FindBy(xpath="//input[@aria-label='Year']")
 WebElement enteryear;
 
 @FindBy(xpath="//select[@aria-label='Month']")
 WebElement entermonth;
 
 @FindBy(id="select2-doctorBloodGroup-container")
 WebElement selectbloodgroup;
 
 @FindBy(xpath="//input[@role='searchbox']")
 WebElement selectsearchboxbloodgroup;
 
 @FindBy(id="doctorMale")
 WebElement maleradiobtn;
 
 @FindBy(id="specialist")
 WebElement enterspecialist;
 
 @FindBy(id="password")
 WebElement enterpassword;
 
 @FindBy(id="password_confirmation")
 WebElement enterconfirmpassword;
 
 @FindBy(id="doctorProfileImage")
 WebElement uploadimage;
 
@FindBy(id="address1")
WebElement address1;

@FindBy(id="address2")
WebElement address2;

@FindBy(id="city")
WebElement city;

@FindBy(id="zip")
WebElement zip;

@FindBy(xpath="//input[@type='submit']")
WebElement savebutton;

public void clickondoctoroption() {
	clickondoctoroption.click();
}
public void clickonactionsDD() {
	clickonactionsDD.click();
}
public void clickonnewdoctoroption() {
	clickonnewdoctoroption.click();
}
public void setenterfirstname(String fname) {
	enterfirstname.sendKeys(fname);
}
public void setenterlastname(String lname) {
	enterlastname.sendKeys(lname);
}
public void clickonselectdepartment() {
	clickonselectdepartment.click();
}
public void setselectdepartment(String depart) {
	selectdepartmentsearchbox.sendKeys(depart);
	selectdepartmentsearchbox.sendKeys(Keys.ENTER);
}
public void setenteremail(String email) {
	enteremail.sendKeys(email);
}
public void setenterdesignation(String designation) {
	enterdesignation.sendKeys(designation);
}
public void setenterphno(String phno) {
	enterphno.sendKeys(phno);
}
public void setqualification(String edu) {
	enterqualification.sendKeys(edu);
}
public void setdob(String year,String month,String date)
{
	enterdob.click();
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
public void selectbloodgroup() {
	selectbloodgroup.click();
}
public void setselectsearchboxbloodgroup(String bloodgrp) {
	selectsearchboxbloodgroup.sendKeys(bloodgrp);
}
public void maleradiobtn() {
	maleradiobtn.click();
}
public void setenterspecialist(String speciality) {
	enterspecialist.sendKeys(speciality);
}
public void setenterpassword(String password) {
	enterpassword.sendKeys(password);
}
public void setenterconfirmpassword(String confirmpasswd) {
	enterconfirmpassword.sendKeys(confirmpasswd);
}
public void uploadimage() {
	uploadimage.click();
}
public void setuploadimage(String path) throws AWTException {
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
public void setaddress1(String add1) {
	address1.sendKeys(add1);
}
public void setaddress2(String add2) {
	address1.sendKeys(add2);
}
public void setcity(String cty) {
	city.sendKeys(cty);
}
public void setzip(String code) {
	zip.sendKeys(code);
}
public void clickonsavebtn() {
	savebutton.click();
}
}
