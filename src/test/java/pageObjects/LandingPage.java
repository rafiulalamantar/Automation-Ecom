package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    public WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver=driver;
    }
    By search = By.xpath("//input[@type = 'search']");
    By productName = By.cssSelector("h4.product-name");

    public void SearchItem(String name){

        driver.findElement(search).sendKeys(name);
    }
    public void getSearchText(){
        driver.findElement(search).getText();
    }
    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
