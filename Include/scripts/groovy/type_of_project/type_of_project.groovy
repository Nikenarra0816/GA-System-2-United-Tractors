package type_of_project
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



class type_of_project {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login type of project username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty type of project")
	def AddEmptyDataTypeOfProject() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of Project/submenu-type_of_project'))
		WebUI.click(findTestObject('Manage Data/Type of Project/button-add_typeofproject'))
	}

	@Then("I click button save empty type of project")
	def SaveEmptyData() {
		WebUI.click(findTestObject('Manage Data/Type of Project/button-save_typeofproject'))
		WebUI.click(findTestObject('Manage Data/Type of Project/button-empty_typeofproject'))
	}

	@When("I click add data type of project")
	def AddDataTypeOfProject() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of Project/submenu-type_of_project'))
		WebUI.click(findTestObject('Manage Data/Type of Project/button-add_typeofproject'))
	}

	@Then("I click button cancel type of project")
	def CancelData() {
		WebUI.click(findTestObject('Manage Data/Type of Project/button-cancel_typeofproject'))
	}

	@When("I add new add data type of project")
	def AddNewDataTypeOfProject() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of Project/submenu-type_of_project'))
		WebUI.click(findTestObject('Manage Data/Type of Project/button-add_typeofproject'))
		def type_name = 'Type_'+ GlobalVariable.RandomNumber
		WebUI.setText(findTestObject('Manage Data/Type of Project/field-type_of_project'), type_name)
	}

	@Then("I click button save type of project")
	def SaveRegisteredData() {
		WebUI.click(findTestObject('Manage Data/Type of Project/button-save_typeofproject'))
		WebUI.click(findTestObject('Manage Data/Type of Project/button-success_typeofproject'))
	}

	@When("I add data registerd type of project")
	def AddRegisteredDataCategory() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of Project/submenu-type_of_project'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-add_tendertype'))
		WebUI.setText(findTestObject('Manage Data/Tender Type/field-tendertype'), 'Onsite')
	}

	@Then("I click button save registered type of project")
	def SaveRegisteredCategory() {
		WebUI.click(findTestObject('Manage Data/Tender Type/button-save_tendertype'))
		WebUI.click(findTestObject('Manage Data/Category of Project/button-category_register'))
	}

	@When("I click button edit type of project")
	def ClickEditDataProject() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of Project/submenu-type_of_project'))
		WebUI.click(findTestObject('Manage Data/Type of Project/button-optionedit'))
		WebUI.clearText(findTestObject('Manage Data/Type of Project/field-type_of_project'))
		WebUI.setText(findTestObject('Manage Data/Tender Type/field-tendertype'), 'Onsite Niken')
	}

	@Then("I click button save edit type of project")
	def SaveEditCategory() {
		WebUI.click(findTestObject('Manage Data/Type of Project/button-click_edit'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_succes_edit'))
	}
}