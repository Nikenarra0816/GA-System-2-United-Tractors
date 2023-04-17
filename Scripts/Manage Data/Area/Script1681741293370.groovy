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

WebUI.setText(findTestObject('Manage Data/Area/input-areacode'), '687')

WebUI.setText(findTestObject('Manage Data/Area/input-areaname'), 'Sidoarjo')

WebUI.setText(findTestObject('Manage Data/Area/input-area_address'), 'Jl Sidoarjo No 31')

WebUI.setText(findTestObject('Manage Data/Area/input-latitude'), '7°35\'18.0"S 111°53\'29.8"E')

WebUI.setText(findTestObject('Manage Data/Area/input-longitude'), '8°45\'15.0"S 111°22\'11.1"E')

WebUI.setText(findTestObject('Manage Data/Area/input-telepon'), '085156755614')

WebUI.setText(findTestObject('Manage Data/Area/input-pimpinan'), 'Fahrul')

WebUI.setText(findTestObject('Manage Data/Area/input-jumlah_karyawan'), '25')

WebUI.setText(findTestObject('Manage Data/Area/input-luas_lahan'), '50')

WebUI.click(findTestObject('Manage Data/Area/button-ok_successedit'))

WebUI.click(findTestObject('Manage Data/Area/button-save'))

WebUI.click(findTestObject('Manage Data/Area/button-oke_success'))

WebUI.clearText(findTestObject('Manage Data/Area/input-areaname'))

WebUI.click(findTestObject('Manage Data/Area/button-okeregisterd'))

WebUI.click(findTestObject('Manage Data/Area/button-oke_empty'))

WebUI.click(findTestObject('Manage Data/Area/button-cancel'))

WebUI.click(findTestObject('Manage Data/Area/button-option_edit'))

WebUI.click(findTestObject('Manage Data/Area/button-klikedit'))

