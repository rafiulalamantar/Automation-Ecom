package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinition {
    public String offerPageProductName;
    TestContextSetup testContextSetup;
    public OfferPageStepDefinition(TestContextSetup testContextSetup){
        this.testContextSetup= testContextSetup;
    }

    @Then("User searched for {string} shortname in offers page")
    public void user_searched_for_same_shortname_in_offers_page(String shortName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        switchToOfferPage();
        OffersPage offersPage = new OffersPage(testContextSetup.driver);
        offersPage.SearchItem(shortName);
        Thread.sleep(2000);
        offerPageProductName= offersPage.getProductName();

    }
    public void switchToOfferPage(){
//        if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase(""));
        LandingPage landingPage = new LandingPage(testContextSetup.driver);
        landingPage.selectTopDealsPage();
        Set<String> s1 = testContextSetup.driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        testContextSetup.driver.switchTo().window(childWindow);
    }
    @Then("validate product name in offer page matches with Landing page")
    public void validate_product_name_in_offer_page_matches_with_landing_page(){
        Assert.assertEquals(offerPageProductName,testContextSetup.landingPageProductName);

    }
}
