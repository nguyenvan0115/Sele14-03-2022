package Selenium.demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions; ///???????
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import javax.swing.*;
import java.time.Duration;

public class ElementTests {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    protected JavascriptExecutor javascriptExecutor;

    protected Actions actions;

    private static final int immplicitlyTimeout =30;
    private static final int explicitlyTimeout =30;
    private static final int pageLoadTimeout = 30;

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is Before  Test Method!!!");

        webDriver = WebDriverManager.getInstance("Chrome").create();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTimeout));
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(immplicitlyTimeout));
        webDriver.manage().window().maximize();

        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(explicitlyTimeout));
        javascriptExecutor = (JavascriptExecutor) webDriver;
        //khai bao action
        actions = new Actions(webDriver);
    }
    @Test
    public void dynamicPropertiesTest(){
        webDriver.get("https://demoqa.com/dynamic-properties");

        WebElement elVisibleAfter = webDriver.findElement(By.id("visibleAfter"));

        elVisibleAfter.click();
    }

    @Test
    public void ThreadSleepTests() throws InterruptedException {
        webDriver.get("https://demoqa.com/dynamic-properties");
        Thread.sleep(6000);

        WebElement elVisibleAfter = webDriver.findElement(By.id("visibleAfter"));

        elVisibleAfter.click();
    }
    @Test
    public void explicitltTimeoutTest(){
        webDriver.get("https://demoqa.com/dynamic-properties");

//        WebElement elVisibleAfter = webDriver.findElement(By.id("visibleAfter"));

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(explicitlyTimeout));

        WebElement elVisibleAfter = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        elVisibleAfter.click();
    }
    @Test
    public void explicitltTimeoutTest2(){
        webDriver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(explicitlyTimeout));

        WebElement elEnableAfter = webDriver.findElement(By.id("enableAfter"));

        elEnableAfter = webDriverWait
                .until(ExpectedConditions.elementToBeClickable(elEnableAfter));

        elEnableAfter.click();
    }
    @Test
    public void explicitltTimeoutTest3(){
        webDriver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(explicitlyTimeout));

        WebElement elColorChange = webDriver.findElement(By.id("colorChange"));
        //mt-4 btn btn-primary
        //mt-4 text-danger btn btn-primary
        webDriverWait
                .until(ExpectedConditions
                        .attributeToBe(elColorChange, "class","mt-4 text-danger btn btn-primary"));
    }

    @Test
    public void textBoxTest1(){
        webDriver.get("https://demoqa.com/text-box");

        By byFullName = By.id("userName");
        By byCurrentAddress = By.id("currentAddress");

        WebElement elFullName = webDriverWait.until(ExpectedConditions.elementToBeClickable(byFullName));
        elFullName.sendKeys("ITMS coaching");

        WebElement elCurrentAddress = webDriverWait.until(ExpectedConditions.elementToBeClickable(elFullName));
        javascriptExecutor.executeScript("arguments[0].innerHTML = arguments[1];", elCurrentAddress,"van xinh gai");

    }
    @Test
    public void checkBoxTest1(){
        webDriver.get("https://demoqa.com/checkbox");

        By byText = By.xpath("//span[text()='Home']");
//        By byCurrentAddress = By.id("currentAddress");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byText)).click();

    }

    @Test
    public void checkBoxTest2(){
        webDriver.get("https://demoqa.com/checkbox");

        By byExpanHome = By.xpath("//span[.='Home']//button");
        By byExpanDesktop = By.xpath("//li[.='Desktop']//button");
        By byNote = By.xpath("//span[text()='Notes']");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byExpanHome)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byExpanDesktop)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byNote)).click();
    }
    @Test
    public void radioBtnTest1(){
        webDriver.get("https://demoqa.com/radio-button");

        By byRadioYes = By.xpath("//div[.=//label[text()='Yes']]"); // thường là click vào lable
        //cach1
        /*WebElement webElement = webDriver.findElement(byRadioYes);
        webElement.click(); */
        //cach2
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byRadioYes)).click();
    }

    @Test
    public void BtnTest1(){
        webDriver.get("https://demoqa.com/buttons");

        By byDoubleClick = By.xpath("//button[.='Double Click Me']");

        WebElement el = webDriverWait.until(ExpectedConditions.elementToBeClickable(byDoubleClick));
        actions.doubleClick(el).perform();

        By byRightClick = By.xpath("//button[.='Right Click Me']");

        WebElement elRightClick = webDriverWait.until(ExpectedConditions.elementToBeClickable(byRightClick));
        actions.contextClick(elRightClick).perform();
    }

    @Test
    public void dropdowlistTest1(){
        webDriver.get("https://www.facebook.com/");

        By byCreateNewAcc = By.linkText("Create New Account");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byCreateNewAcc)).click();

        By byDay = By.id("day");
        By byMonth = By.id("month");
        By byYear = By.id("year");

        WebElement elDay = webDriverWait.until(ExpectedConditions.elementToBeClickable(byDay));
        WebElement elMonth =webDriverWait.until(ExpectedConditions.elementToBeClickable(byMonth));
        WebElement elYear =webDriverWait.until(ExpectedConditions.elementToBeClickable(byYear));

        Select slDay = new Select(elDay);
        slDay.selectByValue("18");

        Select slMonth = new Select(elMonth);
        slDay.selectByValue("1");
//        slDay.selectByVisibleText("Apr"); ?? tại sao lại lỗi

        Select slYear = new Select(elYear);
        slDay.selectByIndex(2);
     }


















    @Test
    public void frameTest1(){
        webDriver.get("https://demoqa.com/frames");
        By bymainHeader = By.className("main-header");
        By byHeating = By.xpath("sampleHeading");
        //tuowg tác dòng lệnh bên trogn frame
        webDriver.switchTo().frame("frame1");

        String header = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byHeating)).getText();

        Assert.assertEquals(header, "This is a sample page");

        webDriver.switchTo().defaultContent();
//        mainHeader = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(bymainHeader)).getText();

    }
    @Test
    public void alertTest(){
        webDriver.get("https://demoqa.com/alerts");
        By byClickMe = By.id("alertButton");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byClickMe)).click();

        Alert alert = webDriver.switchTo().alert();
        alert.accept(); //click OK
//        alert.dismiss(); // click  Cancel
//        alert.sendKeys(" "); //input texxt
//        alert.getText(); // tra ve text
    }
    @Test
    public void alertTest2() {
        webDriver.get("https://demoqa.com/alerts");
        By byClickMe = By.id("timerAlertButton");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byClickMe)).click(); //cach2
//        webDriver.findElement(byClickMe); //casch 1

        webDriverWait.until(ExpectedConditions.alertIsPresent());

        Alert alert = webDriver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void alertTest3() {
        webDriver.get("https://demoqa.com/alerts");
        By byClickMe = By.id("promtButton");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byClickMe)).click(); //cach2
//        webDriver.findElement(byClickMe); //casch 1

        webDriverWait.until(ExpectedConditions.alertIsPresent());

        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys("This is Van");
        alert.accept();
//        alert.dismiss();

        By byPromptResult = By.id("promptResult");
        WebElement elRessult = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byPromptResult));
        String result= elRessult.getText();

        Assert.assertTrue(result.contains("This is Van "));
    }
    @Test
    public void tabTest(){

    }

}
