package com.nijastore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tabletstab {
 
		WebDriver driver;
		
		public Tabletstab(WebDriver driver) {
			
			this.driver=driver;
		PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
		WebElement tabletstab;
		@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/span")
		WebElement addtocart;
		@FindBy(xpath="//*[@id=\"content\"]/ul[1]/li[4]/a")
		WebElement wishlist;
		
		
		public void tabletstab() {
			tabletstab.click();
		}
			public void addtocart(){
				addtocart.click();
			}
		public void wishlist() {
			wishlist.click();
		
		}


}
