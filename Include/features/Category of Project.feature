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
Feature: Category Of Project

  @test
  Scenario Outline: Add data empty category of project
    Given I login category username <username> and password <password>
    When I add new data empty category of project
    Then I click button save empty category of project

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    
	@test
  Scenario Outline: Cancel add data category of project
    Given I login category username <username> and password <password>
    When I click add data category of project
    Then I click button cancel category of project

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    
  @test
  Scenario Outline: Add data new category of project
    Given I login category username <username> and password <password>
    When I add new data category of project
    Then I click button save category of project

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    
	@test
  Scenario Outline: Add data registered category of project
    Given I login category username <username> and password <password>
    When I add data registered category of project
    Then I click button save registered category of project

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    
	@test
  Scenario Outline: Edit data category of project
    Given I login category username <username> and password <password>
    When I click button edit category of project
    Then I click button save edit category of project

    Examples: 
    | username  | password | 
    | gdsechead | 123qwe* | 
    

    
    
    
    
    