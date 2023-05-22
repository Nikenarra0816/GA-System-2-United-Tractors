package vendor
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



class vendor {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login vendor username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty vendor")
	def Addvendor() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Vendor/submenu-vendor'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-add_vendor'))
	}

	@Then("I click button save empty vendor")
	def SaveEmpty() {
		WebUI.click(findTestObject('Manage Data/Vendor/button-save'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-oke_empty'))
	}

	@When("I click add data vendor")
	def Adddatavendor() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Vendor/submenu-vendor'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-add_vendor'))
	}

	@Then("I click button cancel vendor")
	def CancelVendor() {
		WebUI.click(findTestObject('Manage Data/Vendor/button-cancel'))
	}

	@When("I add new add data vendor")
	def Addnewvendor() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Vendor/submenu-vendor'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-add_vendor'))
		def vendor_name = 'Vendor_'+ GlobalVariable.RandomNumber
		WebUI.setText(findTestObject('Manage Data/Vendor/input-name_vendor'), vendor_name)
		WebUI.setText(findTestObject('Manage Data/Vendor/input-pic_vendor'), 'Yura')
		def email_vendor = 'Vendor+' + GlobalVariable.RandomNumber + '@gmail.com'
		WebUI.setText(findTestObject('Manage Data/Vendor/input-email_vendor'), email_vendor)
		WebUI.setText(findTestObject('Manage Data/Vendor/input-vendor_address'), 'Jln Yura ')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-phone'), '081625661726')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-nama_vendor_tdd'), 'Yura')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-jabatan_vendor'), 'CEO')
	}

	@Then("I click button save vendor")
	def SaveNewVendor() {
		WebUI.click(findTestObject('Manage Data/Vendor/button-save'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-oke_success'))
	}

	@When("I add data registered vendor")
	def AddRegisteredvendor() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Vendor/submenu-vendor'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-add_vendor'))
		WebUI.setText(findTestObject('Manage Data/Vendor/input-name_vendor'), 'Vendor BigCo')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-pic_vendor'), 'Fatih')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-email_vendor'), 'fatih@getnada.com')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-vendor_address'), 'Jln Malang ')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-phone'), '085187282776')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-nama_vendor_tdd'), 'Fatih C')
		WebUI.setText(findTestObject('Manage Data/Vendor/input-jabatan_vendor'), 'CEO')
	}

	@Then("I click button save registered vendor")
	def SaveRegisterVendor() {
		WebUI.click(findTestObject('Manage Data/Vendor/button-save'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-oke_registered'))
	}

	@When("I click button edit and edit data vendor")
	def AddEditVendor() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Vendor/submenu-vendor'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-option_edit'))
		WebUI.clearText(findTestObject('Manage Data/Vendor/input-name_vendor'))
		WebUI.setText(findTestObject('Manage Data/Vendor/input-name_vendor'), 'Vendornya Niken')
	}

	@Then("I click button save edit vendor")
	def SaveEditVendor() {
		WebUI.click(findTestObject('Manage Data/Vendor/button-editdata'))
		WebUI.click(findTestObject('Manage Data/Vendor/button-ok_succes_edit'))
	}
}