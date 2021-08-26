package com.runner.com;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.CucumberAdactin.Demo_BaseofTestProject;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/Adactinfeature/com", glue = "com/stepdefenition/com")


public class RunnerTest {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	driver=Demo_BaseofTestProject.browserLaunch("Chrome");
	}
}
