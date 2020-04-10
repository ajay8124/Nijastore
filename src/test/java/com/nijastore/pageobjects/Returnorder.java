package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Returnorder {
	WebDriver driver;
	public Returnorder(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"content\"]/ul[2]/li[1]/a")
	WebElement orderhistroytab;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[7]/a")
	WebElement viewbutton;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a[2]")
	WebElement returnbutton;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[4]/div/div[4]/label/input")
	WebElement radionbutton5;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[5]/div/label[2]")
	WebElement radiobutton6;
	@FindBy(xpath="//*[@id=\"input-comment\"]")
	WebElement commentarea;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	WebElement submitbutton;
	
	public void historytab() {
		orderhistroytab.click();
		
	}
public void viewbutton() {
	viewbutton.click();
}
public void returnbutton() {
	returnbutton.click();
}

public void radiobutton5() {
	radionbutton5.click();
}
public void radiobutton6() {
	radiobutton6.click();
}
public void commentarea(String text) {
	commentarea.sendKeys(text);
}
public void sumbitbutton() {
	submitbutton.click();
}



}
