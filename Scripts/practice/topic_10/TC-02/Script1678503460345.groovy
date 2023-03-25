import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import common.ColorConverter as convert


String url = "https://atlassian.design/components/tooltip/examples";

'Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()

'get background-color before hover'
String backgroundColor = WebUI.getCSSValue(findTestObject('Object Repository/topic_10/practice_02/btn_hoverOver'),'background')
'convert RGBA to hex'
String hexColor = convert.convertRGBA2Hex(backgroundColor);
'Print to screen'
println("background-color before Hover: " + hexColor)

'Hover to button "Hover over me"'
WebUI.mouseOver(findTestObject('Object Repository/topic_10/practice_02/btn_hoverOver'))
'verify tooltip \'Hello World\' displayed'
WebUI.verifyElementText(findTestObject('Object Repository/topic_10/practice_02/txt_hello'),"Hello World")
'get background-color after hover'
String backgroundColorHover = WebUI.getCSSValue(findTestObject('Object Repository/topic_10/practice_02/btn_hoverOver'),'background')
'convert RGBA to hex'
hexColorHover = convert.convertRGBA2Hex(backgroundColorHover);
'Print to screen'
println("background-color after Hover:: " + hexColorHover);

'Verify background-color is correctly'
WebUI.verifyEqual(hexColorHover, "#0065FF")

'Close browser'
WebUI.closeBrowser()



