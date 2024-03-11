package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	features = "src\\test\\java\\features\\VerifyMarketingContactFormErrorMsg.feature",
					glue = "stepDefinition",
					plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				)

public class TestRunner extends AbstractTestNGCucumberTests {

}
