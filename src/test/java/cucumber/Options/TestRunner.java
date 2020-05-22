package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features="./Features",glue= {"StepDefinitions"},tags= {"@Regression , @Sanity"})
//@CucumberOptions(features="./Features",glue= {"StepDefinitions"},tags= {"not @Regression" , "not @Sanity"})
//@CucumberOptions(features="./Features",glue= {"StepDefinitions"},tags= {"@Regression, @Sanity"})
@CucumberOptions(features="./Features",glue= {"StepDefinitions","Utilities"},monochrome=true, plugin = {"pretty", "html:target/Destination"},dryRun=false)

public class TestRunner {

}
