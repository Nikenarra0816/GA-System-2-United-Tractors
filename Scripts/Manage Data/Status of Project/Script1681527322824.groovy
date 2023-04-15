import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Reuseable-test/Block-login with credential'), [('username') : 'gdsechead', ('password') : '123qwe*'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manage Data/Status of Project/submenu-status_of_project'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-add_statusofproject'))

WebUI.setText(findTestObject('Manage Data/Status of Project/field-input_status_project'), 'Hold')

WebUI.click(findTestObject('Manage Data/Status of Project/button-save_statusofproject'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-berhasiltambahdata'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-empty_statusofproject'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-cancel_statusofproject'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-dataregistered'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-editoption'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-click_edit'))

WebUI.click(findTestObject('Manage Data/Status of Project/button-success_edit'))

