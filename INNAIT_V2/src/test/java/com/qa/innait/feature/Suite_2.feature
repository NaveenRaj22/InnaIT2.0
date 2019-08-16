@Feature_2 @Feature
Feature: InnaIT Menu Scenarios

Scenario: Verify Innait Core page functionality
 
 Scenario: Business Unit Creation
 
 		When User click on Business Unit Menu
    And User click Roles Plus button to add roles
    Then User click on the Business Unit field to enter
    Then User enter the Business Unit
    Then User click on the description field to enter
    Then User enter the Description
    And User click on the add button
    And User Click on the cancel button

Scenario: Branch Location Creation

		When User click on Branch Location
		And User click on the Plus button to add location
		Then User click on the Location field to enter
		Then User enter the brach location
		Then User click on the Location description field to enter
		Then User enter the description
		Then User click on the location timezone
		Then User enter the timezone
		Then User select the highlighted timezone
		And User click on the Location add button
		And User click on the cancel button in location 	