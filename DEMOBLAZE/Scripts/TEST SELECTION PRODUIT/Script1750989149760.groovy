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

WebUI.navigateToUrl('https://demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Iphone 6 32gb'))

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Add to cart'))

WebUI.waitForAlert(3)

WebUI.acceptAlert()

WebUI.waitForElementVisible(findTestObject('Page_STORE/a_Cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_STORE/a_Cart'))

WebUI.waitForElementVisible(findTestObject('Page_STORE/button_Place Order'), 0)

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Name_name'), 'Azizou')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Country_country'), 'FRANCE')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_City_city'), 'ARGENTEUIL')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Credit card_card'), '4242424242424242')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Month_month'), 'APRIL')

WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Year_year'), '2029')

WebUI.click(findTestObject('Object Repository/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Page_STORE/button_OK'))

WebUI.closeBrowser()

