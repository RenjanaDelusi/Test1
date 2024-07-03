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

WebUI.navigateToUrl('https://reqres.in/')

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/a_List users'))

WebUI.navigateToUrl('https://reqres.in/api/users?page=1')

WebUI.delay(5)

WebUI.navigateToUrl('https://reqres.in/')

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/a_Single user'))

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/span_apiusers2'))

WebUI.delay(5)

WebUI.navigateToUrl('https://reqres.in/')

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/li_Update'))

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/span_apiusers2'))

WebUI.delay(5)

WebUI.navigateToUrl('https://reqres.in/')

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/a_Register - successful'))

WebUI.click(findTestObject('Object Repository/Page_Reqres - A hosted REST-API ready to re_1f6e1c/span_apiregister'))

WebUI.delay(5)

WebUI.closeBrowser()

