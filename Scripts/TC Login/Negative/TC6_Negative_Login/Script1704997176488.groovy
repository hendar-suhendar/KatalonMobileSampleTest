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

'Buka Aplikasi Smart Residence'
new services.Steps().OpenMobileApps(GlobalVariable.Apk_File,true)
Mobile.takeScreenshot()

'Masukkan No. handphone'
Mobile.setText(findTestObject("Object Repository/Login/Input_No. Handphone"),No_HP, 2)
Mobile.takeScreenshot()

'Masukkan Kata Sandi Ke 1'
Mobile.setText(findTestObject("Object Repository/Login/Input_Kata Sandi"), Wrong_Password_1, 2)
Mobile.takeScreenshot()

'Klik Button Masuk'
Mobile.tap(findTestObject("Object Repository/Login/Btn_Masuk"), 2)

'Verifikasi Popup Login Gagal dengan memasukkan Kata Sandi yang salah Ke 1'
Mobile.verifyElementExist(findTestObject("Object Repository/Validation/Title_Popup",[('var'):'Informasi']), 10,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject("Object Repository/Validation/Description_Popup",[('var'):'Username dan Password Anda salah. Silakan ulangi kembali, jika salah lebih 3x, Akun Anda akan diblokir.']), 10,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot()


'Masukkan Kata Sandi Ke 2'
Mobile.clearText("Object Repository/Login/Input_Kata Sandi", 2)
Mobile.setText(findTestObject("Object Repository/Login/Input_Kata Sandi"), Wrong_Password_2, 2)

'Klik Button Masuk'
Mobile.tap(findTestObject("Object Repository/Login/Btn_Masuk"), 2)



'Verifikasi Popup Login Gagal dengan memasukkan Kata Sandi yang salah Ke 2'
Mobile.verifyElementExist(findTestObject("Object Repository/Validation/Title_Popup",[('var'):'Informasi']), 10,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.verifyElementExist(findTestObject("Object Repository/Validation/Description_Popup",[('var'):'Username dan Password Anda salah. Silakan ulangi kembali, jika salah lebih 3x, Akun Anda akan diblokir.']), 10,FailureHandling.CONTINUE_ON_FAILURE)
Mobile.takeScreenshot()


'Masukkan Kata Sandi Ke 3'
Mobile.clearText("Object Repository/Login/Input_Kata Sandi", 2)
Mobile.setText(findTestObject("Object Repository/Login/Input_Kata Sandi"), Wrong_Password_3, 2)
Mobile.takeScreenshot()

'Klik Button Masuk'
Mobile.tap(findTestObject("Object Repository/Login/Btn_Masuk"), 2)

'Verifikasi Popup Login Gagal dengan memasukkan Kata Sandi yang salah ke 3'
/*
 * Ubah verifikasi keterangan yang diberikan sesuai dengan design UI/UX atau keterangan saat ter block 
 * Saat melakukan sample test ini saya tidak dapat lakukan, bila akun telah ter block saya tidak bisa / tidak terdapat akses untuk
 * melakukan aktif kan akun kembali 
 */
//Mobile.verifyElementExist(findTestObject("Object Repository/Validation/Title_Popup",[('var'):'Informasi']), 10,FailureHandling.CONTINUE_ON_FAILURE)
//Mobile.verifyElementExist(findTestObject("Object Repository/Validation/Description_Popup",[('var'):'Akun Anda Terblokir']), 10,FailureHandling.CONTINUE_ON_FAILURE)
//Mobile.takeScreenshot()

Mobile.closeApplication()