package Selenium.demo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions; ///???????
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.time.Duration;

public class ElementTests {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    protected JavascriptExecutor javascriptExecutor;

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
        javascriptExecutor.executeScript("arguments[0].innerHTML = arguments[1]);", elCurrentAddress,"van xinh gai");

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
        By byNote = By.xpath("////span[text()='Notes']");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byExpanHome)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byExpanDesktop)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byNote)).click();
    }



}
