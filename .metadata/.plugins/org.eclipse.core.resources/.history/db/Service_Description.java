package MMMD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Service_Description extends AbstractComponents {

	WebDriver driver;

	public Service_Description(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[@class=\"p-0 m-0 text-wrap text-break h3\"] ")
	WebElement serviceDescriptionPage;

	@FindBy(xpath = "//p[@class=\"p-0 m-0 text-wrap text-break p2-500\"] ")
	WebElement serviceDescriptionSection;
	@FindBy(xpath = "(//p[@class=\"p-0 m-0 text-wrap text-break ms-4 mt-2\"])[1]")
	WebElement feeSection;
	@FindBy(xpath = "(//p[@class=\"p-0 m-0 text-wrap text-break ms-4 mt-2\"])[2]")
	WebElement processingTimeSection;
	@FindBy(xpath = "(//p[@class=\"p-0 m-0 text-wrap text-break ms-4 mt-2\"])[3]")
	WebElement validitySection;

	@FindBy(xpath = "//a[contains(text(),\" ZamPortal - Government e-Services Directory \")]")
	WebElement logoZamPortal;
	
	@FindBy(xpath="(//div[@class=\"e-content\"])[1]")
	List<WebElement> listOfServices;
	
	@FindBy(xpath="//div[@class=\"collapse navbar-collapse flex-1 justify-content-lg-end\"]")
	List<WebElement> menu;
	@FindBy(xpath="//a[contains(text(),\" E-Services Directory \")]")
	WebElement eServiceDirectoryBtn;
	
	

	public void chooseService(String service) throws InterruptedException {

		
		//Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		wait(eServiceDirectoryBtn);
		eServiceDirectoryBtn.click();
		
		wait(logoZamPortal);
		if (logoZamPortal.isDisplayed()) {
			wait(logoZamPortal);

			waitForPresenceOfAllElements(listOfServices);
			
			// WebElement myservice =(driver.findElement(By.xpath("(//*[contains(text(),'"+
			// service + "')])[1]")));
			WebElement myservice = (driver.findElement(By.xpath("(//*[contains(text(),'" + service + "')])[1]")));
			wait(myservice);
			js.executeScript("arguments[0].click();", myservice);
		} else
			System.out.println("Error: Cannot click on service");

		wait(serviceDescriptionPage);

		if (serviceDescriptionPage.getText().contains(service)) {
			System.out.println("Service is available apply for");
		} else
			System.out.println("Error: Service is not availabel");

	}

	public void serviceDescriptionValidation(String serviceDescr, String feeDescr, String procesingTimeDescr,
			String validityDescr) {
		wait(serviceDescriptionSection);
		if (serviceDescriptionSection.getText().contains(serviceDescr)) {
			System.out.println("Service Description is correct");
		} else
			System.out.println("Error: Service Description is not correct");

		wait(feeSection);
		if (feeSection.getText().contains(feeDescr)) {
			System.out.println("Fees are correct");
		} else
			System.out.println("Error: Service Description is not correct");

		wait(processingTimeSection);
		if (processingTimeSection.getText().contains(procesingTimeDescr)) {
			System.out.println("Processing Time is correct");
		} else
			System.out.println("Error: Service Description is not correct");

		wait(validitySection);
		if (validitySection.getText().contains(validityDescr)) {
			System.out.println("Validty is correct");
		} else
			System.out.println("Error: Service Description is not correct");

	}
	
	public void goToEServicesDirecotry () {
		
		waitForPresenceOfAllElements(menu);	
		wait(eServiceDirectoryBtn);
		eServiceDirectoryBtn.click();
		
	}

}
