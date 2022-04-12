package io.saleor.demo.tasks;

import io.cucumber.datatable.DataTable;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;

import static io.saleor.demo.ui.HomePage.NavigationMenu;
import static io.saleor.demo.ui.HomePage.Subcategory;
import static io.saleor.demo.ui.ProductListPage.Product;

public class Select implements Task {
    private DataTable data;
    private List<Map<String, String>> values;

    public Select(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        values = data.asMaps(String.class, String.class);

        actor.attemptsTo(
            Click.on(NavigationMenu.resolveFor(actor)),
            Click.on(Subcategory.of(cartHeader("subcategory")).resolveFor(actor)),
            Click.on(Product.of(cartHeader("product")).resolveFor(actor))
        );

        actor.remember("chosenSubcategory", cartHeader("subcategory"));
        actor.remember("chosenProduct", cartHeader("product"));
    }

    public static Select theProductWith(DataTable data) {
        return Tasks.instrumented(Select.class, data);
    }

    public String cartHeader(String header) {
        return String.valueOf(values.get(0).get(header));
    }
}