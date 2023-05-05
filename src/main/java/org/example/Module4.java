package org.example;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Module4 {
    WebDriver driver;
    By welcome = By.linkText("Welcome, Epam!");
    By contact = By.xpath("//a[@id='top-card-text-details-contact-info']");
    By edit = By.xpath("//li-icon[@type='edit']");
    public Module4(WebDriver driver){
        this.driver = driver;
    }

    public void editProfile() throws InterruptedException {
        WebElement w = (new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(welcome)));
        w.click();
        Thread.sleep(5000);

        driver.findElement(contact).click();
        Thread.sleep(5000);

        driver.findElement(edit).click();
        Thread.sleep(5000);
    }
}
