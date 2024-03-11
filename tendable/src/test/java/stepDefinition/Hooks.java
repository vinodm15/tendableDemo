package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testBase.TestBase;

public class Hooks extends TestBase{
	
	@Before
	public void beforeScenario() throws Throwable {
		openBrowser();
	}
	
	@After
	public void afterScenario() {
		closeBrowser();
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
		
	}
	
}
