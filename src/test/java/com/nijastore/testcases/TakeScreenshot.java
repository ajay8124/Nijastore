package com.nijastore.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshot extends TC_addCart_002{

	static WebDriver driver;
		
		public TakeScreenshot(WebDriver driver) {
			this.driver=driver;
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chromedriver","D:\\chromedriver.exe");
			//ChromeDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    //driver.get("https://www.google.com/");
		    //Thread.sleep(2000);
		    //driver.navigate().to("https://www.amazon.com/");
		    File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("C:\\Users\\admin\\.eclipse\\auto\\src\\test\\java\\HomePage.png"));


	}

}
