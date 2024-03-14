package MMMD.Test_Cases.InspectionProcess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MMMD.GlobalVariables;
import MMMD.Inspection_Steps;
import MMMD.ZamPass_;

public class Approval_Process_only_intranet extends GlobalVariables {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();


//Inspection process
		driver.get(urlIntranetPortal);
		driver.manage().window().maximize();

		// login in Intranet
		ZamPass_ loginIntranet = new ZamPass_(driver);
		loginIntranet.loginInIntranetDirectly(Username, Password, User);

		Inspection_Steps b = new Inspection_Steps(driver);

		String no = "MMMD-0003308/2-2024";
		b.caseOfficer_step1(no);
		b.caseOfficer_step2(no);
		b.supervisor_step3(no);
		b.committee_step4(no);
		b.executive_step5(no);

	}

}
