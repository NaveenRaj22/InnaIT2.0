package com.qa.innait.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.innait.baseclass.BaseClass;

public class InnaITLogin extends BaseClass {

	public WebDriver driver;

	@FindBy(xpath = "//img[@id='client_logo']")
	private WebElement precisionlogo;

	@FindBy(xpath = "//img[@id='innait_logo']")
	private WebElement innaitlogo;

	@FindBy(xpath = "//span[contains(text(),'Employee Id')]")
	private WebElement empid;

	@FindBy(xpath = "//input[@id='login_text_employee_id']")
	private WebElement empidfield;

	@FindBy(xpath = "//span[contains(text(),'InnaIT Password')]")
	private WebElement innaitpwd;

	@FindBy(xpath = "//input[@id='login_password']")
	private WebElement innaitpwdfield;

	@FindBy(xpath = "//button[@id='login_btn_login']")
	private WebElement loginbtn;

	public WebElement getPrecisionlogo() {
		return precisionlogo;
	}

	public WebElement getInnaitlogo() {
		return innaitlogo;
	}

	public WebElement getEmpid() {
		return empid;
	}

	public WebElement getEmpidfield() {
		return empidfield;
	}

	public WebElement getInnaitpwd() {
		return innaitpwd;
	}

	public WebElement getInnaitpwdfield() {
		return innaitpwdfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public InnaITLogin(WebDriver ldriver) {

		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}
