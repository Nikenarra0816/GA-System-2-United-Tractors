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

WebUI.click(findTestObject('Manage Data/Newsletter/submenu-newsletter'))

WebUI.click(findTestObject('Manage Data/Newsletter/button-addnewsletter'))

WebUI.setText(findTestObject('Manage Data/Newsletter/input-title_newsletter'), 'News Inspector')

WebUI.setText(findTestObject('Manage Data/Newsletter/input-content'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea')

WebUI.clearText(findTestObject('Manage Data/Newsletter/input-title_newsletter'))

WebUI.click(findTestObject('Manage Data/Newsletter/checklist-publish'))

WebUI.uploadFile(findTestObject('Manage Data/Newsletter/upload-img'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyImage\\file.jpeg')

WebUI.click(findTestObject('Manage Data/Newsletter/btn-save'))

WebUI.click(findTestObject('Manage Data/Newsletter/btn-cancel'))

WebUI.click(findTestObject('Manage Data/Newsletter/btn-okesukses'))

WebUI.click(findTestObject('Manage Data/Newsletter/btn-oke_empty'))

WebUI.click(findTestObject('Manage Data/Newsletter/btn-option_edit'))

WebUI.click(findTestObject('Manage Data/Newsletter/btn-edit'))

WebUI.click(findTestObject('Manage Data/Newsletter/btn-oke_edit'))

