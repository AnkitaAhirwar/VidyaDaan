package com.vidyadaan.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vidyadaan.utils.Screenshot;
import com.vidyadaan.config.BaseClass;
import com.vidyadaan.utils.Constant;
import com.vidyadaan.utils.ExcelUtils;

/**
 * This is Page Class for SourcingLogin Page. It contains all the elements and
 * actions related to SourcingLogin Page.
 * 
 */

public class SourcingLoginPage extends BaseClass {

	private static WebElement element = null;

	private static List<WebElement> elements = null;

	public SourcingLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Locators for LogIn Page
	 */

	public static WebElement username(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "login");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(1, 3)));

		return element;

	}

	public static WebElement password(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "login");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(2, 3)));

		return element;

	}

	public static WebElement loginbtn(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "login");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(3, 3)));

		return element;

	}

	public static List<WebElement> errorMessage(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "login");

		elements = driver.findElements(By.xpath(ExcelUtils.getCellData(4, 3)));

		return elements;

	}

	/*
	 * 
	 * Method for Login Success
	 * 
	 */

	public MyProjectsPage loginSuccess(String uname, String upw) throws Exception {

		username(driver).sendKeys(uname); // Login Username
		logger.pass("user name is fetched from excelsheet");
		password(driver).sendKeys(upw);// Login Password
		logger.pass("password fetched from excelsheet");
		loginbtn(driver).click();// Login Button
		logger.pass("User click on the login button");
		logger.pass("User logged Successfully");
		Screenshot.captureScreenshot(driver, "Valid Login");
		return new MyProjectsPage(driver);

	}

	/*
	 * 
	 * Method for Login Expecting Failure
	 * 
	 */

	public SourcingLoginPage loginExpectingFailure(String uname, String upw) throws Exception {

		username(driver).sendKeys(uname); // Login Username
		logger.pass("user name is fetched from excelsheet");
		password(driver).sendKeys(upw); // Login Password
		logger.pass("password fetched from excelsheet");
		loginbtn(driver).click();// Login Button
		logger.pass("User click on the login button");
		logger.pass("User login failed");
		Screenshot.captureScreenshot(driver, "Valid Login");
		int length = errorMessage(driver).size();
		for (int i = 0; i <= length - 1; i++) {
			logger.pass(errorMessage(driver).get(i).getText());
		}
		return new SourcingLoginPage(driver);

	}

}
