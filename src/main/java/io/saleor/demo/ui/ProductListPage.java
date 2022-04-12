package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
    public static final Target Product = Target.the("Product Label").locatedBy("//p[.='{0}']");
}
