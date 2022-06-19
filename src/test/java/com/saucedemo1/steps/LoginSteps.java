package com.saucedemo1.steps;

import com.saucedemo1.pages.BasePage;
import com.saucedemo1.pages.LoginPage;
import com.saucedemo1.pages.ProductsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
public class LoginSteps {
    private LoginPage pageLogin;
    private ProductsPage pageProduct;

    public LoginSteps(WebDriver driver) {
        pageLogin = new LoginPage(driver);
        pageProduct = new ProductsPage(driver);

    }
    @Step ()
    public LoginSteps getFalseMessage () {
        pageLogin
                .openPage()
                .isPageOpened();
        pageLogin
                .login("rsbsfb", "eeeeeee")
                .checkFalseErrorMessage();
        return this;
    }

    @Step ()
    public LoginSteps standardValidation () {
        pageLogin
                .openPage()
                .isPageOpened();
        pageLogin
                .loginWithStandardUser();
        pageProduct
                .waitOpenProductPage();
        pageProduct
                .checkGetProTitle();
     return this;
    }

}
