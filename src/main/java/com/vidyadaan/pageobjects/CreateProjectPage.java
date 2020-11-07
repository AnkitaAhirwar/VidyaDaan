package com.vidyadaan.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vidyadaan.config.BaseClass;
import com.vidyadaan.utils.Constant;
import com.vidyadaan.utils.ExcelUtils;
import com.vidyadaan.utils.Screenshot;

/**
 * This is Page Class for CreateProject Page. It contains all the elements and
 * actions related to CreateProject Page.
 * 
 */

public class CreateProjectPage extends BaseClass {

	private static WebElement element = null;

	private static List<WebElement> elements = null;

	public CreateProjectPage(WebDriver driver) throws Exception {
		this.driver = driver;
	}

	/*
	 * Locators for Create Project
	 */

	public static WebElement createnewprojectbtn(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(1, 3)));
		return element;

	}

	public static WebElement name(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(2, 3)));
		return element;

	}

	public static WebElement myProjectTab(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(29, 3)));
		return element;

	}

	public static WebElement contentType(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(32, 3)));
		return element;

	}

	public static WebElement mediumClassSub(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(33, 3)));
		return element;

	}

	public static WebElement projectDates(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(34, 3)));
		return element;

	}

	public static WebElement projectName(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(30, 3)));
		return element;

	}

	public static WebElement projectNameSorting(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(31, 3)));
		return element;

	}

	public static WebElement vidyadaanLogo(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(56, 3)));
		return element;

	}

	public static WebElement clickHereToGetStarted(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(52, 3)));
		return element;

	}

	public static WebElement helpCentre(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(53, 3)));
		return element;

	}

	public static WebElement termsAndPolicies(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(54, 3)));
		return element;

	}

	public static WebElement details(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(57, 3)));
		return element;

	}

	public static WebElement selectTextbooks(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(58, 3)));
		return element;

	}

	public static WebElement description(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(3, 3)));
		return element;

	}

	public static WebElement openForNominations(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(4, 3)));
		return element;

	}

	public static WebElement skipreview(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(6, 3)));
		return element;

	}

	public static WebElement nominationEndDate(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(7, 3)));
		return element;

	}

	public static WebElement nominationShortlistingDate(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(8, 3)));
		return element;

	}

	public static WebElement contributionEndDate(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(9, 3)));
		return element;

	}

	public static WebElement projectEndDate(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(10, 3)));
		return element;

	}

	public static WebElement contentTypeDropdown(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(11, 3)));
		return element;

	}

	public static List<WebElement> contentTypeDropdownlist(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		elements = driver.findElements(By.xpath(ExcelUtils.getCellData(12, 3)));
		return elements;

	}

	public static WebElement saveAsDraft(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(15, 3)));
		return element;

	}

	public static WebElement next(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(16, 3)));
		return element;

	}

	public static WebElement editDraft(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(17, 3)));
		return element;

	}

	public static WebElement mediumdropdown(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(63, 3)));
		return element;

	}

	public static WebElement hindi(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(64, 3)));
		return element;

	}

	public static WebElement gradedropdown(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(67, 3)));
		return element;

	}

	public static WebElement class2(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(68, 3)));
		return element;

	}

	public static WebElement subjectdropdown(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(69, 3)));
		return element;

	}

	public static WebElement hindisub(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(70, 3)));
		return element;

	}

	public static WebElement reset(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(21, 3)));
		return element;

	}

	public static WebElement englishMedium(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(65, 3)));
		return element;

	}

	public static WebElement class6(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(71, 3)));
		return element;

	}

	public static WebElement englishSub(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(72, 3)));
		return element;

	}

	public static WebElement applybutton(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(22, 3)));
		return element;

	}

	public static WebElement textbookCheckbox(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(74, 3)));
		return element;

	}

	public static WebElement textbookClose(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(74, 3)));
		return element;

	}

	public static WebElement publishProject(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(24, 3)));
		return element;

	}

	public static WebElement publishProjectYes(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(24, 3)));
		return element;

	}

	public static WebElement textbookSelect(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(77, 3)));
		return element;

	}

	public static WebElement selectTextbookTab(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(62, 3)));
		return element;

	}

	public static WebElement nameLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(80, 3)));
		return element;

	}

	public static WebElement descLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(81, 3)));
		return element;

	}

	public static WebElement nominationEndDateLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(82, 3)));
		return element;

	}

	public static WebElement nominationShortlistingDateLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(83, 3)));
		return element;

	}

	public static WebElement contributionEndDateLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(84, 3)));
		return element;

	}

	public static WebElement projectEndDateLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(85, 3)));
		return element;

	}

	public static WebElement contentTypeLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(86, 3)));
		return element;

	}

	public static WebElement guidelinesDocumentLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(87, 3)));
		return element;

	}

	public static WebElement recognitionToContributorsLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(88, 3)));
		return element;

	}

	public static WebElement openBtn(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(90, 3)));
		return element;

	}

	public static WebElement textbooksLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(91, 3)));
		return element;

	}

	public static WebElement nominationsLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(92, 3)));
		return element;

	}

	public static WebElement usersLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(93, 3)));
		return element;

	}

	public static WebElement contributionDashboardLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(94, 3)));
		return element;

	}

	public static WebElement reportsLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(95, 3)));
		return element;

	}

	public static WebElement contentTypesDetailsPageLabel(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(96, 3)));
		return element;

	}

	public static WebElement toastMessage(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.TESTDATAPATH, "createproject");
		element = driver.findElement(By.xpath(ExcelUtils.getCellData(97, 3)));
		return element;

	}
	
	public void myProjectTab() throws Exception {

		if (myProjectTab(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + myProjectTab(driver).getText()); // My Projects Tab is visible
		} else {
			System.out.println("Element is missing");
		}

		if (contentType(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + contentType(driver).getText()); // Content Type is available
																							// on My Projects Tab
		} else {
			System.out.println("Element is missing");
		}

		if (mediumClassSub(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + mediumClassSub(driver).getText()); // Medium, Class & Subject
																								// is available on My
																								// Projects Tab
		} else {
			System.out.println("Element is missing");
		}

		if (projectDates(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + projectDates(driver).getText()); // Project Dates are
																							// available on My Projects
																							// Tab
		} else {
			System.out.println("Element is missing");
		}

		if (projectName(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + projectName(driver).getText()); // Project Name is available
																							// on My Projects Tab
		} else {
			System.out.println("Element is missing");
		}

		projectNameSorting(driver).click(); // Project Sorting

		Boolean vidyadaanlogo = vidyadaanLogo(driver).isDisplayed();
		System.out.println("Element displayed is :" + vidyadaanlogo); // VidyaDaan logo is available on My Projects Tab
		// System.out.println("Element displayed is :"+vidyadaanLogo(driver).getText());

		if (clickHereToGetStarted(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + clickHereToGetStarted(driver).getText()); // Click Here To Get
																									// Started is
																									// available on My
																									// Projects Tab
		} else {
			System.out.println("Element is missing");
		}

		if (helpCentre(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + helpCentre(driver).getText()); // Help Centre is available on
																							// My Projects Tab
		} else {
			System.out.println("Element is missing");
		}

		if (termsAndPolicies(driver).isDisplayed()) {
			System.out.println("Element displayed is :" + termsAndPolicies(driver).getText()); // Terms and Policies is
																								// available on My
																								// Projects Tab
		} else {
			System.out.println("Element is missing");
		}
	}

	/*
	 * 
	 * Method for new project creation
	 * 
	 */

	public void newProjectCreation(String title, String description, String nominationedate, String shortlistinged,
			String contributioned, String projected, String fp, String tm, String lp) throws Exception {

		createnewprojectbtn(driver).click(); // Create Project Button

		if (details(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + details(driver).getText()); // Details Tab is available on Create
																				// Project Form
		} else {
			logger.pass("Element is missing");
		}

		if (nameLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + nameLabel(driver).getText()); // Name Label available in details page
		} else {
			logger.pass("Element is missing");
		}

		if (descLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + descLabel(driver).getText()); // Description Label available in
																					// details page
		} else {
			logger.pass("Element is missing");
		}

		if (nominationEndDateLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + nominationEndDateLabel(driver).getText()); // Nomination End Date
																								// Label available in
																								// details page
		} else {
			logger.pass("Element is missing");
		}

		if (nominationShortlistingDateLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + nominationShortlistingDateLabel(driver).getText()); // Nomination
																										// Shortlisting
																										// Date Label
																										// available in
																										// details page
		} else {
			logger.pass("Element is missing");
		}

		if (contributionEndDateLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + contributionEndDateLabel(driver).getText()); // Contribution End Date
																								// Label available in
																								// details page
		} else {
			logger.pass("Element is missing");
		}

		if (projectEndDateLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + projectEndDateLabel(driver).getText()); // Project End Date Label
																							// available in details page
		} else {
			logger.pass("Element is missing");
		}

		if (contentTypeLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + contentTypeLabel(driver).getText()); // Content Type Label available
																						// in details page
		} else {
			logger.pass("Element is missing");
		}

		if (guidelinesDocumentLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + guidelinesDocumentLabel(driver).getText()); // Guidelines Documents
																								// Label available in
																								// details page
		} else {
			logger.pass("Element is missing");
		}

		if (recognitionToContributorsLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + recognitionToContributorsLabel(driver).getText()); // Recognition to
																										// Contributors
																										// Label
																										// available in
																										// details page
		} else {
			logger.pass("Element is missing");
		}

		name(driver).sendKeys(title); // Name
		logger.pass("User fetching title from excelsheet");
		description(driver).sendKeys(description); // Description
		logger.pass("User fetching description from excelsheet");
		openForNominations(driver).click(); // Open for Nominations
		logger.pass("User click on open for nomination button");
		skipreview(driver).click(); // Skip Review
		logger.pass("User click on skip review checkbox");
		nominationEndDate(driver).sendKeys(nominationedate);// Nomination End Date
		logger.pass("User fetching nomination end date from excelsheet");
		// nominationShortlistingDate(driver).sendKeys(shortlistinged); // Nomination
		// Shortlisting Date
		logger.pass("User fetching nomination shortlisting date from excelsheet");
		contributionEndDate(driver).sendKeys(contributioned); // Contribution End Date
		logger.pass("User fetching contribution end date from excelsheet");
		projectEndDate(driver).sendKeys(projected); // Project End Date
		logger.pass("User fetching project end date from excelsheet");
		contentTypeDropdown(driver).click(); // Content Type Dropdown
		logger.pass("User click on content type dropdown");

		for (WebElement contenttypes : contentTypeDropdownlist(driver)) {
			String stringlinktext = contenttypes.getText();
			System.out.println(stringlinktext); // Printing List of all Content types available in the create project
												// form
		}

		for (WebElement type : contentTypeDropdownlist(driver)) {
			if (type.getText().equals(fp)) { // Select Focus Spot as Content Type
				type.click();
				break;
			}
		}
		for (WebElement type : contentTypeDropdownlist(driver)) {
			if (type.getText().equals(tm)) { // Select Teaching Method as Content Type
				type.click();
				break;
			}
		}
		for (WebElement type : contentTypeDropdownlist(driver)) {
			if (type.getText().equals(lp)) { // Select Lesson Plan as Content Type
				type.click();
				break;
			}
		}
		next(driver).click(); // Next Button
		logger.pass("User click on next button");
		// saveAsDraft(driver).click();
		/*
		 * editDraft(driver).click(); logger.pass("User click on edit draft button");
		 * JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("window.scrollBy(0, 2500)", "");
		 * 
		 * WebDriverWait w = new WebDriverWait(driver, 30);
		 * w.until(ExpectedConditions.visibilityOf(next(driver)));
		 * 
		 * next(driver).click();
		 * 
		 *
		 */

		if (selectTextbookTab(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + selectTextbookTab(driver).getText()); // Select TextBooks Tab is
																							// available while clicking
																							// on next button
		} else {
			logger.pass("Element is missing");
		}

		mediumdropdown(driver).click(); // Medium
		logger.pass("User click on medium dropdown");
		hindi(driver).click();
		logger.pass("User click on medium hindi");

		gradedropdown(driver).click();
		logger.pass("User click on grade dropdown");
		class2(driver).click();
		logger.pass("User click on class2");

		subjectdropdown(driver).click();
		logger.pass("User click on subject dropdown");
		hindisub(driver).click();
		logger.pass("User click on hindi subject");

		publishProject(driver).click();
		Screenshot.captureScreenshot(driver, "Pop Up Message");

		reset(driver).click();

		mediumdropdown(driver).click();
		logger.pass("User click on medium dropdown");
		englishMedium(driver).click();
		logger.pass("User click on medium hindi");

		gradedropdown(driver).click();
		logger.pass("User click on grade dropdown");
		class6(driver).click();
		logger.pass("User click on class2");

		subjectdropdown(driver).click();
		logger.pass("User click on subject dropdown");
		englishSub(driver).click();
		logger.pass("User click on hindi subject");

		applybutton(driver).click();

		// driver.navigate().refresh();

		// WebDriverWait w = new WebDriverWait(driver, 30);
		// w.until(ExpectedConditions.visibilityOf(textbookCheckbox(driver)));

		Thread.sleep(1000);

		textbookCheckbox(driver).click();

		// textbookClose(driver).click();

		if (textbookSelect(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + textbookSelect(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

		publishProject(driver).click();

		// toastMessage(driver).getAttribute(contents);
		// element.getAttribute(contents);

		// publishProjectYes(driver).click();
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(
						By.xpath("//button[@class='sb-btn sb-btn-normal sb-btn-primary'][contains(text(),'Yes')]")))
				.click();

		/*
		 * WebElement element = driver .findElement(By.
		 * xpath("//div[@class='iziToast-wrapper iziToast-wrapper-topCenter']")); String
		 * contents = (String) ((JavascriptExecutor)
		 * driver).executeScript("return arguments[0].innerHTML;", element);
		 * //System.out.println(element.getAttribute(contents));
		 * System.out.println(element.getText());
		 */
		try {
			Thread.sleep(1000);
			if (driver.findElement(By.xpath("//div[@class='iziToast-wrapper iziToast-wrapper-topCenter']"))
					.isDisplayed()) {
				System.out.println("inside if");
				System.out.println("Message >> "
						+ driver.findElement(By.xpath("//div[@class='iziToast-wrapper iziToast-wrapper-topCenter']"))
								.getText());
			}
		} catch (Exception e) {
			System.out.println("inside else");
			System.out.println(e.getMessage());
		}
	}

	/*
	 * 
	 * Method for project details page
	 * 
	 */

	public void projectDetails() throws Exception {

		openBtn(driver).click();

		if (textbooksLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + textbooksLabel(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

		if (nominationsLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + nominationsLabel(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

		if (usersLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + usersLabel(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

		if (contributionDashboardLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + contributionDashboardLabel(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

		if (reportsLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + reportsLabel(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

		if (contentTypesDetailsPageLabel(driver).isDisplayed()) {
			logger.pass("Element displayed is :" + contentTypesDetailsPageLabel(driver).getText());
		} else {
			logger.pass("Element is missing");
		}

	}

}
