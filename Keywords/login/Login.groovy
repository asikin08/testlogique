package login

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

public class Login {
	
	TestObject email = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//input[@name="email"]')
	TestObject pass = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//input[@name="password"]')
	TestObject Captcha = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="recaptcha-anchor"]/div[1]')
	TestObject rememberME = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="remember_me"]')
	TestObject MasukButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[1]/div/div/div/form/button')
	TestObject Tittle = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="container"]/div[2]/div[2]/h2')
	 
	def inputLoginForm() {
		WebUI.sleep(3000)
		WebUI.setText(email, "asik@email.com");
		WebUI.setText(pass, "asikuy01!");
		TestObject iframe = new TestObject('iframeRecaptcha')
		iframe.addProperty('xpath', ConditionType.EQUALS, "//iframe[contains(@src,'recaptcha') or contains(@title,'recaptcha')]")
		WebUI.waitForElementPresent(iframe, 10)
		
		WebUI.switchToFrame(iframe, 10) //
		TestObject checkbox = new TestObject('recaptchaCheckbox')
		checkbox.addProperty('css', ConditionType.EQUALS, "div.recaptcha-checkbox-border")
		WebUI.waitForElementClickable(checkbox, 10)
		WebUI.click(checkbox)

		WebUI.switchToDefaultContent()
		WebUI.click(rememberME)
		WebUI.click(MasukButton)
	}
	def verifySuccessfullyLogin() {
		WebUI.sleep(3000)
		String tittle = WebUI.getText(Tittle);
	}
		
}
