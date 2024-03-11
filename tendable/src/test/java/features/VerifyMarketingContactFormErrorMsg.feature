Feature: Verify Error Message in Marketing Contact Form

	Scenario: Verify Error Message when Message Field Kept blank
		Given User is on the marketing contact form
		When User fill all the data in contact form
		And User click on submit button
		Then User should be able to see the error message
