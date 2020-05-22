package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample8 {
	@Given("start test8")
	public void start_test() {
	    System.out.println("start test8");
	}

	@When("enter required data8")
	public void enter_required_data() {
	    System.out.println("enter required data8");
	}

	@Then("validate output8")
	public void validate_output() {
	    System.out.println("validate output8");
	}

}
