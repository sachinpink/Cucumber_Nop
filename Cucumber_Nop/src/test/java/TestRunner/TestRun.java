package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	   features=".//Features/Login.feature",
		glue="StepDefinations",
		monochrome=true
		)


public class TestRun {

}
