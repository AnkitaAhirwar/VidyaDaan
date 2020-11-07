package com.vidyadaan.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.utils.Constant;
import com.vidyadaan.utils.ExcelUtils;

/**
 * This is Page Class for MyProjects Page. It contains all the elements and
 * actions related to MyProjects Page.
 * 
 */

public class MyProjectsPage extends BaseClass {

	private static WebElement element = null;

	public MyProjectsPage(WebDriver driver) throws Exception {
		this.driver = driver;
	}

	/*
	 * Locators for MyProjectsPage
	 */

	public static WebElement myProjectTab(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(1, 3)));
		return element;

	}

	public static WebElement contentType(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(4, 3)));
		return element;

	}

	public static WebElement mediumClassSub(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(5, 3)));
		return element;

	}

	public static WebElement projectDates(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(6, 3)));
		return element;

	}

	public static WebElement projectName(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(2, 3)));
		return element;

	}

	public static WebElement projectNameSorting(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(3, 3)));
		return element;

	}

	public static WebElement vidyadaanLogo(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(11, 3)));
		return element;

	}

	public static WebElement clickHereToGetStarted(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(8, 3)));
		return element;

	}

	public static WebElement helpCentre(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(9, 3)));
		return element;

	}

	public static WebElement termsAndPolicies(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "myproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(10, 3)));
		return element;

	}

	/*
	 * 
	 * Method for My Projects Page
	 * 
	 */

	public MyProjectsPage myProjectTab() throws Exception {

		if (myProjectTab(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + myProjectTab(driver).getText()); // My Projects Tab is visible
		} else {
			logger.pass("Element is missing");
		}

		if (contentType(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + contentType(driver).getText()); // Content Type is available
																					// on My Projects Tab
		} else {
			logger.pass("Element is missing");
		}

		if (mediumClassSub(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + mediumClassSub(driver).getText()); // Medium, Class & Subject
																						// is available on My
																						// Projects Tab
		} else {
			logger.pass("Element is missing");
		}

		if (projectDates(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + projectDates(driver).getText()); // Project Dates are
																					// available on My Projects
																					// Tab
		} else {
			logger.pass("Element is missing");
		}

		if (projectName(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + projectName(driver).getText()); // Project Name is available
																					// on My Projects Tab
		} else {
			logger.pass("Element is missing");
		}

		projectNameSorting(driver).click(); // Project Sorting

		Boolean vidyadaanlogo = vidyadaanLogo(driver).isDisplayed();
		logger.pass("Element displayed is :" + vidyadaanlogo); // VidyaDaan logo is available on My Projects Tab
		// logger.pass("Element displayed is :"+vidyadaanLogo(driver).getText());

		if (clickHereToGetStarted(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + clickHereToGetStarted(driver).getText()); // Click Here To Get
																								// Started is
																								// available on My
																								// Projects Tab
		} else {
			logger.pass("Element is missing");
		}

		if (helpCentre(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + helpCentre(driver).getText()); // Help Centre is available on
																					// My Projects Tab
		} else {
			logger.pass("Element is missing");
		}

		if (termsAndPolicies(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + termsAndPolicies(driver).getText()); // Terms and Policies is
																						// available on My
																						// Projects Tab
		} else {
			logger.pass("Element is missing");
		}
		return this;
	}

}
