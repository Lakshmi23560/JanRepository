package StepDefinitions;

import org.openqa.selenium.Keys;

import PageObjects.PoAgentsPage;
import PageObjects.PoHomePage;
import PageObjects.PoPropertiesListingPage;
import PageObjects.PoPropertyPage;
import Utilities.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckPricesStepdef2 extends Testbase {

	PoHomePage homepage;
	PoPropertiesListingPage PropertiesListingPage;
	PoPropertyPage propertypage;
	PoAgentsPage agentspage;

	@Given("^Login to Zoopla application is launched for \"([^\"]*)\"$")
	public void login_to_Zoopla_application_is_launched_for(String testName) throws Throwable {
		logger = reports.startTest(testName);
	}

	@When("^click on house prices$")
	public void click_on_house_prices() throws Throwable {
		homepage = new PoHomePage(driver);
		oBrowsUtil.Click(homepage.saveMyPreferences, "saveMyPreferences");
		oBrowsUtil.Click(homepage.housePrices, "house prices");

	}

	@When("^Enter place name \"([^\"]*)\" in search box$")
	public void enter_place_name_in_search_box(String Place) throws Throwable {
		oBrowsUtil.enterText(homepage.searchPrices, Place, "SearchBox");
		homepage.searchPrices.sendKeys(Keys.ENTER);

	}

	@Then("^place with price is displayed\\.$")
	public void place_with_price_is_displayed() throws Throwable {
		// log.info("Place with prices has been shown in page");
	}

}
