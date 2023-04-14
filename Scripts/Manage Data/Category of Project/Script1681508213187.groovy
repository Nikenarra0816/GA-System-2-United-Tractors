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

WebUI.click(findTestObject('Manage Data/Category of Project/submenu-category_of_project'))

WebUI.click(findTestObject('Manage Data/Tender Type/button-add_tendertype'))

WebUI.setText(findTestObject('Manage Data/Tender Type/field-tendertype'), 'CO Sales')

WebUI.click(findTestObject('Manage Data/Tender Type/button-save_tendertype'))

WebUI.click(findTestObject('Manage Data/Tender Type/button-ok_succes_add_data'))

WebUI.click(findTestObject('Manage Data/Category of Project/button-cancel_category'))

WebUI.click(findTestObject('Manage Data/Category of Project/button-ok_empty'))

WebUI.click(findTestObject('Manage Data/Category of Project/button-category_register'))

WebUI.click(findTestObject('Manage Data/Category of Project/button-edit_option'))

WebUI.setText(findTestObject('Manage Data/Category of Project/field-inputcategory'), 'CO Yuhu')

WebUI.click(findTestObject('Manage Data/Category of Project/button-edit_category'))

WebUI.click(findTestObject('Manage Data/Category of Project/button-success_edit'))

