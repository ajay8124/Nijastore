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
import com.nijastore.pageobjects.PhonesPDAstab;

public class TC_tabletstab_008 extends BaseClass {

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
		     
		     PhonesPDAstab pt=new  PhonesPDAstab(driver);
		     pt.PhonesPDA();
		     pt.addtocart();
		     Thread.sleep(1000);
		     driver.navigate().to("http://tutorialsninja.com/demo/index.php?route=checkout/cart");
		     Thread.sleep(1000);
		     pt.checkoutbutton();
		     Thread.sleep(1000);
		     pt.radiobutton();
		     Thread.sleep(1000);
		     pt.adressbutton();
		     Thread.sleep(1000);
		     pt.radiobutton1();
		     Thread.sleep(1000);
		     pt.shippingbutton();
		     Thread.sleep(1000);
		     pt.radionbutton3();
		     Thread.sleep(1000);
		     pt.Textarea("test");
		     pt.shippingmethod();
		    // pt.radiobutton4();
		     Thread.sleep(1000);
		     pt.Textarea2("test");
		     Thread.sleep(1000);
		     pt.Checkbox();
		     Thread.sleep(2000);
		     pt.paymentbutton();
		     Thread.sleep(3000);
		     pt.confirm();
		     File src1=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(src1, new File("C:\\Users\\admin\\.eclipse\\auto\\src\\test\\java\\tablestab.png"));
		     


}
}