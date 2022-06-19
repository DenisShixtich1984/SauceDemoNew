package com.saucedemo1.pages;
import com.saucedemo1.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String getUrl () {
        return driver.getCurrentUrl();
    }
    public  abstract BasePage isPageOpened ();
    PropertyReader reader = new PropertyReader();

}
