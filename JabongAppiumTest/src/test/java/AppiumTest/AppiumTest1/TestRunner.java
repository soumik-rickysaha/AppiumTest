package AppiumTest.AppiumTest1;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeaturesFiles"
		,glue={"AppiumTest.AppiumTest1"}
		,monochrome=true
		,plugin = {
		        "html:target/Reports", "json:target/Reports/cucumber.json",
		        "pretty:target/Reports/cucumber-pretty.txt",
		        "usage:target/Reports/cucumber-usage.json", "junit:target/Reports/cucumber-results.xml" }
		,dryRun=false
		)
public class TestRunner {

}
