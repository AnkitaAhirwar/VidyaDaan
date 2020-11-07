package com.vidyadaan.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.utils.Constant;
import com.vidyadaan.utils.ExcelUtils;

/**
 * This is Page Class for Logout Page. It contains all the elements and actions
 * related to Logout Page.
 * 
 */

public class LogoutPage extends BaseClass {

	private static WebElement element = null;

	public LogoutPage(WebDriver driver) throws Exception {
		this.driver = driver;
	}

	/*
	 * Locators for LogOut Page
	 */

	public static WebElement logoutbtn(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(98, 3)));
		return element;

	}

	public static WebElement usernamebtn(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(100, 3)));
		return element;

	}

	/*
	 * 
	 * Method for Logout
	 * 
	 */

	public LogoutPage logout() throws Exception {

		usernamebtn(driver).click();// Username button
		logger.pass("User click on username button");
		logoutbtn(driver).click(); // Logout Button
		logger.pass("User click on logout button");
		return this;

	}

}
