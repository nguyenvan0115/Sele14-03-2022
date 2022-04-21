package tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAccPage extends BasePage{
    private WebElement txtFirstName;
    private WebElement txtLastName;
    private WebElement txtEmail;
    private WebElement txtTelephone;
    private WebElement txtPassword;
    private WebElement txtPasswordConf;

    private WebElement checkBox;
    private WebElement btnContinue;


    public RegisterAccPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void registerAcc(String firstName, String lastName, String email, String phone, String password){
        txtFirstName = webDriver.findElement(By.id("input-firstname"));  // seach by F12= input#input-firstname
        txtLastName = webDriver.findElement(By.id("input-lastname"));  // seach by F12= input#input-lastname
        txtEmail = webDriver.findElement(By.id("input-email"));  // seach by F12= input#input-email
        txtTelephone = webDriver.findElement(By.id("input-telephone"));  // seach by F12= input-telephone


        txtPassword = webDriver.findElement(By.id("input-password"));
        txtPasswordConf = webDriver.findElement(By.id("input-confirm"));

        checkBox = webDriver.findElement(By.name("agree"));
        btnContinue = webDriver.findElement(By.xpath("//input[@class='btn btn-primary']")); //"input[@class=''btn btn-primary]"


        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtEmail.sendKeys(email);
        txtTelephone.sendKeys(phone);

        txtPassword.sendKeys(password);
        txtPasswordConf.sendKeys(password);

        checkBox.click();
        btnContinue.click();
    }
}
