package UI.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialsninja.ui.pages.AccPage;
import tutorialsninja.ui.pages.LoginPage;
import tutorialsninja.ui.pages.MyAccInformationPage;

public class MyAcc extends BaseTest{
    @Test
    public void veryfyAccInfor() throws InterruptedException {
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //login
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("van11@gmail.com","0969205780");
        //My Acc Page
        AccPage accPage = new AccPage(webDriver);
        accPage.openEdityouraccountinformation();
        //Acc Information
        MyAccInformationPage myAccInformationPage = new MyAccInformationPage(webDriver);

        Assert.assertEquals(myAccInformationPage.getFirstName(),"Vân 10");
        Assert.assertEquals(myAccInformationPage.getLastName(),"Nguyễn");
        Assert.assertEquals(myAccInformationPage.getEmail(),"van10@gmail.com");
        Assert.assertEquals(myAccInformationPage.getTelephone(),"0969205780");
    }
    @Test
    public void editMyAccInformation(){
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        //login
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("van10@gmail.com","Van99");
        //My Acc Page
        AccPage accPage = new AccPage(webDriver);
        accPage.openEdityouraccountinformation();

        //Acc Information
        MyAccInformationPage myAccInformationPage = new MyAccInformationPage(webDriver);

        Assert.assertEquals(myAccInformationPage.getFirstName(),"Vân 10");
        Assert.assertEquals(myAccInformationPage.getLastName(),"Nguyễn");
        Assert.assertEquals(myAccInformationPage.getEmail(),"van10@gmail.com");
        Assert.assertEquals(myAccInformationPage.getTelephone(),"0969205780");

        //Edit Information
        myAccInformationPage.setTxtFirstName("Tom");
        myAccInformationPage.setTxtLastName("Harry");
        myAccInformationPage.setTxtTelephone("0969205777");

        //Verify new Infor before Continue
        Assert.assertEquals(myAccInformationPage.getFirstName(),"Tom");
        Assert.assertEquals(myAccInformationPage.getLastName(),"Harry");
        Assert.assertEquals(myAccInformationPage.getTelephone(),"0969205777");

        myAccInformationPage.clickContinue();
    }
}
