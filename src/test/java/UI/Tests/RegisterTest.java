package UI.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tutorialsninja.ui.pages.RegisterAccPage;

public class RegisterTest extends BaseTest{
    String firtName = "Vân 13";
    String lastName = "Nguyễn";
    String email = "van13@gmail.com";
    String phone= "0969205780";
    String password = "Van99";

    @Test
    public void registerAccTest1(){

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        WebElement txtFirstName = webDriver.findElement(By.id("input-firstname"));  // seach by F12= input#input-firstname
        WebElement txtLastName = webDriver.findElement(By.id("input-lastname"));  // seach by F12= input#input-lastname
        WebElement txtEmail = webDriver.findElement(By.id("input-email"));  // seach by F12= input#input-email
        WebElement txtTelephone = webDriver.findElement(By.id("input-telephone"));  // seach by F12= input-telephone


        WebElement txtPassword = webDriver.findElement(By.id("input-password"));
        WebElement txtPasswordConf = webDriver.findElement(By.id("input-confirm"));

        WebElement checkBox = webDriver.findElement(By.name("agree"));
        WebElement btnContinue = webDriver.findElement(By.xpath("//input[@class='btn btn-primary']")); //"input[@class=''btn btn-primary]"


        txtFirstName.sendKeys(firtName);
        txtLastName.sendKeys(lastName);
        txtEmail.sendKeys(email);
        txtTelephone.sendKeys(phone);

        txtPassword.sendKeys(password);
        txtPasswordConf.sendKeys(password);

        checkBox.click();
        btnContinue.click();

    }

    @Test
    public void registerAccTest2() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        Thread.sleep(3000);

        RegisterAccPage registerAccPage = new RegisterAccPage(webDriver);
        registerAccPage.registerAcc(firtName,  lastName,email, phone,password);
    }

}
