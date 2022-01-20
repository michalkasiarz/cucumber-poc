package cucumberTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features", glue = "stepImplementations")
public class ErrorMessagesTestRunner extends AbstractTestNGCucumberTests {
}
