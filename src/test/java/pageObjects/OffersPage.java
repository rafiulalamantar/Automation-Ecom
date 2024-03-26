package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
    public WebDriver driver;
    By search = By.xpath("//input[@type = 'search']");
    By productName = By.cssSelector("tr td:nth-child(1)");
    public OffersPage(WebDriver driver){
        this.driver= driver;
    }
    public void SearchItem(String name){

        driver.findElement(search).sendKeys(name);
    }
    public String getProductName(){
        return driver.findElement(productName).getText();
    }
}
