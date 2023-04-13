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

WebUI.click(findTestObject('Manage Data/Division/menu-managedata'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/submenu-type_of_dnd_document'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-addtypednd'))

WebUI.setText(findTestObject('Manage Data/Type of DnD Document/field-type_of_dnd'), '')

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-save_typeofdnd'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-ok_berhasil'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-cancel_typeofdnd'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-ok_empty'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-registered'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-edit'))

WebUI.clearText(findTestObject('Manage Data/Type of DnD Document/field-type_of_dnd'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-confirmedit'))

WebUI.click(findTestObject('Manage Data/Type of DnD Document/button-suksesedit'))

