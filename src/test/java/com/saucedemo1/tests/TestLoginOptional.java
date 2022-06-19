package com.saucedemo1.tests;

import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLoginOptional extends BaseTest {
    @Test
    @TmsLink("SP-24")
    @Parameters({"Log","Pass"})
    public void ParametersTest (@Optional("standard_user")String Log,
                                @Optional("secret_sauce")String Pass) {
        System.out.println("New Parameters");
        loginPage.openPage();
        loginPage.isPageOpened();
        loginPage.login (Log, Pass);
        productsPage.waitOpenProductPage();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
    }
}
