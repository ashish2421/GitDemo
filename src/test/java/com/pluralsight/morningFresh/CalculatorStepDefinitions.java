package com.pluralsight.morningFresh;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CalculatorStepDefinitions {

    Calculator calculator;
    Integer result;
	@Given("I have a calculator")
	public void i_have_a_calculator() 
	{
	    calculator = new Calculator();
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer a, Integer b) {
	    result = calculator.add(a,b);
	}
	@When("I add {int} and {int}")
	public void i_add_anda(Integer a, Integer b) {
	    System.out.println("Great");
	}
	

	@Then("I should get {int}")
	public void i_should_get(Integer expectedResult) {
		Assert.assertEquals(result, expectedResult);
		
	    
	}
	
}
