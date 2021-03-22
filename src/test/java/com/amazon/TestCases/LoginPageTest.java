package com.amazon.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.Pages.Base;
import com.amazon.Pages.HomePage;
import com.amazon.Pages.LoginPage;

public class LoginPageTest extends Base {

	static LoginPage loginObj;
	HomePage homePageObj;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initializeation();
		loginObj = new LoginPage();
	}
	
	@Test
	public void toValidateSignInLink() {
		loginObj.clickSignInLink();
	}

	
	  @Test public void toValidateLogin() throws Exception { LoginPage loginObj =
	  new LoginPage(); Thread.sleep(5000); homePageObj =
	  loginObj.loginToSystem(prop.getProperty("username"),
	  prop.getProperty("password"));
	  
	  }
	 

}