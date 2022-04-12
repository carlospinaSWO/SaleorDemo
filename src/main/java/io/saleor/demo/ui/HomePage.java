package io.saleor.demo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    // SWO naming conventions for constants at https://softwareone.sharepoint.com/sites/ApplicationServicesHub/Standards/SitePages/Conventions.aspx
    public static final Target NavigationMenu = Target.the("Navigation Button").locatedBy("//button[@aria-label='Open main menu']");
    public static final Target Subcategory = Target.the("Subcategory Label").locatedBy("//a[@role='menuitem' and .='{0}']");
}
