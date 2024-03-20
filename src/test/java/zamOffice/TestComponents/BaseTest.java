package zamOffice.TestComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.model.Response;
import org.openqa.selenium.devtools.v121.network.Network;
import org.openqa.selenium.devtools.v121.network.model.Request;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestNGException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import zamOffice.PageObjects.*;


public class BaseTest {
 
	public WebDriver driver;
	public Service_Description MiningAndNonMiningRightsLicenceService;
	public Application_Forms serviceForms;
	public Eligibilities_Validation serviceEligibility;
	public ZamPass_ loginEF11;
	public Properties properties;
	public FileInputStream fis;
	public String browserName;
	public String urlEFilling;
	public String username;
	public String password;
	public String user;
	public String service;
	public String individual;
	public String organization;
	public String individualID;
	public String organizationID;
	public String miningLicence;
	public String explorationLicence;
	public String mineralProcessing;
	public String artisanal;
	public String large;
	public String small;
	public String nonRadioactive;
	public String radioactive;
	public String radioAndNonRadioactive;
	
	

	
	
	public WebDriver initializeDriver() throws IOException, FileNotFoundException  {


		properties = new Properties();
		fis = new FileInputStream( System.getProperty("user.dir") + "//src//main//java//zamOffice//Resources//GlobalData.properties");
		properties.load(fis);
			
	    browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :properties.getProperty("browser");
		
		if (browserName.contains("chrome")) {

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
		} else if (browserName.contains("firefox")) {
			
			driver = new FirefoxDriver();
			

		} else if (browserName.contains("edge")) {
			
			System.setProperty("webdriver.edge.driver", "edge.exe");
			driver = new EdgeDriver();
			

		}
		
		return driver;

	}
	
	
	@BeforeMethod()
	public void loginToEF() throws IOException, InterruptedException, TestNGException {
		
		driver = initializeDriver();
		loginEF11 = new ZamPass_(driver);

		
		//get value for global variables:
		urlEFilling = System.getProperty("urlEFPortal")!=null ? System.getProperty("urlEFPortal") :properties.getProperty("urlEFPortal");
		username = System.getProperty("Username")!=null ? System.getProperty("Username") :properties.getProperty("Username");
		password = System.getProperty("Password")!=null ? System.getProperty("Password") :properties.getProperty("Password");
		user = System.getProperty("User")!=null ? System.getProperty("User") :properties.getProperty("User");
		service = System.getProperty("Service")!=null ? System.getProperty("Service") :properties.getProperty("Service");
		explorationLicence = System.getProperty("ExplorationLicence")!=null ? System.getProperty("ExplorationLicence") :properties.getProperty("ExplorationLicence");
		organization = System.getProperty("OrganizationCustomer")!=null ? System.getProperty("OrganizationCustomer") :properties.getProperty("OrganizationCustomer");
		individual = System.getProperty("IndividualCustomer")!=null ? System.getProperty("IndividualCustomer") :properties.getProperty("IndividualCustomer");
		individualID = System.getProperty("IndividualID")!=null ? System.getProperty("IndividualID") :properties.getProperty("IndividualID");
		organizationID = System.getProperty("OrganizationID")!=null? System.getProperty("OrganizationID") :properties.getProperty("OrganizationID");
		radioactive = System.getProperty("Radioactive")!=null? System.getProperty("Radioactive") :properties.getProperty("Radioactive"); 
		large = System.getProperty("Large")!=null? System.getProperty("Large") :properties.getProperty("Large");	
		miningLicence = System.getProperty("MiningLicence")!=null? System.getProperty("MiningLicence") :properties.getProperty("MiningLicence");	
		mineralProcessing = System.getProperty("MineralProcessing")!=null? System.getProperty("MineralProcessing") :properties.getProperty("MineralProcessing");
		artisanal =  System.getProperty("Artisanal")!=null? System.getProperty("Artisanal") :properties.getProperty("Artisanal"); 	
		small =  System.getProperty("Small")!=null? System.getProperty("Small") :properties.getProperty("Small");	
		nonRadioactive =  System.getProperty("NonRadioactive")!=null? System.getProperty("NonRadioactive") :properties.getProperty("NonRadioactive");
		radioactive =  System.getProperty("Radioactive")!=null? System.getProperty("Radioactive") :properties.getProperty("Radioactive");
		radioAndNonRadioactive =  System.getProperty("RadioAndNonRadioactive")!=null? System.getProperty("RadioAndNonRadioactive") :properties.getProperty("RadioAndNonRadioactive");
		
		//go to EF Portal and login
		driver.get(urlEFilling);
		loginEF11.loginInEF(username, password, user);

		//objects:
		MiningAndNonMiningRightsLicenceService = PageFactory.initElements(driver, Service_Description.class);
		serviceForms = PageFactory.initElements(driver, Application_Forms.class);
		serviceEligibility = PageFactory.initElements(driver, Eligibilities_Validation.class);
		MiningAndNonMiningRightsLicenceService.chooseService(service);
		
	}
	
	//@Test
	public void setMobileDevice() {

		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		DevTools devTools = driver1.getDevTools();
		devTools.createSession();
		Map<String, Object> deviceMetrics = new HashMap<String, Object>();
		deviceMetrics.put("width", 600);
		deviceMetrics.put("height", 1000);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		
		driver1.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver1.get("https://mmmdui.dotgov.uk/services");	

	}
	
	//@Test
	public void localication() {

		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		DevTools devTools = driver1.getDevTools();
		devTools.createSession();
		Map<String,Object>coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);
		
		driver1.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		driver1.get("https://www.facebook.com/");	

	}
	
	
//	@Test
	public void network () {
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		
		DevTools devTools = driver2.getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), request ->
		{
			Request re = request.getRequest();
			//System.out.println("URL Request: " + re.getUrl());			
			
			
		});
		devTools.addListener(Network.responseReceived(), response ->
		{
			org.openqa.selenium.devtools.v121.network.model.Response r = response.getResponse();
			//System.out.println("URL Respone: " + r.getUrl() + "Status Code: " + r.getStatus());
			Integer resp = r.getStatus();
			if (resp != 200) 
				System.out.println("Different Status Code for " + r.getUrl() + "Status code is: " + r.getStatus());
		

			
		});
		
		driver2.get("https://mmmdui.dotgov.uk/services");	

		

		
		
		
	}
	
	
	
	
	


}
