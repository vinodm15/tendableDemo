package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonElements{
	
	@FindBy(xpath = "//img[@alt='Tendable Logo']")
	public WebElement homepage;
	
	
	@FindBy(xpath = "//a[contains(text(),'Our Story')]")
	public WebElement ourStory;
	
	
	@FindBy(xpath = "//a[contains(text(),'Our Solution')]")
	public WebElement ourSolution;
	
	
	@FindBy(xpath = "//a[contains(text(),'Why Tendable?')]")
	public WebElement whyTendable;
	
	@FindBy(xpath = "//a[contains(text(),'Request A Demo')]")
	public WebElement demo;
	
	
	
	public void clickOnHomepage(String menu) {
		
		if (menu.equalsIgnoreCase("homepage")) {
			Assert.assertTrue(homepage.isDisplayed(), "Yes Home Page is displayed");
			System.out.println("Yes Home Page is displayed");
			Assert.assertTrue(homepage.isEnabled(), "Yes Home page is interactable");
			System.out.println("Yes Home page is interactable");
			homepage.click();
		}else if (menu.equalsIgnoreCase("ourSolution")) {
			Assert.assertTrue(ourSolution.isDisplayed(), "Yes ourSolution Page is displayed");
			System.out.println("Yes ourSolution Page is displayed");
			Assert.assertTrue(ourSolution.isEnabled(), "Yes ourSolution page is interactable");
			System.out.println("Yes ourSolution page is interactable");
			ourSolution.click();
		}else if (menu.equalsIgnoreCase("whyTendable")) {
			Assert.assertTrue(whyTendable.isDisplayed(), "Yes whyTendable Page is displayed");
			System.out.println("Yes whyTendable Page is displayed");
			Assert.assertTrue(whyTendable.isEnabled(), "Yes whyTendable page is interactable");
			System.out.println("Yes whyTendable page is interactable");
			whyTendable.click();
		}else if (menu.equalsIgnoreCase("ourStory")) {
			Assert.assertTrue(ourStory.isDisplayed(), "Yes ourStory Page is displayed");
			System.out.println("Yes ourStory Page is displayed");
			Assert.assertTrue(ourStory.isEnabled(), "Yes ourStory page is interactable");
			System.out.println("Yes ourStory page is interactable");
			ourStory.click();
		}
		
		
		
	}
	
	public void verifyDemoButton() {
		
		Assert.assertTrue(demo.isDisplayed(), "Yes Demo button is present");
		Assert.assertTrue(demo.isEnabled(), "Yes Demo button is interactable");
		demo.click();
		
		
	}
	
	
	
	
	
	
	

}
