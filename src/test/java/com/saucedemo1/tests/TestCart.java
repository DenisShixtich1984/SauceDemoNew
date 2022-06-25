package com.saucedemo1.tests;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCart extends BaseTest {
//    @Test
//    @Description("test for working with the cart")
//    @TmsLink("SP-15")
//    public void testRedShirtAddToCart() {
//        loginPage.startLoginPasAndClick();
//        productsPage.waitOpenProductPage();
//        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
//        productsPage.addToCartRedTShirt().pressCartButton();
//        cartPage.isPageOpened();
//        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");
//        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
//    }

    @Test
    @Description("test for working with the cart")
    @TmsLink("SP-16")
    public void testCheckPrice() {
        loginPage.startLoginPasAndClick();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.isPageOpened();
        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");
        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
        Assert.assertEquals(cartPage.getCheckPriceInTheCart(), "$15.99");
    }

    @Test
    @Description("test for working with the cart")
    @TmsLink("SP-17")
    public void testRemoveShirt() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.waitOpenAndCheckTShirt();
        cartPage.isPageOpened();
        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");
        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
        cartPage.removeButton.click();
        Assert.assertEquals(cartPage.getCart(), "");
    }
//    @Test
//    @Description("broken test")
//    @TmsLink("SP-33")
//    public void testBroken() {
//        loginPage.openPage();
//        loginPage.loginWithStandardUser();
//        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
//        productsPage.addToCartRedTShirt().pressCartButton();
//        cartPage.waitOpenAndCheckTShirt();
//        cartPage.isPageOpened();
//        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");
//        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "TTest.allTheThings() T-Shirt (Red)");
//    }
}