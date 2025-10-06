package registration

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
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import com.kms.katalon.core.testobject.ConditionType


import internal.GlobalVariable

public class Registration {
	//Object (Test Data )
	TestObject linkBtn = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div/div/div/div/div/a')
	TestObject inputFirstName = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[1]/div/input')
	TestObject inputLastName = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[2]/div/input')
	TestObject addresDOB = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[3]/div[1]/input')
	TestObject DOB = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[4]/div[1]/div/div/input')
	TestObject ChooseDOB = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//div[3]/div[text()="1"]')
	TestObject SelectButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//div[3]/div[2]/span[2]')
	TestObject ktpNumber = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[5]/div[1]/input')
	TestObject uploadKTP = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[1]/div[1]/div[6]/input[@name="uploadKtp"]')
	TestObject CheckedActiveAllways = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[9]/div/input')
	TestObject Provinsi = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[11]/div/div/input')
	TestObject Jatim = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Jawa Timur"]')
	TestObject city = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[12]/div/div/input')
	TestObject Tuban = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Kab. Tuban"]')
	TestObject AlamatDomisili = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[13]/div/textarea')
	TestObject telephone = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[1]/div[14]/div/input')
	TestObject SelectWorker = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[1]/div/div/input')
	TestObject PNS = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="PNS"]')
	TestObject JenisKendaraan = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[7]/div[1]/div/input')
	TestObject Mobil = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Mobil"]')
	TestObject SearchKendaraan = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[8]/div[1]/div/input')
	TestObject Other = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Lain-lain"]')
	TestObject TujuanBeli = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[9]/div/div/input')
	TestObject Pribadi = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Pribadi"]')
	TestObject Email = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[10]/div[1]/input')
	TestObject Password = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[11]/div[1]/input')
	TestObject ConfirmPassword = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div[2]/div[12]/div/input')
	TestObject NextButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[1]/form/div[2]/button[2]')
	TestObject NomorRekening = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[1]/div[1]/div/input')
	TestObject ChooseBank = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[1]/div[2]/div/div/input')
	TestObject BCA = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="BANK BCA"]')
	TestObject NamaPemilikRekening = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[1]/div[3]/div/input')
	TestObject SumberDana = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[2]/div[1]/div/div/input')
	TestObject Usaha = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Usaha"]')
	TestObject MetodePembayaran = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/div/input')
	TestObject Debit = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[text()="Debit"]')
	TestObject RegisterButton = new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/div/div/div[2]/div[2]/div/form/div[2]/button[2]')

	def clickTheRegisterLink() {
		WebUI.sleep(3000)
		WebUI.scrollToElement(linkBtn, 5)
		WebUI.click(linkBtn)
	}

	def inputRegisterForm() {
		WebUI.sleep(3000)
		WebUI.setText(inputFirstName, "Dhiyaul");
		WebUI.setText(inputLastName, "Asikin");
		WebUI.setText(addresDOB, "Tuban");
		WebUI.click(DOB);
		WebUI.click(ChooseDOB);
		WebUI.click(SelectButton);
		WebUI.setText(ktpNumber, "3523162410960001");
		WebUI.executeJavaScript("""
		var el = document.querySelector('input[name="uploadKtp"]');
		if (el) {
		  el.classList.remove('hidden');
		  el.style.display = 'block';
		  el.style.visibility = 'visible';
		  el.style.opacity = '1';
		}
		""", [])
		WebUI.delay(3)
		WebUI.uploadFile(uploadKTP, 'D:\\automation\\Dautomationhiring.png')
		WebUI.click(CheckedActiveAllways)
		WebUI.setText(Provinsi, "Jawa Timur")
		WebUI.click(Jatim)
		WebUI.setText(city, "Tuban")
		WebUI.click(Tuban)
		WebUI.setText(AlamatDomisili, "Tuban")
		WebUI.setText(telephone, "085707766742")
		WebUI.setText(SelectWorker, "PNS")
		WebUI.click(PNS)
		WebUI.setText(JenisKendaraan, "Mobil")
		WebUI.click(Mobil)
		WebUI.setText(SearchKendaraan, "Lain-lain")
		WebUI.click(Other)
		print("TujuanBeli")
		WebUI.setText(TujuanBeli, "Pribadi")
		WebUI.click(Pribadi)
		WebUI.setText(Email, "asik@email.com")
		WebUI.setText(Password, "asikuy01!")
		WebUI.setText(ConfirmPassword, "asikuy01!")
		WebUI.click(NextButton)
		WebUI.sleep(3000)
		print("Fill nomor rekening")
		WebUI.setText(NomorRekening, "23232323232")
		WebUI.setText(ChooseBank, "BCA")
		WebUI.click(BCA)
		WebUI.setText(NamaPemilikRekening, "Asikin")
		WebUI.setText(SumberDana, "Usaha")
		WebUI.click(Usaha)
		WebUI.setText(MetodePembayaran, "Debit")
		WebUI.click(Debit)
		WebUI.click(RegisterButton)
	}
}
