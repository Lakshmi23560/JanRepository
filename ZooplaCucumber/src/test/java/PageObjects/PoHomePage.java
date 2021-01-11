package PageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.Testbase;

public class PoHomePage extends Testbase {

	@FindBy(xpath = "//button[@class='ui-button-secondary']")
	public WebElement saveMyPreferences;

	@FindBy(xpath = "//input[@id='search-input-location']")
	WebElement searchBox;

	@FindBy(xpath = "//a[@href='/house-prices/']")
	public WebElement housePrices;

	@FindBy(xpath = "//input[@id='search-input-location']")
	public WebElement searchPrices;

	@FindBy(xpath = "//li[@class='ui-first-child']")
	public WebElement selectPlaces;

	public PoHomePage(WebDriver driver) throws IOException {
		PageFactory.initElements(driver, this);
	}

//	validating homepage
	public String validateHomePage() {
		return driver.getTitle();
	}

//	entering text in searchbox
	public void enterTextSearchBox(String text) throws InterruptedException {
		// Thread.sleep(5000);
		oBrowsUtil.Click(saveMyPreferences, "savePreferences");
		oBrowsUtil.enterText(searchBox, text, "SearchBox");
		searchBox.sendKeys(Keys.ENTER);
		logger.log(LogStatus.PASS, "Text entered in textbox and pressed enter");
	}

}
