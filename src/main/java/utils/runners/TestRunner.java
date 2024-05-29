package utils.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        monochrome = true,
        features = {"src/main/resources/tests/"}
        , glue = {"utils.hooks, stepDef"}
        , plugin = {"usage", "json:target/cucumber-reports/Cucumber.json"},
        tags = "@debug"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}