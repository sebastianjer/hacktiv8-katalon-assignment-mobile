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

//start app
Mobile.startApplication('C:\\Users\\u071837\\Documents\\Projects\\Katalon Training\\Android-Solodroid_E-CommerceApp Demo_3.2.0\\Solodroid_E-CommerceApp Demo_3.2.0.apk',
	true)
//click tab Profile
Mobile.tap(findTestObject('Object Repository/Tab Profile'), 0)
//click Edit to go to User Profile
Mobile.tap(findTestObject('Object Repository/Profile/Button Edit'), 0)
//click the email, clear text, and click ok without inputting new email
Mobile.tap(findTestObject('Object Repository/Profile/User Profile/View Email'), 3)
Mobile.clearText(findTestObject('Object Repository/Profile/User Profile/Input Text'), 0)
Mobile.tap(findTestObject('Object Repository/Profile/User Profile/Button OK'), 0)
//verify error message "Invalid Email Input"
Mobile.verifyElementText(findTestObject('Object Repository/Profile/User Profile/Error Invalid Input'), "Invalid Email Input")