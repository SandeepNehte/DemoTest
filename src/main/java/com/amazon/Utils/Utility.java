package com.amazon.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	WebDriver driver;

	public void getScreenShot() {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\Sandeep\\git\\LocalGitDemoTest\\Valley\\ScreenShots"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
