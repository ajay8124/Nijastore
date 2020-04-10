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

import com.nijastore.pageobjects.EditAccount;
import com.nijastore.pageobjects.Loginpage;

public class TC_Editaccount_003  extends BaseClass{
	
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
		     
		     EditAccount EA=new EditAccount(driver);
		     
		     EA.Editinformation();
		     logger.info("clicked on edit infromation");
		     EA.fname("test");
		     logger.info("first name entred");
		     EA.lname("test");
		     logger.info("last name entred");
		     EA.emailid("test1234567gmail.com");
		     logger.info("Emailid name entred");
		     EA.telephone("test");
		     logger.info("telephone name entred");
		     EA.coutiune();
		     logger.info("Clicked on countiune");
		     File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(src1, new File("C:\\Users\\admin\\.eclipse\\auto\\src\\test\\java\\Editaccount.png"));
	}
}
