package UI.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;
    private static final int timeout = 40;
    private static final int immplicitlyTimeout = 40;

    @BeforeTest
    public void beforeTest(){
        webDriver = WebDriverManager.getInstance("Chrome").create();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(immplicitlyTimeout));
        webDriver.manage().window().maximize();
    }

    public void login() throws InterruptedException {
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement txtEmail = webDriver.findElement(By.id("input-email"));  // seach by F12= input#input-firstname
        WebElement txtPassword = webDriver.findElement(By.id("input-password"));
        WebElement clickRegister = webDriver.findElement(By.xpath("//input[@value='Login']"));

        txtEmail.sendKeys("Vân10@Gmail.com");
        txtPassword.sendKeys("Van99");

        clickRegister.click();
    }

}
