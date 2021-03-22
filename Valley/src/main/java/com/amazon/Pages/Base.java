package com.amazon.Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	public FileInputStream fis;

	public Base() {

		try {
			prop = new Properties();
			FileInputStream fis= new FileInputStream(
					"C:\\Users\\Sandeep\\SiliconVally\\Valley\\src\\main\\java\\com\\amazon\\Properties\\config.Properties");
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// once we created Constructor for Properties file to load the key and value,
	// then here we Get the data
	public static void initializeation() {
		
		System.setProperty("webdriver.chrome.driver",
				  "D:\\Selenium World\\Library\\ChromeDriver_v89\\chromedriver_v89.exe");
				  driver = new ChromeDriver();

		/*
		 * String browserName = prop.getProperty("browser"); if
		 * (browserName.equals("chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selenium World\\Library\\ChromeDriver_v89\\chromedriver_v89.exe");
		 * driver = new ChromeDriver(); } else if (browserName.equals("firefox")) {
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Selenium World\\Library\\FirefoxDriver_v86\\geckodriver.exe"); driver =
		 * new FirefoxDriver();
		 * 
		 * }
		 */
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); TestUtil.IMPLICIT_WAIT
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		

 	}
}
