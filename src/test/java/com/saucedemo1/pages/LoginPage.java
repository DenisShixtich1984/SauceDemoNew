package com.saucedemo1.pages;

import com.saucedemo1.utils.AllureUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userNameField;
    @FindBy (id = "password")
    public WebElement passwordField;
    @FindBy (id = "login-button")
    public WebElement loginButton;
    @FindBy (css = ".error-message-container.error")
    public WebElement errorMessage;

    public LoginPage(WebDriver driver) {
    super(driver);
        PageFactory.initElements(driver, this);
}
    @Override
    @Step
    public BasePage isPageOpened() {
        wait.until(ExpectedConditions.urlToBe(reader.getProperty("urlSaucedemo")));
     //   AllureUtils.takeScreenshot(driver);
        return this;
    }
    @Step ("Opening site SauceDemo")
    public LoginPage openPage() {
        driver.get(reader.getProperty("urlSaucedemo"));
        return this;
    }

    @Step ("Input login, password and click button" )
    public LoginPage login(String username, String password) {
        setUsername(username).setPasswordField(password).clickLogin();
        return this;
    }
    @Step ("false message")
    public LoginPage checkFalseErrorMessage () {
        AllureUtils.takeScreenshot(driver);
        Assert.assertEquals(getErrorMessage(), "Eic sadface: Username and password do not match any user in this service");
        return this;
    }
    @Step
    public LoginPage assertCheckTrueErrorMessage () {
        Assert.assertEquals(getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
   return this;
    }

    public String getUserName() {
        return reader.getProperty("username");
    }

    public String getUserPassword() {
        return reader.getProperty("password");
    }

    public LoginPage setUsername(String username) {
        userNameField.sendKeys(username);
        return this;
    }

    public LoginPage setPasswordField(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public ProductsPage clickLogin() {
        loginButton.click();
        return new ProductsPage(driver);
    }

    @Step
    public ProductsPage loginWithStandardUser() {
         login(getUserName(), getUserPassword());
         return new ProductsPage(driver);

    }

    public void startLoginPasAndClick() {
        openPage();
        loginWithStandardUser();
    }
}