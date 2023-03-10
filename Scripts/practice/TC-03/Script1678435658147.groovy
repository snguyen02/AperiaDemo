import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String url = "https://www.fahasa.com/customer/account/create";

String username = '3634635678'
String password = 'ThisIsNotAPassword'
// Open browser
WebUI.openBrowser(url);
WebUI.maximizeWindow()

// Click Dang nhap
WebUI.click(findTestObject('Object Repository/TC_03/lbl_dangnhap'))

// verify Btn Dang nhap disable
WebUI.verifyElementNotClickable(findTestObject('Object Repository/TC_03/btn_dangnhap'));

// Input username
WebUI.setText(findTestObject('Object Repository/TC_03/txt_username'), username,FailureHandling.STOP_ON_FAILURE)

//Input password
WebUI.setText(findTestObject('Object Repository/TC_03/txt_password'), password, FailureHandling.STOP_ON_FAILURE)

// verify Btn Dang nhap enable

WebUI.verifyElementClickable(findTestObject('Object Repository/TC_03/btn_dangnhap'));

// Click Dang nhap
WebUI.click(findTestObject('Object Repository/TC_03/btn_dangnhap'));

//Số điện thoại/Email hoặc Mật khẩu sai!'"
WebUI.verifyElementText(findTestObject('Object Repository/TC_03/txt_message'),"Số điện thoại/Email hoặc Mật khẩu sai!")
// Close browser
WebUI.closeBrowser()



