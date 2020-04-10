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



	public class Testcases extends BaseClass {
		
		WebDriver driver=new ChromeDriver();
		public Logger logger;
		@Test
	  public void login() throws Exception {
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
			     TakeScreenshot tsc= new TakeScreenshot(driver);
			     File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				    FileUtils.copyFile(src, new File("C:\\Users\\admin\\.eclipse\\auto\\Screenshots\\HomePage.png"));

				    //C:\\Users\\admin\\eclipse-workspace\\Screenshot\\src\\google.png"));

		  }

	}	
	


