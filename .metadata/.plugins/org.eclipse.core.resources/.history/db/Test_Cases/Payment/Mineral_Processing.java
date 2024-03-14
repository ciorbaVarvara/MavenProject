package MMMD.Test_Cases.Payment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MMMD.Application_Forms;
import MMMD.Eligibilities_Validation;
import MMMD.GlobalVariables;
import MMMD.Service_Description;
import MMMD.ZamPass_;
import MMMD.ZamPay_;

public class Mineral_Processing extends GlobalVariables {

	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility; 
	public ZamPay_ pay;
	
	@BeforeTest
	public void setUp() throws InterruptedException {

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
	
	@Test
	public void Pay_For_Mineral_Processing() throws InterruptedException {

		serviceForms.caseDetailsForm(Category[2], Customer[0], CustomerID[0]);
		serviceForms.applicationFormMineralProcessing("15");
		serviceEligibility.eligibilityVerification(Category[2], Customer[0], null, null);
		serviceForms.goToNextGS_1();
		pay.paymentWithMTN(phoneNumbers[0]);

	}

}
