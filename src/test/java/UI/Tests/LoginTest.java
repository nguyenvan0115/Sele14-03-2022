package UI.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tutorialsninja.ui.pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest1() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement txtEmail = webDriver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement txtPassword = webDriver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement clickRegister = webDriver.findElement(By.xpath("//input[@value='Login']"));

        txtEmail.sendKeys("van10@gmail.com");
        txtPassword.sendKeys("Van99");
        clickRegister.click();
    }
    @Test
    public void loginTest2() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("van10@gmail.com","Van99");
    }


}
