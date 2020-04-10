package com.nijastore.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nijastore.pageobjects.Loginpage;
import com.nijastore.pageobjects.addtoCart;

public class TC_addCart_002 extends BaseClass {

	
	WebDriver driver=new ChromeDriver();
	@Test
	public void addcart() throws Exception {
		//driver.get(URL);
		Loginpage lp=new Loginpage(driver);
		driver.get(URL);
		Logger logger=Logger.getLogger("auto");
		 PropertyConfigurator.configure("Log4j.properties");
		logger.info("Browser Opened");
	      
		driver.manage().window().maximize();
			 lp.setUserName(UserName);
			 logger.info("Username Entered");

		     lp.setPassword(Password);
		    logger.info("Password Entered");

		     lp.login();
		     logger.info("login");
		     File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(src, new File("C:\\Users\\admin\\.eclipse\\auto\\Screenshots\\HomePage.png"));

		addtoCart ac=new addtoCart(driver);
		ac.Shop();
		logger.info("clicked on shopcart button");
		ac.button();
		logger.info("clicked on next button");
		ac.cart();
		logger.info("clicked on checkbox");
		ac.Check();
		ac.button();
		logger.info("name Entered");
		//ac.name("tset");
		logger.info("lastname Entered");
		//ac.lname("tset");
		logger.info("Username Entered");
		//ac.radiobutton();
		File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src1, new File("C:\\Users\\admin\\.eclipse\\auto\\src\\test\\java\\addtocart.png"));

		
	}
}
