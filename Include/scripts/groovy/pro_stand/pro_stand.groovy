package pro_stand
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



class pro_stand {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login prostand username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty pro stand")
	def AddProStand() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/submenu-pro_stand'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-add_pro_stand'))
	}

	@Then("I click button save empty pro stand")
	def Save() {
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-save'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-empty'))
	}
	
	@When("I click add data pro stand")
	def ClickAddProStand() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/submenu-pro_stand'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-add_pro_stand'))
	}

	@Then("I click button cancel pro stand")
	def Cancel() {
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-cancel'))
	}
	
	@When("I add new data pro stand")
	def ClickNewData() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/submenu-pro_stand'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-add_pro_stand'))
		WebUI.setText(findTestObject('Manage Data/Pro Stand/input-title_pro_stand'), 'PANDUAN INSPECTOR TERBARU BGT')
		WebUI.setText(findTestObject('Manage Data/Pro Stand/input-description'), 'description')
		WebUI.click(findTestObject('Manage Data/Pro Stand/checklist-publish'))
		WebUI.uploadFile(findTestObject('Manage Data/Pro Stand/upload-file'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyFile\\file.pdf')
	}

	@Then("I click button save pro stand")
	def SaveProStand() {
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-save'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-oke_create'))
	}
	
	@When("I click button edit and edit pro stand")
	def ClickEdit() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/submenu-pro_stand'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-edit_option'))
		WebUI.clearText(findTestObject('Manage Data/Pro Stand/input-title_pro_stand'))
		WebUI.setText(findTestObject('Manage Data/Pro Stand/input-title_pro_stand'), 'PANDUAN INSPECTOR 2024')
		WebUI.uploadFile(findTestObject('Manage Data/Pro Stand/upload-file'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyFile\\file.pdf')
	}

	@Then("I click button save edit pro stand")
	def SaveEditProStand() {
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-edit_prostand'))
		WebUI.click(findTestObject('Manage Data/Pro Stand/button-ok_edit'))
	}
}