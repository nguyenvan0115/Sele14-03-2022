package UI.Tests;

import org.testng.annotations.Test;
import tutorialsninja.ui.pages.LoginPage;

public class ChangePass extends BaseTest {
    @Test
    public void changePass() {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");


        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("van11@gmail.com","0969205780");




    }
}
