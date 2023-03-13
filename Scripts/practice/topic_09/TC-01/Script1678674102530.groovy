import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


String url = "https://demo.guru99.com/V4";

String username = ''
String password = ''
String emailId = 'son.nguyen@outloook.com'
// Open browser
WebUI.openBrowser(url);
WebUI.maximizeWindow()

// Click here hyperlink
WebUI.click(findTestObject('Object Repository/topic_09/link_here'));

// Close ads modal
boolean isFramePresent = true;

try {
   WebUI.verifyElementPresent(findTestObject('Object Repository/topic_09/ifr_ads'), 3)
} catch (NoSuchElementException e) {
    isFramePresent = false;
}

if(isFramePresent){
	WebUI.switchToFrame(findTestObject('Object Repository/topic_09/ifr_ads'), 0)
	WebUI.click(findTestObject('Object Repository/topic_09/btn_close'));
	WebUI.switchToDefaultContent()
}
//WebUI.switchToDefaultContent()

// Input email
WebUI.setText(findTestObject('Object Repository/topic_09/txt-emailID'), emailId,FailureHandling.STOP_ON_FAILURE);

// Click Submit button
WebUI.click(findTestObject('Object Repository/topic_09/btn_submit'));

//Get User ID
username = WebUI.getText(findTestObject('Object Repository/topic_09/txt_getUserID'));
//Get Password 
password = WebUI.getText(findTestObject('Object Repository/topic_09/txt_getPassword'));

// Navigate to to http://demo.guru99.com/V4/ again
WebUI.navigateToUrl(url)

// Input UID
WebUI.setText(findTestObject('Object Repository/topic_09/txt_userID'), username,FailureHandling.STOP_ON_FAILURE);

//Input password
WebUI.setText(findTestObject('Object Repository/topic_09/txt_password'), password, FailureHandling.STOP_ON_FAILURE);

// verify Btn Login enable
WebUI.verifyElementClickable(findTestObject('Object Repository/topic_09/btn_login'));

// Click Dang nhap
WebUI.click(findTestObject('Object Repository/topic_09/btn_login'));

//Verify message: Welcome To Manager's Page of Guru99 Bank
WebUI.verifyElementText(findTestObject('Object Repository/topic_09/txt_welcome'),"Welcome To Manager's Page of Guru99 Bank");

// Close browser
WebUI.closeBrowser()
