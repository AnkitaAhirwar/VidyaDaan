package com.vidyadaan.testsuite;

import org.testng.annotations.Test;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.pageobjects.MyProjectsPage;

public class MyProjectsTest extends BaseClass {

	@Test
	public void myprojecttab() throws Exception {

		MyProjectsPage myproject = new MyProjectsPage(driver);
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());
		myproject.myProjectTab();

	}
}
