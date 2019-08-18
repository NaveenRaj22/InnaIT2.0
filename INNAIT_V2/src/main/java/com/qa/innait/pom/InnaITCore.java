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

	// DEPARTMENT

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

	// DESIGNATION

	@FindBy(xpath = "//li[@id='menu_designation']//div[@class='item']")
	private WebElement desigmenu;

	@FindBy(xpath = "//button[@id='designation_btn_circle_add_row']")
	private WebElement desigplusbtn;

	@FindBy(xpath = "//span[contains(text(),'Designation Name')]")
	private WebElement desigfield;

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

	public WebElement getDesigfield() {
		return desigfield;
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

	// ROLES

	@FindBy(xpath = "//li[@id='menu_role']//div[@class='item']")
	private WebElement rolemenu;

	@FindBy(xpath = "//button[@id='roles_btn_circle_add_row']")
	private WebElement roleplusbtn;

	@FindBy(xpath = "//span[contains(text(),'Role Name')]")
	private WebElement rolefield;

	@FindBy(xpath = "//input[@id='roles_role_name']")
	private WebElement entrole;

	@FindBy(xpath = "//div[@id='roles_role_desc_row']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement roledesfield;

	@FindBy(xpath = "//input[@id='roles_role_desc']")
	private WebElement entroledes;

	@FindBy(xpath = "//button[@id='roles_btn_add_row']")
	private WebElement roleaddbtn;

	@FindBy(xpath = "//button[@id='roles_btn_cancel_row']")
	private WebElement rolecancelbtn;

	public WebElement getRolemenu() {
		return rolemenu;
	}

	public WebElement getRoleplusbtn() {
		return roleplusbtn;
	}

	public WebElement getRolefield() {
		return rolefield;
	}

	public WebElement getEntrole() {
		return entrole;
	}

	public WebElement getRoledesfield() {
		return roledesfield;
	}

	public WebElement getEntroledes() {
		return entroledes;
	}

	public WebElement getRoleaddbtn() {
		return roleaddbtn;
	}

	public WebElement getRolecancelbtn() {
		return rolecancelbtn;
	}

	// DOMAIN & PASSWORDPOLICY

	@FindBy(xpath = "//li[@id='menu_domain']//div[@class='item']")
	private WebElement domainmenu;

	@FindBy(xpath = "//button[@id='domain_btn_circle_add_row']")
	private WebElement domainplusbtn;

	@FindBy(xpath = "//div[@id='link_passwordpolicy']//a[contains(text(),'here')]")
	private WebElement passpolicymenu;

	@FindBy(xpath = "//button[@id='pwd_policy_btn_circle_add_row']")
	private WebElement policyplusbtn;

	@FindBy(xpath = "//span[contains(text(),'Password Policy Name')]")
	private WebElement policynamfield;

	@FindBy(xpath = "//input[@id='pwd_policy_name']")
	private WebElement entpolicyname;

	@FindBy(xpath = "//div[@id='pwd_policy_desc_row']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement policydes;

	@FindBy(xpath = "//input[@id='pwd_policy_desc']")
	private WebElement entpolicydes;

	@FindBy(xpath = "//span[contains(text(),'Minimum Length')]")
	private WebElement minleng;

	@FindBy(xpath = "//input[@id='pwd_policy_min_length']")
	private WebElement entminleng;

	@FindBy(xpath = "//span[contains(text(),'Minimum Upper')]")
	private WebElement minupp;

	@FindBy(xpath = "//input[@id='pwd_policy_min_upper']")
	private WebElement entminupp;

	@FindBy(xpath = "//span[contains(text(),'Minimum Lower')]")
	private WebElement minlow;

	@FindBy(xpath = "//input[@id='pwd_policy_min_lower']")
	private WebElement entminlow;

	@FindBy(xpath = "//span[contains(text(),'Minimum Digit')]")
	private WebElement mindig;

	@FindBy(xpath = "//input[@id='pwd_policy_min_digit']")
	private WebElement entmindig;

	@FindBy(xpath = "//span[contains(text(),'Minimum Alphabets')]")
	private WebElement minalph;

	@FindBy(xpath = "//input[@id='pwd_policy_min_alphabets']")
	private WebElement entminalph;

	@FindBy(xpath = "//span[contains(text(),'Minimum Others')]")
	private WebElement minoth;

	@FindBy(xpath = "//input[@id='pwd_policy_min_others']")
	private WebElement entminoth;

	@FindBy(xpath = "//span[contains(text(),'Minimum Days')]")
	private WebElement minday;

	@FindBy(xpath = "//input[@id='pwd_policy_min_days']")
	private WebElement entminday;

	@FindBy(xpath = "//span[contains(text(),'History Depth')]")
	private WebElement histdepth;

	@FindBy(xpath = "//input[@id='pwd_policy_history_depth']")
	private WebElement enthistdepth;

	@FindBy(xpath = "//button[@id='pwd_policy_btn_add_row']")
	private WebElement policyaddbtn;

	@FindBy(xpath = "//button[@id='pwd_policy_btn_cancel_row']")
	private WebElement policycancelbtn;

	@FindBy(xpath = "//li[@id='menu_domain']//div[@class='item']")
	private WebElement domamenu;

	@FindBy(xpath = "//button[@id='domain_btn_circle_add_row']")
	private WebElement domaplusbtn;

	@FindBy(xpath = "//span[contains(text(),'Domain Name')]")
	private WebElement domanamfield;

	@FindBy(xpath = "//input[@id='domaain_name']")
	private WebElement entdomaname;

	@FindBy(xpath = "//div[@id='domain_desc_row']//span[@class='lang'][contains(text(),'Description')]")
	private WebElement domadesfield;

	@FindBy(xpath = "//input[@id='domain_desc']")
	private WebElement entdomades;

	@FindBy(xpath = "//span[@id='select2-domain_pswd_policy-container']")
	private WebElement selpolicyfield;

	@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
	private WebElement entpolicy;

	@FindBy(xpath = "///li[@class='select2-results__option select2-results__option--highlighted' and text()='Policy-1']")
	private WebElement selpolicy;

	@FindBy(xpath = "//span[contains(text(),'Password Manager IP')]")
	private WebElement passpwdIPfield;

	@FindBy(xpath = "//input[@id='domain_pswd_managerIP']")
	private WebElement entpasspwdIP;

	@FindBy(xpath = "//span[contains(text(),'Password Manager Port')]")
	private WebElement passpwdportfield;

	@FindBy(xpath = "//input[@id='domain_pswd_managerport']")
	private WebElement entpasspwdport;

	@FindBy(xpath = "//button[@id='domain_btn_add_row']")
	private WebElement domaaddbtn;

	@FindBy(xpath = "//button[@id='domain_btn_cancel_row']")
	private WebElement domacancelbtn;

	public WebElement getDomainmenu() {
		return domainmenu;
	}

	public WebElement getDomainplusbtn() {
		return domainplusbtn;
	}

	public WebElement getPasspolicymenu() {
		return passpolicymenu;
	}

	public WebElement getPolicyplusbtn() {
		return policyplusbtn;
	}

	public WebElement getPolicynamfield() {
		return policynamfield;
	}

	public WebElement getEntpolicyname() {
		return entpolicyname;
	}

	public WebElement getPolicydes() {
		return policydes;
	}

	public WebElement getEntpolicydes() {
		return entpolicydes;
	}

	public WebElement getMinleng() {
		return minleng;
	}

	public WebElement getEntminleng() {
		return entminleng;
	}

	public WebElement getMinupp() {
		return minupp;
	}

	public WebElement getEntminupp() {
		return entminupp;
	}

	public WebElement getMinlow() {
		return minlow;
	}

	public WebElement getEntminlow() {
		return entminlow;
	}

	public WebElement getMindig() {
		return mindig;
	}

	public WebElement getEntmindig() {
		return entmindig;
	}

	public WebElement getMinalph() {
		return minalph;
	}

	public WebElement getEntminalph() {
		return entminalph;
	}

	public WebElement getMinoth() {
		return minoth;
	}

	public WebElement getEntminoth() {
		return entminoth;
	}

	public WebElement getMinday() {
		return minday;
	}

	public WebElement getEntminday() {
		return entminday;
	}

	public WebElement getHistdepth() {
		return histdepth;
	}

	public WebElement getEnthistdepth() {
		return enthistdepth;
	}

	public WebElement getPolicyaddbtn() {
		return policyaddbtn;
	}

	public WebElement getPolicycancelbtn() {
		return policycancelbtn;
	}

	public WebElement getDomamenu() {
		return domamenu;
	}

	public WebElement getDomaplusbtn() {
		return domaplusbtn;
	}

	public WebElement getDomanamfield() {
		return domanamfield;
	}

	public WebElement getEntdomaname() {
		return entdomaname;
	}

	public WebElement getDomadesfield() {
		return domadesfield;
	}

	public WebElement getEntdomades() {
		return entdomades;
	}

	public WebElement getSelpolicyfield() {
		return selpolicyfield;
	}

	public WebElement getEntpolicy() {
		return entpolicy;
	}

	public WebElement getSelpolicy() {
		return selpolicy;
	}

	public WebElement getPasspwdIPfield() {
		return passpwdIPfield;
	}

	public WebElement getEntpasspwdIP() {
		return entpasspwdIP;
	}

	public WebElement getPasspwdportfield() {
		return passpwdportfield;
	}

	public WebElement getEntpasspwdport() {
		return entpasspwdport;
	}

	public WebElement getDomaaddbtn() {
		return domaaddbtn;
	}

	public WebElement getDomacancelbtn() {
		return domacancelbtn;
	}

}
