package TestRunner;
//package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:\\Users\\aswin\\eclipse-workspace\\DataDriven\\src\\test\\resources\\Features\\DataDriven.feature",
        glue = "StepDefination",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html"
        },
        monochrome = true
)

public class DataDrivenRunnable {
}