package Selenium.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTests {
    @Test
    public void seleniumTest1() throws InterruptedException {
        //Setting system property of ChormeDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        //Init a new Chorme Driver Object
        WebDriver webDriver = new ChromeDriver();
        //Launching a specified url
        webDriver.get("https://www.google.com/");
        Thread.sleep(3000);
        webDriver.findElement(By.name("q")).sendKeys("ITMS");
        WebElement searchButton = webDriver.findElement(By.name("btnK"));
//        searchButton.click();
    }

    @Test
    public void seleniumTest2() throws InterruptedException {
        //Setting system property of ChormeDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        //Init a new Chorme Driver Object
        WebDriver webDriver = new ChromeDriver();

        //Launching a specified url
        webDriver.get("http://tutorialsninja.com/demo/");
        Thread.sleep(3000);
    }

    @Test
    public void seleniumTest3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        Thread.sleep(3000);

        WebElement txtFirstName = webDriver.findElement(By.id("input-firstname"));  // seach by F12= input#input-firstname
        txtFirstName.sendKeys("Vân 2");

        WebElement txtLastName = webDriver.findElement(By.id("input-lastname"));  // seach by F12= input#input-lastname
        txtLastName.sendKeys("Nguyễn");

        WebElement txtEmail = webDriver.findElement(By.id("input-email"));  // seach by F12= input#input-email
        txtEmail.sendKeys("van@gmail.com");

        WebElement txtTelephone = webDriver.findElement(By.id("input-telephone"));  // seach by F12= input-telephone
        txtTelephone.sendKeys("0969205780");

        WebElement txtPassword = webDriver.findElement(By.id("input-password"));
        txtPassword.sendKeys("Van99");

        WebElement txtPasswordConf = webDriver.findElement(By.id("input-confirm"));
        txtPasswordConf.sendKeys("Van99");

        WebElement checkBox = webDriver.findElement(By.name("agree"));
        checkBox.click();

        WebElement btnContinue = webDriver.findElement(By.xpath("//input[@class='btn btn-primary']")); //"input[@class=''btn btn-primary]"
        btnContinue.click();

//        webDriver.close();
    }

    @Test
    public void seleniumTest4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
        Thread.sleep(8000);

        WebElement clickMyAcc = webDriver.findElement(By.xpath("//span[text()='My Account']"));
        clickMyAcc.click();

        WebElement clickRegister = webDriver.findElement(By.xpath("//a[text()='Register']"));
        clickRegister.click();

    }
}
