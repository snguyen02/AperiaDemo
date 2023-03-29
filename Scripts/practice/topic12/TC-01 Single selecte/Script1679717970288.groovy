import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


String url = "https://demos.telerik.com/kendo-ui/dropdownlist/index";

'1. Open browser'
WebUI.openBrowser(url);
WebUI.maximizeWindow()

'2. Click on Category Dropdown control'
WebUI.click(findTestObject('Object Repository/topic12/ddl_category'));

'3. Select a Item Dairy Products in dropdown'
WebUI.click(findTestObject('Object Repository/topic12/ddlValue_dairyProducts',['value':"Dairy Products"]));

'4. Close browser'
WebUI.closeBrowser()
