package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target ProductNameOnCart = Target.the("Product name on cart").locatedBy("//h3/a");
    public static final Target ProductSizeOnCart = Target.the("Product size on cart").locatedBy("//h4/p");
    public static final Target ProductPriceOnCart = Target.the("Product price on cart").locatedBy("//input[@type='number']//following-sibling::p");
    public static final Target ProductQuantityOnCart = Target.the("Product quantity on cart").locatedBy("//input[@type='number']");
}
