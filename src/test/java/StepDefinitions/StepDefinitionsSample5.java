package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample5 {
	@Given("start test5")
	public void start_test() {
	    System.out.println("start test5");
	}

	@When("enter required data5")
	public void enter_required_data() {
	    System.out.println("enter required data5");
	}

	@Then("validate output5")
	public void validate_output() {
	    System.out.println("validate output5");
	}

}
