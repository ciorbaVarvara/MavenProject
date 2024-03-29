package MMMD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eligibilities_Validation extends AbstractComponents {

	public Eligibilities_Validation(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h3[contains(text(),\"Eligibility\")]")
	WebElement eligibilityH;

	// General Requirements (8 and 9 with companyID) :
	By nrc = By.xpath("//*[contains(text(),\"NRC\")]");
	@FindBy(xpath = "//tr[@role=\"row\"]//td[contains(@aria-label,\"NRC\")]")
	WebElement nrc1;

	By localResidence = By.xpath("//*[contains(text(),\"Local Residence\")]");
	@FindBy(xpath = "//*[contains(text(),\"Local Residence\")]")
	WebElement localResidence1;

	By criminalHistory = By.xpath("//*[contains(text(),\"Criminal History\")]");
	@FindBy(xpath = "//*[contains(text(),\"Criminal History\")]")
	WebElement criminalHistory1;

	By currentAndPrevioslyLicences = By.xpath("//*[contains(text(),\"Current\")]");
	@FindBy(xpath = "//*[contains(text(),\"Current\")]")
	WebElement currentAndPrevioslyLicences1;

	By taxClearanceC = By.xpath("//*[contains(text(),\"Tax Clearance Certificate\")]");
	@FindBy(xpath = "//*[contains(text(),\"Tax Clearance Certificate\")]")
	WebElement taxClearanceC1;

	By landOwnership = By.xpath("//*[contains(text(),\"Land Ownership\")]");
	@FindBy(xpath = "//*[contains(text(),\"Land Ownership\")]")
	WebElement landOwnership1;

	By proposalsForEmployment = By.xpath("//*[contains(text(),\"Proposals for Employment\")]");
	@FindBy(xpath = "//*[contains(text(),\"Proposals for Employment\")]")
	WebElement proposalsForEmployment1;

	By proposalsForPromotion = By.xpath("//*[contains(text(),\"Proposals for Promotion\")]");
	@FindBy(xpath = "//*[contains(text(),\"Proposals for Promotion\")]")
	WebElement proposalsForPromotion1;

	By organization = By.xpath("//*[contains(text(),\"Certificate of Incorporation\")]");
	@FindBy(xpath = "//*[contains(text(),\"Certificate of Incorporation\")]")
	WebElement organization1;

	// Mining, Artisanal (2)
	By programmeOfIntended = By.xpath("//*[contains(text(),\"Programme of intended\")]");
	By envCommitmentPlan = By.xpath("//*[contains(text(),\"Environmental\")]");

	// Mining, Large Scale (6)
	By comprehensiveStatement = By.xpath("//*[contains(text(),\"A comprehensive statement\")]");
	By feasibilityStudy = By.xpath("//*[contains(text(),\"Feasibility Study for Mining Operations\")]");
	By approvedEnvImpact = By.xpath("//*[contains(text(),\"Approved Environmental Impact Statement\")]");
	By detailsOfExpected = By.xpath("//*[contains(text(),\"Details of Expected\")]");
	By planOfProposed = By.xpath("//*[contains(text(),\"Plan of Proposed\")]");
	// Mineral=Gemstone
	By gemstones = By.xpath("//*[contains(text(),\"gemstone\")]");

	// Mining, Small Scale (4)
	By relevantProspecting = By.xpath("//*[contains(text(),\"Relevant prospecting permit and prospecting report\")]");
	By miningOperations = By.xpath("//*[contains(text(),\"Proposed programme of mining operations\")]");
	By descriptionOfMineral = By.xpath("//*[contains(text(),\"Description of the mineral deposit\")]");
	By projectBrief = By.xpath("//*[contains(text(),\"Approved Environmental Project Brief\")]");

	// Exploration, Small and Large Scale (3)
	By proposedExplorationOperations = By
			.xpath("//*[contains(text(),\"Proposed Programme of Exploration Operations\")]");
	By commitmentPlan = By.xpath("//*[contains(text(),\"Environmental Commitment Plan\")]");
	By proofConsent = By.xpath("//*[contains(text(),\"Proof of consent from appropriate\")]");

	// Mineral Processing (6)
	By descriptionPlanDev = By.xpath("//*[contains(text(),\"Description and Plan of Surrounding Developments\")]");
	@FindBy(xpath = "//*[contains(text(),\"Description and Plan of Surrounding Developments\")]")
	WebElement descriptionPlanDev1;

	By feasibilityStudyFor = By.xpath("//*[contains(text(),\"Feasibility Study for Processing Operations\")]");
	@FindBy(xpath = "//*[contains(text(),\"Feasibility Study for Processing Operations\")]")
	WebElement feasibilityStudyFor1;

	By managementPlan = By.xpath("//*[contains(text(),\"Approved Environmental management plan\")]");
	@FindBy(xpath = "//*[contains(text(),\"Approved Environmental management plan\")]")
	WebElement managementPlan1;

	By expectedInfrasctructure = By.xpath("//*[contains(text(),\"Details of expected infrastructure\")]");
	@FindBy(xpath = "//*[contains(text(),\"Details of expected infrastructure\")]")
	WebElement expectedInfrasctructure1;

	By writtenConsent = By.xpath("//*[contains(text(),\"Written consent of legal occupier of land\")]");
	@FindBy(xpath = "//*[contains(text(),\"Written consent of legal occupier of land\")]")
	WebElement writtenConsent1;

	By writtenConsentFromMiningRights = By
			.xpath("//*[contains(text(),\"Written consent from existing Mining Rights holder\")]");
	@FindBy(xpath = "//*[contains(text(),\"Written consent from existing Mining Rights holder\")]")
	WebElement writtenConsentFromMiningRights1;

	// Radioactive Minerals (9)
	By planAndDescriptionR = By.xpath("//*[contains(text(),\"Plan and description of mine\")]");
	By copyOfLicenceR = By.xpath("//*[contains(text(),\"Copy of licence issued under\")]");
	By programmeToEducateR = By.xpath("//*[contains(text(),\"Programme to educate persons\")]");
	By programmeToAssist = By.xpath("//*[contains(text(),\"Programme to assist authorities outside\")]");
	By programmeForSelectingR = By.xpath("//*[contains(text(),\"Proposed programme for selecting,\")]");
	By programmeForWorkersR = By.xpath("//*[contains(text(),\"Proposed training programme\")]");
	By securityMeasuresR = By.xpath("//*[contains(text(),\"Proposed security measures during mining\")]");
	By storageTransporationMarketingR = By.xpath("//*[contains(text(),\"Storage, transportation and marketing\")]");
	By ventilationR = By.xpath("//*[contains(text(),\"Proposed ventilation and dust control\")]");

	// "Non-Radioactive",
	// "Radioactive",
	// "Radioactive and Non-Radioactive"};

	@FindBy(xpath = "//a[@class=\"e-icons e-focus e-dtdiagonaldown e-icon-gdownarrow\"]")
	WebElement closeRow;

	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[1]")
	WebElement openRow1;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[2]")
	WebElement openRow2;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[3]")
	WebElement openRow3;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[4]")
	WebElement openRow4;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[5]")
	WebElement openRow5;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[6]")
	WebElement openRow6;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[7]")
	WebElement openRow7;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[8]")
	WebElement openRow8;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[9]")
	WebElement openRow9;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[10]")
	WebElement openRow10;
	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[11]")
	WebElement openRow11;

	// writtenconsent
	@FindBy(xpath = "(//a[@class=\"e-icons e-focus e-dtdiagonalright e-icon-grightarrow\"])")
	WebElement openRow13;

	@FindBy(xpath = "(//a[@class=\"e-icons e-dtdiagonalright e-icon-grightarrow\"])[12]")
	WebElement openRow12;

	@FindBy(xpath = "(//input[@type=\"file\"])[1]")
	WebElement uploadFile1;
	@FindBy(xpath = "(//input[@type=\"file\"])[2]")
	WebElement uploadFile2;
	@FindBy(xpath = "(//input[@type=\"file\"])[3]")
	WebElement uploadFile3;
	@FindBy(xpath = "(//input[@type=\"file\"])[4]")
	WebElement uploadFile4;
	@FindBy(xpath = "(//input[@type=\"file\"])[5]")
	WebElement uploadFile5;
	@FindBy(xpath = "(//input[@type=\"file\"])[6]")
	WebElement uploadFile6;
	@FindBy(xpath = "(//input[@type=\"file\"])[7]")
	WebElement uploadFile7;
	@FindBy(xpath = "(//input[@type=\"file\"])[8]")
	WebElement uploadFile8;
	@FindBy(xpath = "(//input[@type=\"file\"])[9]")
	WebElement uploadFile9;
	@FindBy(xpath = "(//input[@type=\"file\"])[10]")
	WebElement uploadFile10;
	@FindBy(xpath = "(//input[@type=\"file\"])[11]")
	WebElement uploadFile11;
	@FindBy(xpath = "(//input[@type=\"file\"])[12]")
	WebElement uploadFile12;
	@FindBy(xpath = "(//input[@type=\"file\"])[13]")
	WebElement uploadFile13;
	@FindBy(xpath = "(//input[@type=\"file\"])[14]")
	WebElement uploadFile14;

    @FindBy(xpath="//button[@class=\"btn btn-outline-primary border-0 w-100\"]")
    WebElement cancelAppplicationBtn;
    
    public void eligibilityVerification(String serviceCateogy, String customerType, String scaleOfOperation,
			String typeOfMinerals) {

		wait(eligibilityH);

//INDIVDUAL:

		if (serviceCateogy == "Mineral Processing Licence" & customerType == "Individual" & scaleOfOperation == null
				& typeOfMinerals == null) {
			// general reqs:
			// JavascriptExecutor js = (JavascriptExecutor)driver;

			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mineral Processing (6) */
			trying(descriptionPlanDev, "Warning: Description and Plan of Surrounding Developments is missing");
			trying(feasibilityStudyFor, "Warning: Feasibility Study for Processing Operations is missing");
			trying(managementPlan, "Warning: Approved Environmental management plan is missing");
			trying(expectedInfrasctructure, "Warning: Details of Expected Infrastructure Requirements is missing");
			trying(writtenConsent, "Warning: Written consent of legal occupier of land is missing");
			trying(writtenConsentFromMiningRights,
					"Warning: Written consent from existing Mining Rights holder is missing");

			System.out.println("ELigibility Requirements have been verified (14)");

		}

//RADIOACTIVE:

		if (serviceCateogy == "Exploration Licence" & customerType == "Individual"
				& (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)"
						|| scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)")
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Exploration, Small Scale (4)
			trying(proposedExplorationOperations, "Warning: Proposed Programme of Exploration Operations");
			trying(commitmentPlan, "Warning: Environmental Commitment Plan");
			trying(proofConsent, "Warning: Proof of consent from appropriate");
			// for radioactive minerals:
		/*	trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing"); */

			System.out.println("ELigibility Requirements have been verified");
		}

		if (serviceCateogy == "Mining Licence" & customerType == "Individual"
				& scaleOfOperation == "Small Scale (9.99 - 399.6 ha)"
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Small Scale (4)
			trying(relevantProspecting, "Warning: Relevant Prospecting Permit");
			trying(miningOperations, "Warning: Proposed programme of mining operations");
			trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
			trying(projectBrief, "Warning: Approved Environmental Project Brief");
			// for radioactive minerals:
			/*trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");*/

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Individual"
				& scaleOfOperation == "Artisanal (not exceeding 9.98 ha)"
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Artisanal (2)
			trying(programmeOfIntended, "Warning: Programme Of Intended is missing");
			trying(envCommitmentPlan, "Warning: Environmental Commitment Plan is missing");
			// for radioactive minerals:
			/*trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");*/

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Individual"
				& scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)"
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Large Scale (5)
			trying(comprehensiveStatement, "Warning: Comprehensive Statement is missing");
			trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
			trying(approvedEnvImpact, "Warning: Approved Environmental Impact Statement");
			trying(detailsOfExpected, "Warning: Details of Expected");
			trying(planOfProposed, "Warning: Plan of Proposed");
			// for radioactive minerals:
			trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");

			System.out.println("ELigibility Requirements have been verified");
		}

//NON-RADIOACTIVE:

		if (serviceCateogy == "Exploration Licence" & customerType == "Individual"
				& (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)"
						|| scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)")
				& typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Exploration, Small Scale (4)
			trying(proposedExplorationOperations, "Warning: Proposed programme of exploration operations");
			trying(commitmentPlan, "Warning: Environmental Commitment Plan");
			trying(proofConsent, "Warning: Proof of consent from appropriate");

			System.out.println("ELigibility Requirements have been verified");
		}

		if (serviceCateogy == "Mining Licence" & customerType == "Individual"
				& scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" & typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Small Scale (4)
			trying(relevantProspecting, "Warning: Relevant Prospecting Permit");
			trying(miningOperations, "Warning: Proposed programme of mining operations");
			trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
			trying(projectBrief, "Warning: Approved Environmental Project Brief");

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Individual"
				& scaleOfOperation == "Artisanal (not exceeding 9.98 ha)" & typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Artisanal (2)
			trying(programmeOfIntended, "Warning: Programme Of Intended is missing");
			trying(envCommitmentPlan, "Warning: Environmental Commitment Plan is missing");

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Individual"
				& scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)" & typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Large Scale (5)
			trying(comprehensiveStatement, "Warning: Comprehensive Statement is missing");
			trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
			trying(approvedEnvImpact, "Warning: Approved Environmental Impact Statement");
			trying(detailsOfExpected, "Warning: Details of Expected");
			trying(planOfProposed, "Warning: Plan of Proposed");

			System.out.println("ELigibility Requirements have been verified");
		}

