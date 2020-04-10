package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	WebDriver driver;
	
	public ChangePassword(WebDriver driver) {
		
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	//*[@id="content"]/ul[1]/li[2]/a
	
@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[2]/a")
WebElement passwordbutton;
	@FindBy(xpath="//*[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='input-confirm']")
	WebElement ConfirmPasswpord;
	@FindBy(xpath="//*[@id='content']/form/div/div[2]/input")
	WebElement contiune;
	
	public void passwordbutton() {
		passwordbutton.click();;
	}
	
	public void password(String Password) {
		password.sendKeys(Password);
	}
	
	public void ConfirmPassword(String Cpassword) {
		ConfirmPasswpord.sendKeys(Cpassword);
		
	}
	
	public void Cbutton() {
		contiune.click();
	}
}
