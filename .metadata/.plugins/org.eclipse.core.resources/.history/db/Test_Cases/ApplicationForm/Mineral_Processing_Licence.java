package MMMD.Test_Cases.ApplicationForm;

import org.openqa.selenium.WebDriver;
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

public class Mineral_Processing_Licence extends GlobalVariables {

	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility;

	@BeforeTest
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

	}
	
	@BeforeMethod
	public void preRequiests () throws InterruptedException {
		
		MiningAndNonMiningRightsLicenceService.chooseService(Service);

	}
	

	@Test
	public void apply_for_mineral_processing() throws InterruptedException {

		serviceForms.caseDetailsForm(Category[2], Customer[0], CustomerID[0]);
		serviceForms.applicationFormMineralProcessing("15");

	}

}

/*
 * public static final String[] Category = new String[] { "Mining Licence",
 * "Exploration Licence", "Mineral Processing Licence"};
 * 
 * public static final String[] ScaleOfOperation = new String[] {
 * "Artisanal (not exceeding 9.98 ha)", "Large Scale (399.7 - 24,925.05 ha)",
 * "Small Scale (9.99 - 399.6 ha)"};
 * 
 * public static final String[] MineralsType = new String[] { "Non-Radioactive",
 * "Radioactive", "Radioactive and Non-Radioactive"};
 */