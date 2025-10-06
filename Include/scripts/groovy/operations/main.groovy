package operations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import registration.Registration
import login.Login
import myprofile.Deposit



class main {

	@Given("Go to Lelang page")
	def go_to_lelang_page() {
		//open new browser
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		// Navigasi ke url yang diinginkan
		WebUI.navigateToUrl('https://jkt:RsonSmW7UgLUKm9@auction.lelangmobilku.co.id/login')
	}

	@When("Click the Registration option")
	def click_the_Registration_option() {
		//		call in registration function
		Registration reg = new Registration();
		reg.clickTheRegisterLink();
	}

	@And("Submit register form with validly")
	def submit_registration_form_with_validly() {
		//		call in registration function
		Registration reg = new Registration();
		reg.inputRegisterForm();
	}
	
	@When("Input login form")
	def input_login_form() {
		//		call in login function
		Login login = new Login();
		login.inputLoginForm();
	}
	
	@And("Verify after successfully login")
	def verify_after_successfully_login() {
		//		call in login function
		Login login = new Login();
		login.verifySuccessfullyLogin();
	}
	
	@Then("Navigate to deposit tab")
	def navigate_to_deposit_page() {
		//		call in login function
		Deposit depo = new Deposit()
		depo.clickDepositTab()
	}
	
	@Then("Validation after redirected to Deposit page")
	def validation_after_redirected_to_Deposit_page() {
		//		call in login function
		Deposit depo = new Deposit()
		depo.verifyDepositPage()
	}
	
}