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

String searchKeyword = "Baby"

//start app
Mobile.startApplication('C:\\Users\\u071837\\Documents\\Projects\\Katalon Training\\Android-Solodroid_E-CommerceApp Demo_3.2.0\\Solodroid_E-CommerceApp Demo_3.2.0.apk',
	true)
//click tab Category
Mobile.tap(findTestObject('Object Repository/Tab Category'), 0)
//click search icon
Mobile.tap(findTestObject('Object Repository/Category/Icon Search'), 0)
//input search keyword
Mobile.setText(findTestObject('Object Repository/Category/Input Search Text'), searchKeyword, 0)
//verify result contains searchKeyword (this test case is for keyword that return a result)
String result = Mobile.getText(findTestObject('Object Repository/Category/Result Text'), 3)
assert result.contains(searchKeyword)