package com.saucedemo1.tests;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckOut extends BaseTest {
    @Test
    @TmsLink("SP-18")
    public void testCheckOutCrossing() {
        loginPage.startLoginPasAndClick();
        productsPage.addToCartRedTShirt().pressCartButton();
        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
        cartPage.pressButtonAndSwitch();
        checkOutPage.isPageOpened();
    }
    @Test
    @TmsLink("SP-19")
    public void testOverViewCrossingWithOutRegistration() {
        loginPage.startLoginPasAndClick();
        productsPage.addToCartRedTShirt().pressCartButton();
        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
        cartPage.pressButtonAndSwitch();
        checkOutPage.isPageOpened();
        checkOutPage.continueButtonClick();
        Assert.assertEquals(checkOutPage.getErrorMessageText(),"Error: First Name is required");
    }
    @Test
    @TmsLink("SP-20")
    public void testEnterRegistration () {
        loginPage.startLoginPasAndClick();
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.pressButtonAndSwitch();
        checkOutPage.getFirstLastZipCode().continueButtonClick();
        overviewPage.isPageOpened();
    }

}