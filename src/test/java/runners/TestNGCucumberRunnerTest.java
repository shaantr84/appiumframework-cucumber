package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports/html-report","json:target/cucumber-reports/cucumber.json"},
        glue = "org.shanoj.mobile.stepDefinitions",
        features = "./src/test/resources/features"
)
public class TestNGCucumberRunnerTest extends AbstractTestNGCucumberTests {


}
