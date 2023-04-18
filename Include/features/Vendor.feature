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
Feature: Vendor

  @test
  Scenario Outline: Add data empty vendor
    Given I login vendor username <username> and password <password>
    When I add new data empty vendor
    Then I click button save empty vendor

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  @test
  Scenario Outline: Cancel add data vendor
    Given I login vendor username <username> and password <password>
    When I click add data vendor
    Then I click button cancel vendor

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Add data new data vendor
    Given I login vendor username <username> and password <password>
    When I add new add data vendor
    Then I click button save vendor

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
 @test
  Scenario Outline: Add data registered vendor
    Given I login vendor username <username> and password <password>
    When I add data registered vendor
    Then I click button save registered vendor

  Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
      
  
      
      