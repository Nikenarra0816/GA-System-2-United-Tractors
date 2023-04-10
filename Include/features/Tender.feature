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
Feature: Tender

  @tag1
  Scenario Outline: Add data empty
    Given I login valid username <username> and password <password>
    When I add new data empty tender
    Then I click button save

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Cancel add data tender 
    Given I login valid username <username> and password <password>
    When I click add data
    Then I click button cancel
      
     Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Add data new tender
    Given I login valid username <username> and password <password>
    When I add new data tender
    Then I click save data

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
  Scenario Outline: Add data tender with registered data
  	Given I login valid username <username> and password <password>
    When I add data tender with registered data 
    Then I click save data registered
    
    Examples:
    | username | password|
    | gdsechead | 123qwe*|
    
	Scenario Outline: See detailed data tender
		Given I login valid username <username> and password <password>
		When I click detailed data tender
		Then I back to menu tender 
		
		Examples:
    | username | password|
    | gdsechead | 123qwe*|
    
    
     