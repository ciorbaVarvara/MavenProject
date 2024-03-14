package MMMD.Test_Cases.Payment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MMMD.Application_Forms;
import MMMD.Eligibilities_Validation;
import MMMD.GlobalVariables;
import MMMD.Service_Description;
import MMMD.ZamPass_;
import MMMD.ZamPay_;

public class Exploration_Licence extends GlobalVariables {

	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility; 
	public ZamPay_ pay;
	
	@BeforeTest(groups = { "largeScale", "NonAndRadioactive", "radioactive", "NonRadioactive", "indivdualApplicant" })
	public void login() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(urlEFPortal);
		driver.manage().window().maximize();

		// login in EFilling
		ZamPass_ loginEF = new ZamPass_(driver);
		loginEF.loginInEF(getUser[0][0], getUser[0][1], getUser[0][2]);

		MiningAndNonMiningRightsLicenceService = PageFactory.initElements(driver, Service_Description.class);
		serviceForms = PageFactory.initElements(driver, Application_Forms.class);
		serviceEligibility = PageFactory.initElements(driver, Eligibilities_Validation.class); 
		pay = PageFactory.initElements(driver,  ZamPay_.class);
		
	}
	
	@BeforeMethod
	public void preRequiests () throws InterruptedException {
		
		MiningAndNonMiningRightsLicenceService.chooseService(Service);

	}
	
	@Test(groups = { "largeScale", "radioactive", "indivdualApplicant" })
	public void Pay_For_Exloration_Licence_Large_RadioActive() throws InterruptedException {

		
		serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
		serviceForms.applicationFormLargeRadioactive(Category[1]);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}

	@Test(groups = { "largeScale", "NonRadioactive", "indivdualApplicant" })
	public void Pay_For_Exloration_Licence_Large_NonRadioactive() throws InterruptedException {


		serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
		serviceForms.applicationFormLargeNonRadioactive(Category[1]);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}

	@Test(groups = { "largeScale", "NonAndRadioactive", "indivdualApplicant" })
	public void Pay_For_Exloration_Licence_Large_RadioAndNonRadioactive() throws InterruptedException {

		serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
		serviceForms.applicationFormLargeNon_And_Radioactive(Category[1]);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}
	
	@Test
	public void Pay_For_Exloration_Licence_Small_Radioactive() throws InterruptedException {

		serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
		serviceForms.applicationFormSmallRadioactive(Category[1]);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}

	@Test
	public void Pay_For_Exloration_Licence_Small_NonRadioactive() throws InterruptedException {

		serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
		serviceForms.applicationFormSmallNonRadioactive(Category[1]);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}

	@Test
	public void Pay_For_Exloration_Licence_Small_NonAndRadioactive() throws InterruptedException {

		serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
		serviceForms.applicationFormSmallNon_And_Radioactive(Category[1]);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}

}
