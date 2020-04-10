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
import com.nijastore.pageobjects.Returnorder;

public class TC_Returnorder_009 extends BaseClass{
	
	WebDriver driver=new ChromeDriver();

	@Test
	
	public void editaccount() throws Exception {
		
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
		     Returnorder ro=new Returnorder(driver);
		     ro.historytab();
		     ro.viewbutton();
		     ro.returnbutton();
		     ro.radiobutton5();
		     ro.radiobutton6();
		     ro.commentarea("test");
		     ro.sumbitbutton();
		     
		     
		     File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(src1, new File("C:\\Users\\admin\\.eclipse\\auto\\src\\test\\java\\returnorder.png"));		     
		     
	}

}
