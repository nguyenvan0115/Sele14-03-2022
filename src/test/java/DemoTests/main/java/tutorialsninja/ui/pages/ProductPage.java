package tutorialsninja.ui.pages;

import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    String product;
    public ProductPage(WebDriver webDriver,String product) {
        super(webDriver);
        this.product = product;
    }


}
