package tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductItemPage extends BasePage{

    private String productName;

    public ProductItemPage(WebDriver webDriver, String productName) {
        super(webDriver);
        this.productName = productName;
    }
    public String getDesc(){
        By by = By.xpath(String.format("//div[contains(@class,'product-layout')][.//a[text()=%s]]//h4//following-sibling::p[1]",this.productName));
        return getText(by);
    }
    public String getNewPrice(){
        By by = By.xpath(String.format("//div[contains(@class,'product-layout')][.//a[text()=%s]]//span[@class='price-new']",this.productName));
        return getText(by);
    }
    public String getOldrice(){
        By by = By.xpath(String.format("//div[contains(@class,'product-layout')][.//a[text()=%s]]//span[@class='price-old']",this.productName));
        return getText(by);
    }
    public String getTax(){
        By by = By.xpath(String.format("//div[contains(@class,'product-layout')][.//a[text()=%s]]//span[@class='price-tax']",this.productName));
        return getText(by);
    }
}
