#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@AMAZON
Feature: Amaazon login page
@smoke
  Scenario: verify the play order
    Given Go to home page
    And click on moblels links
    When click on moblels and acc links
    And click on radio button
    And click on moblels text links
    Then click on logout
   
@sanity
Scenario: Verify the successfull loguot page
Given: Go to home page 
When: click on the books lins
And: click on the english book radio botton
And: click on rubicks cube link
Then: click on logout link



    |
