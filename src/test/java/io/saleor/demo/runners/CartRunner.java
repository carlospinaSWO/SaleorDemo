package io.saleor.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"io.saleor.demo.stepdefinitions"},
        features = {"src/test/resources/features/cart.feature"},
        tags = ""
)

public class CartRunner {
}
