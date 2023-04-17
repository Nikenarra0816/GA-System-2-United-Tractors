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

WebUI.click(findTestObject('Manage Data/Area/submenu-area'))

WebUI.click(findTestObject('Manage Data/Area/button-add_area'))

WebUI.setText(findTestObject('Manage Data/Area/input-areacode'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-areaname'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-area_address'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-latitude'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-longitude'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-telepon'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-pimpinan'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-jumlah_karyawan'), '')

WebUI.setText(findTestObject('Manage Data/Area/input-luas_lahan'), '')

WebUI.click(findTestObject('Manage Data/Area/button-save'))

WebUI.click(findTestObject('Manage Data/Area/button-oke_success'))

WebUI.clearText(findTestObject('Manage Data/Area/input-areaname'))

WebUI.click(findTestObject('Manage Data/Area/button-okeregisterd'))

WebUI.click(findTestObject('Manage Data/Area/button-oke_empty'))

WebUI.click(findTestObject('Manage Data/Area/button-cancel'))

WebUI.click(findTestObject('Manage Data/Area/button-option_edit'))

WebUI.click(findTestObject('Manage Data/Area/button-klikedit'))

