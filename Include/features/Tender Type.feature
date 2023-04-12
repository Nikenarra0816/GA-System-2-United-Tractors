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
Feature: Tender Type

  @test
  Scenario Outline: Add data empty tender type
    Given I login tender type username <username> and password <password>
    When I add new data empty tender type
    Then I click button save empty tender type

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    
  Scenario Outline: Cancel Add data tender type
    Given I login tender type username <username> and password <password>
    When I click add data tender type
    Then I click button cancel tender type

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    
  Scenario Outline: Add data new tender type
    Given I login division username <username> and password <password>
    When I add new data tender type
    Then I click button save tender type

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
    
    