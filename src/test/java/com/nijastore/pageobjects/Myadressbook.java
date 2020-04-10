package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Myadressbook {
	


WebDriver driver;

public Myadressbook(WebDriver driver) {
	
	this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[3]/a")
WebElement adbook;
@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/a")
WebElement newadbook;
@FindBy(xpath="//*[@id=\"input-firstname\"]")
WebElement Firstname;
//*[@id="input-lastname"]
@FindBy(xpath="//*[@id=\"input-lastname\"]")
WebElement Lastname;
@FindBy(xpath="//*[@id=\"input-company\"]")
WebElement Compnay;
@FindBy(xpath="//*[@id=\"input-address-1\"]")
WebElement adress1;
@FindBy(xpath="//*[@id=\"input-address-2\"]")
WebElement adress2;
@FindBy(xpath="//*[@id=\"input-city\"]")
WebElement City;
@FindBy(xpath="//*[@id=\"input-postcode\"]")
WebElement Postcode;
@FindBy(id="input-country")
WebElement dropCountry;
@FindBy(id="input-zone")
WebElement dropstate;
@FindBy(xpath="//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]/input")
WebElement radiobutton;
@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
WebElement countine;

public void adbook() {
	adbook.click();
}
public void newaddbook() {
	newadbook.click();
}
public void firstname(String Fname) {
	Firstname.sendKeys(Fname);
}

public void lastname(String Lname) {
	Lastname.sendKeys(Lname);
}
public void compnay(String Compny)
{
	 Compnay.sendKeys(Compny);
	 }

public void adress1(String Adress1) {
	adress1.sendKeys(Adress1);
}

public void adress2(String Adress2) {
	adress1.sendKeys(Adress2);
}
public void city(String city)
{
	City.sendKeys(city);
}
public void Postcode(String postcode) {
	Postcode.sendKeys( postcode);
	}
public WebElement dropcountry() {
	Select dropdown=new Select(dropCountry);
	dropdown.selectByIndex(4);
return dropCountry;
}

public WebElement dropstate() {
	Select dropdown=new Select(dropstate);
	dropdown.selectByVisibleText("Alger");
	return dropstate;
}	

public void radiobutton() {
	radiobutton.click();
	
}

public void cbutton1() {
	countine.click();
}








}























































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




