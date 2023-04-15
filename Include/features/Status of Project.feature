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
Feature: Status of project

  @test
  Scenario Outline: Add data empty status of project
    Given I login status of project username <username> and password <password>
    When I add new data empty status of project
    Then I click button save empty data

   Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  @test
  Scenario Outline: Cancel add status of project
    Given I login status of project username <username> and password <password>
    When I click add status of project
    Then I click button save of project

   Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Add data new status of project
    Given I login status of project username <username> and password <password>
    When I add new status of project
    Then I click button save status of project

   Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Add data registered status of project
    Given I login status of project username <username> and password <password>
    When I add data registered status of project
    Then I click button save registered status of project

   Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      

      
      