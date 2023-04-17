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
Feature: Area

  @test
  Scenario Outline: Add data empty area
    Given I login area username <username> and password <password>
    When I add new data empty area
    Then I click button save empty area 

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	Scenario Outline: Cancel add data area
    Given I login area username <username> and password <password>
    When I click add data area
    Then I click button cancel area 

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Add data new data area
    Given I login area username <username> and password <password>
    When I add new data area
    Then I click button save area 

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Add data registered area
    Given I login area username <username> and password <password>
    When I add data registered area
    Then I click button save registered area 

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
  
      

      