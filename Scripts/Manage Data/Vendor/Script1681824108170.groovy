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

WebUI.click(findTestObject('Manage Data/Vendor/submenu-vendor'))

WebUI.click(findTestObject('Manage Data/Vendor/button-add_vendor'))

WebUI.setText(findTestObject('Manage Data/Vendor/input-name_vendor'), '')

WebUI.setText(findTestObject('Manage Data/Vendor/input-pic_vendor'), '')

WebUI.setText(findTestObject('Manage Data/Vendor/input-email_vendor'), '')

WebUI.setText(findTestObject('Manage Data/Vendor/input-vendor_address'), '')

WebUI.setText(findTestObject('Manage Data/Vendor/input-phone'), '')

WebUI.setText(findTestObject('Manage Data/Vendor/input-nama_vendor_tdd'), '')

WebUI.setText(findTestObject('Manage Data/Vendor/input-jabatan_vendor'), '')

WebUI.click(findTestObject('Manage Data/Vendor/button-save'))

WebUI.click(findTestObject('Manage Data/Vendor/button-oke_success'))

WebUI.click(findTestObject('Manage Data/Vendor/button-cancel'))

WebUI.click(findTestObject('Manage Data/Vendor/button-oke_empty'))

WebUI.click(findTestObject('Manage Data/Vendor/button-oke_registered'))

WebUI.click(findTestObject('Manage Data/Vendor/button-option_edit'))

WebUI.click(findTestObject('Manage Data/Vendor/button-editdata'))

WebUI.click(findTestObject('Manage Data/Vendor/button-ok_succes_edit'))

