package tender_type
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



class tender_type {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login tender type username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty tender type")
	def AddEmptyData() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Tender Type/submenu-tender_type'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-add_tendertype'))
	}

	@Then("I click button save empty tender type")
	def SaveEmptyData() {
		WebUI.click(findTestObject('Manage Data/Tender Type/button-save_tendertype'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_data_empty'))
	}

	@When("I click add data tender type")
	def ClickAddtendertype() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Tender Type/submenu-tender_type'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-add_tendertype'))
	}

	@Then("I click button cancel tender type")
	def CancelTendertype() {
		WebUI.click(findTestObject('Manage Data/Tender Type/button-cancel_tendertype'))
	}

	@When("I add new data tender type")
	def Addtendertype() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Tender Type/submenu-tender_type'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-add_tendertype'))
		WebUI.setText(findTestObject('Manage Data/Tender Type/field-tendertype'), 'Tender Type Mlg')
	}

	@Then("I click button save tender type")
	def SaveTendertype() {
		WebUI.click(findTestObject('Manage Data/Tender Type/button-save_tendertype'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_succes_add_data'))
	}

	@When("I add data registered tender type")
	def ClickAddregisteredTendertype() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Tender Type/submenu-tender_type'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-add_tendertype'))
		WebUI.setText(findTestObject('Manage Data/Tender Type/field-tendertype'), 'Lelang')
	}

	@Then("I click button save registered tender type")
	def SaveRegisteredTendertype() {
		WebUI.click(findTestObject('Manage Data/Tender Type/button-save_tendertype'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_data_registered'))
	}

	@When("I click button edit and edit data tender type")
	def ClickEdit() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Tender Type/submenu-tender_type'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-edit_tendertype'))
		WebUI.clearText(findTestObject('Manage Data/Tender Type/field-tendertype'))
		WebUI.setText(findTestObject('Manage Data/Division/field-division'), 'Edit tender')
	}

	@Then("I click button save edit tender type")
	def Saveedit() {
		WebUI.click(findTestObject('Manage Data/Tender Type/button-clickedit'))
		WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_succes_edit'))
	}
}