package com.qa.innait.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.qa.innait.baseclass.BaseClass;
import com.qa.innait.helper.PageObjectManager;
import com.qa.innait.junitrunner.RunnerClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InnaITMasterCreationSteps extends BaseClass {

	public WebDriver driver = RunnerClass.driver;
	public PageObjectManager pm = new PageObjectManager(driver);

	@When("^User click on Business Unit Menu$")
	public void user_click_on_Business_Unit_Menu() throws Throwable {
		try {
			Thread.sleep(5000);
			elementClick(pm.getic().getBusinessmenu());
			System.out.println("User click on Business Unit Menu");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@When("^User click Roles Plus button to add roles$")
	public void user_click_Roles_Plus_button_to_add_roles() throws Throwable {
		try {
			elementClick(pm.getic().getBusinessunitplsbtn());
			System.out.println("User click Roles Plus button to add roles");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Business Unit field to enter$")
	public void user_click_on_the_Business_Unit_field_to_enter() throws Throwable {
		try {
			elementClick(pm.getic().getBusinessfield());
			System.out.println("User click on the Business Unit field to enter");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the Business Unit$")
	public void user_enter_the_Business_Unit() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEntbusinessname(), "Precision Biometric");
			System.out.println("User enter the Business Unit");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the description field to enter$")
	public void user_click_on_the_description_field_to_enter() throws Throwable {
		try {
			elementClick(pm.getic().getBusidesfield());
			System.out.println("User click on the description field to enter");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the Description$")
	public void user_enter_the_Description() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEntdescription(), "Precision Biometric");
			System.out.println("User enter the Description");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the add button$")
	public void user_click_on_the_add_button() throws Throwable {
		try {
			elementClick(pm.getic().getBusinessaddbtn());
			System.out.println("User click on the add button");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	@Then("^User Click on the cancel button$")
	public void user_Click_on_the_cancel_button() throws Throwable {
		try {
			elementClick(pm.getic().getBusinesscnlbtn());
			System.out.println("User Click on the cancel button");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	//BRANCH LOCATION
	
	@When("^User click on Branch Location$")
	public void user_click_on_Branch_Location() throws Throwable {
		try {
			Thread.sleep(500);
			elementClick(pm.getic().getLocationmenu());
			System.out.println("User click on Branch Location");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@When("^User click on the Plus button to add location$")
	public void user_click_on_the_Plus_button_to_add_location() throws Throwable {
		try {
			elementClick(pm.getic().getLocplusbtn());
			System.out.println("User click on the Plus button to add location");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Location field to enter$")
	public void user_click_on_the_Location_field_to_enter() throws Throwable {
		try {
			elementClick(pm.getic().getLocfield());
			System.out.println("User click on the Location field to enter");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the brach location$")
	public void user_enter_the_brach_location() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEntloc(), "TNagar");
			System.out.println("User enter the brach location");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Location description field to enter$")
	public void user_click_on_the_Location_description_field_to_enter() throws Throwable {
		try {
			elementClick(pm.getic().getLocdesfield());
			System.out.println("User click on the Location description field to enter");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	@Then("^User enter the description$")
	public void user_enter_the_description() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEntlocdesi(), "TNagar");
			System.out.println("User enter the description");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the location timezone$")
	public void user_click_on_the_location_timezone() throws Throwable {
		try {
			elementClick(pm.getic().getTimezone());
			System.out.println("User click on the location timezone");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the timezone$")
	public void user_enter_the_timezone() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEnttimezone(), "IST");
			System.out.println("User enter the timezone");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User select the highlighted timezone$")
	public void user_select_the_highlighted_timezone() throws Throwable {
		try {
			Thread.sleep(500);
			elementClick(pm.getic().getSeltimezone());
			System.out.println("User select the highlighted timezone");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	@Then("^User click on the Location add button$")
	public void user_click_on_the_Location_add_button() throws Throwable {
	   try {
		elementClick(pm.getic().getLocaddbtn());
		   System.out.println("User click on the Location add button");
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException();
	}
	}

	@Then("^User click on the cancel button in location$")
	public void user_click_on_the_cancel_button_in_location() throws Throwable {
		try {
			elementClick(pm.getic().getLoccnlbtn());
			System.out.println("User click on the cancel button in location");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
