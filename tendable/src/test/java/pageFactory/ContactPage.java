package pageFactory;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.base.Verify;

public class ContactPage extends CommonElements{
	
	
//	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']")
//	public WebElement form;
		
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	public WebElement contactUs;
	
	@FindBy(xpath = "(//button[@class='body-button bg-plain-600 toggle-control'][normalize-space()='Contact'])[1]")
	public WebElement marketingContact;
	
	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-fullName']")
	public WebElement fullName;
	
	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-organisationName']")
	public WebElement organisationName;
	
	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-cellPhone']")
	public WebElement phoneNumber;
	
	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-email']")
	public WebElement email;
	
	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//select[@id='form-input-jobRole']")
	public WebElement jobRoleDropDown;
	
	@FindBy(xpath = "//form[@id='contactMarketingPipedrive-163701']//input[@id='form-input-consentAgreed-0']")
	public WebElement iAgreeButton;
	
	@FindBy(xpath = "//button[@data-loading-text='Loading...'][normalize-space()='Submit']")
	public WebElement submitButton;
	
	@FindBy(xpath = "//li[normalize-space()='This field is required']")
	public WebElement messageFieldErrorMessage;
	
	
	public void clickOnContactUs() {
		contactUs.click();
	}
	
	public void clickOnMarketingContact() {
		marketingContact.click();
	}
	
	public void clickOnSubmitButton() {
		submitButton.click();
	}
	
	public void fillTheMarketingContactForm() {
		
//		driver.switchTo().frame("contactMarketingPipedrive-163701");
		fullName.sendKeys("JERRY");
		organisationName.sendKeys("SATech");
		phoneNumber.sendKeys("8527419633");
		email.sendKeys("xyz@satech.com");
		
		Select select = new Select(jobRoleDropDown);
		select.selectByIndex(3);
		
		iAgreeButton.click();
	}
	
	public void verifyMessageFieldErrorMsg() {
		
		String messageFieldErrorText = messageFieldErrorMessage.getText();
		Assert.assertEquals(messageFieldErrorText, "This field is required");
	}
	
}
