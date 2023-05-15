import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String url = "https://www.zingpoll.com/";

'1. Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()


'2. Click on Sign In button'
WebUI.click(findTestObject('Object Repository/topic13/popup/btn_signin'))

'3. Wait for Popup displayed'
WebUI.waitForElementVisible(findTestObject('Object Repository/topic13/popup/modal_login'), 30)

'4. Click Sign In button'
WebUI.click(findTestObject('Object Repository/topic13/popup/btn_signinInPopup'))

'5. Verify text'
WebUI.verifyElementText(findTestObject('Object Repository/topic13/popup/msg_invalidEmail'), 'Please enter your email.', FailureHandling.STOP_ON_FAILURE)

'6. Close popup'
WebUI.click(findTestObject('Object Repository/topic13/popup/btn_closeModal'))

'7. Close browser'
WebUI.closeBrowser()

