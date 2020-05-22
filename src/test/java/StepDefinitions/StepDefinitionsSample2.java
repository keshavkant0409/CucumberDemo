package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample2 {
	@Given("start test2")
	public void start_test() {
	    System.out.println("start test2");
	}

	@When("enter required data2")
	public void enter_required_data() {
	    System.out.println("enter required data2");
	}

	@Then("validate output2")
	public void validate_output() {
	    System.out.println("validate output2");
	}

}
