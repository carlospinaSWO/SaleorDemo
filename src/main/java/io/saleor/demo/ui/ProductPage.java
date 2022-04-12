package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target SizeSelector = Target.the("Size selector").locatedBy("//select");
    public static final Target AddButton = Target.the("Add button").locatedBy("//button[.='Add to cart']");
    //public static final Target ProductPrice = Target.the("Product price").locatedBy("//main/descendant::h2");
}
