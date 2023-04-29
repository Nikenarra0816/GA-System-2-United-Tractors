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
Feature: Pro Stand

  @test
  Scenario Outline: Add data empty pro stand 
    Given I login prostand username <username> and password <password>
    When I add new data empty pro stand 
    Then I click button save empty pro stand

     Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Cancel data pro stand 
    Given I login prostand username <username> and password <password>
    When I click add data pro stand
    Then I click button cancel pro stand 

     Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Add data new pro stand 
    Given I login prostand username <username> and password <password>
    When I add new data pro stand
    Then I click button save pro stand 

     Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
 
 
      
      
      