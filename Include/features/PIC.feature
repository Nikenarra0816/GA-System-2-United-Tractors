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
Feature: PIC

  @test
  Scenario Outline: Add data empty pic
    Given I login pic username <username> and password <password>
    When I add new data empty pic
    Then I click button save empty pic

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  @test
  Scenario Outline: Cancel data pic
    Given I login pic username <username> and password <password>
    When I click add data pic
    Then I click button cancel pic

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
  
      