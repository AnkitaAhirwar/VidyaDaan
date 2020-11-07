package com.vidyadaan.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.dataproviders.DataProviderClass;
import com.vidyadaan.pageobjects.SourcingLoginPage;

public class SourcingLoginTest extends BaseClass {

	@Test(dataProvider = "login", dataProviderClass = DataProviderClass.class)
	public void sourcingPortalLogin(String testdesc, String uname, String upw) throws Exception {

		SourcingLoginPage login = new SourcingLoginPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);

		String actualurl = driver.getCurrentUrl();
		String expectedurl = properties.getProperty("url");
		System.out.println(actualurl);
		System.out.println(expectedurl);
		// Assert.assertEquals(actualurl, expectedurl);

		if (testdesc.equals("negative")) {
			login.loginExpectingFailure(uname, upw);
		}
		if (testdesc.equals("positive")) {
			login.loginSuccess(uname, upw);
		}

	}

}
