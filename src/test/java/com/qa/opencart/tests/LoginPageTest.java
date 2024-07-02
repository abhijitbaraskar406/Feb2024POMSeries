package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.errors.AppError;

public class LoginPageTest extends BaseTest {

	@Test
	public void LoginPageTitleTest() {
    String actTitle =loginPage.getLoginPageTitle();
    Assert.assertEquals(actTitle,"Account Login",AppError.TITLE_NOT_FOUND );
		
	}

	@Test
	public void LogintPageUrlTest() {
		String actURL= loginPage.geLogintPageUrl();
		Assert.assertTrue(actURL.contains("=account/login"),AppError.URL_NOT_FOUND);

	}
	
	
	@Test
	public void ForgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.checkForForgotPwdLinkExist(),AppError.ELEMENT_NOT_FOUND);
	}
	

	

}
