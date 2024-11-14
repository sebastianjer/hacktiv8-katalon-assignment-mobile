import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
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

//new user profile, hardcoded for now
//address is the same as default as it's not possible to input address for now
Map userProfile = [
	"name": "New Test Name",
	"email": "blabla@gmail.com",
	"phone": "+6281378654910",
	"address": "Your Address"
]

//start app
Mobile.startApplication('C:\\Users\\u071837\\Documents\\Projects\\Katalon Training\\Android-Solodroid_E-CommerceApp Demo_3.2.0\\Solodroid_E-CommerceApp Demo_3.2.0.apk',
	true)

//click tab Profile
Mobile.tap(findTestObject('Object Repository/Tab Profile'), 0)
//click Edit to go to User Profile
Mobile.tap(findTestObject('Object Repository/Profile/Button Edit'), 0)
//check if current name not equal to userProfile.name
if (userProfile.name != Mobile.getText(findTestObject('Object Repository/Profile/User Profile/View Name'), 3)) {
	//if not equal then update name
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/View Name'), 3)
	//clear text
	Mobile.clearText(findTestObject('Object Repository/Profile/User Profile/Input Text'), 0)
	//set text
	Mobile.setText(findTestObject('Object Repository/Profile/User Profile/Input Text'), userProfile.name, 0)
	//click ok
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/Button OK'), 0)
}

//email
if (userProfile.email != Mobile.getText(findTestObject('Object Repository/Profile/User Profile/View Email'), 3)) {
	//if not equal then update email
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/View Email'), 0)
	//clear text
	Mobile.clearText(findTestObject('Object Repository/Profile/User Profile/Input Text'), 0)
	//set text
	Mobile.setText(findTestObject('Object Repository/Profile/User Profile/Input Text'), userProfile.email, 0)
	//click ok
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/Button OK'), 0)
}

//phone
if (userProfile.phone != Mobile.getText(findTestObject('Object Repository/Profile/User Profile/View Phone'), 3)) {
	//if not equal then update email
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/View Phone'), 0)
	//clear text
	Mobile.clearText(findTestObject('Object Repository/Profile/User Profile/Input Text'), 0)
	//set text
	Mobile.setText(findTestObject('Object Repository/Profile/User Profile/Input Text'), userProfile.phone, 0)
	//click ok
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/Button OK'), 0)
}

//address
//somehow it clicks phone number even though the xpath/attribute is different, resulting in address inputted to phone number
if (userProfile.address != Mobile.getText(findTestObject('Object Repository/Profile/User Profile/View Address'), 3)) {
	//if not equal then update email
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/View Address'), 0)
	//clear text
	Mobile.clearText(findTestObject('Object Repository/Profile/User Profile/Input Text'), 0)
	//set text
	Mobile.setText(findTestObject('Object Repository/Profile/User Profile/Input Text'), userProfile.address, 0)
	//click ok
	Mobile.tap(findTestObject('Object Repository/Profile/User Profile/Button OK'), 0)
}

//go back to Profile
Mobile.tap(findTestObject('Object Repository/Profile/User Profile/Button Back'), 0)

//verify if texts in Profile are updated correctly
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Name'), userProfile.name)
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Email'), userProfile.email)
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Phone'), userProfile.phone)
Mobile.verifyElementText(findTestObject('Object Repository/Profile/Address'), userProfile.address)