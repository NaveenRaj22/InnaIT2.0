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

}
