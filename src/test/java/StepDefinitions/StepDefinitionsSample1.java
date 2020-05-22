package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample1 {
	@Given("start test1")
	public void start_test() {
	    System.out.println("start test1");
	}

	@When("enter required data1")
	public void enter_required_data() {
	    System.out.println("enter required data1");
	}

	@Then("validate output1")
	public void validate_output() {
	    System.out.println("validate output1");
	}

}
