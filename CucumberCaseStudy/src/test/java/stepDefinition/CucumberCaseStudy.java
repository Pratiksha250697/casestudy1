package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberCaseStudy 
{

@Given("user is on home page")
public void user_is_on_home_page() {
	System.out.println("user is on home page");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	System.out.println("user enters username and password");
}

@Then("user is logged in")
public void user_is_logged_in() {
    System.out.println("user is logged in");
}

}
