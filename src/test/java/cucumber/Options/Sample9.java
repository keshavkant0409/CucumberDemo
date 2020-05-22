package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Features/Sample9.feature",glue= {"StepDefinitions"})
//@CucumberOptions(features= "./Features/EnableNewsletter.feature",glue= {"com.stepdefinition","EnableNewsletterStepDefinition.java"})

public class Sample9 {
	
	
	

}
