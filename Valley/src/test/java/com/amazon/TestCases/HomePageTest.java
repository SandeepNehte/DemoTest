package com.amazon.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.Pages.Base;
import com.amazon.Pages.HomePage;

public class HomePageTest  extends Base{
	
	HomePage homepageObj;
	public  WebDriver driver;
	public HomePageTest() {
		super();
	}



	@BeforeClass
	public void setup() throws InterruptedException {
		initializeation();
	
		HomePageTest hp = new HomePageTest();
		 
	}


	@Test
	public void toValidateLogin() throws Exception {
	System.out.println("Fisrt Need To Login");
		Thread.sleep(5000);
		//loginObj.loginToSystem(prop.getProperty("username"),prop.getProperty("password"));		
	}
	
	@Test
	public void testCase001() {
		homepageObj.selectCategories("Electronic");
	}
	
	@Test
	public void testCase002() {
		homepageObj.enterItem("iphone");
	}
	

	@Test
	public void testCase003() {
		homepageObj.selectCategories("iphone-11");
	}
}
