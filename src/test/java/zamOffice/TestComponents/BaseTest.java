package zamOffice.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Factory;

import zamOffice.PageObjects.*;
import zamOffice.Resources.*;

import zamOffice.AbstractComponents.*;



public class BaseTest extends GlobalVariables {
 
	public WebDriver driver;
	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility;
	public ZamPass_ loginEF;
	
	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "C:\\Users\\User\\AutomatedTesting\\NewZamOffice\\src\\main\\java\\ZamOffice\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriver driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			
			WebDriver driver = new FirefoxDriver();
			

		} else if (browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", "edge.exe");
			WebDriver driver = new EdgeDriver();
			

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}
	

	@BeforeMethod()
	public ZamPass_ login (String username, String password, String user) throws IOException {

		driver = initializeDriver();
		
		loginEF = new ZamPass_(driver);
		
		driver.get(urlEFPortal);
	    
		loginEF.loginInEF(Username, Password, User);
		
		MiningAndNonMiningRightsLicenceService = PageFactory.initElements(driver, Service_Description.class);
		serviceForms = PageFactory.initElements(driver, Application_Forms.class);
		serviceEligibility = PageFactory.initElements(driver, Eligibilities_Validation.class);
		
		
		return loginEF;
		
	/*	MiningAndNonMiningRightsLicenceService = PageFactory.initElements(driver, Service_Description.class);
		serviceForms = PageFactory.initElements(driver, Application_Forms.class);
		serviceEligibility = PageFactory.initElements(driver, Eligibilities_Validation.class);
		*/

	}

}
