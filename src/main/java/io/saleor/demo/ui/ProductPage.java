package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target SizeSelector = Target.the("Size selector").locatedBy("//select");
    public static final Target AddButton = Target.the("Add button").locatedBy("//button[.='Add to cart']");
    // Un XPath más elegante para ProductPrice sería "//h1/following-sibling::h2" pero no lo reconoce
    public static final Target ProductPrice = Target.the("Product price").locatedBy("//*[@id=\"__next\"]/div[3]/main/div[2]/div[1]/h2");
}
