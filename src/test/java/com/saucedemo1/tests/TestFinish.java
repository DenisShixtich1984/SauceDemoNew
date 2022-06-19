package com.saucedemo1.tests;

import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFinish extends BaseTest{
    @Test
    @TmsLink("SP-21")
    public void testEnterFinishAndReturn() {
        loginPage.startLoginPasAndClick();
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.pressButtonAndSwitch();
        checkOutPage.getFirstLastZipCode().continueButtonClick();
        overviewPage.getButtonFinish();
        Assert.assertEquals(finishPage.getTitleText(), "THANK YOU FOR YOUR ORDER");
        finishPage.buttonBack.click();
        productsPage.isPageOpened();
    }
}
