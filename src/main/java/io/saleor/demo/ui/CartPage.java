package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target ProductNameOnCart = Target.the("Product name on cart").locatedBy("//h3/a");
    public static final Target ProductSizeOnCart = Target.the("Product size on cart").locatedBy("//h4/p");
    // Un XPath más elegante para ProductPriceOnCart sería "//input[@type='number']//following-sibling::p" pero no lo reconoce
    public static final Target ProductPriceOnCart = Target.the("Product price on cart").locatedBy("//*[@id=\"__next\"]/div[3]/div/main/div/section/ul/li/div[2]/div/div/div[2]/p");
    public static final Target ProductQuantityOnCart = Target.the("Product quantity on cart").locatedBy("//input[@type='number']");
}
