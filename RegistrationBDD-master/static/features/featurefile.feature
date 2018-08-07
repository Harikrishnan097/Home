Feature: Registration

  Scenario: Registration for user
    Given user is on first page
    Then user enters name
    Then user enters gender
    Then user enters email 
    Then user enters contact
    Then user enters address 
    Then user enters city 
    Then user enters state 
	Given  user is on second page
	Then  user enters projectdetails
		Then  user enters Project name  
		Then  user enters Client name
		Then enters  Team Size
		