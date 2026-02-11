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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.github.javafaker.Faker
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.github.javafaker.Faker

Faker faker = new Faker()

def acc = faker.number().digits(16)

def pan = faker.letterify("?????") + faker.number().digits(4) + faker.letterify("?")

def phone = faker.phoneNumber().subscriberNumber(10)

def email = faker.internet().emailAddress()

def name = faker.name().firstName()

try {
    Mobile.startExistingApplication('com.nexdha.nexpay', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/android.widget.RelativeLayout'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 10)
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0'), '300', 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Proceed'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.RelativeLayout (2)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Agree'), 10)

    Mobile.pressBack(); Mobile.pressBack(); Mobile.pressBack(); Mobile.pressBack()

    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Bank Transfer'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Favourites'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - NEXDHA Ai'), 10)
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 0 (1)'), '600', 10)
	
    Mobile.hideKeyboard()
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), '424242', 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Proceed (1)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Proceed (1)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Agree (1)'), 10)

    Mobile.pressBack(); Mobile.pressBack(); Mobile.pressBack()

    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Bank Transfer'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 10)

    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Account Number'), acc)
	
    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Re-enter Account Number'), acc)
	
    Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - IFSC'), 'HDFC0001112')
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Next'), 10)

    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Account Holder Name'), name, 10)
	
    Mobile.hideKeyboard()
	
    Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton - Savings'), 10)
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter PAN number (1)'), pan, 10)
	
    Mobile.hideKeyboard()
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Receivers Nick Name (Optional)'), name, 10)
	
    Mobile.hideKeyboard()
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Receivers Mobile Number (Optional)'), phone, 10)
	
    Mobile.hideKeyboard()
	
    Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Receivers Email ID (Optional)'), email, 10)

    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Proceed (2)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Done'), 10)

    Mobile.pressBack(); Mobile.pressBack()

    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - History'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Bank Transfer History'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - FAILED'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (3)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (3)'), 10)
	
    Mobile.pressBack()

    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Credit Card Bill History'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - FAILED (1)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (4)'), 10)
	
    Mobile.pressBack(); Mobile.pressBack()

    Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (5)'), 10)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 10)
	
    Mobile.scrollToText('Sign Out')
	
	Mobile.delay(3)
	
    Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Sign Out'), 10)
	
	Mobile.delay(3) 
	
    Mobile.tap(findTestObject('Object Repository/android.widget.Button - Sign Out'), 10)

    Mobile.closeApplication()
	
} catch (Exception e) {
    Mobile.takeScreenshot()
    Mobile.closeApplication()
    throw e
}
