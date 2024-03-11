Feature: Verify Request a Demo button presence

   
	Scenario: Verify Request A DemoButton Is Present in home toplevel menu
		Given user is on the homepage of tendable application
		When user click on the "homepage" from the toplevel menu
		Then user should see the requestADemo button
		
	Scenario: Verify Request A DemoButton Is Present in ourSolution toplevel menu
		Given user is on the homepage of tendable application
		When user click on the "ourSolution" from the toplevel menu
		Then user should see the requestADemo button
			
	
	Scenario: Verify Request A DemoButton Is Present in whyTendable toplevel menu
		Given user is on the homepage of tendable application
		When user click on the "whyTendable" from the toplevel menu
		Then user should see the requestADemo button
		
	Scenario: Verify Request A DemoButton Is Present in ourStory toplevel menu
		Given user is on the homepage of tendable application
		When user click on the "ourStory" from the toplevel menu
		Then user should see the requestADemo button

