package tender
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



class tender {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I login valid username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty tender")
	def AddTender() {
		WebUI.click(findTestObject('Tender/menu-tender'))
		WebUI.click(findTestObject('Tender/button-add-vendor'))
	}

	@Then("I click button save")
	def Save() {
		WebUI.click(findTestObject('Tender/button-save'))
		WebUI.click(findTestObject('Tender/button-okkosong'))
	}
	
	@When("I click add data")
	def Clickdata() {
		WebUI.click(findTestObject('Tender/menu-tender'))
		WebUI.click(findTestObject('Tender/button-add-vendor'))
	}
	
	@Then("I click button cancel")
	def Canceldata() {
		WebUI.click(findTestObject('Tender/button-cancel'))
	}
	
	@When("I add new data tender")
	def AddNewTender() {
		WebUI.click(findTestObject('Tender/menu-tender'))
		WebUI.click(findTestObject('Tender/button-add-vendor'))
		WebUI.setText(findTestObject('Tender/field-namakontraktor'), 'Yuhu Contractor')
		WebUI.setText(findTestObject('Tender/field-vendorpic'), 'Yuhu')
		WebUI.setText(findTestObject('Tender/field-email'), 'yuhu@getnada.com')
		WebUI.setText(findTestObject('Tender/field-alamatkantor'), 'Palembang')
		WebUI.setText(findTestObject('Tender/field-telepon'), '085243245342')
		WebUI.setText(findTestObject('Tender/field-namavendorttd'), 'Yuhu')
		WebUI.setText(findTestObject('Tender/field-jabatanvendorttd'), 'CEO')	
	}
	
	@Then("I click save data")
	def Savenewdata() {
		WebUI.click(findTestObject('Tender/button-save'))
        WebUI.click(findTestObject('Tender/button-ok tender'))
	}
	
	@When("I add data tender with registered data")
	def AddRegisteredData() {
		WebUI.click(findTestObject('Tender/menu-tender'))
		WebUI.click(findTestObject('Tender/button-add-vendor'))
		WebUI.setText(findTestObject('Tender/field-namakontraktor'), 'JJ Contractor')
		WebUI.setText(findTestObject('Tender/field-vendorpic'), 'Nando')
		WebUI.setText(findTestObject('Tender/field-email'), 'nando@getnada.com')
		WebUI.setText(findTestObject('Tender/field-alamatkantor'), 'Tasik')
		WebUI.setText(findTestObject('Tender/field-telepon'), '085222332123')
		WebUI.setText(findTestObject('Tender/field-namavendorttd'), 'Nando R')
		WebUI.setText(findTestObject('Tender/field-jabatanvendorttd'), 'CEO')
	}
	
	@Then("I click save data registered")
	def Savedataregistered() {
		WebUI.click(findTestObject('Tender/button-save'))
		WebUI.click(findTestObject('Tender/button-ok terdaftar'))
	}
	
	
}