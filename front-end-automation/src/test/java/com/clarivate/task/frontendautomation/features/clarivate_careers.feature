Feature: Google Search and Clarivate careers

 Background:
  Given I Navigate to Google 
    When I search for "Clarivate Analytics"
    
  Scenario: write the titles of all results on the first page to a text file
    Then I write the titles of all results on the first page to a text file


  Scenario: Filter Technology jobs in Bangalore
    Given I navigate to the "https://clarivate.com/" website from Google search results
    When I click on the "Careers" link
    #And I filter the list for "Technology" jobs in "Bangalore"
    #Then the number of jobs shown matches the count in the brackets