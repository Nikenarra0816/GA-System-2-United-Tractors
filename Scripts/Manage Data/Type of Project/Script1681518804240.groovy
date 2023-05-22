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

WebUI.click(findTestObject('Manage Data/Type of Project/submenu-type_of_project'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-add_typeofproject'))

WebUI.setText(findTestObject('Manage Data/Type of Project/field-type_of_project'), type_name)

WebUI.click(findTestObject('Manage Data/Type of Project/button-save_typeofproject'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-success_typeofproject'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-cancel_typeofproject'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-empty_typeofproject'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-registered'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-optionedit'))

WebUI.clearText(findTestObject('Manage Data/Type of Project/field-type_of_project'))

WebUI.click(findTestObject('Manage Data/Type of Project/button-click_edit'))

WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_succes_edit'))

