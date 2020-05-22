package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample7 {
	@Given("start test7")
	public void start_test() {
	    System.out.println("start test7");
	}

	@When("enter required data7")
	public void enter_required_data() {
	    System.out.println("enter required data7");
	}

	@Then("validate output7")
	public void validate_output() {
	    System.out.println("validate output7");
	}

}
