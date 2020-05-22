package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample3 {
	@Given("start test3")
	public void start_test() {
	    System.out.println("start test3");
	}

	@When("enter required data3")
	public void enter_required_data() {
	    System.out.println("enter required data3");
	}

	@Then("validate output3")
	public void validate_output() {
	    System.out.println("validate output3");
	}

}
