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
import com.nijastore.pageobjects.Myadressbook;

public class TC_Myadressbook_005 extends BaseClass {
	
	WebDriver driver=new ChromeDriver();

	@Test
	public void Myaddressbook() throws Exception {
		
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
		     
		     Myadressbook my=new Myadressbook(driver);
		     my.adbook();
		     my.newaddbook();
		     my.firstname("test");
		     my.lastname("test");
		     my.compnay("test");
		     my.adress1("test");
		     my.adress2("test");
		     my.city("test");
		     my.Postcode("12444");
		     my.dropcountry();
		     Thread.sleep(1000);
		     my.dropstate();
		     my.radiobutton();
		     my.cbutton1();
		     
		     
		     File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(src1, new File("C:\\Users\\admin\\.eclipse\\auto\\Screenshots\\Myadressbook.png"));
	}

}
