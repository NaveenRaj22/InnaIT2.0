package com.qa.innait.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.qa.innait.baseclass.BaseClass;
import com.qa.innait.helper.PageObjectManager;
import com.qa.innait.helper.PropertyReaderManager;
import com.qa.innait.junitrunner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InnaITLoginSteps extends BaseClass {

	public WebDriver driver = RunnerClass.driver;
	public PageObjectManager pm = new PageObjectManager(driver);

	@Given("^User should launch the innait application$")
	public void user_should_launch_the_innait_application() throws Throwable {
	    try {
			driver.get(PropertyReaderManager.getInstance().getPr().getUrl());
			System.out.println("User should launch the innait application");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the client logo is present on the header$")
	public void user_verify_the_client_logo_is_present_on_the_header() throws Throwable {
		try {
			elementIsDisplayed(pm.gethp().getClientlogo());
			System.out.println("User verify the client logo is present on the header");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the application logo is present on the header$")
	public void user_verify_the_application_logo_is_present_on_the_header() throws Throwable {
		try {
			elementIsDisplayed(pm.gethp().getApplicationlogo());
			System.out.println("User verify the application logo is present on the header");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the fingerprint text message$")
	public void user_verify_the_fingerprint_text_message() throws Throwable {
		try {
			elementIsDisplayed(pm.gethp().getFPmessage());
			System.out.println("User verify the fingerprint text message");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	@Then("^User verify the precision logo is present on the footer$")
	public void user_verify_the_precision_logo_is_present_on_the_footer() throws Throwable {
		try {
			elementIsDisplayed(pm.gethp().getPrecisionlogo());
			System.out.println("User verify the precision logo is present on the footer");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the key icon$")
	public void user_click_on_the_key_icon() throws Throwable {
		try {
			elementClick(pm.gethp().getCheckinkey());
			System.out.println("User click on the key icon");
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the precision logo is present on the header$")
	public void user_verify_the_precision_logo_is_present_on_the_header() throws Throwable {
		try {
			elementIsDisplayed(pm.getil().getPrecisionlogo());
			System.out.println("User verify the precision logo is present on the header");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the innait logo is present on the header$")
	public void user_verify_the_innait_logo_is_present_on_the_header() throws Throwable {
		try {
			elementIsDisplayed(pm.getil().getInnaitlogo());
			System.out.println("User verify the innait logo is present on the header");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the Login page header matches - Employee Id$")
	public void user_verify_the_Login_page_header_matches_Employee_Id() throws Throwable {
		try {
			elementIsDisplayed(pm.getil().getEmpid());
			System.out.println("User verify the Login page header matches - Employee Id");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@When("^User enter the employeeid address$")
	public void user_enter_the_employeeid_address() throws Throwable {
		try {
			inputValuestoWebelement(pm.getil().getEmpidfield(),
					PropertyReaderManager.getInstance().getPr().getUsername());
			System.out.println("User enter the employeeid address");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User verify the Login page header matches - InnaIT Password$")
	public void user_verify_the_Login_page_header_matches_InnaIT_Password() throws Throwable {
		try {
			elementIsDisplayed(pm.getil().getInnaitpwd());
			System.out.println("User verify the Login page header matches - InnaIT Password");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the InnaIT Password$")
	public void user_enter_the_InnaIT_Pssword() throws Throwable {
		try {
			Thread.sleep(1000);
			inputValuestoWebelement(pm.getil().getInnaitpwdfield(),
					PropertyReaderManager.getInstance().getPr().getPassword());
			System.out.println("User enter the InnaIT Password");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		try {
			Thread.sleep(1000);
			elementClick(pm.getil().getLoginbtn());
			System.out.println("User click on the login button");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
