package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsSample{
	@Given("start functionality test")
	public void start_functionality_test() {
	    System.out.println("<----------start functionality test------------>");
	}

	@When("enter required functionality data")
	public void enter_required_functionality_data() {
		System.out.println("<--------------enter required functionality data---------->");
	}

	@Then("validate functionality output")
	public void validate_functionality_output() {
		System.out.println("<------------------validate functionality output--------------->");
	}

	@Given("start{int} test")
	public void start_test(Integer int1) {
	    System.out.println("Start Test"+int1);
	}

	@When("enter{int} required data")
	public void enter_required_data(Integer int1) {
		System.out.println("required data"+int1);
	}

	@Then("validate{int} output")
	public void validate_output(Integer int1) {
		System.out.println("required output"+int1);
	}
	@Given("start test")
	public void start_test() {
	    System.out.println("start test");
	}

	@When("enter required data")
	public void enter_required_data() {
	    System.out.println("enter required data");
	}

	@Then("validate output")
	public void validate_output() {
	    System.out.println("validate output");
	}

}
