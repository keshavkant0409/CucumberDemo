package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample9 {
	@Given("start test9")
	public void start_test() {
	    System.out.println("start test9");
	}

	@When("enter required data9")
	public void enter_required_data() {
	    System.out.println("enter required data9");
	}

	@Then("validate output9")
	public void validate_output() {
	    System.out.println("validate output9");
	}

}
