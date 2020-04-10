package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeraccount {
	WebDriver driver;
	public Registeraccount(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-firstname")
	WebElement Firstname;
	//*[@id="input-lastname"]
	@FindBy(id="input-Lastname")
	WebElement Lastname;	
	@FindBy(xpath="//*[@id='input-email']")
	WebElement emailid;
	@FindBy(xpath="//*[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//*[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='input-confirm']")
	WebElement ConfirmPasswpord;

	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]")
	WebElement radiobutton;
@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
WebElement Checkbox;


public void firstname(String Fname) {
	Firstname.sendKeys(Fname);
}

public void lastname(String Lname) {
	Lastname.sendKeys(Lname);
}
	public void emailid(String Email) {
		emailid.sendKeys(Email);
	}

	public void telephone(String Telephone ) {
		telephone.sendKeys(Telephone);
		
	}
		public void password(String Password) {
			password.sendKeys(Password);
		}
		
		public void ConfirmPassword(String Cpassword) {
			ConfirmPasswpord.sendKeys(Cpassword);
			
		}
		
		public void radionbutton() {
		
			radiobutton.click();
}
			public void CheckBox() {
				Checkbox.click();
				
			
			
		}
}

