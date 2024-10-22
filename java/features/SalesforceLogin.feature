Feature: Login Salesforce

  Scenario Outline: Login SalesForce with Valid Input
    Given the user is on the salesforce login page
    When the user enter valid credentails for username 'dilip@testleaf.com'
    And the user enter password as 'leaf@2024'
    Then the user should on click on the login button
    And user should click on the toggle menu
    And user should click on view all option
    Then userclick on Sales option
    Then userclick on opportunities
    And user should clicking New option
    And user clicks on opportunity name <Opportunity Name>
    And user enters the amount as <Amount>
    Then user should close the date as today
    And user should click on Stage optionselect need analysis
    And user should click on the save button
    Then user should verify the name

    Examples: 
      | Opportunity Name                          | Amount  |
      | 'Salesforce Automation by Shanmuganathan' | '75000' |
