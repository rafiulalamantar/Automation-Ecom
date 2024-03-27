package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;
    public WebDriver WebDriverManager() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String url = properties.getProperty("QAUrl");

        if(driver==null){
            if (properties.getProperty("browser").equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
            }
            driver.get(url);
        }
        return driver;
    }
}
