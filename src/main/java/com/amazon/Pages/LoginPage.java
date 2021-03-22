package com.amazon.Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	public WebDriver driver;
//Locators
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement signInLink;

	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	public LoginPage() {
		this.driver = driver; // initializing instance variable with local variable

		PageFactory.initElements(driver, this); // this elements method will create all WebElements
	}

	public void clickSignInLink() {
		signInLink.click();
	}

	public HomePage loginToSystem(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		return new HomePage(driver);
	}

}