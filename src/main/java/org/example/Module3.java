package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ResourceBundle;

public class Module3 {
    WebDriver driver;
    @FindBy(id = "username")
    WebElement user;
    // By user = By.id("username");
    @FindBy(id = "password")
    WebElement pass;
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement login;
    public Module3(WebDriver driver){
        this.driver = driver;
    }
    public void CorrectLogin() throws InterruptedException {

        ResourceBundle r = ResourceBundle.getBundle("config");
        String a = r.getString("email");
        String b = r.getString("password");

        driver.navigate().refresh();
        Thread.sleep(10000);

        user.sendKeys(a);
        Thread.sleep(3000);
        pass.sendKeys(b);
        Thread.sleep(3000);
        login.click();

    }

}
