package io.saleor.demo.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import io.saleor.demo.questions.Product;
import io.saleor.demo.tasks.Add;
import io.saleor.demo.tasks.NavigateTo;
import io.saleor.demo.tasks.Select;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CartStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} opened the website")
    public void givenActorOpenedTheWebsite(String actorName) {
        theActorCalled(actorName).wasAbleTo(NavigateTo.theUrl());
    }

    @When("the actor selects the product")
    public void whenActorSelectsTheProduct(DataTable data) {
        theActorInTheSpotlight().attemptsTo(Select.theProductWith(data));
    }

    @When("the actor adds the product to the cart with")
    public void whenActorAddsTheProductToTheCartWith(DataTable data) {
        theActorInTheSpotlight().attemptsTo(Add.theProductWith(data));
    }

    @Then("the actor will see the product in the cart")
    public void thenActorWillSeeTheProductInTheCart() {
        theActorInTheSpotlight().should(seeThat(Product.isAdded()));
    }
}