package org.example;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Module1 {
    WebDriver driver;
    @FindBy(id = "username")
    WebElement user;

    @FindBy(id = "password")
    WebElement pass;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement login;
    @FindBy(id = "error-for-username")
    WebElement Empty_Login;

    public Module1(WebDriver driver){
        this.driver = driver;
    }

    public void emptyLogin() throws InterruptedException {

        String email = " ";
        String password = "";
        user.sendKeys(email);
        Thread.sleep(3000);
        pass.sendKeys(password);
        Thread.sleep(3000);
        login.click();
        Thread.sleep(3000);
    }

    public WebElement Get_Empty_Login(){
        WebElement EmptyLog = Empty_Login;
        return EmptyLog;
    }
}
