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

WebUI.click(findTestObject('Manage Data/PIC/submenu-pic'))

WebUI.click(findTestObject('Manage Data/PIC/button-add_pic'))

WebUI.setText(findTestObject('Manage Data/PIC/input-fullname'), 'John Bornet')

WebUI.setText(findTestObject('Manage Data/PIC/input-email'), 'john@getnada.com')

WebUI.click(findTestObject('Manage Data/PIC/radio-buttonPICP'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Manage Data/PIC/input-username'), 'John B')

WebUI.setText(findTestObject('Manage Data/PIC/input-code'), '888')

WebUI.setText(findTestObject('Manage Data/PIC/input-phone'), '085156922642')

WebUI.selectOptionByIndex(findTestObject('Manage Data/PIC/dropdown-area'), '2')

WebUI.selectOptionByIndex(findTestObject('Manage Data/PIC/dropdown-division'), '5')

WebUI.selectOptionByIndex(findTestObject('Manage Data/PIC/dropdown-departement'), '2')

WebUI.click(findTestObject('Manage Data/PIC/input-start_date'))

WebUI.click(findTestObject('Manage Data/PIC/itemdate-start'))

WebUI.click(findTestObject('Manage Data/PIC/input-end_date'))

WebUI.click(findTestObject('Manage Data/PIC/itemdate-end'))

WebUI.setText(findTestObject('Manage Data/PIC/input-password'), 'John123.')

WebUI.uploadFile(findTestObject('Manage Data/PIC/upload-file'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyImage\\files.png')

WebUI.click(findTestObject('Manage Data/PIC/button-cancel'))

WebUI.click(findTestObject('Manage Data/PIC/button-save'))

WebUI.click(findTestObject('Manage Data/PIC/button-empty'))

WebUI.click(findTestObject('Manage Data/PIC/button-oke_create'))

WebUI.click(findTestObject('Manage Data/PIC/button-option_edit'))

WebUI.clearText(findTestObject('Manage Data/PIC/input-fullname'))

WebUI.click(findTestObject('Manage Data/PIC/button-edit'))

WebUI.click(findTestObject('Manage Data/PIC/button-oke_edit'))

