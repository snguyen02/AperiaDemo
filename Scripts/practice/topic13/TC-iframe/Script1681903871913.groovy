import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String url = "https://demos.telerik.com/kendo-ui/editor/mvvm";

'1. Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()


'2. Switch to Iframe'
WebUI.switchToFrame(findTestObject('Object Repository/topic13/iframe_editor'), 0)

'3. Enter some text'
WebUI.setText(findTestObject('Object Repository/topic13/txtbox_editor'), "There are some text")
WebUI.delay(10)
'4. Switch to Default content'
WebUI.switchToDefaultContent()
'5. Verify Header'
WebUI.verifyElementText(findTestObject('Object Repository/topic13/txt_header'), 'Enter some content', FailureHandling.STOP_ON_FAILURE)
'6. Close browser'
WebUI.closeBrowser()

