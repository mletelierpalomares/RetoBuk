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

WebUI.click(findTestObject('InicioSesion/LogIn'))

WebUI.setText(findTestObject('InicioSesion/CampoUserName'), Usuario)

WebUI.setText(findTestObject('InicioSesion/CampoPassword'), Password)

WebUI.click(findTestObject('InicioSesion/BotonLogin'))

Existe = WebUI.verifyElementVisible(findTestObject('InicioSesion/CampoUserName'))

if (Existe == true) {
    WebUI.click(findTestObject('InicioSesion/BotonClose'))

    WebUI.click(findTestObject('InicioSesion/CampoSingUp'))

    WebUI.setText(findTestObject('CreacionUsuario/CampoUserName'), 'MarceloPrueba1')

    WebUI.setText(findTestObject('CreacionUsuario/CampoPassword'), 'Marcelo1234')

    WebUI.click(findTestObject('Object Repository/CreacionUsuario/ClickBotonSingUp'))

    WebUI.click(findTestObject('InicioSesion/LogIn'))

    WebUI.setText(findTestObject('InicioSesion/CampoUserName'), 'MarceloPrueba1')

    WebUI.setText(findTestObject('InicioSesion/CampoPassword'), 'Marcelo1234')

    WebUI.click(findTestObject('InicioSesion/BotonLogin'))

    WebUI.delay(GlobalVariable.Espera)

    WebUI.click(findTestObject('InicioSesion/logout'))

    WebUI.delay(GlobalVariable.Espera)
}

WebUI.closeBrowser()

