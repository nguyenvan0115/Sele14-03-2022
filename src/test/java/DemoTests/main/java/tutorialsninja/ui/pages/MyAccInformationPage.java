package tutorialsninja.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccInformationPage extends BasePage{

    @FindBy(id ="input-firstname")
            private  WebElement txtFirstName;
    @FindBy(id="input-lastname")
            private WebElement txtLastName;
    @FindBy(id="input-email")
            private WebElement txtEmail;
    @FindBy(id="input-telephone")
            private  WebElement txtTelephone;
    @FindBy(xpath = "//input[@value='Continue']")
        private  WebElement btnContinue;


    public MyAccInformationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getFirstName(){
        //cách 1
        return txtFirstName.getAttribute( "value");
        //cách 2
//        String firstName = txtFirstName.getAttribute("value");
//        return firstName;
    }
    public String getLastName(){
        return txtLastName.getAttribute("value");
    }
    public String getEmail(){
        return txtEmail.getAttribute("value");
    }
    public String getTelephone(){
        return txtTelephone.getAttribute("value");
    }
    public void setTxtFirstName(String firstName){
        inputText(txtFirstName,firstName);
//        txtFirstName.clear();
//        txtFirstName.sendKeys(firstName);
    }
    public void setTxtLastName(String lastName){
        inputText(txtLastName,lastName);
    }
    public void setTxtTelephone(String telephone){
        inputText(txtTelephone,telephone);
    }
    public void clickContinue(){
        btnContinue.click();
    }
}
