package com.nijastore.pageobjects;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Loginpage {
		
		WebDriver driver;
		
		public Loginpage(WebDriver driver) {
			
			this.driver=driver;
		PageFactory.initElements(driver, this);
			
		}

		@FindBy(id="input-email")
		WebElement username;
		
		@FindBy(id="input-password")
		WebElement password;
		
		//input[@value="Login"]
		@FindBy(xpath="//input[@value=\"Login\"]")
		
		WebElement LoginButton;
		
		public void setUserName(String UserName) {
		username.sendKeys(UserName);
		}
		
		public void setPassword(String Password) {
			
			password.sendKeys(Password);
			
		}
		
		public void login() {
			
			LoginButton.click();
		}
			
		
		}













