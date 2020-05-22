package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample6 {
	@Given("start test6")
	public void start_test() {
	    System.out.println("start test6");
	}

	@When("enter required data6")
	public void enter_required_data() {
	    System.out.println("enter required data6");
	}

	@Then("validate output6")
	public void validate_output() {
	    System.out.println("validate output6");
	}

}
