import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String url = "http://the-internet.herokuapp.com/windows";

'1. Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()
'2. CLick Here htperlink'
WebUI.click(findTestObject('Object Repository/topic14/link_clickHere'));
'3. Switch to new tab'
WebUI.switchToWindowIndex(1)
'4. Verify Title'
WebUI.verifyElementText(findTestObject('Object Repository/topic14/txt_newWindowTitle'),'New Window')
'5. Close the tab'
WebUI.closeWindowIndex(1)
'6. Switch to tab 1'
WebUI.switchToWindowIndex(0)
'7. Close browser'
WebUI.closeBrowser()