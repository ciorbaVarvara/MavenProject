package MMMD.Test_Cases.ApplicationForm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MMMD.Application_Forms;
import MMMD.Eligibilities_Validation;
import MMMD.GlobalVariables;
import MMMD.Service_Description;
import MMMD.ZamPass_;

public class Mining_Licence extends GlobalVariables {

	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility; 

	
	@BeforeTest(groups = { "largeScale", "smallScale", "NonAndRadioactive", "Radioactive", "NonRadioactive",
			"indivdualApplicant" })
	public void login() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(urlEFPortal);
		driver.manage().window().maximize();

		// login in EFilling
		ZamPass_ loginEF = new ZamPass_(driver);
		loginEF.loginInEF(getUser[0][0], getUser[0][1], getUser[0][2]);

	}

	@Test
	public void artisanal_applyFor_miningLicence_Radioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormArtisanalRadioactive(Category[0]);

	}

	@Test
	public void artisanal_applyFor_miningLicence_NonRadioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormArtisanalNonRadioactive(Category[0]);

	}

	@Test
	public void artisanal_applyFor_miningLicence_AndNonRadioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormArtisanalNon_And_Radioactive(Category[0]);

	}
	
	@Test
	public void large_applyFor_miningLicence_Radioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormLargeRadioactive(Category[0]);

	}

	@Test
	public void large_applyFor_miningLicence_NonRadioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		Application_Forms serviceForms = new Application_Forms(driver);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormLargeNonRadioactive(Category[0]);

	}

	@Test
	public void large_applyFor_miningLicence_AndNonRadioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormLargeNon_And_Radioactive(Category[0]);

	}
	
	@Test
	public void small_applyFor_miningLicence_Radioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormSmallRadioactive(Category[0]);

	}

	@Test
	public void small_applyFor_miningLicence_NonRadioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormSmallNonRadioactive(Category[0]);

	}

	@Test
	public void small_applyFor_miningLicence_AndNonRadioactive() throws InterruptedException {

		MiningAndNonMiningRightsLicenceService.chooseService(Service);
		serviceForms.caseDetailsForm(Category[0], Customer[0], CustomerID[0]);
		serviceForms.applicationFormSmallNon_And_Radioactive(Category[0]);

	}

}
//}else if ((serviceCateogry == "Mining Licence" || serviceCateogry == "Exploration Licence") & scaleType=="Artisanal (not exceeding 9.98 ha)" & mineralType=="Non-Radioactive") {

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