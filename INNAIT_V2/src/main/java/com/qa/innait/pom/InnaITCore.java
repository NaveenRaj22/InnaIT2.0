package com.qa.innait.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnaITCore {

	public WebDriver driver;

	public InnaITCore(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	// BUSINESS UNIT

	@FindBy(xpath = "//li[@id='menu_business_unit']//div[@class='item']")
	private WebElement businessmenu;

	@FindBy(xpath = "//button[@id='business_unit_btn_circle_add_row']")
	private WebElement businessunitplsbtn;

	@FindBy(xpath = "//span[contains(text(),'Business Unit Name')]")
	private WebElement businessfield;

	@FindBy(xpath = "//input[@id='business_unit_name']")
	private WebElement entbusinessname;

	@FindBy(xpath = "//div[@class='form-line always']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement busidesfield;

	@FindBy(xpath = "//input[@id='business_unit_description']")
	private WebElement entdescription;

	@FindBy(xpath = "//button[@id='business_unit_btn_add_row']")
	private WebElement businessaddbtn;

	@FindBy(xpath = "//button[@id='business_unit_btn_cancel_row']")
	private WebElement businesscnlbtn;

	public WebElement getBusinessmenu() {
		return businessmenu;
	}

	public WebElement getBusinessunitplsbtn() {
		return businessunitplsbtn;
	}

	public WebElement getBusinessfield() {
		return businessfield;
	}

	public WebElement getEntbusinessname() {
		return entbusinessname;
	}

	public WebElement getBusidesfield() {
		return busidesfield;
	}

	public WebElement getEntdescription() {
		return entdescription;
	}

	public WebElement getBusinessaddbtn() {
		return businessaddbtn;
	}

	public WebElement getBusinesscnlbtn() {
		return businesscnlbtn;
	}

	// BRANCH LOCATION

	@FindBy(xpath = "//li[@id='menu_location']//div[@class='item']")
	private WebElement locationmenu;

	@FindBy(xpath = "//button[@id='location_btn_circle_add_row']")
	private WebElement locplusbtn;

	@FindBy(xpath = "//span[contains(text(),'Location Name')]")
	private WebElement locfield;

	@FindBy(xpath = "//input[@id='locations_location_name']")
	private WebElement entloc;

	@FindBy(xpath = "//div[@id='locations_location_desc_row']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement locdesfield;

	@FindBy(xpath = "//input[@id='locations_location_desc']")
	private WebElement entlocdesi;

	@FindBy(xpath = "//span[@id='select2-locations_location_timezone-container']")
	private WebElement timezone;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	private WebElement enttimezone;

	@FindBy(xpath = "//li[@class ='select2-results__option select2-results__option--highlighted' and text()='IST']")
	private WebElement seltimezone;

	@FindBy(xpath = "//button[@id='locations_btn_add_row']")
	private WebElement locaddbtn;

	@FindBy(xpath = "//button[@id='locations_btn_cancel_row']")
	private WebElement loccnlbtn;

	public WebElement getLocationmenu() {
		return locationmenu;
	}

	public WebElement getLocplusbtn() {
		return locplusbtn;
	}

	public WebElement getLocfield() {
		return locfield;
	}

	public WebElement getEntloc() {
		return entloc;
	}

	public WebElement getLocdesfield() {
		return locdesfield;
	}

	public WebElement getEntlocdesi() {
		return entlocdesi;
	}

	public WebElement getTimezone() {
		return timezone;
	}

	public WebElement getEnttimezone() {
		return enttimezone;
	}

	public WebElement getSeltimezone() {
		return seltimezone;
	}

	public WebElement getLocaddbtn() {
		return locaddbtn;
	}

	public WebElement getLoccnlbtn() {
		return loccnlbtn;
	}

	//DEPARTMENT
	
	@FindBy(xpath = "//li[@id='menu_department']//div[@class='item']")
	private WebElement deptmenu;
	
	@FindBy(xpath = "//button[@id='department_btn_circle_add_row']")
	private WebElement deptplusbtn;
	
	@FindBy(xpath = "//span[contains(text(),'Department Name')]")
	private WebElement deptnamefield;
	
	@FindBy(xpath = "//input[@id='dept_department_name']")
	private WebElement entdept;
	
	@FindBy(xpath = "//div[@id='dept_department_desc_row']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement deptdesfield;
	
	@FindBy(xpath = "//input[@id='dept_department_desc']")
	private WebElement entdeptdes;
	
	@FindBy(xpath = "//button[@id='department_btn_add_row']")
	private WebElement deptaddbtn;
	
	@FindBy(xpath = "//button[@id='department_btn_cancel_row']")
	private WebElement deptcancelbtn;

	public WebElement getDeptmenu() {
		return deptmenu;
	}

	public WebElement getDeptplusbtn() {
		return deptplusbtn;
	}

	public WebElement getDeptnamefield() {
		return deptnamefield;
	}

	public WebElement getEntdept() {
		return entdept;
	}

	public WebElement getDeptdesfield() {
		return deptdesfield;
	}

	public WebElement getEntdeptdes() {
		return entdeptdes;
	}

	public WebElement getDeptaddbtn() {
		return deptaddbtn;
	}

	public WebElement getDeptcancelbtn() {
		return deptcancelbtn;
	}
	
	//DESIGNATION
	
	@FindBy(xpath = "//li[@id='menu_department']//div[@class='item']")
	private WebElement desigmenu;
	
	@FindBy(xpath = "//button[@id='designation_btn_circle_add_row']")
	private WebElement desigplusbtn;
	
	@FindBy(xpath = "//span[contains(text(),'Designation Name')]")
	private WebElement designamefield;
	
	@FindBy(xpath = "//input[@id='desig_designation_name']")
	private WebElement entdesig;
	
	@FindBy(xpath = "//div[@id='desig_designation_desc_row']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement desigdesfield;
	
	@FindBy(xpath = "//input[@id='desig_designation_desc']")
	private WebElement entdesigdes;
	
	@FindBy(xpath = "//button[@id='designation_btn_add_row']")
	private WebElement desigaddbtn;
	
	@FindBy(xpath = "//button[@id='designation_btn_cancel_row']")
	private WebElement desigcancelbtn;

	public WebElement getDesigmenu() {
		return desigmenu;
	}

	public WebElement getDesigplusbtn() {
		return desigplusbtn;
	}

	public WebElement getDesignamefield() {
		return designamefield;
	}

	public WebElement getEntdesig() {
		return entdesig;
	}

	public WebElement getDesigdesfield() {
		return desigdesfield;
	}

	public WebElement getEntdesigdes() {
		return entdesigdes;
	}

	public WebElement getDesigaddbtn() {
		return desigaddbtn;
	}

	public WebElement getDesigcancelbtn() {
		return desigcancelbtn;
	}
	
	
	
}
