package com.saucedemo1.tests;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOverview extends BaseTest {
    @Test
    @TmsLink("SP-26")
    public void testEnterRegistrationAndCheck() {
        loginPage.startLoginPasAndClick();
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.pressButtonAndSwitch();
        checkOutPage.getFirstLastZipCode().continueButtonClick();
        overviewPage.isPageOpened();
        Assert.assertEquals(overviewPage.getTextProd(), "Test.allTheThings() T-Shirt (Red)");
    }

    @Test
    @TmsLink("SP-27")
    public void testEnterFinish() {
        loginPage.startLoginPasAndClick();
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.pressButtonAndSwitch();
        checkOutPage.getFirstLastZipCode().continueButtonClick();
        overviewPage.getButtonFinish();
        finishPage.isPageOpened();
    }
}