package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Module7 {

    WebDriver driver;
    By messages = By.xpath("//a[@target='_self']");
    @FindBy(xpath = "//input[@placeholder='Type a name or multiple names']")
    WebElement searchBox;
    @FindBy(xpath = "//div[@aria-label='Write a message…']")
    WebElement typeMessage;
    @FindBy(xpath = "//button[text()='Send']")
    WebElement sendMessage;
    public Module7(WebDriver driver){
        this.driver = driver;
    }
    public void MessagesTab() throws InterruptedException {

        List<WebElement> list = driver.findElements(messages);
        list.get(3).click();
        Thread.sleep(3000);
        WebElement w = searchBox;
        w.sendKeys("Chellaboina Raghavendra");
        Thread.sleep(5000);
        w.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        typeMessage.sendKeys("This Is Epam Testing");
        Thread.sleep(4000);
        sendMessage.click();
        Thread.sleep(4000);

    }
}
