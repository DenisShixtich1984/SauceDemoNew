
package com.saucedemo1.tests;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest{
    @Test(groups = "number1")
    @Description("user validation test")
    @TmsLink("SP-1")
    public void testLogin() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.loginWithStandardUser();
        productsPage.waitOpenProductPage();
        productsPage.checkGetProTitle();
    }
    @Test(description = "enterWithStandardData")
    public void enterWithStandardData () {
        loginSteps.standardValidation();
    }

    @Test(groups = "number1")
    @Description("user validation test")
    @TmsLink("SP-2")
    public void testEmptyPassword() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.setUsername(loginPage.getUserName()).clickLogin();
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required");
    }
    @Test
    @Description("user validation test")
    @TmsLink("SP-3")
    public void testWrongLoginAndPassword() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login("rsbsfb", "eeeeeee");
        loginPage.assertCheckTrueErrorMessage();
    }
    @Test
    @Description("user validation test")
    @TmsLink("SP-4")
    public void testLockedOutUserLoginAndPropertiesPassword() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login("locked_out_user",loginPage.getUserPassword());
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
    }
    @Test
    @Description("user validation test")
    @TmsLink("SP-5")
    public void testProblemUserLoginAndStandardPassword() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login("problem_user", loginPage.getUserPassword());
        productsPage.waitOpenProductPage();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
    }
    @Test
    @Description("user validation test")
    @TmsLink("SP-6")
    public void testPerformanceGlitchUserLoginAndStandardPassword() {
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login("performance_glitch_user", loginPage.getUserPassword());
        productsPage.waitOpenProductPage();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
    }
    @Test
    @Description("user validation with true test's  mistake in expected")
    @TmsLink("SP-3")
    @Issue("14")
    @Link("https://open.spotify.com/artist/5Rhvec15X3GXZGq52lEKt8")
    public void testWrongLoginAndPasswordTrue() {
        loginSteps.getFalseMessage();
    }



}
