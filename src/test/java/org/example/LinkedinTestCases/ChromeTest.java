package org.example.LinkedinTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromeTest {

    WebDriver driver;
    Module1 obj;
    String Empty_Credentials;

    String Wrong_Credentials;

    @BeforeClass

    @Parameters({"browser", "Url"})
    public void openBrowser(String browser, String Url){

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            obj = new Module1(driver);
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            obj = new Module1(driver);
        }
        driver.get(Url);
    }



    @Test
    public void LinkedinTest() throws InterruptedException {

        driver.manage().window().maximize();

        PageFactory.initElements(driver,Module1 .class);
        Module1 EmptyLogin = PageFactory.initElements(driver, Module1.class);
        EmptyLogin.emptyLogin();
        Empty_Credentials =EmptyLogin.Get_Empty_Login().getText();

        PageFactory.initElements(driver, Module2.class);
        Module2 WrongCredentials = PageFactory.initElements(driver, Module2.class);
        WrongCredentials.wrongLogin();
        Wrong_Credentials =WrongCredentials.Get_Wrong_Login().getText();

        PageFactory.initElements(driver, Module3.class);
        PageFactory.initElements(driver, Module4.class);
        PageFactory.initElements(driver, Module5.class);
        PageFactory.initElements(driver,Module6 .class);
        PageFactory.initElements(driver,Module7 .class);
        PageFactory.initElements(driver,Module8 .class);
        PageFactory.initElements(driver,Module9 .class);

        Module3 CorrectCredentials = PageFactory.initElements(driver, Module3.class);
        Module4 OpenProfile = PageFactory.initElements(driver, Module4.class);
        Module5 EditProfile = PageFactory.initElements(driver, Module5.class);
        Module6 SearchBox = PageFactory.initElements(driver, Module6.class);
        Module7 OpenMessages = PageFactory.initElements(driver, Module7.class);
        Module8 DeleteMessages = PageFactory.initElements(driver, Module8.class);
        Module9 logOut = PageFactory.initElements(driver, Module9.class);



        CorrectCredentials.CorrectLogin();
        OpenProfile.editProfile();
        EditProfile.editDetails();
        SearchBox.searchTest();
        OpenMessages.MessagesTab();
        DeleteMessages.DeleteMessage();
        logOut.logOut();

    }


    @Test
    public void VerifyData(){

        Assert.assertEquals(Empty_Credentials, "Please enter an email address or phone number");

        Assert.assertEquals(Wrong_Credentials,"The password you provided must have at least 6 characters.");

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}