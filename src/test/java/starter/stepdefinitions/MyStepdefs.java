package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.NavigateTo;

public class MyStepdefs {

    @Given("{actor} is in LUMA page")
    public void actor_is_in_LUMA_page(Actor actor){
        actor.wasAbleTo(NavigateTo.theTodoListPage());
    }

    @When("{actor} write {string} in Password field")
    public void he_write_in_password_field(Actor actor, String itemName) {

    }
    @Then("All ok")
    public void all_ok() {

    }

}
