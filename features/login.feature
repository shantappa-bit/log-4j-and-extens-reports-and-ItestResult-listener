Feature: Login


@sanity
Scenario: Successfull login with invalid credentials
    Given user has opened the browser 
    When user enters a url as "https://ui.freecrm.com/"
    Then verify that login page should be displayed 
    When user enters user name as "shantu147@gmail.com" and password as "Godvs400"
    And user clicks on the login button 
    Then verify that home page should be displayed 
    When user clicks on the log out link 
    Then verify that login page should be dispayed 
    And close the browser 
    
    
    @smoke
    Scenario Outline: data driven testing with multiple set of data 
    	Given user has opened the browser 
    When user enters a url as "<url>"
    Then verify that login page should be displayed 
    When user enters user name as "<username>" and password as "<pwd>"
    And user clicks on the login button 
    Then verify that home page should be displayed 
    When user clicks on the log out link 
    Then verify that login page should be dispayed 
    And close the browser 
    		
    		Examples:
    		| username | pwd | url |
    		| shantu147@gmail.com | Godvs400 | https://ui.freecrm.com/ |
    		| shantu147@gmail.com | Godvs400 | https://ui.freecrm.com/ |
    		| shantu147@gmail.com | Godvs400 | https://ui.freecrm.com/ |
    