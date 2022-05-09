package tutorialsninja.ui.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    protected JavascriptExecutor javascriptExecutor;

    private static final int timeout =60;

    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(60));

        javascriptExecutor = (JavascriptExecutor) webDriver;

        PageFactory.initElements(webDriver, this );
    }


    protected void inputText(WebElement webElement, String text){
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(webElement));

        webElement.clear();
        webElement.sendKeys(text);
    }

    protected void inputText(By by, String text){
        WebElement webElement= webDriverWait
                .until(ExpectedConditions.elementToBeClickable(by));

        webElement.clear();
        webElement.sendKeys(text);
    }
    //dùng để set giát trị cho 1 cái textbox(set ở bên dưới)
    protected void setText(WebElement webElement, String text){
         webDriverWait
                 .until(ExpectedConditions.visibilityOf(webElement));
         javascriptExecutor.executeScript("arguments[0].innerHTML = arguments[1];", webElement,text);
    }

    protected void setTextArea(WebElement webElement, String text){
        webDriverWait
                .until(ExpectedConditions.visibilityOf(webElement));
        javascriptExecutor.executeScript("arguments[0].innerHTML = arguments[1];", webElement,text);
    }

    protected void click(WebElement webElement){
//        WebElement el = webDriverWait
//                .until(ExpectedConditions.elementToBeClickable(webElement));
//        el.click();
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(webElement))
                .click();
    }
    protected void click(By by){
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(by))
                .click();
    }

    public String getPageTitle(){
        return webDriver.getTitle();
    }

    public String getText(By by){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by)).getText();
        return getText(by);
    }

}
