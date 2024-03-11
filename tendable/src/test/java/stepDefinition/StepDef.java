package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.TestBase;

public class StepDef extends TestBase{
	
	@Given("user is on the homepage of tendable application")
	public void user_is_on_the_homepage_of_tendable_application() {
	    System.out.println("user is on homepage");
	}

	@When("user click on the {string} from the toplevel menu")
	public void user_click_on_the_from_the_toplevel_menu(String string) {
	    hp.clickOnHomepage(string);
	}

	@Then("homepage should be displayed and accessable")
	public void homepage_should_be_displayed_and_accessable() {
		System.out.println("user is clickable");

	}

	
	@When("user click on the {string} from the toplevel menus")
    public void user_click_on_the_menulist_from_the_toplevel_menus(String menuList) {
        hp.clickOnHomepage(menuList);
        System.out.println("User clicked on " + menuList);
    }
	
	@Then("user should see the requestADemo button")
    public void user_should_see_the_requestADemo_button() {
        hp.verifyDemoButton();
        System.out.println("Verified the presence of request a demo button");
    }
	
	//this for contact form
	
	@Given("User is on the marketing contact form")
    public void user_is_on_the_marketing_contact_form() throws Throwable {
        cp.clickOnContactUs();
        Thread.sleep(3000);
        cp.clickOnMarketingContact();
        Thread.sleep(3000);
        System.out.println("User is on the marketing contact form");
    }

    @When("User fill all the data in contact form")
    public void user_fill_all_the_data_in_contact_form() {
        
    	cp.fillTheMarketingContactForm();
    	
    	
        System.out.println("User fills all the data in the contact form");
    }

    @And("User click on submit button")
    public void user_click_on_submit_button() {
        cp.clickOnSubmitButton();
        System.out.println("User clicks on submit button");
    }

    @Then("User should be able to see the error message")
    public void user_should_be_able_to_see_the_error_message() {
        cp.verifyMessageFieldErrorMsg();
        System.out.println("User sees the error message");
    }

}
