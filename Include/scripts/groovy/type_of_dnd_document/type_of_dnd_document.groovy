package type_of_dnd_document
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



class type_of_dnd_document {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login type of DnD Document username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty type of DnD Document")
	def AddEmptyData() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/submenu-type_of_dnd_document'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-addtypednd'))
	}

	@Then("I click button save empty type of DnD Document")
	def SaveEmptyData() {
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-save_typeofdnd'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-ok_empty'))
	}

	@When("I click add data type of DnD Document")
	def ClickAddtypeDnD() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/submenu-type_of_dnd_document'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-addtypednd'))
	}

	@Then("I click button cancel type of DnD Document")
	def CancelTypeDnD() {
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-cancel_typeofdnd'))
	}

	@When("I add new data type of DnD Document")
	def Addtendertypeofdnd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/submenu-type_of_dnd_document'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-addtypednd'))
		WebUI.setText(findTestObject('Manage Data/Type of DnD Document/field-type_of_dnd'), 'Document Z')
	}

	@Then("I click button save type of DnD Document")
	def SaveDnD() {
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-save_typeofdnd'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-ok_berhasil'))
	}

	@When("I add data registered type of DnD Document")
	def ClickAddtendertypeofdnd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/submenu-type_of_dnd_document'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-addtypednd'))
		WebUI.setText(findTestObject('Manage Data/Type of DnD Document/field-type_of_dnd'), 'Document Low')
	}

	@Then("I click button save registered type of DnD Document")
	def SaveRegiteredDnD() {
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-save_typeofdnd'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-registered'))
	}

	@When("I click button edit type of DnD Document")
	def ClickEdittendertypeofdnd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/submenu-type_of_dnd_document'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-edit'))
		WebUI.clearText(findTestObject('Manage Data/Type of DnD Document/field-type_of_dnd'))
		WebUI.setText(findTestObject('Manage Data/Type of DnD Document/field-type_of_dnd'), 'Document Niken')
	}

	@Then("I click button save edit type of DnD Document")
	def SaveEditDnD() {
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-confirmedit'))
		WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-suksesedit'))
	}
}