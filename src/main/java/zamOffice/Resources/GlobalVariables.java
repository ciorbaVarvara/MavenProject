package zamOffice.Resources;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class GlobalVariables {

	//public WebDriver driver;

	public static final String urlEFPortal = "https://mmmdui.dotgov.cloud/services";
	public static final String urlIntranetPortal = "https://mmmd.dotgov.cloud/";

	public static final String Username = "727110111";
	public static final String Password = "Skrillex!!2018";
	public static final String User = "Varvara Ciorba";


	@DataProvider
	public static final String[][] getUser() {
		return new String[][] { { "727110111", "Skrillex!!2018", "Varvara Ciorba" } };
	}
	
	
	
	public static final String[][] getUser = { { "727110111", "Skrillex!!2018", "Varvara Ciorba" } };
	

	public static final String Service = "Mining and Non-Mining Rights Licence";

	public static String caseNumber;

	public static final String[] Customer = new String[] { "Individual", "Organization", };

	public static final String[] CustomerID = new String[] { "727110111", "119950034979" };

	// Service settings:
	public static final String[] Category = new String[] { "Mining Licence", "Exploration Licence",
			"Mineral Processing Licence" };

	public static final String[] ScaleOfOperation = new String[] { "Artisanal (not exceeding 9.98 ha)",
			"Large Scale (399.7 - 24,925.05 ha)", "Small Scale (9.99 - 399.6 ha)" };

	public static final String[] MineralsType = new String[] { "Non-Radioactive", "Radioactive",
			"Radioactive and Non-Radioactive" };

	// Card Details:
	public static final String card_number = "4890533660474227";
	public static final String expiry_month = "02";
	public static final String expiry_year = "2025";
	public static final String cvv = "123";
	public static final String card_name = "My Card";

	// Phone Number
	public static final String[] phoneNumbers = new String[] { "260555555444" };

}