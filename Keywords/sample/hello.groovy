package sample

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class hello {

	public static void main(String[] args) {
		def map =["name":"Trump", "age":60, "city":"Newyork"]
		float number = -42.3f;
		System.out.println(number); //prints -42.3)
		String name = map.get("name");
		System.out.println(name)

		String st = " Hello Katalon   ";
		String st2  = "Hello Java";
		System.out.println(st.length());
		st = st.trim();
		System.out.println(st.trim());
		System.out.println(st.length());
		def map2 = [s1:"Hello Katalon", s2: "Hello Java"];
		def map3 = [s3:"hello Groovy"];
		map2.putAll(map3);
		System.out.println(map2);
		map2.replace( "s1", "Xin chao Katalon");
		System.out.println(map2);

		for(String s1 : map2.keySet())
			System.out.println("key: "+ s1);

		for(String value : map2.values())
			System.out.println("Value is: "+ value);

		for(Map.Entry<String, String> entry: map2.entrySet()) {
			System.out.println("Key= " + entry.getKey() +" Value = " + entry.getValue())
		}



	}
}

