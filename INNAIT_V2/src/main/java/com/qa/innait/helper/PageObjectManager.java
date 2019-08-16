package com.qa.innait.helper;

import org.openqa.selenium.WebDriver;

import com.qa.innait.pom.InnaITCore;
import com.qa.innait.pom.InnaITHomePage;
import com.qa.innait.pom.InnaITLogin;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;

	}

	public InnaITHomePage hp;

	public InnaITHomePage gethp() {
		if (hp == null) {
			hp = new InnaITHomePage(driver);
		}
		return hp;

	}

	public InnaITLogin il;

	public InnaITLogin getil() {
		if (il == null) {
			il = new InnaITLogin(driver);
		}
		return il;

	}
	
	public InnaITCore ic;

	public InnaITCore getic() {
		if (ic == null) {
			ic = new InnaITCore(driver);
		}
		return ic;

	}

}
