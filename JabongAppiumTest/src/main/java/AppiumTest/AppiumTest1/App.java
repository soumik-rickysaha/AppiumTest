/*package AppiumTest.AppiumTest1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class App {

	WebDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up desired capabilities and pass the Android app-activity and app-package
		// to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0");
		capabilities.setCapability("deviceName", "Automation_Test");
		capabilities.setCapability("platformName", "Android");
		// String apkpath="C:\\Users\\SOUMIK\\Downloads\\com.vector.guru99.apk";
		// File app=new File(apkpath);
		// capabilities.setCapability("app", app.getAbsolutePath());

		capabilities.setCapability("appPackage", "com.vector.guru99");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity", "com.vector.guru99.BaseActivity"); // This is Launcher activity of
																						// your app (you can get it from
																						// apk info app)
		// Create RemoteWebDriver instance and connect to the Appium server
		// It will launch the Calculator App in Android Device using the configurations
		// specified in Desired Capabilities
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@Test
	public void testCal() throws Exception {
		// locate the Text on the calculator by using By.name()
		Thread.sleep(5000);
		// WebElement
		// Library=driver.findElement(By.id("com.tutorialspoint.onlineviewer:id/tutorial_libary"));
		WebElement Library = driver.findElement(By.id("com.vector.guru99:id/action_quiz"));
		Library.click();

		WebElement TB = driver.findElement(By.id("com.tutorialspoint.onlineviewer:id/edittext"));
		TB.click();
		TB.sendKeys("JAva Essential");
		
		 * WebElement four=driver.findElement(By.id("4")); four.click(); WebElement
		 * equalTo=driver.findElement(By.id("=")); equalTo.click(); //locate the edit
		 * box of the calculator by using By.tagName() WebElement
		 * results=driver.findElement(By.tagName("EditText")); //Check the calculated
		 * value on the edit box assert
		 * results.getText().equals("6"):"Actual value is : "+results.getText()
		 * +" did not match with expected value: 6";
		 

	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}
}
*/