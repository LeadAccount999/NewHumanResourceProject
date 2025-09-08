Feature: Login Functionality

	@Smoke	
	Scenario: OrangeHRMLogin Functionality
		Given Open the firefox browser
		Given  Navigate the app url
		When  enter the username into username textbox field
			| username |
			| selenium |
		When   enter the password into password textbox field
			| password |
			| selenium |
		When click on login
		Then verify the welcome page
		When Close the app url