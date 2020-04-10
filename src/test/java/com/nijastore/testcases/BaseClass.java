package com.nijastore.testcases;

	
	import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeClass;

	public class BaseClass {
		
	
		public String URL="http://tutorialsninja.com/demo/index.php?route=account/login";
		public String UserName="guest1234@gmail.com";
		public String Password="test";
		public WebDriver driver=new ChromeDriver();
		public Logger logger;
		@BeforeClass
		public void setup() {
			 driver=new ChromeDriver();
			System.setProperty("webdriver.chromedriver","C:\\chromedriver.exe");
			Logger logger=Logger.getLogger("auto");
			 PropertyConfigurator.configure("Log4j.properties");
			 
			//driver=new ChromeDriver();
			//driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
			
			//driver.manage().window().maximize();
			//driver.quit();
		}

		
		public void teardwon()
	{
			
			driver.quit();
			}
	}


