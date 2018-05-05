package AppiumTest.AppiumTest1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class StepDefination {

	WebDriver driver;
	DesiredCapabilities capabilities;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
//		capabilities = new DesiredCapabilities();
//		capabilities.setCapability("BROWSER_NAME", "Android");
//		capabilities.setCapability("VERSION", "6.0");
//		capabilities.setCapability("deviceName", "Automation_Test");
//		capabilities.setCapability("platformName", "Android");
//
//		capabilities.setCapability("appPackage", "com.jabong.android");
//		// This is Launcher activity of
//		// your app (you can get it fromapk info app)
//
//		capabilities.setCapability("appActivity", "com.jabong.android.view.activity.JabongMainActivity");
//
//		// Create RemoteWebDriver instance and connect to the Appium server
//		// It will launch the Calculator App in Android Device using the configurations
//		// specified in Desired Capabilities
//		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	// Step Definitions
	@Given("^user is on the Landing page$")
	public void user_is_on_the_Landing_page() throws Throwable{
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0");
		capabilities.setCapability("deviceName", "Automation_Test");
		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("appPackage", "com.jabong.android");
		// This is Launcher activity of
		// your app (you can get it fromapk info app)

		capabilities.setCapability("appActivity", "com.jabong.android.view.activity.JabongMainActivity");

		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the configurations
		// specified in Desired Capabilities
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(5000);
		String str=driver.findElement(By.id("com.jabong.android:id/render_search")).getAttribute("text");
		Assert.assertEquals("Search on Jabong", str);
	}

	@Given("^User click on the Categories tab$")
	public void user_click_on_the_Categories_tab(){
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		driver.findElement(By.name("Categories")).click();
	}

	@When("^user navigates to Categories Page$")
	public void user_navigates_to_Categories_Page(){
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^User clicks on the Men Tab$")
	public void user_clicks_on_the_Men_Tab(){
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	// End Of Step Defination

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}
