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

WebUI.click(findTestObject('CompraMultiple/NavCart'))

PrecioMac = WebUI.getText(findTestObject('Comparacion total 2 productos/PrecioMac'))

int PrecioIntMac = ((PrecioMac) as int)

PrecioNokia = WebUI.getText(findTestObject('Comparacion total 2 productos/Precio Nokia'))

int PrecioIntNokia = ((PrecioNokia) as int)

Precio = WebUI.getText(findTestObject('Compra menos de 1500 dolares/Total'))

int PrecioInt = ((Precio) as int)

Total = PrecioIntMac + PrecioIntNokia

if (Total == PrecioInt) {
	WebUI.click(findTestObject('Compra/BotonPlaceOrden'))
	
	WebUI.callTestCase(findTestCase('RellenarFormularioDeCompra/RellenarFormularioCompra'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.closeBrowser()
	
println('La suma de los productos coinciden con el total')
}
