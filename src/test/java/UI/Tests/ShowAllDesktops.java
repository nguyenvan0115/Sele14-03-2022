package UI.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialsninja.ui.pages.ProductItemPage;
import tutorialsninja.ui.pages.ProductPage;
import tutorialsninja.ui.pages.YourStorePage;

public class ShowAllDesktops extends BaseTest{
    @Test
    public void openShowAllDesktops(){
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openShowAllDesktops();
    }
    //cach2
    @Test
    public void openShowAllDesktop1(){
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Desktops", "Show All Desktops");
    }

    @Test
    public void verifyComponents(){
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Desktops", "Show All Desktops");

        ProductPage desktoproductPage =new ProductPage(webDriver,"Desktops");
        Assert.assertEquals(desktoproductPage.getPageTitle(), "Desktops");

        ProductItemPage productItemPage = new ProductItemPage(webDriver, "Canon EOS 5D");
        System.out.println(productItemPage.getDesc());
        System.out.println(productItemPage.getNewPrice());
        System.out.println(productItemPage.getOldrice());
        System.out.println(productItemPage.getTax());
    }
}
