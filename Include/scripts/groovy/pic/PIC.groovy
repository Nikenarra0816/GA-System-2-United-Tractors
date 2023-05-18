package pic
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



class PIC {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I login pic username (.*) and password (.*)")
	def login(String username, String password) {
		WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : username, ('password') : password],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("I add new data empty pic")
	def AddNewsletter() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))
		WebUI.click(findTestObject('Manage Data/PIC/button-add_pic'))
	}

	@Then("I click button save empty pic")
	def Save() {
		WebUI.click(findTestObject('Manage Data/PIC/button-save'))
		WebUI.click(findTestObject('Manage Data/PIC/button-empty'))
	}
	
	@When("I click add data pic")
	def ClickAdd() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))
		WebUI.click(findTestObject('Manage Data/PIC/button-add_pic'))
	}
	
	@Then("I click button cancel pic")
	def Cancel() {
		WebUI.click(findTestObject('Manage Data/PIC/button-cancel'))
	}
	
	@When("I add new data pic")
	def ClickNewData() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))
		WebUI.click(findTestObject('Manage Data/PIC/button-add_pic'))
		WebUI.setText(findTestObject('Manage Data/PIC/input-fullname'), 'Zitty Entana')
		WebUI.setText(findTestObject('Manage Data/PIC/input-email'), 'zitty@getnada.com')
		WebUI.click(findTestObject('Manage Data/PIC/radio-buttonPICP'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Manage Data/PIC/input-username'), 'Zity')
		WebUI.setText(findTestObject('Manage Data/PIC/input-code'), '897')
		WebUI.setText(findTestObject('Manage Data/PIC/input-phone'), '085156822134')
		WebUI.selectOptionByIndex(findTestObject('Manage Data/PIC/dropdown-area'), '2')
		WebUI.selectOptionByIndex(findTestObject('Manage Data/PIC/dropdown-division'), '5')
		WebUI.selectOptionByIndex(findTestObject('Manage Data/PIC/dropdown-departement'), '2')
		WebUI.click(findTestObject('Manage Data/PIC/input-start_date'))
		WebUI.click(findTestObject('Manage Data/PIC/itemdate-start'))
		WebUI.click(findTestObject('Manage Data/PIC/input-end_date'))
		WebUI.click(findTestObject('Manage Data/PIC/itemdate-end'))
		WebUI.setText(findTestObject('Manage Data/PIC/input-password'), 'zity.')
		WebUI.uploadFile(findTestObject('Manage Data/PIC/upload-file'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyImage\\files.png')
	}
	
	@Then("I click button save pic")
	def SaveNewsletter() {
		WebUI.click(findTestObject('Manage Data/PIC/button-save'))
		WebUI.click(findTestObject('Manage Data/PIC/button-oke_create'))
	}
	
	@When("I click button edit and edit pic")
	def ClickEdit() {
		WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))
		WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))
		WebUI.click(findTestObject('Manage Data/PIC/button-option_edit'))
		WebUI.clearText(findTestObject('Manage Data/PIC/input-fullname'))
		WebUI.setText(findTestObject('Manage Data/PIC/input-fullname'), 'Zitty zzz')
		WebUI.uploadFile(findTestObject('Manage Data/PIC/upload-file'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyImage\\files.png')
	}
	
	@Then("I click button save edit pic")
	def SaveEditPIC() {
		WebUI.click(findTestObject('Manage Data/PIC/button-edit'))
		WebUI.click(findTestObject('Manage Data/PIC/button-oke_edit'))
	}
	
	
	
	
}