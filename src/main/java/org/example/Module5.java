package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Module5 {
    WebDriver driver;
    @FindBy(id = "single-line-text-form-component-urn-li-fsu-profileContactInfoEditFormElement-PHONE-NUMBER-1")
    WebElement mobileNo;
    @FindBy(id = "text-entity-list-form-component-urn-li-fsu-profileContactInfoEditFormElement-PHONE-TYPE-1")
    WebElement mobileType;
    @FindBy(id = "multiline-text-form-component-urn-li-fsu-profileContactInfoEditFormElement-ADDRESS-1")
    WebElement place;
    @FindBy(xpath = "//button[@type='button']//span[text()='Save']")
    WebElement contactSave;
    public Module5(WebDriver driver){
        this.driver =driver;
    }
    public void editDetails() throws InterruptedException {
        WebElement phoneNo= mobileNo;
        phoneNo.clear();
        Thread.sleep(3000);
        phoneNo.sendKeys("1234567890");
        Select phoneType = new Select(mobileType);
        phoneType.selectByValue("Please select");
        phoneType.selectByValue("Home");
        Thread.sleep(3000);
        WebElement address= place;
        address.clear();
        Thread.sleep(3000);
        address.sendKeys("1-233,Phagwara,Punjab");
        contactSave.click();
        Thread.sleep(3000);

    }
}
