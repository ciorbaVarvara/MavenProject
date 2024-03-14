package zamOffice.AbstractComponents;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AbstractComponents {


	public WebDriver driver;

	public AbstractComponents (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementToAppear(By findby) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));

	}

	public void old_wait(WebElement ele) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(ele));

		} catch (StaleElementReferenceException e) {
			System.out.println("catch");
			System.out.println(e.getMessage());
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(ele));

		} catch (ElementNotInteractableException e) {
			System.out.println("catch");
			System.out.println(e.getMessage());
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(ele));
		}

	}

	public void waitForVisibilityOfElementBy(By by) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(60));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			System.out.println("catch");
			System.out.println(e.getMessage());
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));

		}

	}

	public void wait_visibility(WebElement ele) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			// wait.until(ExpectedConditions.elementToBeClickable(ele));
			wait.until(ExpectedConditions.visibilityOf(ele));

		} catch (StaleElementReferenceException e) {
			System.out.println("catch");
			System.out.println(e.getMessage());
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(ele));

		} catch (ElementNotInteractableException e) {
			System.out.println("catch");
			System.out.println(e.getMessage());
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(Duration.ofSeconds(30));
			wait.pollingEvery(Duration.ofSeconds(2));
			wait.ignoring(Exception.class);
			// wait.until(ExpectedConditions.elementToBeClickable(ele));
			wait.until(ExpectedConditions.visibilityOf(ele));
		}

	}

	public void waitForElementToBeClickableBy(By by) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(by));

	}

	public void waitForElementToBeClickable(WebElement ele) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public void waitForPresenceOfAllElements(List<WebElement> ele) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));

		if (ele.isEmpty() == false) {
			System.out.println("the list is not empty");
		} else
			System.out.println("the list IS empty");

	}

	public boolean waitForPresenceOfElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.presenceOfElementLocated(by));
		wait.until(ExpectedConditions.visibilityOf(ele));

		// wait.until(ExpectedConditions.)
		return false;
	}

	public boolean waitForPresenceOfElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// wait.until(ExpectedConditions.presenceOfElementLocated(by));
		wait.until(ExpectedConditions.presenceOfElementLocated(by));

		// wait.until(ExpectedConditions.)
		return false;
	}

	public void trying(By by, String warningMessage) {
		try {
			waitForPresenceOfElement(by);
		} catch (TimeoutException ex) {
			System.out.println(warningMessage);
		}
	}

	public boolean trying(WebElement ele, String warningMessage) {
		try {
			waitForPresenceOfElement(ele);
			return true;
		} catch (TimeoutException ex) {
			System.out.println(warningMessage);
		}
		return false;
	}

	public void uploadingFiles(WebElement ele, String warningMessage, WebElement open_row, WebElement close_row,
			WebElement upload_file) {
		// String warningMessage = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (trying(ele, warningMessage) == true) {

			wait(open_row);
			js.executeScript("arguments[0].scrollIntoView();", open_row);
			open_row.click();
			// js.executeScript("arguments[0].click();", open_row);

			upload_file.sendKeys("C:\\Users\\varvara.ciorba\\AutomatedTesting\\AutomatedTesting\\TestData\\text.pdf");
			wait(close_row);
			js.executeScript("arguments[0].scrollIntoView();", close_row);
			close_row.click();
			// js.executeScript("arguments[0].click();", close_row);

		}
	}

	public void waitForPaymentConfirmation(WebElement ele) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(180));
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public WebElement wait(final WebElement element) {
		
		final int maxRetryCount = 10;

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(500)).ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class).ignoring(ElementClickInterceptedException.class)
				.ignoring(TimeoutException.class);

		return wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				for (int i = 0; i < maxRetryCount; i++) {
					try {
						waitForPresenceOfElement(element);
						if (element.isDisplayed()) {
							return element;
						}
					} catch (Exception e) {
						
						waitForPresenceOfElement(element);
						if (element.isDisplayed()) {
							return element;
						}
					}
				}
				throw new RuntimeException("Failed to find element after " + maxRetryCount + " retries");
			}
		});
	}

}

