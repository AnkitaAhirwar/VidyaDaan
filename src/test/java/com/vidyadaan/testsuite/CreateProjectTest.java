package com.vidyadaan.testsuite;

import org.testng.annotations.Test;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.dataproviders.DataProviderClass;
import com.vidyadaan.pageobjects.CreateProjectPage;

public class CreateProjectTest extends BaseClass {

	@Test(dataProvider = "projectcreation", dataProviderClass = DataProviderClass.class)
	public void createProject(String testdesc, String title, String description, String nominationedate,
			String shortlistinged, String contributioned, String projected, String fp, String tm, String lp)
			throws Exception {

		CreateProjectPage createProjectPage = new CreateProjectPage(driver);
		driver.get(properties.getProperty("url"));
		logger = extent.createTest(new Object() {
		}.getClass().getEnclosingMethod().getName());

		 //createProjectPage.myProjectTab();
	if (testdesc.equals("positive")) {
			createProjectPage.newProjectCreation(title, description, nominationedate, shortlistinged, contributioned,
					projected, fp, tm, lp);
			
		}
		//createProjectPage.projectDetails();
	}

}
