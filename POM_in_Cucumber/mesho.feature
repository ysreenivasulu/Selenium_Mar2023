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
@tag
Feature: Verify meesho e-commerce
  I want to use this template for my feature file

  @tag1
  Scenario: Verify the logo 
    Given go to home page
    And go to on moble button
    When click on moble future
    And go to next aaction
    And click on oppo version
    Then i validate the buy futere
    And check the buy outcomes

 # @tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
 #   Then I verify the <status> in step

  #  Examples: 
   #   | name  | value | status  |
    #  | name1 |     5 | success |
     # | name2 |     7 | Fail    |
