package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Module2 {
    WebDriver driver;
    @FindBy(id = "username")
    WebElement user;
    @FindBy(id = "password")
    WebElement pass;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement login;
    @FindBy(id = "error-for-password")
    WebElement Wrong_Login;

    public Module2(WebDriver driver){
        this.driver = driver;
    }
    public void wrongLogin() throws InterruptedException {
        String email = "Epam@gmail.com";
        String password = "Epam2";
        user.sendKeys(email);
        Thread.sleep(3000);
        pass.sendKeys(password);
        Thread.sleep(3000);
        login.click();
        Thread.sleep(5000);

    }
    public WebElement Get_Wrong_Login(){
        WebElement WrongLog = Wrong_Login;
        return WrongLog;
    }
}
