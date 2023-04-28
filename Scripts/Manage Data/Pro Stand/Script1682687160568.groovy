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

WebUI.click(findTestObject('Manage Data/Pro Stand/submenu-pro_stand'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-add_pro_stand'))

WebUI.setText(findTestObject('Manage Data/Pro Stand/input-title_pro_stand'), 'PANDUAN INSPECTOR TERBARU')

WebUI.setText(findTestObject('Manage Data/Pro Stand/input-description'), 'description')

WebUI.click(findTestObject('Manage Data/Pro Stand/checklist-publish'))

WebUI.uploadFile(findTestObject('Manage Data/Pro Stand/upload-file'), 'C:\\Users\\Semoga Berkah\\Katalon Studio\\Automationtest-GASys2\\Data Files\\DummyFile\\file.pdf')

WebUI.click(findTestObject('Manage Data/Pro Stand/button-save'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-cancel'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-empty'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-oke_create'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-edit_option'))

WebUI.clearText(findTestObject('Manage Data/Pro Stand/input-title_pro_stand'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-edit_prostand'))

WebUI.click(findTestObject('Manage Data/Pro Stand/button-ok_edit'))

