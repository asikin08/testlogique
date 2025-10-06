package myprofile

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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable

public class Deposit {
	
	TestObject depositTab = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="container"]/div[2]/div[1]/a[2]')
	TestObject tittleDeposit = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="container"]/div[2]/div[2]/div/div[1]/h2')
	 
	
	def clickDepositTab() {
		WebUI.sleep(3000)
		WebUI.click(depositTab)
		
	}
	
	def verifyDepositPage() {
		WebUI.sleep(3000)
		String tittle = WebUI.getText(tittleDeposit);
		tittle.equals("Deposit")
	}
}

