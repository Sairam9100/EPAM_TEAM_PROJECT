package org.example;

import org.bouncycastle.math.raw.Mod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Module6 {
    WebDriver driver;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchButton;

    public Module6(WebDriver driver){
        this.driver =driver;
    }

    public void searchTest() throws InterruptedException {
        WebElement s = searchButton;
        s.sendKeys("CHELLABOINA RAGHAVENDRA");
        s.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

}
