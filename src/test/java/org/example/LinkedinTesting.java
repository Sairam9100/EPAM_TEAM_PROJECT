package org.example;

import com.browser.FactoryBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.resources.ResourceBuilder;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.bouncycastle.math.raw.Mod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.time.Duration;
import java.util.ResourceBundle;
import java.util.List;


public class LinkedinTesting {

    @Test
    public void LinkedinTest() throws InterruptedException {

        WebDriver driver = FactoryBrowser.setupBrowser("chrome", "https://www.linkedin.com/login");

        PageFactory.initElements(driver, Module1.class);
        Module1 EmptyLogin = PageFactory.initElements(driver, Module1.class);

        EmptyLogin.emptyLogin();
        WebElement A1 = driver.findElement(By.id("error-for-username"));

        Assert.assertEquals(A1.getText(), "Please enter an email address or phone number");

        PageFactory.initElements(driver, Module2.class);
        Module2 WrongCredentials = PageFactory.initElements(driver, Module2.class);

        WrongCredentials.wrongLogin();

        WebElement A2 = driver.findElement(By.id("error-for-password"));
        Assert.assertEquals(A2.getText(),"The password you provided must have at least 6 characters.");


        PageFactory.initElements(driver, Module3.class);
        Module3 CorrectCredentials = PageFactory.initElements(driver, Module3.class);

        CorrectCredentials.CorrectLogin();


        PageFactory.initElements(driver, Module4.class);
        Module4 OpenProfile = PageFactory.initElements(driver, Module4.class);

        OpenProfile.editProfile();

        PageFactory.initElements(driver, Module5.class);
        Module5 EditProfile = PageFactory.initElements(driver, Module5.class);

        EditProfile.editDetails();


        PageFactory.initElements(driver, Module6.class);
        Module6 SearchBox = PageFactory.initElements(driver, Module6.class);

        SearchBox.searchTest();

        PageFactory.initElements(driver, Module7.class);
        Module7 OpenMessages = PageFactory.initElements(driver, Module7.class);

        OpenMessages.MessagesTab();


        PageFactory.initElements(driver, Module8.class);
        Module8 DeleteMessages = PageFactory.initElements(driver, Module8.class);

        DeleteMessages.DeleteMessage();


        PageFactory.initElements(driver, Module9.class);
        Module9 logOut = PageFactory.initElements(driver, Module9.class);

        logOut.logOut();

    }

}
