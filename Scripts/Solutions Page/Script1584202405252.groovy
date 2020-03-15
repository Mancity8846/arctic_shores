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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.arcticshores.com/')

WebUI.waitForElementPresent(findTestObject('Page_Modern Psychometric Tests  Revolutionise Your Hiring  Arctic Shores/a_Solutions'), 
    0)

WebUI.click(findTestObject('Page_Modern Psychometric Tests  Revolutionise Your Hiring  Arctic Shores/a_Solutions'))

WebUI.waitForElementVisible(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/h3_Offering data-driven assessment and development solutions to help you hire train and retain your employees'), 
    0)

'Test 2'
WebUI.verifyElementText(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/h3_Offering data-driven assessment and development solutions to help you hire train and retain your employees'), 
    'Offering data-driven assessment and development solutions to help you hire, train and retain your employees.')

