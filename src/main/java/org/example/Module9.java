package org.example;

import org.bouncycastle.math.raw.Mod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Module9 {
    WebDriver driver;
    @FindBy(xpath = "//span[text()='Me']")
    WebElement MeButton;
    @FindBy(xpath = "//a[@class='global-nav__secondary-link mv1']")
    WebElement logoutButton;

    public Module9(WebDriver driver){
        this.driver =driver;
    }

    void logOut() throws InterruptedException {
        MeButton.click();
        Thread.sleep(5000);

        logoutButton.click();
        Thread.sleep(5000);

    }

}
