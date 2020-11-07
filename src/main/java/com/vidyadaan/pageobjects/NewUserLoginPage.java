package com.vidyadaan.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.utils.Constant;
import com.vidyadaan.utils.ExcelUtils;
import com.vidyadaan.utils.Screenshot;

/**
 * This is Page Class for NewUserLogin Page. It contains all the elements and
 * actions related to NewUserLogin Page.
 * 
 */

public class NewUserLoginPage extends BaseClass {

	private static WebElement element = null;

	private static List<WebElement> elements = null;

	public NewUserLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Locators for NewUserLogin Page
	 */

	public static WebElement username(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "newuserlogin");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(1, 3)));

		return element;

	}

	public static WebElement password(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "newuserlogin");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(2, 3)));

		return element;

	}

	public static WebElement loginbtn(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "newuserlogin");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(3, 3)));

		return element;

	}

	public static List<WebElement> errorMessage(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "newuserlogin");

		elements = driver.findElements(By.xpath(ExcelUtils.getCellData(4, 3)));

		return elements;

	}

	public static WebElement noResultsFound(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "newuserlogin");

		element = driver.findElement(By.xpath(ExcelUtils.getCellData(5, 3)));

		return element;

	}

	/*
	 * 
	 * Method for login success
	 * 
	 */

	public CreateProjectPage loginSuccess(String uname, String upw) throws Exception {

		username(driver).sendKeys(uname); // Login Username
		logger.pass("user name is fetched from excelsheet");
		password(driver).sendKeys(upw);// Login Password
		logger.pass("password fetched from excelsheet");
		loginbtn(driver).click();// Login Button
		logger.pass("User click on the login button");
		System.out.println(" Logged Successfully");
		logger.pass("User logged Successfully");
		Screenshot.captureScreenshot(driver, "Valid Login");
		// System.out.println(noResultsFound(driver).getText());

		if (noResultsFound(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + noResultsFound(driver).getText());
		} else {
			System.out.println("Element is missing");
		}
		return new CreateProjectPage(driver);

	}

	/*
	 * 
	 * Method for login expecting failure
	 * 
	 */

	public NewUserLoginPage loginExpectingFailure(String uname, String upw) throws Exception {

		username(driver).sendKeys(uname); // Login Username
		logger.pass("user name is fetched from excelsheet");
		password(driver).sendKeys(upw); // Login Password
		logger.pass("password fetched from excelsheet");
		loginbtn(driver).click();// Login Button
		logger.pass("User click on the login button");
		System.out.println(" Login Failed");
		logger.pass("User login failed");
		Screenshot.captureScreenshot(driver, "Valid Login");
		int length = errorMessage(driver).size();
		for (int i = 0; i <= length - 1; i++) {

			System.out.println(errorMessage(driver).get(i).getText());
		}
		return new NewUserLoginPage(driver);

	}

}
