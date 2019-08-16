@Feature_1 @Feature
Feature: InnaIT Application Login Scenarios

  Scenario: Verify user login with valid credentials
    Given User should launch the innait application
    Then User verify the client logo is present on the header
    Then User verify the application logo is present on the header
    Then User verify the fingerprint text message
    Then User verify the precision logo is present on the footer
    Then User click on the key icon
    Then User verify the precision logo is present on the header
    Then User verify the innait logo is present on the header
    Then User verify the Login page header matches - Employee Id
    When User enter the employeeid address
    Then User verify the Login page header matches - InnaIT Password
    And User enter the InnaIT Password
    And User click on the login button