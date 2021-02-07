@regression @smoke
Feature: Some API test

	Scenario: First api scenario
		When user make GET request to "/users"
		Then user get the 200 response code