package cucumber.Options;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Features/Sample.feature",glue= {"StepDefinitions","Utilities"},monochrome=true, plugin = {"pretty", "html:target/Destination"},dryRun=false)
//@CucumberOptions(features= "./Features/EnableNewsletter.feature",glue= {"com.stepdefinition","EnableNewsletterStepDefinition.java"}, format = {"pretty", "html:target/Destination"})

public class Sample{
	

}
