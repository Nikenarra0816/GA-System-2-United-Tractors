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
Feature: Newsletter

  @test
  Scenario Outline: Add data empty newsletter
    Given I login newsletter username <username> and password <password>
    When I add new data empty newsletter
    Then I click button save empty newsletter

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Cancel data newsletter
    Given I login newsletter username <username> and password <password>
    When I click add data newsletter
    Then I click button cancel newsletter

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Add data new newsletter
    Given I login newsletter username <username> and password <password>
    When I add new data newsletter
    Then I click button save newsletter

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
	@test
  Scenario Outline: Edit data newsletter
    Given I login newsletter username <username> and password <password>
    When I click button edit and edit newsletter
    Then I click button save edit newsletter

    Examples: 
      | username  | password | 
      | gdsechead | 123qwe* | 
      
      
      
      

      

      
  
      
      
      