package MMMD.Test_Cases.Eligibility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import MMMD.Application_Forms;
import MMMD.Eligibilities_Validation;
import MMMD.GlobalVariables;
import MMMD.Service_Description;
import MMMD.ZamPass_;

public class Mineral_Processing_Licence extends GlobalVariables {
	
	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility; 
	
	@BeforeTest(groups = { "largeScale", "smallScale", "NonAndRadioactive", "Radioactive", "NonRadioactive", "indivdualApplicant" })
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
		
	}
	
	@BeforeMethod
	public void preRequiests () throws InterruptedException {
		
		MiningAndNonMiningRightsLicenceService.chooseService(Service);

	}
	
	
	public void mineralProcessingLicenceIndividual () throws InterruptedException {
		
		
		serviceForms.caseDetailsForm(Category[2], Customer[0], CustomerID[1]); 
		serviceForms.applicationFormMineralProcessing("15");
	    serviceEligibility.eligibilityVerification(Category[2], Customer[0], null, null); 		   
			   
		}
	
	public void mineralProcessingLicenceOrganization () throws InterruptedException {
		
		
		serviceForms.caseDetailsForm(Category[2], Customer[1], CustomerID[1]); 
		serviceForms.applicationFormMineralProcessing("15");
		serviceEligibility.eligibilityVerification(Category[2], Customer[1], null, null); 		   
			   
		}

	}

