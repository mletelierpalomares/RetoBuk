package com.help.compraMultiple

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

public class CompraMultipleK {

	@Keyword
	public void compra(String url) {
		WebUI.openBrowser(url)

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

		WebUI.setText(findTestObject('Compra/FormularioName'), 'Marcelo Letelier')

		WebUI.setText(findTestObject('Compra/FormularioCountry'), 'Chile')

		WebUI.setText(findTestObject('Compra/FormularioCity'), 'Santiago')

		WebUI.setText(findTestObject('Compra/FormularioCard'), '123412341234')

		WebUI.setText(findTestObject('Compra/FormularioMonth'), '03')

		WebUI.setText(findTestObject('Compra/FormularioYear'), '1998')

		WebUI.click(findTestObject('Compra/BotonPurchase'))

		WebUI.click(findTestObject('Compra/BotonOk'))

		WebUI.closeBrowser()
	}
}
