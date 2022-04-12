package io.saleor.demo.tasks;

import io.cucumber.datatable.DataTable;
import jdk.internal.org.jline.terminal.Size;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.util.List;
import java.util.Map;

import static io.saleor.demo.ui.ProductPage.*;

public class Add implements Task {
    private DataTable data;
    private List<Map<String, String>> values;

    public Add(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        values = data.asMaps(String.class, String.class);

        // Si esto fuese un switch sería más clean code?
        if(!actor.recall("chosenSubcategory").equals("Alcohol")) {
            actor.attemptsTo(
                SelectFromOptions.byVisibleText(productAttribute("size")).from(SizeSelector.resolveFor(actor))
            );

            actor.remember("productSize", SizeSelector.resolveFor(actor).getFirstSelectedOptionVisibleText());
        }

        actor.attemptsTo(
            Click.on(AddButton.resolveFor(actor))
        );

        //actor.remember("productPrice", ProductPrice.resolveFor(actor).getText());
    }

    public static Add theProductWith(DataTable data) {
        return Tasks.instrumented(Add.class, data);
    }

    public String productAttribute(String attribute) {
        return String.valueOf(values.get(0).get(attribute));
    }
}
