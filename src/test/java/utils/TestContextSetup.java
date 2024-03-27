package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {

    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestContextSetup() throws IOException {
        testBase= new TestBase();
        driver = testBase.WebDriverManager();
        pageObjectManager = new PageObjectManager(testBase.driver);
        genericUtils = new GenericUtils(testBase.WebDriverManager());
    }
}
