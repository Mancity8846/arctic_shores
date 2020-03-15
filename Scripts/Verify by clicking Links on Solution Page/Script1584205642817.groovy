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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.arcticshores.com/')

WebUI.waitForElementPresent(findTestObject('Object Repository/New-Solutions/Page_Modern Psychometric Tests  Revolutionise Your Hiring  Arctic Shores/a_Solutions'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Modern Psychometric Tests  Revolutionise Your Hiring  Arctic Shores/a_Solutions'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Early Careers and Graduate Recruitment  Arctic Shores/h3_Offering data-driven assessment and development solutions to help you hire train and retain your employees'), 
    0)

'Test 5'
WebUI.scrollToElement(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Customisation  Branding'), 
    0)

'Test 5'
WebUI.enhancedClick(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Customisation  Branding'))

'Test 5'
WebUI.verifyElementText(findTestObject('Page_Customisation  Branding - Arctic Shores/h2_CustomisationBranding'), 'Customisation/Branding')

'Test 5'
WebUI.enhancedClick(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Employee Development'))

'Test 5'
WebUI.waitForElementPresent(findTestObject('Page_Employee Development Solutions  Arctic Shores/h2_Employee Development'), 
    0)

'Test 5'
WebUI.scrollToElement(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Employee Development'), 
    0)

'Test 5'
WebUI.verifyElementText(findTestObject('Page_Employee Development Solutions  Arctic Shores/h2_Employee Development'), 'Employee Development')

'Test 5'
WebUI.enhancedClick(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Experienced Hires'))

'Test 5'
WebUI.waitForElementPresent(findTestObject('Page_Experienced Hires  Solutions  Arctic Shores/h2_Experienced Hires'), 0)

'Test 5'
WebUI.scrollToElement(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Experienced Hires'), 
    0)

'Test 5'
WebUI.verifyElementText(findTestObject('Page_Experienced Hires  Solutions  Arctic Shores/h2_Experienced Hires'), 'Experienced Hires')

'Test 5'
WebUI.enhancedClick(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Volume Recruitment'))

'Test 5'
WebUI.verifyElementPresent(findTestObject('Page_Volume Recruitment  Arctic Shores/h2_Volume Recruitment'), 0)

'Test 5'
WebUI.scrollToElement(findTestObject('Page_Early Careers and Graduate Recruitment  Arctic Shores/a_Volume Recruitment'), 
    0)

'Test 5'
WebUI.verifyElementText(findTestObject('Page_Volume Recruitment  Arctic Shores/h2_Volume Recruitment'), 'Volume Recruitment')

'Test 6'
WebUI.scrollToElement(findTestObject('Page_Volume Recruitment  Arctic Shores/a_See our options here'), 0)

'Test 6'
WebUI.enhancedClick(findTestObject('Page_Volume Recruitment  Arctic Shores/a_See our options here'))

'Test 6'
WebUI.waitForElementPresent(findTestObject('Page_Customisation  Branding - Arctic Shores/h2_CustomisationBranding'), 0)

'Test 6\r\n\r\n'
WebUI.verifyElementText(findTestObject('Page_Customisation  Branding - Arctic Shores/h2_CustomisationBranding'), 'Customisation/Branding')

