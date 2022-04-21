package tutorialsninja.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccPage extends BasePage{
//    @FindBy(linkText = "Edit your account information")

    @FindBy(xpath = "//a[text()='Edit your account information']")
    private WebElement lkEdityouraccountinformation;

    public AccPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openEdityouraccountinformation(){
        lkEdityouraccountinformation.click();
    }

}
