package tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourStorePage extends BasePage{
    @FindBy(linkText = "Desktops")
    private WebElement lkDesktops;

    @FindBy(linkText = "Show All Desktops")
    private WebElement lkShowAllDesktops;

    public YourStorePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openShowAllDesktops(){
        click(lkDesktops);
        click(lkShowAllDesktops);
    }
    public void openMenu(String mainItem, String subItem){
        clickMainItems(mainItem);
        clickSubItems(subItem);
    }
    public void openMenu(String mainItem){
        clickMainItems(mainItem);
    }



    public void clickMainItems(String item){
        By byLick = By.linkText(item);
        click(byLick);
    }

    private void clickSubItems(String item){
        By byLink = By.partialLinkText(item);
        click(byLink);
    }


}
