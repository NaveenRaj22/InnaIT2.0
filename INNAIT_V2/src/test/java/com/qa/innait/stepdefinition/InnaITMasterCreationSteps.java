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

	// BRANCH LOCATION

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

	// DEPARTMENT

	@When("^User click on the Department menu$")
	public void user_click_on_the_Department_menu() throws Throwable {
		try {
			Thread.sleep(1000);
			elementClick(pm.getic().getDeptmenu());
			System.out.println("User click on the Department menu");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Plus button to add department$")
	public void user_click_on_the_Plus_button_to_add_department() throws Throwable {
		try {
			elementClick(pm.getic().getDeptplusbtn());
			System.out.println("User click on the Plus button to add department");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Department field to enter$")
	public void user_click_on_the_Department_field_to_enter() throws Throwable {
		try {
			elementClick(pm.getic().getDeptnamefield());
			System.out.println("User click on the Department field to enter");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the Department$")
	public void user_enter_the_Department() throws Throwable {
		try {
			Thread.sleep(300);
			inputValuestoWebelement(pm.getic().getEntdept(), "IoT");
			System.out.println("User enter the Department");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the departmet decription field$")
	public void user_click_on_the_departmet_decription_field() throws Throwable {
		try {
			elementClick(pm.getic().getDeptdesfield());
			System.out.println("User click on the departmet decription field");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the department description$")
	public void user_enter_the_department_description() throws Throwable {
		try {
			Thread.sleep(300);
			inputValuestoWebelement(pm.getic().getEntdeptdes(), "IoT");
			System.out.println("User enter the department description");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Department add button$")
	public void user_click_on_the_Department_add_button() throws Throwable {
		try {
			elementClick(pm.getic().getLocaddbtn());
			System.out.println("User click on the Department add button");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the cancel button to close department frame$")
	public void user_click_on_the_cancel_button_to_close_department_frame() throws Throwable {
		try {
			elementClick(pm.getic().getLoccnlbtn());
			System.out.println("User click on the cancel button to close department frame");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	// DESIGNATION

	@When("^User click on the Designation menu$")
	public void user_click_on_the_Designation_menu() throws Throwable {
		try {
			Thread.sleep(3000);
			elementClick(pm.getic().getDesigmenu());
			System.out.println("User click on the Designation menu");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Plus button to add designation$")
	public void user_click_on_the_Plus_button_to_add_designation() throws Throwable {
		try {
			elementClick(pm.getic().getDesigplusbtn());
			System.out.println("User click on the Plus button to add designation");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the Designation field to enter$")
	public void user_click_on_the_Designation_field_to_enter() throws Throwable {
		try {
			elementClick(pm.getic().getDesignamefield());
			System.out.println("User click on the Designation field to enter");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the Designation$")
	public void user_enter_the_Designation() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEntdesig(), "TEAM LEADER");
			System.out.println("User enter the Designation");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the designation description field$")
	public void user_click_on_the_designation_description_field() throws Throwable {
		try {
			elementClick(pm.getic().getDesigdesfield());
			System.out.println("User click on the designation description field");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User enter the designation description$")
	public void user_enter_the_designation_description() throws Throwable {
		try {
			Thread.sleep(500);
			inputValuestoWebelement(pm.getic().getEntdesigdes(), "TEAM LEADER");
			System.out.println("User enter the designation description");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();

		}
	}

	@Then("^User click on the Designation add button$")
	public void user_click_on_the_Designation_add_button() throws Throwable {
		try {
			elementClick(pm.getic().getDesigaddbtn());
			System.out.println("User click on the Designation add button");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Then("^User click on the cancel button to close the designation frame$")
	public void user_click_on_the_cancel_button_to_close_the_designation_frame() throws Throwable {
		try {
			elementClick(pm.getic().getDesigcancelbtn());
			System.out.println("User click on the cancel button to close the designation frame");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
