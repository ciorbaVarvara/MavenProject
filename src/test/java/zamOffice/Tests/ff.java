package zamOffice.Tests;

import java.io.IOException;

import org.testng.annotations.Test;
import zamOffice.TestComponents.BaseTest;

public class ff extends BaseTest {


	//@Test
	public void large_applyFor_RadioactiveMinerals() throws InterruptedException, IOException {

		
		serviceForms.caseDetailsForm(explorationLicence, individual, null , individualID);
		serviceForms.applicationFormLargeRadioactive(explorationLicence);

	}
	
	@Test
	public void large_applyFor() throws InterruptedException, IOException {

		
		serviceForms.caseDetailsForm(explorationLicence, individual, null , individualID);
		serviceForms.applicationForm(explorationLicence, large, null, null, radioactive, null);

	}
	
	
	/*
	 * 
	 * 
	 * 	public void applicationForm(String serviceCategory, String large, String small, String artisanal, String radioactive, String nonradioactive) {

	 * 		explorationLicence = System.getProperty("ExplorationLicence");
		organizationCustomer = System.getProperty("OrganizationCustomer");
		individualCustomer = System.getProperty("IndividualCustomer");
		individualID = System.getProperty("IndividualID");
	 * @Test public void large_applyForNon_RadioactiveMinerals() throws
	 * InterruptedException {
	 * 
	 * serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
	 * serviceForms.applicationFormLargeNonRadioactive(Category[1]);
	 * 
	 * }
	 * 
	 * @Test public void large_applyForNon_And_RadioactiveMinerals() throws
	 * InterruptedException {
	 * 
	 * serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
	 * serviceForms.applicationFormLargeNon_And_Radioactive(Category[1]);
	 * 
	 * }
	 * 
	 * @Test public void small_applyFor_RadioactiveMinerals() throws
	 * InterruptedException {
	 * 
	 * serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
	 * serviceForms.applicationFormSmallRadioactive(Category[1]);
	 * 
	 * }
	 * 
	 * @Test public void small_applyForNon_RadioactiveMinerals() throws
	 * InterruptedException {
	 * 
	 * serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
	 * serviceForms.applicationFormSmallNonRadioactive(Category[1]);
	 * 
	 * }
	 * 
	 * @Test public void small_applyForNon_And_RadioactiveMinerals() throws
	 * InterruptedException {
	 * 
	 * serviceForms.caseDetailsForm(Category[1], Customer[0], CustomerID[0]);
	 * serviceForms.applicationFormSmallNon_And_Radioactive(Category[1]);
	 * 
	 * }
	 */

}

/*
 * if (serviceCateogry == "Mining Licence" || serviceCateogry ==
 * "Exploration Licence" & scaleType=="Large Scale (399.7 - 24,925.05 ha)" &
 * mineralType=="Non-Radioactive") {
 * 
 * 
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