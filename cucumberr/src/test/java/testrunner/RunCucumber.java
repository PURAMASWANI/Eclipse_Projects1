package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        /*features = "cucumberr/src/test/resources/features/login.feature",
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true*/
		features="C:\\Users\\aswin\\eclipse-workspace\\cucumberr\\src\\test\\resources\\features\\login.feature" ,
		glue= "stepdefinationn",
		plugin= {"pretty ", "html:target/cucumber-report.html"},
		monochrome=true
)

public class RunCucumber {
}