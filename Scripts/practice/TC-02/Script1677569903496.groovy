import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



String url = "https://the-internet.herokuapp.com/login";

String username = 'tomsmith'
String password = 'SuperSecretPassword!'
// Open browser
WebUI.openBrowser(url);
WebUI.maximizeWindow()

// Input username
WebUI.setText(findTestObject('Object Repository/TC_02/txt_username'), username,FailureHandling.STOP_ON_FAILURE)

//Input password
WebUI.setText(findTestObject('Object Repository/TC_02/txt_password'), password, FailureHandling.STOP_ON_FAILURE)
// CLick Dang Nhap
WebUI.click(findTestObject('Object Repository/TC_02/btn_login'))

// Verify login successful
WebUI.verifyElementText(findTestObject('Object Repository/TC_02/lbl_welcome'), "Welcome to the Secure Area. When you are done click logout below.", FailureHandling.STOP_ON_FAILURE)

// Close browser
WebUI.closeBrowser()

