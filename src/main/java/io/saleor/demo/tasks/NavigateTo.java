package io.saleor.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO: no quemar la URL
        actor.attemptsTo(
                Open.url("https://demo.saleor.io/default-channel/en-US")
        );
    }

    public static NavigateTo theUrl() {
        return Tasks.instrumented(NavigateTo.class);
    }
}
