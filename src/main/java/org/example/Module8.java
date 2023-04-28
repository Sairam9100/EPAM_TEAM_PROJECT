package org.example;

import com.beust.jcommander.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Module8 {
    WebDriver driver;
    @FindBy(css = ".msg-selectable-entity__checkbox-container")
    WebElement selectMessage;
    @FindBy(css ="button[title=Delete]")
    WebElement delete;
    @FindBy(xpath = "//span[text()='Yes, delete']")
    WebElement confirm;
    @FindBy(xpath = "//a[@aria-label='Compose a new message']")
    WebElement reload;
    public Module8(WebDriver driver){
        this.driver =driver;
    }
    public void DeleteMessage() throws InterruptedException {

        selectMessage.click();
        Thread.sleep(5000);
        delete.click();
        Thread.sleep(3000);
        confirm.click();
        Thread.sleep(3000);
        reload.click();
        Thread.sleep(3000);

    }

}
