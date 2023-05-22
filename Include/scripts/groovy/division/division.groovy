package division
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



class division {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login division username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty division")
	def AddDivision() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Division/submenu-division'))
		WebUI.click(findTestObject('Manage Data/Division/button-adddivision'))
	}

	@Then("I click button save empty")
	def Save() {
		WebUI.click(findTestObject('Manage Data/Division/button-save'))
		WebUI.click(findTestObject('Manage Data/Division/button-okwajibisi'))
	}

	@When("I click add data division")
	def ClickAdd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Division/submenu-division'))
		WebUI.click(findTestObject('Manage Data/Division/button-adddivision'))
	}

	@Then("I click button cancel division")
	def Cancel() {
		WebUI.click(findTestObject('Manage Data/Division/button-cancel'))
	}

	@When("I add new data division")
	def ClickNewData() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Division/submenu-division'))
		WebUI.click(findTestObject('Manage Data/Division/button-adddivision'))
		def division_name = 'Division_' + GlobalVariable.RandomNumber
		WebUI.setText(findTestObject('Manage Data/Division/field-division'), division_name)
	}

	@Then("I click button save division")
	def Savedivision() {
		WebUI.click(findTestObject('Manage Data/Division/button-save'))
		WebUI.click(findTestObject('Manage Data/Division/button-okberhasil'))
	}

	@When("I add data registered division")
	def ClickDataRegistered() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Division/submenu-division'))
		WebUI.click(findTestObject('Manage Data/Division/button-adddivision'))
		WebUI.setText(findTestObject('Manage Data/Division/field-division'), 'Division Inspector Nganjuk')
	}

	@Then("I click button save registered division")
	def Saveregistered() {
		WebUI.click(findTestObject('Manage Data/Division/button-save'))
		WebUI.click(findTestObject('Manage Data/Division/button-okterdaftar'))
	}

	@When("I click button edit and edit data")
	def ClickEdit() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Division/submenu-division'))
		WebUI.click(findTestObject('Manage Data/Division/button-edit'))
		WebUI.clearText(findTestObject('Manage Data/Division/field-division'))
		WebUI.setText(findTestObject('Manage Data/Division/field-division'), 'Division Product Manager')
	}

	@Then("I click button save edit")
	def Saveedit() {
		WebUI.click(findTestObject('Manage Data/Division/button-save'))
		WebUI.click(findTestObject('Manage Data/Division/button-berhasiledit'))
	}
}