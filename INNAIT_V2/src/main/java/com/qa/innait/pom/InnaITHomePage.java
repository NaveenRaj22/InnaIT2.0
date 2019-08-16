package com.qa.innait.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.innait.baseclass.BaseClass;

public class InnaITHomePage {

	public WebDriver driver;

	@FindBy(xpath = "//img[@id='client_logo']")
	private WebElement clientlogo;

	@FindBy(xpath = "//img[@id='innait_logo']")
	private WebElement applicationlogo;

	@FindBy(xpath = "//h4[@id='login_msg_default']")
	private WebElement FPmessage;

	@FindBy(xpath = "//img[@id='precision_logo']")
	private WebElement precisionlogo;

	@FindBy(xpath = "//a[@id='login_link_checkin_key']//img")
	private WebElement checkinkey;

	public WebElement getClientlogo() {
		return clientlogo;
	}

	public WebElement getApplicationlogo() {
		return applicationlogo;
	}

	public WebElement getFPmessage() {
		return FPmessage;
	}

	public WebElement getPrecisionlogo() {
		return precisionlogo;
	}

	public WebElement getCheckinkey() {
		return checkinkey;
	}

	public InnaITHomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
}
