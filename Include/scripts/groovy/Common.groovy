import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

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


class Common {

	@Given("The Calculator page is loaded successfully")
	def load_calculator_page() {
		WebUI.callTestCase(findTestCase("Test Cases/common/The Calculator page is loaded successfully"), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@Given("I navigate to demoblaze homepage")
	def navigate_to_homepage() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Navigate to homepage"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I click login button")
	def click_login_btn() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Log in"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I enter email (.*) and pass (.*)")
	def input_access(String email, String pass) {
		WebUI.callTestCase(findTestCase("Test Cases/common/Input access"), [ ('email') : email, ('pass') : pass ], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I click login button to access the page")
	def enter_access() {
		WebUI.callTestCase(findTestCase("Test Cases/common/Enter access"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I can successfully login to the website")
	def login_succeed(){
		WebUI.callTestCase(findTestCase("Test Cases/verify/Logged in"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I should NOT be able to login successfully")
	def user_not_found(){
		WebUI.callTestCase(findTestCase("Test Cases/common/User not found"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I get the result (.*)")
	def check_result(String result) {
		WebUI.callTestCase(findTestCase('Test Cases/common/Check result'), [ ('result') : result ], FailureHandling.STOP_ON_FAILURE)
	}
}

