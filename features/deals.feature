Feature: Deals tab


Background:
    Given user has opened the browser 
    When user enters a url as "https://ui.freecrm.com/"
    Then verify that login page should be displayed 
    When user enters user name as "shantu147@gmail.com" and password as "Godvs400"
    And user clicks on the login button 
    Then verify that home page should be displayed 

Scenario: Verify Deals tab
    Given user has already landed on delas tab
    When User clicks on the delas tab
    Then deals tab should be displayed
    And close the application
    
    @sanity
    Scenario: verify the email tab
        Given user has already on the home page 
        When user clicks on the email tab
        Then email tab should be opened 
        And user teas down the application
   
    