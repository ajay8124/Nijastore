package com.nijastore.testcases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nijastore.pageobjects.Loginpage;
import com.nijastore.pageobjects.Registeraccount;

public class TC_Registeraccount_006 extends BaseClass {
	WebDriver driver=new ChromeDriver();

	@Test
	public void registeraccount() throws Exception {
		
		Loginpage lp=new Loginpage(driver);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
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
		    
		     Registeraccount rc=new Registeraccount(driver) ;
		    	
		    	 rc.firstname("test");
		    	 rc.lastname("test");
		    	 rc.emailid("test@12345678901");
		    	 rc.telephone("123456789");
		    	 rc.password("test");
		    	 rc.ConfirmPassword("test");
		    	 rc.radionbutton();
		    	 rc.CheckBox();
		    	 File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 	    FileUtils.copyFile(src1, new File("C:\\Users\\admin\\.eclipse\\auto\\src\\test\\java\\Registeraccount.png"));
		     }
		     
		     
}
