package services

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Steps {

	@Keyword
	def OpenMobileApps(AppName,OpenApp) {
		if(OpenApp==true){

			Mobile.startApplication("../Mobile Sample Test/apk file/"+AppName, false)
			Mobile.tap(findTestObject("Object Repository/SplashScreen/Btn_Lanjut"), 2)
			Mobile.tap(findTestObject("Object Repository/SplashScreen/Btn_Mulai"), 2)
		}else{

			Mobile.startExistingApplication(AppName)
		}
	}

	@Keyword
	def OpenWebBrowser(BaseURL) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(BaseURL)
	}

	@Keyword
	def LogoutMobile() {
		Mobile.tap(findTestObject("Object Repository/Beranda/Menu_Button Pengaturan"), 2)
		Mobile.tap(findTestObject("Object Repository/Settings/Logout/Btn_Keluar"), 2)
		Mobile.verifyElementExist(findTestObject("Object Repository/Settings/Logout/Title_Popup_Keluar"), 2)
		Mobile.tap(findTestObject("Object Repository/Settings/Logout/Btn_Popup_Keluar"), 2)
	}
}
