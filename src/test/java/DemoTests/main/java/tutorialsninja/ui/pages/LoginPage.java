package tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "input-email")
    private WebElement txtEmail;

    @FindBy(id="input-password")
    private WebElement txtPassword;

    @FindBy(xpath ="//input[@value='Login']")
    private WebElement btnLogin;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void login(String email, String password){
//        txtEmail.sendKeys(email);
//        txtPassword.sendKeys(password);

        inputText(txtEmail, email);
        inputText(txtPassword,password);
//        btnLogin.click();
        click(btnLogin);
    }

    //VD dùng với by
    public void loginBy(String email, String password){
        By byTxtEmail = By.id("input-email");
        By byPassword = By.id("input-password");
        By byBtnLogin = By.xpath("//input[@value='Login']");

        inputText(byTxtEmail, email);
        inputText(byPassword,password);
        click(byBtnLogin);
    }
}
