package com.vidyadaan.testsuite;

import org.testng.annotations.Test;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.pageobjects.LogoutPage;

public class LogoutTest extends BaseClass {

	@Test
	public void logOut() throws Exception {

		LogoutPage logoutpage = new LogoutPage(driver);
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		logoutpage.logout();

	}

}
