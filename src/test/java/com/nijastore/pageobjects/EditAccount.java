package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccount {
	WebDriver driver;
	
	public EditAccount(WebDriver driver) {
		
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[1]/a")
	WebElement Eaccount;
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement emailid;
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement telephone;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	WebElement contiune;
	
	public  void Editinformation() {
		Eaccount.click();
		}
 public void fname(String Fname) {
	 firstname.sendKeys(Fname);
	 
 }
 
 public void lname(String Lname) {
	 lastname.sendKeys(Lname);
	}
	
public void emailid(String Email) {
	emailid.sendKeys(Email);
}

public void telephone(String Telephone ) {
	telephone.sendKeys(Telephone);
}
public void coutiune() {
	contiune.click();
}
}

