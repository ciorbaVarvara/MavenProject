package zamOffice.Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.support.PageFactory;
import org.testng.TestNGException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import zamOffice.PageObjects.Application_Forms;
import zamOffice.PageObjects.Eligibilities_Validation;
import zamOffice.PageObjects.Service_Description;
import zamOffice.PageObjects.ZamPass_;
import zamOffice.TestComponents.BaseTest;

public class CDP_Functionalities {

	@Test
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
	
	

}
