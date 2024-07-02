package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	// 1. Page Objects: By Locators:
	private By emailId= By.id("input-email");
	private By password= By.id("input-password");
	private By loginBtn= By.xpath("//input[@value='Login']");
	private By forgotPwdLink= By.linkText("Forgotten Password");

	// 2. public constructor.. of the page:
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	// 3. public page actions/methods
	public String getLoginPageTitle() {
		
		String title= driver.getTitle();
		System.out.println("Login page title :"+ title);
		return title;
	}
	
	public String geLogintPageUrl() {
		
		String url= driver.getCurrentUrl();
		System.out.println("Login page URL :"+ url);
		return url;
			
		}
	
	public boolean checkForForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public String doLogin(String username, String pwd ) {
		driver.findElement(emailId).sendKeys(username);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
		
		return driver.getTitle();
	}
	
	 

}
