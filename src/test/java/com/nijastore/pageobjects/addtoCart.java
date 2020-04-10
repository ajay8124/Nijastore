package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtoCart {
	

		
		WebDriver driver;
		
		public addtoCart(WebDriver driver) {
			
			this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/span")
		WebElement Shoppingcart;

		@FindBy(xpath="//*[@id='content']/div/div/a")
		WebElement contiune;
		@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/div[3]/button[1]/span")
		WebElement cart;
		@FindBy(xpath="//*[@id='top-links']/ul/li[4]/a")
		WebElement Checkout;
		@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
		WebElement Checkoutbutton;
  			//*[@id="content"]/div[3]/div[2]/a	
		//@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input")
		//WebElement radiobutton;
		
		//@FindBy(xpath="//*[@id='input-payment-firstname']")
		//WebElement Firstname;
		//@FindBy(xpath="//*[@id='input-payment-lastname']")
	//	WebElement Lastname;
		
		
		//@FindBy(xpath="//*[@id='input-payment-company']")
		//WebElement Compnay;
		//*[@id="input-payment-address-1"]
		//*[@id="input-payment-address-2"]
		//*[@id="input-payment-city"]
		//*[@id="input-payment-postcode"]
		//*[@id="input-payment-country"]//welelment dropdwon
		//*[@id="input-payment-zone"]//welelment dropdwo
		//*[@id="collapse-payment-method"]/div/p[2]/textarea comment aresa//comment as test
		//*[@id="collapse-payment-method"]/div/div[2]/div/input[1] chekbox
		//*[@id="button-payment-method"]


public void Shop() {
	Shoppingcart.click();
}
public void button() {
contiune.click();
}
public void cart() {
cart.click();
}
public void Check() {
Checkout.click();	
}
//public void checkoutbutton() {
	//Checkoutbutton.click();
//}
//public void radiobutton() {
	//radiobutton.clear();

//}
//public void name(String Fname) {
	//Firstname.sendKeys(Fname);
//}
	//public void lname(String Lname) {
		//Firstname.sendKeys(Lname);
	//}	
		

}




		
		
		



