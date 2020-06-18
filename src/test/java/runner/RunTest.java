package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features" }, plugin = { "pretty",
		"json:target/cucumber-json/cucumber.json", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
		"html:target/cucumber-reports" }, glue = { "stepDefinitions", "hooks" }, monochrome = true, strict = true)
public class RunTest extends AbstractTestNGCucumberTests {
	
}

