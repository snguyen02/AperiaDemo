import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


String url = "https://multiple-select.wenzhixin.net.cn/templates/template.html?v=189&url=basic.html";
def months = ["January", "April", "May"];
def options = ["Option 1", "Option 3", "Option 5","Option 7"];

'1. Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()

'2. Click on Multiple Select in Basic Select section'
WebUI.click(findTestObject('Object Repository/topic12/multi_Select/ddl_multipleSelectBasic'));

'3. Select a Item Dairy Products in dropdown'
for(int i=0; i<months.size(); i++) {
	WebUI.check(findTestObject('Object Repository/topic12/multi_Select/chekbox_months',['month':months[i]]))
}
'4. Click on Multiple Select in Basic Select section to collap'
WebUI.click(findTestObject('Object Repository/topic12/multi_Select/ddl_multipleSelectBasic'));

'5. Click on Multiple Select in Group Select section'
WebUI.click(findTestObject('Object Repository/topic12/multi_Select/ddl_multipleSelectGroup'));

'3. Select a Item Dairy Products in dropdown'
for( i=0; i<options.size(); i++) {
	WebUI.check(findTestObject('Object Repository/topic12/multi_Select/checkbox_groups',['option':options[i]]))
}

'7. Click on Multiple Select in Group Select section to collap'
WebUI.click(findTestObject('Object Repository/topic12/multi_Select/ddl_multipleSelectGroup'));

'8. Close browser'
WebUI.closeBrowser()
