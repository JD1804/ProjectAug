package com.CucumberAdactin;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_BaseofTestProject {
	
	public static WebDriver driver;
	//Browserlaunch
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/jd/eclipse-workspace/CucumberAdactin/Driver/chromedriver");
			driver = new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/jd/eclipse-workspace/CucumberAdactin/Driver/chromedriver");
			 driver = new FirefoxDriver();
		}	
		else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	//pagelaunch
	
	public static void pagelaunch(String url) {
		driver.get(url);
	}
	//Actions
	public static void action(WebElement target) {
		Actions ac = new Actions(driver);
		ac.click(target).build().perform();
	}
	
	public static void sendValues(WebElement element, String str) {
		element.sendKeys(str);
		
	}
	public static void selectValueFromDropDown(String value, WebElement element) {
	
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void captureScreenshot(WebElement element) throws IOException {	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);	
		File Destination = new File("/Users/jd/eclipse-workspace/SeleniumProProject/Driver/Screenshot.jpeg");
		FileUtils.copyFile(Source, Destination);
	}
	public static void closethepage() {
		driver.close();
	}
	public static void quitthedriver() {
		driver.quit();
	}
}
