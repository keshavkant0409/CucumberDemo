package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample10 {
	@Given("start test10")
	public void start_test() {
	    System.out.println("start test10");
	}

	@When("enter required data10")
	public void enter_required_data() {
	    System.out.println("enter required data10");
	}

	@Then("validate output10")
	public void validate_output() {
	    System.out.println("validate output10");
	}

}