//ORGANIZATION

		if (serviceCateogy == "Mineral Processing Licence" & customerType == "Organization" & scaleOfOperation == null
				& typeOfMinerals == null) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");

			// Mineral Processing (6)
			trying(descriptionPlanDev, "Warning: Description and Plan of Surrounding Developments is missing");
			trying(feasibilityStudyFor, "Warning: Feasibility Study for Processing Operations is missing");
			trying(managementPlan, "Warning: Approved Environmental management plan is missing");
			trying(expectedInfrasctructure, "Warning: Details of Expected Infrastructure Requirements is missing");
			trying(writtenConsent, "Warning: Written consent of legal occupier of land is missing");
			trying(writtenConsentFromMiningRights,
					"Warning: Written consent from existing Mining Rights holder is missing");

			System.out.println("ELigibility Requirements have been verified (15)");

		}

//RADIOACTIVE:

		if (serviceCateogy == "Exploration Licence" & customerType == "Organization"
				& (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)"
						|| scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)")
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			// Exploration, Small Scale (4)
			trying(proposedExplorationOperations, "Warning: Proposed programme of exploration operations");
			trying(commitmentPlan, "Warning: Environmental Commitment Plan");
			trying(proofConsent, "Warning: Proof of consent from appropriate");
			// for radioactive minerals:
			/*trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");*/

			System.out.println("ELigibility Requirements have been verified");
		}

		if (serviceCateogy == "Mining Licence" & customerType == "Organization"
				& scaleOfOperation == "Small Scale (9.99 - 399.6 ha)"
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Small Scale (4)
			trying(relevantProspecting, "Warning: Relevant Prospecting Permit");
			trying(miningOperations, "Warning: Proposed programme of mining operations");
			trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
			trying(projectBrief, "Warning: Approved Environmental Project Brief");
			// for radioactive minerals:
		/*	trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");*/

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Organization"
				& scaleOfOperation == "Artisanal (not exceeding 9.98 ha)"
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Artisanal (2)
			trying(programmeOfIntended, "Warning: Programme Of Intended is missing");
			trying(envCommitmentPlan, "Warning: Environmental Commitment Plan is missing");
			// for radioactive minerals:
		/*	trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");*/

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Organization"
				& scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)"
				& ((typeOfMinerals == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Large Scale (5)
			trying(comprehensiveStatement, "Warning: Comprehensive Statement is missing");
			trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
			trying(approvedEnvImpact, "Warning: Approved Environmental Impact Statement");
			trying(detailsOfExpected, "Warning: Details of Expected");
			trying(planOfProposed, "Warning: Plan of Proposed");
			// for radioactive minerals:
			trying(planAndDescriptionR, "Warning: Plan and description of mine is missing");
			trying(copyOfLicenceR, "Warning: Copy of licence issued under is missing");
			trying(programmeToEducateR, "Warning: Programme to educate persons is missing");
			trying(programmeToAssist, "Warning: Programme to assist authorities outside is missing");
			trying(programmeForSelectingR, "Warning: Proposed programme for selecting is missing");
			trying(programmeForWorkersR, "Warning: Proposed training programme is missing");
			trying(securityMeasuresR, "Warning: Proposed security measures during mining is missing");
			trying(storageTransporationMarketingR, "Warning: Storage, transportation and marketing is missing");
			trying(ventilationR, "Warning: Proposed ventilation and dust control is missing");

			System.out.println("ELigibility Requirements have been verified");
		}

//NON-RADIOACTIVE:

		if (serviceCateogy == "Exploration Licence" & customerType == "Organization"
				& (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)"
						|| scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)")
				& typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");

			// Exploration, Small Scale (4)
			trying(proposedExplorationOperations, "Warning: Proposed programme of exploration operations");
			trying(commitmentPlan, "Warning: Environmental Commitment Plan");
			trying(proofConsent, "Warning: Proof of consent from appropriate");

			System.out.println("ELigibility Requirements have been verified");
		}

		if (serviceCateogy == "Mining Licence" & customerType == "Organization"
				& scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" & typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Small Scale (4)
			trying(relevantProspecting, "Warning: Relevant Prospecting Permit");
			trying(miningOperations, "Warning: Proposed programme of mining operations");
			trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
			trying(projectBrief, "Warning: Approved Environmental Project Brief");

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Organization"
				& scaleOfOperation == "Artisanal (not exceeding 9.98 ha)" & typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Artisanal (2)
			trying(programmeOfIntended, "Warning: Programme Of Intended is missing");
			trying(envCommitmentPlan, "Warning: Environmental Commitment Plan is missing");

			System.out.println("ELigibility Requirements have been verified");
		}
		if (serviceCateogy == "Mining Licence" & customerType == "Organization"
				& scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)" & typeOfMinerals == "Non-Radioactive") {
			// general reqs:
			trying(nrc, "Warning: NRC is missing");
			trying(organization, "Warning: Certificate of Incorporation is missing");
			trying(localResidence, "Warning: Local Residence is missing");
			trying(criminalHistory, "Warning: Criminal History is missing");
			trying(currentAndPrevioslyLicences, "Warning: Current And Previosly Licences is missing");
			trying(taxClearanceC, "Warning: Tax Clearance is missing");
			trying(landOwnership, "Warning: Tax Clearance is missing");
			trying(proposalsForEmployment, "Warning: Proposals For Employment is missing");
			trying(proposalsForPromotion, "Warning: Proposals For Promotion is missing");
			// Mining, Large Scale (5)
			trying(comprehensiveStatement, "Warning: Comprehensive Statement is missing");
			trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
			trying(approvedEnvImpact, "Warning: Approved Environmental Impact Statement");
			trying(detailsOfExpected, "Warning: Details of Expected");
			trying(planOfProposed, "Warning: Plan of Proposed");

			System.out.println("ELigibility Requirements have been verified");
		}
		
		//wait(cancelAppplicationBtn);
		//cancelAppplicationBtn.click();
		
		//button[@class="btn btn-outline-primary border-0 w-100"]

	}

	public void eligibilityVerificationUploadFiles(String serviceCateogy, String customerType, String scaleOfOperation,
			String typeOfMinerals) {

		wait(eligibilityH);

//INDIVIDUAL:

		if (serviceCateogy == "Mineral Processing Licence" & customerType == "Individual" & scaleOfOperation == null
				& typeOfMinerals == null) {
			// general reqs:
			// JavascriptExecutor js = (JavascriptExecutor)driver;

			uploadingFiles(nrc1, "Warning: NRC is missing", openRow1, closeRow, uploadFile1);
			uploadingFiles(localResidence1, "Warning: Local Residence is missing", openRow1, closeRow, uploadFile2);
			uploadingFiles(criminalHistory1, "Warning: Criminal History is missing", openRow2, closeRow, uploadFile3);
			uploadingFiles(currentAndPrevioslyLicences1, "Warning: Current And Previosly Licences is missing", openRow3,
					closeRow, uploadFile4);
			uploadingFiles(taxClearanceC1, "Warning: Tax Clearance is missing", openRow4, closeRow, uploadFile5);
			uploadingFiles(landOwnership1, "Warning: Tax Clearance is missing", openRow5, closeRow, uploadFile6);
			uploadingFiles(proposalsForEmployment1, "Warning: Proposals For Employment is missing", openRow6, closeRow,
					uploadFile7);
			uploadingFiles(proposalsForPromotion1, "Warning: Proposals For Promotion is missing", openRow7, closeRow,
					uploadFile8);

			uploadingFiles(descriptionPlanDev1, "Warning: Description and Plan of Surrounding Developments is missing",
					openRow8, closeRow, uploadFile9);
			uploadingFiles(feasibilityStudyFor1, "Warning: Feasibility Study for Processing Operations is missing",
					openRow9, closeRow, uploadFile10);
			uploadingFiles(managementPlan1, "Warning: Approved Environmental management plan is missing", openRow10,
					closeRow, uploadFile11);
//uploadingFiles (expectedInfrasctructure1, "Warning: Details of Expected Infrastructure Requirements is missing", openRow11, closeRow, uploadFile12);
			uploadingFiles(writtenConsent1, "Warning: Written consent of legal occupier of land is missing", openRow11,
					closeRow, uploadFile12);
			uploadingFiles(writtenConsentFromMiningRights1,
					"Warning: Written consent from existing Mining Rights holder is missing", openRow12, closeRow,
					uploadFile13);

			/*
			 * trying(localResidence, "Warning: Local Residence is missing");
			 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
			 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
			 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
			 * trying(landOwnership,"Warning: Tax Clearance is missing");
			 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
			 * );
			 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
			 * //Mineral Processing (6)
			 */
			/*
			 * trying(descriptionPlanDev,
			 * "Warning: Description and Plan of Surrounding Developments is missing");
			 * trying(feasibilityStudyFor,
			 * "Warning: Feasibility Study for Processing Operations is missing"); -
			 * trying(managementPlan,
			 * "Warning: Approved Environmental management plan is missing"); -
			 * trying(expectedInfrasctructure,
			 * "Warning: Details of Expected Infrastructure Requirements is missing"); -
			 * trying(writtenConsent,
			 * "Warning: Written consent of legal occupier of land is missing"); -
			 * trying(writtenConsentFromMiningRights,
			 * "Warning: Written consent from existing Mining Rights holder is missing");
			 * 
			 * System.out.println("ELigibility Requirements have been verified (14)");
			 */
		}

//RADIOACTIVE:
		/*
		 * if (serviceCateogy == "Exploration Licence" & customerType == "Individual" &
		 * (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" || scaleOfOperation ==
		 * "Large Scale (399.7 - 24,925.05 ha)") & ((typeOfMinerals == "Radioactive" ||
		 * typeOfMinerals == "Radioactive and Non-Radioactive"))) { //general reqs:
		 * trying(nrc, "Warning: NRC is missing"); trying(localResidence,
		 * "Warning: Local Residence is missing"); trying(criminalHistory,
		 * "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Exploration, Small Scale (4) trying(proposedExplorationOperations,
		 * "Warning: Proposed programme of exploration operations");
		 * trying(commitmentPlan, "Warning: Environmental Commitment Plan");
		 * trying(proofConsent, "Warning: Proof of consent from appropriate"); //for
		 * radioactive minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * if (serviceCateogy == "Mining Licence" & customerType == "Individual" &
		 * scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" & ((typeOfMinerals ==
		 * "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive")) ) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Small Scale (4) trying(relevantProspecting,
		 * "Warning: Relevant Prospecting Permit"); trying(miningOperations,
		 * "Warning: Proposed programme of mining operations");
		 * trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
		 * trying(projectBrief, "Warning: Approved Environmental Project Brief"); //for
		 * radioactive minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Individual" &
		 * scaleOfOperation == "Artisanal (not exceeding 9.98 ha)" & ((typeOfMinerals ==
		 * "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Artisanal (2)
		 * trying(programmeOfIntended,"Warning: Programme Of Intended is missing");
		 * trying(envCommitmentPlan,"Warning: Environmental Commitment Plan is missing"
		 * ); //for radioactive minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Individual" &
		 * scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)" & ((typeOfMinerals
		 * == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive")) ) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Large Scale (5) trying(proposedProgramme,
		 * "Warning: Proposed Programme of exploration is missing");
		 * trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
		 * trying(approvedEnvImpact,
		 * "Warning: Approved Environmental Impact Statement");
		 * trying(detailsOfExpected, "Warning: Details of Expected");
		 * trying(planOfProposed, "Warning: Plan of Proposed"); //for radioactive
		 * minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * //NON-RADIOACTIVE:
		 * 
		 * if (serviceCateogy == "Exploration Licence" & customerType == "Individual" &
		 * (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" || scaleOfOperation ==
		 * "Large Scale (399.7 - 24,925.05 ha)") & typeOfMinerals == "Non-Radioactive")
		 * { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Exploration, Small Scale (4) trying(proposedExplorationOperations,
		 * "Warning: Proposed programme of exploration operations");
		 * trying(commitmentPlan, "Warning: Environmental Commitment Plan");
		 * trying(proofConsent, "Warning: Proof of consent from appropriate");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * 
		 * if (serviceCateogy == "Mining Licence" & customerType == "Individual" &
		 * scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" & typeOfMinerals ==
		 * "Non-Radioactive" ) { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Small Scale (4) trying(relevantProspecting,
		 * "Warning: Relevant Prospecting Permit"); trying(miningOperations,
		 * "Warning: Proposed programme of mining operations");
		 * trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
		 * trying(projectBrief, "Warning: Approved Environmental Project Brief");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Individual" &
		 * scaleOfOperation == "Artisanal (not exceeding 9.98 ha)" & typeOfMinerals ==
		 * "Non-Radioactive") { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Artisanal (2)
		 * trying(programmeOfIntended,"Warning: Programme Of Intended is missing");
		 * trying(envCommitmentPlan,"Warning: Environmental Commitment Plan is missing"
		 * );
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Individual" &
		 * scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)" & typeOfMinerals ==
		 * "Non-Radioactive" ) { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Large Scale (5) trying(proposedProgramme,
		 * "Warning: Proposed Programme of exploration is missing");
		 * trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
		 * trying(approvedEnvImpact,
		 * "Warning: Approved Environmental Impact Statement");
		 * trying(detailsOfExpected, "Warning: Details of Expected");
		 * trying(planOfProposed, "Warning: Plan of Proposed");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * 
		 * //ORGANIZATION
		 * 
		 * if (serviceCateogy == "Mineral Processing Licence" & customerType ==
		 * "Organization" & scaleOfOperation == null & typeOfMinerals == null ) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing"); trying(organization,
		 * "Warning: Certificate of Incorporation is missing"); trying(localResidence,
		 * "Warning: Local Residence is missing"); trying(criminalHistory,
		 * "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * 
		 * //Mineral Processing (6) trying(descriptionPlanDev,
		 * "Warning: Description and Plan of Surrounding Developments is missing");
		 * trying(feasibilityStudyFor,
		 * "Warning: Feasibility Study for Processing Operations is missing");
		 * trying(managementPlan,
		 * "Warning: Approved Environmental management plan is missing");
		 * trying(expectedInfrasctructure,
		 * "Warning: Details of Expected Infrastructure Requirements is missing");
		 * trying(writtenConsent,
		 * "Warning: Written consent of legal occupier of land is missing");
		 * trying(writtenConsentFromMiningRights,
		 * "Warning: Written consent from existing Mining Rights holder is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified (15)");
		 * 
		 * }
		 * 
		 * //RADIOACTIVE:
		 * 
		 * if (serviceCateogy == "Exploration Licence" & customerType == "Organization"
		 * & (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" || scaleOfOperation ==
		 * "Large Scale (399.7 - 24,925.05 ha)") & ((typeOfMinerals == "Radioactive" ||
		 * typeOfMinerals == "Radioactive and Non-Radioactive"))) { //general reqs:
		 * trying(nrc, "Warning: NRC is missing"); trying(localResidence,
		 * "Warning: Local Residence is missing"); trying(criminalHistory,
		 * "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * trying(organization, "Warning: Certificate of Incorporation is missing");
		 * //Exploration, Small Scale (4) trying(proposedExplorationOperations,
		 * "Warning: Proposed programme of exploration operations");
		 * trying(commitmentPlan, "Warning: Environmental Commitment Plan");
		 * trying(proofConsent, "Warning: Proof of consent from appropriate"); //for
		 * radioactive minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * if (serviceCateogy == "Mining Licence" & customerType == "Organization" &
		 * scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" & ((typeOfMinerals ==
		 * "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive")) ) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing"); trying(organization,
		 * "Warning: Certificate of Incorporation is missing"); trying(localResidence,
		 * "Warning: Local Residence is missing"); trying(criminalHistory,
		 * "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Small Scale (4) trying(relevantProspecting,
		 * "Warning: Relevant Prospecting Permit"); trying(miningOperations,
		 * "Warning: Proposed programme of mining operations");
		 * trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
		 * trying(projectBrief, "Warning: Approved Environmental Project Brief"); //for
		 * radioactive minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Organization" &
		 * scaleOfOperation == "Artisanal (not exceeding 9.98 ha)" & ((typeOfMinerals ==
		 * "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive"))) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing"); trying(organization,
		 * "Warning: Certificate of Incorporation is missing"); trying(localResidence,
		 * "Warning: Local Residence is missing"); trying(criminalHistory,
		 * "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Artisanal (2)
		 * trying(programmeOfIntended,"Warning: Programme Of Intended is missing");
		 * trying(envCommitmentPlan,"Warning: Environmental Commitment Plan is missing"
		 * ); //for radioactive minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Organization" &
		 * scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)" & ((typeOfMinerals
		 * == "Radioactive" || typeOfMinerals == "Radioactive and Non-Radioactive")) ) {
		 * //general reqs: trying(nrc, "Warning: NRC is missing"); trying(organization,
		 * "Warning: Certificate of Incorporation is missing"); trying(localResidence,
		 * "Warning: Local Residence is missing"); trying(criminalHistory,
		 * "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Large Scale (5) trying(proposedProgramme,
		 * "Warning: Proposed Programme of exploration is missing");
		 * trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
		 * trying(approvedEnvImpact,
		 * "Warning: Approved Environmental Impact Statement");
		 * trying(detailsOfExpected, "Warning: Details of Expected");
		 * trying(planOfProposed, "Warning: Plan of Proposed"); //for radioactive
		 * minerals: trying(planAndDescriptionR,
		 * "Warning: Plan and description of mine is missing"); trying(copyOfLicenceR,
		 * "Warning: Copy of licence issued under is missing");
		 * trying(programmeToEducateR,
		 * "Warning: Programme to educate persons is missing");
		 * trying(programmeToAssist,
		 * "Warning: Programme to assist authorities outside is missing");
		 * trying(programmeForSelectingR,
		 * "Warning: Proposed programme for selecting is missing");
		 * trying(programmeForWorkersR,
		 * "Warning: Proposed training programme is missing"); trying(securityMeasuresR,
		 * "Warning: Proposed security measures during mining is missing");
		 * trying(storageTransporationMarketingR,
		 * "Warning: Storage, transportation and marketing is missing");
		 * trying(ventilationR,
		 * "Warning: Proposed ventilation and dust control is missing");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * //NON-RADIOACTIVE:
		 * 
		 * if (serviceCateogy == "Exploration Licence" & customerType == "Organization"
		 * & (scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" || scaleOfOperation ==
		 * "Large Scale (399.7 - 24,925.05 ha)") & typeOfMinerals == "Non-Radioactive")
		 * { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(organization, "Warning: Certificate of Incorporation is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * 
		 * //Exploration, Small Scale (4) trying(proposedExplorationOperations,
		 * "Warning: Proposed programme of exploration operations");
		 * trying(commitmentPlan, "Warning: Environmental Commitment Plan");
		 * trying(proofConsent, "Warning: Proof of consent from appropriate");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 * 
		 * if (serviceCateogy == "Mining Licence" & customerType == "Organization" &
		 * scaleOfOperation == "Small Scale (9.99 - 399.6 ha)" & typeOfMinerals ==
		 * "Non-Radioactive" ) { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(organization, "Warning: Certificate of Incorporation is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Small Scale (4) trying(relevantProspecting,
		 * "Warning: Relevant Prospecting Permit"); trying(miningOperations,
		 * "Warning: Proposed programme of mining operations");
		 * trying(descriptionOfMineral, "Warning: Description of the mineral deposit");
		 * trying(projectBrief, "Warning: Approved Environmental Project Brief");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Organization" &
		 * scaleOfOperation == "Artisanal (not exceeding 9.98 ha)" & typeOfMinerals ==
		 * "Non-Radioactive") { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(organization, "Warning: Certificate of Incorporation is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Artisanal (2)
		 * trying(programmeOfIntended,"Warning: Programme Of Intended is missing");
		 * trying(envCommitmentPlan,"Warning: Environmental Commitment Plan is missing"
		 * );
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); } if
		 * (serviceCateogy == "Mining Licence" & customerType == "Organization" &
		 * scaleOfOperation == "Large Scale (399.7 - 24,925.05 ha)" & typeOfMinerals ==
		 * "Non-Radioactive" ) { //general reqs: trying(nrc, "Warning: NRC is missing");
		 * trying(organization, "Warning: Certificate of Incorporation is missing");
		 * trying(localResidence, "Warning: Local Residence is missing");
		 * trying(criminalHistory, "Warning: Criminal History is missing"); trying(
		 * currentAndPrevioslyLicences,"Warning: Current And Previosly Licences is missing"
		 * ); trying(taxClearanceC,"Warning: Tax Clearance is missing");
		 * trying(landOwnership,"Warning: Tax Clearance is missing");
		 * trying(proposalsForEmployment,"Warning: Proposals For Employment is missing"
		 * );
		 * trying(proposalsForPromotion,"Warning: Proposals For Promotion is missing");
		 * //Mining, Large Scale (5) trying(proposedProgramme,
		 * "Warning: Proposed Programme of exploration is missing");
		 * trying(feasibilityStudy, "Warning: Feasibility Study for Mining Operations");
		 * trying(approvedEnvImpact,
		 * "Warning: Approved Environmental Impact Statement");
		 * trying(detailsOfExpected, "Warning: Details of Expected");
		 * trying(planOfProposed, "Warning: Plan of Proposed");
		 * 
		 * System.out.println("ELigibility Requirements have been verified"); }
		 * 
		 */

	}

}
