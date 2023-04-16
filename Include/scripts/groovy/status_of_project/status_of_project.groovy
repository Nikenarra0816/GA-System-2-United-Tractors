package status_of_project
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class status_of_project {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login status of project username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty status of project")
	def AddStatusProject() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Status of Project/submenu-status_of_project'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-add_statusofproject'))
	}

	@Then("I click button save empty data")
	def Save() {
		WebUI.click(findTestObject('Manage Data/Status of Project/button-save_statusofproject'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-empty_statusofproject'))
	}
	
	@When("I click add status of project")
	def ClickAddStatusProject() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Status of Project/submenu-status_of_project'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-add_statusofproject'))
	}

	@Then("I click button save of project")
	def Cancel() {
		WebUI.click(findTestObject('Manage Data/Status of Project/button-cancel_statusofproject'))
	}
	
	@When("I add new status of project")
	def ClickNewStatus() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Status of Project/submenu-status_of_project'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-add_statusofproject'))
		WebUI.setText(findTestObject('Manage Data/Status of Project/field-input_status_project'), 'Backlog #2')
	}

	@Then("I click button save status of project")
	def SaveStatusofproject() {
		WebUI.click(findTestObject('Manage Data/Status of Project/button-save_statusofproject'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-berhasiltambahdata'))
	}
	
	@When("I add data registered status of project")
	def ClickNewDataStatus() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Status of Project/submenu-status_of_project'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-add_statusofproject'))
		WebUI.setText(findTestObject('Manage Data/Status of Project/field-input_status_project'), 'Hold')
	}

	@Then("I click button save registered status of project")
	def SaveStatus() {
		WebUI.click(findTestObject('Manage Data/Status of Project/button-save_statusofproject'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-dataregistered'))
	}
	
	@When("I click button edit and edit data registered status of project")
	def ClickEditDataStatus() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Status of Project/submenu-status_of_project'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-editoption'))
		WebUI.clearText(findTestObject('Manage Data/Status of Project/field-input_status_project'))
		WebUI.setText(findTestObject('Manage Data/Status of Project/field-input_status_project'), 'Todo')
	}

	@Then("I click button save edit status of project")
	def SaveEdit() {
		WebUI.click(findTestObject('Manage Data/Type of Project/button-click_edit'))
		WebUI.click(findTestObject('Manage Data/Status of Project/button-success_edit'))
	}
	
}