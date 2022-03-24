import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.demoblaze.com/index.html')

WebUI.waitForPageLoad(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('CompraMultiple/Laptop'))

WebUI.click(findTestObject('CompraMultiple/nextLaptop'))

WebUI.click(findTestObject('CompraMultiple/LaptopMac'))

WebUI.click(findTestObject('CompraMultiple/añadirAlCarro'))

WebUI.click(findTestObject('CompraMultiple/Home'))

WebUI.click(findTestObject('CompraMultiple/Mobile'))

WebUI.click(findTestObject('CompraMultiple/Nokia'))

WebUI.click(findTestObject('CompraMultiple/añadirAlCarro'))

WebUI.click(findTestObject('CompraMultiple/Home'))

WebUI.click(findTestObject('CompraMultiple/Monitors'))

WebUI.click(findTestObject('CompraMultiple/Monitor'))

WebUI.click(findTestObject('CompraMultiple/añadirAlCarro'))

WebUI.click(findTestObject('CompraMultiple/NavCart'))

WebUI.click(findTestObject('CompraMultiple/DeletePrimerObjeto'))

WebUI.click(findTestObject('Compra/BotonPlaceOrden'))

WebUI.setText(findTestObject('Compra/FormularioName'), GlobalVariable.Name)

WebUI.setText(findTestObject('Compra/FormularioCountry'), GlobalVariable.Country)

WebUI.setText(findTestObject('Compra/FormularioCity'), GlobalVariable.City)

WebUI.setText(findTestObject('Compra/FormularioCard'), GlobalVariable.CreditCard)

WebUI.setText(findTestObject('Compra/FormularioMonth'), GlobalVariable.Month)

WebUI.setText(findTestObject('Compra/FormularioYear'), GlobalVariable.Year)

WebUI.click(findTestObject('Compra/BotonPurchase'))

WebUI.click(findTestObject('Compra/BotonOk'))

WebUI.closeBrowser()

