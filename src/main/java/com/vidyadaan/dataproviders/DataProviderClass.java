package com.vidyadaan.dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.vidyadaan.utils.ExcelUtils;

public class DataProviderClass {
	
	public static final String TESTDATAEXCELFILE = "testData.xlsx";
	
	@DataProvider(name = "login")

	public static Object[][] login() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "Login");

	}
	
	@DataProvider(name = "projectcreation")

	public static Object[][] projectcreation() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "createproject");

	}
	
	@DataProvider(name = "newuserlogin")

	public static Object[][] newuserlogin() throws IOException {

		return ExcelUtils.getExcelData(TESTDATAEXCELFILE, "newuserlogin");

	}
	
}
