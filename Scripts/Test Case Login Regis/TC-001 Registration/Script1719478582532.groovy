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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://wakool.academy/')

WebUI.click(findTestObject('Object Repository/Registration/Page_Dashboard  Wakool Academy/a_Daftar'))

WebUI.click(findTestObject('Object Repository/Registration/Page_Daftar  Wakool Academy/input_Nama Lengkap_name'))

WebUI.setText(findTestObject('Object Repository/Registration/Page_Daftar  Wakool Academy/input_Nama Lengkap_name'), 'Jons')

WebUI.setText(findTestObject('Object Repository/Registration/Page_Daftar  Wakool Academy/input_Email_email'), 'xju51771@vogco.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Daftar  Wakool Academy/input_Kata Sandi_password'), 
    '6TZDCUec4yDpudglGm9Nzw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Registration/Page_Daftar  Wakool Academy/input_Konfirmasi Ulang Kata Sandi_repassword'), 
    '6TZDCUec4yDpudglGm9Nzw==')

WebUI.click(findTestObject('Object Repository/Registration/Page_Daftar  Wakool Academy/button_DAFTAR SEKARANG'))

WebUI.closeBrowser()

