import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



String url = "https://katalon-demo-cura.herokuapp.com/profile.php#login";

String username = 'John Doe'
String password = 'ThisIsNotAPassword'
'Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()

'Input username'
WebUI.setText(findTestObject('Object Repository/TC_01/txt_username'), username,FailureHandling.STOP_ON_FAILURE)

'Input password'
WebUI.setText(findTestObject('Object Repository/TC_01/txt_password'), password, FailureHandling.STOP_ON_FAILURE)
'CLick Dang Nhap'
WebUI.click(findTestObject('Object Repository/TC_01/btn_login'))

'Verify login successful'
WebUI.verifyElementText(findTestObject('Object Repository/TC_01/btn_bookApp'), "Book Appointment", FailureHandling.STOP_ON_FAILURE)

'Close browser'
WebUI.closeBrowser()

