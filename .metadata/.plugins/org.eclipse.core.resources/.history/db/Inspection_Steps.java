package MMMD;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inspection_Steps extends AbstractComponents {

	WebDriver driver;

	public Inspection_Steps(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//waiting for 
	@FindBy(xpath = "//div[@class=\"fmNavTree\"]")
	List<WebElement> leftBarDiv;
	@FindBy(xpath = "//div[@class=\"fmForm\"]")
	List<WebElement> filterDiv;
	@FindBy(xpath = "//div[@class=\"tab\"]")
	List<WebElement> tabDiv;
	@FindBy(xpath = "//div[@class=\"gridDataPanel\"]")
	List<WebElement> casesTableDiv;
	@FindBy(xpath = "//div[@class=\"content\"]")
	List<WebElement> contentDiv;

	@FindBy(xpath = "//span[text()=\"Details of Area Applied For\"]")
	WebElement detailsOfAreaAppliedForH;
	@FindBy(xpath = "//span[text()=\"Inspect\"]")
	WebElement inspectH;
	@FindBy(xpath = "//span[text()=\"Conditions\"]")
	WebElement specialCondH;
	@FindBy(xpath = "//span[text()=\"Committee Decision\"]")
	WebElement committeeDecH;
	@FindBy(xpath = "//span[text()=\"FORM\"]")
	WebElement formExecutiveH;
	@FindBy(xpath = "//span[contains(text(),\"Notice Of Action\")]")
	WebElement noticeOfActionH;
	@FindBy(xpath = "//span[text()=\"Preview and Sign\"]")
	WebElement previewAndSignH;
	@FindBy(xpath = "//span[text()=\"PDF Viewer\"]")
	WebElement pdfViewerH;
	@FindBy(xpath = "//span[text()=\"ShowConditions\"]")
	WebElement showConditionsH;
	@FindBy(xpath = "//iframe[@src]")
	WebElement viewGS2Content;

	// Changing role

	@FindBy(css = "i[cmd=\"role\"]")
	WebElement roleBtn;

	@FindBy(xpath = "//*[contains(text(),\"*Case Officer\")]")
	WebElement clickRoleBtn;

	// folders
	@FindBy(xpath = "//a[@n=\"CaseOfficer_ActiveCases\"]")
	WebElement activeCasesFolder_CO;
	@FindBy(xpath = "//a[@n=\"Supervisor_ActiveCases\"]")
	WebElement activeCasesFolder_Supervisor;
	@FindBy(xpath = "//a[@n=\"Committee_Active_Cases\"]")
	WebElement activeCasesFolder_Committee;
	@FindBy(xpath = "//a[@n=\"ExecActiveCases\"]")
	WebElement activeCasesFolder_Executive;

	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	WebElement caseNumberfield;
	@FindBy(xpath = "//a[@cmd=\"OK\"]")
	WebElement searchBtn;

	// select and open case
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[4]")
	WebElement selectCase;
	@FindBy(xpath = "//td[text()=\"In progress\"]")
	WebElement openCase_InProgress;
	@FindBy(xpath = "//td[text()=\"e-Sign\"]")
	WebElement openCase_ESign;

	// case components:
	@FindBy(xpath = "//div[@class=\"mwnd-body\"]")
	WebElement caseBody;
	@FindBy(xpath = "(//div[@class=\"fmForm\"])[2]")
	WebElement caseDiv;
	// case components: tabs:
	@FindBy(xpath = "//span[contains(text(),\"Case Summary\")]")
	WebElement caseSummaryTab;
	@FindBy(xpath = "//span[contains(text(),\"Applications\")]")
	WebElement applicationsTab;
	@FindBy(xpath = "//span[contains(text(),\"Applicant\")]")
	WebElement applicantTab;
	@FindBy(xpath = "//span[contains(text(),\"Eligibility\")]")
	WebElement eligibilityTab;
	@FindBy(xpath = "//span[contains(text(),\"Payments\")]")
	WebElement paymentsTab;
	@FindBy(xpath = "//span[contains(text(),\"Task Monitor\")]")
	WebElement taskMonitorTab;

	@FindBy(xpath = "//a[@cmd=\"next\"]")
	WebElement nextBtn;
	@FindBy(xpath = "//textarea[@class=\"fm\"]")
	WebElement commentsTextArea;
	@FindBy(xpath = "(//input[@value=\"false\"])[1]")
	WebElement selectNoExtraPayment;

	// buttons of decissions
	@FindBy(xpath = "//a[contains(text(),\"Send Next Step\")]")
	WebElement sendNextStepBtn;
	@FindBy(xpath = "(//a[@cmd=\"X\"])[2]")
	WebElement closeCaseBtn;

	// buttons of approval or rejection case
	@FindBy(xpath = "(//div[@class=\"fm-ddl\"])[4]")
	WebElement decisionDropdownList;
	@FindBy(xpath = "//*[contains(text(),\"Approved\")]")
	WebElement selectApproved;
	@FindBy(xpath = "//*[contains(text(),\"Rejected\")]")
	WebElement selectRejected;
	@FindBy(xpath = "//*[contains(text(),\"Deferred\")]")
	WebElement selectDeferred;

	// for committee
	@FindBy(xpath = "(//*[contains(text(),\"Approved\")])[3]")
	WebElement selectApprovedC;

	// test (to delete)
	@FindBy(xpath = "//input[@field=\"CommitteeDecision\"]")
	WebElement x;

	// wait row
	@FindBy(xpath = "//tr[@class=\"row\"]")
	List<WebElement> row;

	public void caseOfficer_step1(String no) throws InterruptedException {

		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

//first step:

		// accessing the actor's folders
		waitForPresenceOfAllElements(leftBarDiv);
		waitForPresenceOfAllElements(contentDiv);

		// wait(roleBtn).click();
		// waitForPresenceOfAllElements
		// wait(clickRoleBtn).click();

		// Thread.sleep(3000);
		waitForElementToBeClickable(activeCasesFolder_CO);
		activeCasesFolder_CO.click();

		// filtering the cases
		waitForPresenceOfAllElements(filterDiv);
		wait(caseNumberfield);
		// waitForElement(driver, caseNumberfield, 60);
		js.executeScript("arguments[0].value='" + no + "'", caseNumberfield);

		waitForPresenceOfAllElements(filterDiv);
		wait(searchBtn);
		searchBtn.click();

		// select and open case
		waitForPresenceOfAllElements(contentDiv);
		// waiting for presence of all elements
		waitForPresenceOfAllElements(casesTableDiv);
		// if ()
		wait(selectCase);
		wait(openCase_InProgress);
		waitForPresenceOfAllElements(row);
		act.moveToElement(openCase_InProgress);
		act.doubleClick(openCase_InProgress).build().perform();

		// going through workflow: case tabs:
		wait(caseBody);
		wait(caseDiv);
		wait(caseSummaryTab);
		caseSummaryTab.click();
		wait(applicationsTab);
		applicationsTab.click();
		wait(applicantTab);
		applicantTab.click();
		wait(eligibilityTab);
		eligibilityTab.click();
		wait(paymentsTab);
		paymentsTab.click();
		wait(taskMonitorTab);
		taskMonitorTab.click();

		wait(nextBtn);
		nextBtn.click();

		// going through workflow: decision's buttons
		wait(caseBody);
		wait(caseDiv);
		wait(sendNextStepBtn);
		// sendNextStepBtn.click();
		act.moveToElement(sendNextStepBtn).build().perform();
		js.executeScript("arguments[0].click();", sendNextStepBtn);

		// going through workflow: leave comments screen
		wait(inspectH);
		wait(caseBody);
		wait(caseDiv);
		wait(commentsTextArea);
		commentsTextArea.clear();
		commentsTextArea.sendKeys("any message");

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		System.out.println("Step 1 is passed");

	}

	public void caseOfficer_step2(String no) {
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// second step
		// accessing the actor's folders
		waitForPresenceOfAllElements(leftBarDiv);
		waitForPresenceOfAllElements(contentDiv);
		wait(activeCasesFolder_CO);
		activeCasesFolder_CO.click();

		// filtering the cases
		waitForPresenceOfAllElements(filterDiv);
		wait(caseNumberfield);
		wait(caseNumberfield);
		// caseNumberfield.sendKeys(no);
		js.executeScript("arguments[0].value='" + no + "'", caseNumberfield);
		wait(searchBtn);
		searchBtn.click();

		// select and open case
		waitForPresenceOfAllElements(contentDiv);
		waitForPresenceOfAllElements(casesTableDiv);
		waitForPresenceOfAllElements(row);
		wait(selectCase);
		wait(openCase_InProgress);
		act.doubleClick(openCase_InProgress).build();
		act.doubleClick(openCase_InProgress).perform();

		// going through workflow: case tabs:
		wait(caseBody);
		wait(caseDiv);
		wait(caseSummaryTab);
		caseSummaryTab.click();
		wait(applicationsTab);
		applicationsTab.click();
		wait(applicantTab);
		applicantTab.click();
		wait(eligibilityTab);
		eligibilityTab.click();
		wait(paymentsTab);
		paymentsTab.click();
		wait(taskMonitorTab);
		taskMonitorTab.click();
		wait(nextBtn);
		nextBtn.click();

		// going through workflow:review Details of Area Applied For Screen:
		wait(caseBody);
		wait(caseDiv);
		wait(detailsOfAreaAppliedForH);
		if (detailsOfAreaAppliedForH.isDisplayed()) {
			System.out.println("Details of Area Applied For Screen is displayed");
			wait(nextBtn);
			js.executeScript("arguments[0].click();", nextBtn);
		} else {
			System.out.println("Details of Area Applied For Screen is not displayed");
			wait(nextBtn);
			js.executeScript("arguments[0].click();", nextBtn);
		}

		// going through workflow: recommended decision:
		wait(caseBody);
		wait(caseDiv);
		wait(inspectH);
		if (inspectH.isDisplayed()) {
			wait(decisionDropdownList);
			System.out.println("Recommended Decision Screen is displayed");
			decisionDropdownList.click();
			wait(selectApproved);
			selectApproved.click();
			wait(nextBtn);
			js.executeScript("arguments[0].click();", nextBtn);
		} else {
			System.out.println("Recommended Decision Screen is not displayed");
			wait(decisionDropdownList);
			decisionDropdownList.click();
			wait(selectApproved);
			selectApproved.click();
			wait(nextBtn);
			js.executeScript("arguments[0].click();", nextBtn);
		}

		// going through workflow: special conditions screen:
		wait(specialCondH);
		if (specialCondH.isDisplayed()) {
			System.out.println("Conditions Screen is displayed");
			wait(caseBody);
			wait(caseDiv);
			wait(nextBtn);
			js.executeScript("arguments[0].click();", nextBtn);
		} else {
			System.out.println("Conditions Screen is not displayed");
			wait(caseBody);
			wait(caseDiv);
			wait(nextBtn);
			js.executeScript("arguments[0].click();", nextBtn);
		}

		// going through workflow: decision's buttons
		wait(caseBody);
		wait(caseDiv);
		wait(sendNextStepBtn);
		sendNextStepBtn.click();
		System.out.println("Step 2 is passed");

	}

	public void supervisor_step3(String no) {
		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// second step
		// accessing the actor's folders
		waitForPresenceOfAllElements(leftBarDiv);
		waitForPresenceOfAllElements(contentDiv);
		wait(activeCasesFolder_Supervisor);
		activeCasesFolder_Supervisor.click();

		// filtering the cases
		waitForPresenceOfAllElements(filterDiv);
		wait(caseNumberfield);
		wait(caseNumberfield);
		js.executeScript("arguments[0].value='" + no + "'", caseNumberfield);
		// caseNumberfield.sendKeys(no);
		wait(searchBtn);
		searchBtn.click();

		// select and open case
		waitForPresenceOfAllElements(contentDiv);
		waitForPresenceOfAllElements(casesTableDiv);
		// waitForElementToBeClickable(selectCase);

		// wait+++
		waitForPresenceOfAllElements(row);
		act.moveToElement(wait(openCase_InProgress)).build().perform();
		act.doubleClick(wait(openCase_InProgress)).build().perform();

		// going through workflow: case tabs:
		wait(caseBody);
		wait(caseDiv);
		wait(caseSummaryTab);
		caseSummaryTab.click();
		wait(applicationsTab);
		applicationsTab.click();
		wait(applicantTab);
		applicantTab.click();
		wait(eligibilityTab);
		eligibilityTab.click();
		wait(paymentsTab);
		paymentsTab.click();
		wait(taskMonitorTab);
		taskMonitorTab.click();

		wait(nextBtn);
		nextBtn.click();

		// going through workflow: special conditions screen:
		wait(specialCondH);
		wait(caseBody);
		wait(caseDiv);
		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: leave comments screen
		wait(inspectH);
		wait(caseBody);
		wait(caseDiv);
		wait(commentsTextArea);
		commentsTextArea.clear();
		commentsTextArea.sendKeys("any message");

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: decision's buttons
		wait(caseBody);
		wait(caseDiv);
		wait(sendNextStepBtn);
		sendNextStepBtn.click();

		System.out.println("Step 3 is passed");
	}

	public void committee_step4(String no) {

		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// accessing the actor's folders
		waitForPresenceOfAllElements(leftBarDiv);
		waitForPresenceOfAllElements(contentDiv);
		wait(activeCasesFolder_Committee);
		activeCasesFolder_Committee.click();

		// filtering the cases
		waitForPresenceOfAllElements(filterDiv);
		wait(caseNumberfield);
		wait(caseNumberfield);
		// caseNumberfield.sendKeys(no);
		js.executeScript("arguments[0].value='" + no + "'", caseNumberfield);
		wait(searchBtn);
		searchBtn.click();

		// select and open case
		waitForPresenceOfAllElements(contentDiv);
		waitForPresenceOfAllElements(casesTableDiv);
		waitForPresenceOfAllElements(row);
		wait(selectCase);
		wait(openCase_InProgress);
		act.moveToElement(openCase_InProgress);
		act.doubleClick(openCase_InProgress).build().perform();

		// going through workflow: case tabs:
		wait(caseBody);
		wait(caseDiv);
		wait(caseSummaryTab);
		caseSummaryTab.click();
		wait(applicationsTab);
		applicationsTab.click();
		wait(applicantTab);
		applicantTab.click();
		wait(eligibilityTab);
		eligibilityTab.click();
		wait(paymentsTab);
		paymentsTab.click();
		wait(taskMonitorTab);
		taskMonitorTab.click();

		wait(nextBtn);
		nextBtn.click();

		// going through workflow: committee decision:
		wait(committeeDecH);
		wait(caseBody);
		wait(caseDiv);
		wait(decisionDropdownList);
		decisionDropdownList.click();

		wait(selectApprovedC);
		wait(selectApprovedC);
		selectApprovedC.click();

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: decision's buttons
		wait(caseBody);
		wait(caseDiv);
		wait(sendNextStepBtn);
		sendNextStepBtn.click();

		System.out.println("Step 4 is passed");

	}

	public void executive_step5(String no) {

		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// accessing the actor's folders
		waitForPresenceOfAllElements(leftBarDiv);
		waitForPresenceOfAllElements(contentDiv);
		wait(activeCasesFolder_Executive);
		activeCasesFolder_Executive.click();

		// filtering the cases
		waitForPresenceOfAllElements(filterDiv);
		wait(caseNumberfield);
		wait(caseNumberfield);
		// caseNumberfield.sendKeys(no);
		js.executeScript("arguments[0].value='" + no + "'", caseNumberfield);
		wait(searchBtn);
		searchBtn.click();

		// select and open case
		waitForPresenceOfAllElements(contentDiv);
		waitForPresenceOfAllElements(casesTableDiv);
		waitForPresenceOfAllElements(row);
		wait(selectCase);
		wait(openCase_ESign);
		act.moveToElement(openCase_ESign);
		act.doubleClick(openCase_ESign).build().perform();

		// going through workflow: case tabs:
		wait(caseBody);
		wait(caseDiv);
		wait(caseSummaryTab);
		caseSummaryTab.click();
		wait(applicationsTab);
		applicationsTab.click();
		wait(applicantTab);
		applicantTab.click();
		wait(eligibilityTab);
		eligibilityTab.click();
		wait(paymentsTab);
		paymentsTab.click();
		wait(taskMonitorTab);
		taskMonitorTab.click();

		wait(nextBtn);
		nextBtn.click();

		// going through workflow: view committee decision and licence conds:
		wait(formExecutiveH);
		wait(caseBody);
		wait(caseDiv);

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: gs-2 for payment form
		wait(noticeOfActionH);
		wait(caseBody);
		wait(caseDiv);

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: preview and sign gs-2 about the payment
		wait(previewAndSignH);
		wait(viewGS2Content);
		// waitForVisibilityOfElement(caseBody);
		// waitForVisibilityOfElement(caseDiv);

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: view Invoice:
		wait(pdfViewerH);
		wait(viewGS2Content);
		// waitForVisibilityOfElement(caseBody);
		// waitForVisibilityOfElement(caseDiv);

		wait(nextBtn);
		js.executeScript("arguments[0].click();", nextBtn);

		// going through workflow: view conditions about the payment
		wait(showConditionsH);
		wait(caseBody);
		wait(caseDiv);

		wait(closeCaseBtn);
		js.executeScript("arguments[0].click();", closeCaseBtn);

		System.out.println("Step 5 is passed");

	}

}