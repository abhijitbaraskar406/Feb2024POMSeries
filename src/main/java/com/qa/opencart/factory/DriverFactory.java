package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.errors.AppError;
import com.qa.opencart.exceptions.BrowserException;

public class DriverFactory {
	
	WebDriver driver;
	
	/**
	 * This is used to init the driver on the basis of given browser name. 
	 * @param browserName
	 * @return 
	 */
	
	public WebDriver initDriver(String browserName) {
		//cross browser logic
		
		System.out.println("browser name is :" + browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please pass right browser..." + browserName);
			throw new BrowserException(AppError.BROWSER_NOT_FOUND);
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		return driver;
		
	}

	
	public void initProp() {
		// cross prop logic
	}

}
