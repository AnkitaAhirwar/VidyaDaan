package com.vidyadaan.testsuite;

import org.testng.annotations.Test;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.dataproviders.DataProviderClass;
import com.vidyadaan.pageobjects.SourcingLoginPage;

public class NewUserLoginTest extends BaseClass {

	@Test(dataProvider = "newuserlogin", dataProviderClass = DataProviderClass.class)
	public void NewUserLoginTest(String testdesc, String uname, String upw) throws Exception {

		SourcingLoginPage login = new SourcingLoginPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		if (testdesc.equals("negative")) {
			login.loginExpectingFailure(uname, upw);
		}
		if (testdesc.equals("positive")) {
			login.loginSuccess(uname, upw);
		}

	}

}
