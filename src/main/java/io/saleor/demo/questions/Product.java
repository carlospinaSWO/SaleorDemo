package io.saleor.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static io.saleor.demo.ui.CartPage.*;
import static io.saleor.demo.ui.ProductPage.SizeSelector;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Product implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
            WaitUntil.the(ProductNameOnCart, isVisible()).forNoMoreThan(10).seconds(),
            Ensure.that(ProductNameOnCart).hasText(actor.recall("chosenProduct"))
            //Ensure.that(ProductPriceOnCart).hasText(actor.recall("productPrice"))
        );

        if(!actor.recall("chosenSubcategory").equals("Alcohol")) {
            actor.attemptsTo(
                Ensure.that(ProductSizeOnCart).hasText(actor.recall("productSize"))
            );
        }

        return true;
    }

    public static Product isAdded() {
        return new Product();
    }
}
