package com.qa.innait.junitrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.qa.innait.baseclass.BaseClass;
import com.qa.innait.helper.PropertyReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\qa\\innait\\reports\\InnaIT-Report.html",
		"html:src\\test\\resource\\com\\qa\\innait\\reports", "json:src\\test\\resource\\com\\qa\\innait\\reports\\report.json",
		"junit:src\\test\\resource\\com\\qa\\innait\\reports\\report.xml" },

		features = "src\\test\\java\\com\\qa\\innait\\feature", glue = "com.qa.innait.stepdefinition", dryRun = false, strict = true, monochrome = true, tags = "@Feature")

public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void driverInitialization() throws Throwable {
		String browserName = PropertyReaderManager.getInstance().getPr().getBrowser();

		driver = BaseClass.getBrowser(browserName);

	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src\\test\\resource\\com\\qa\\innait\\config\\Extent_Config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + " " + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
		driver.quit();
	}

}
