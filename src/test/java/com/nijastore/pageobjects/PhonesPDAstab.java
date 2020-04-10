package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonesPDAstab {
 WebDriver driver;

	public PhonesPDAstab(WebDriver driver) {
		
		this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
	WebElement PhonesPda;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]/span")
	WebElement addtocart;
//driver.nave("http://tutorialsninja.com/demo/index.php?route=checkout/cart");
	//*[@id="content"]/div[3]/div[2]/a
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	WebElement Checkout;
	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/form/div[1]/label/input")
	WebElement radiobutton;
	@FindBy(xpath="//*[@id=\"button-payment-address\"]")
	//*[@id="button-payment-address"]
	WebElement countiuneadressbutton;
	@FindBy(xpath="//*[@id=\"collapse-shipping-address\"]/div/form/div[1]/label/input")
	WebElement radiobutton1;
	//*[@id="button-payment-address"]
	@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
	WebElement countiuneshippingbutton;
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/div[1]/label/input")
	WebElement radiobutton3;
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
	WebElement textarea;
	@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
	WebElement countiuneshippingmethod;
	//@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[1]/label")
	//*[@id="collapse-shipping-method"]/div/div[1]/label
	//WebElement radiobutton4;
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea")
	WebElement textarea2;
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"button-payment-method\"]")
	WebElement countiunepaymentButton;
	@FindBy(xpath="//*[@id='button-confirm']")
	WebElement confirmbutton;
	
	public void PhonesPDA() {
		PhonesPda.click();
	}
	
	public void addtocart() {
		addtocart.click();
	}
	public void checkoutbutton() {
		Checkout.click();
	}
	public void radiobutton() {
		radiobutton.click();
	}
	public void adressbutton() {
		countiuneadressbutton.click();
		
	}
	public void radiobutton1(){
		radiobutton1.click();
		
	}
	public void shippingbutton() {
		countiuneshippingbutton.click();
	}
	public void radionbutton3() {
		radiobutton3.click();
		
	}
	
	public void Textarea(String text) {
		textarea.sendKeys(text);
	}
	public  void shippingmethod() {
		countiuneshippingmethod.click();
	}
	//public void radiobutton4()
	//{
		//radiobutton4.click();
	//}
	public void Textarea2(String text) {
		textarea2.sendKeys(text);
	}
	public void Checkbox() {
		checkbox.click();
		
	}
	public void paymentbutton()
	{
		countiunepaymentButton.click();	
	}
	public void confirm() {
		confirmbutton.click();
	}
	
}
