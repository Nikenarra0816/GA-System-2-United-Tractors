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
Feature: Login
  
  Background:
  Given I open https://ut-depan.pages.dev/

  @test
  Scenario Outline: Logging in as an existing user with invalid password
    When I fill in correct username <username> and incorret password <password>
    And I click Log In
    Then I see error message Username atau password salah

    Examples: 
      | username  | password | 
      | gdsechead | vDCxDdcVGQE= | 
  
  Scenario Outline: Logging in as an existing user
  	When I fill in correct username <username> and password <password>
  	And I click Log In 
  	Then I see my home page 
  	
  	Examples: 
      | username  | password | 
      | gdsechead | n6NR8oDuwok= | 
  	
  	
  
  