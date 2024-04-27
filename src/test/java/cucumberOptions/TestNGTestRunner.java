package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions",monochrome = true,tags = "@PlaceOrder or @OffersPage",
plugin = {"html:target/cucumber.html","json:target/cucumber.json"})
//dryRun = true only use for compile
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
