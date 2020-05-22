package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample4 {
	@Given("start test4")
	public void start_test() {
	    System.out.println("start test4");
	}

	@When("enter required data4")
	public void enter_required_data() {
	    System.out.println("enter required data4");
	}

	@Then("validate output4")
	public void validate_output() {
	    System.out.println("validate output4");
	}

}
