package smoketest
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



class checkout {
	@And("I click cart button")
	def open_cart() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Open cart"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I click place order button")
	def click_place_order() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Place order"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I input Name (.*)")
	def input_name(String name) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input Name"), [('name'): name], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I input Country (.*)")
	def input_country(String country) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input Country"), [('country'): country], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I input City (.*)")
	def input_city(String city) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input City"), [('city'): city], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I input Credit card (.*)")
	def input_creditcard(String creditcard) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input Credit Card"), [('creditcard'): creditcard], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I input Month (.*)")
	def input_month(String month) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input Month"), [('month'): month], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I input Year (.*)")
	def input_year(String year) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input Year"), [('year'): year], FailureHandling.STOP_ON_FAILURE)
	}
	@And("I click purchase button")
	def click_purchase_btn() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Purchase"), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("I place my order successfully")
	def order_success() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Purchase"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}