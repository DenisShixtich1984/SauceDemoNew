package com.saucedemo1.tests;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.apache.commons.lang3.RandomUtils;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class UnstableTest extends BaseTest{
//    @Test (timeOut = 1000, retryAnalyzer = Retry.class)
//    @Description("Unstable Test. Need to fix")
//    @TmsLink("SP-28")
//    @Link("https://music.yandex.ru/artist/3099790/info")
//    public void testRemoveShirtUnstable() {
//        long timeout = RandomUtils.nextLong(1100,1400);
//        loginPage.openPage();
//        loginPage.loginWithStandardUser();
//        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
//        productsPage.addToCartRedTShirt().pressCartButton();
//        cartPage.waitOpenAndCheckTShirt();
//        cartPage.isPageOpened();
//        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");
//        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
//        cartPage.removeButton.click();
//        Assert.assertEquals(cartPage.getCart(), "");
//        System.out.println("Retry = " + timeout);
//    }
//    @Test (timeOut = 1000, retryAnalyzer = Retry.class)
//    @Description("Not working test. The problem is a big timeout. Need to fix")
//    @TmsLink("SP-29")
//    @Issue("13")
//    @Ignore
//    public void testRemoveShirtUnstablePart2() {
//        long timeout = RandomUtils.nextLong(1000,1300);
//        loginPage.openPage();
//        loginPage.loginWithStandardUser();
//        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
//        productsPage.addToCartRedTShirt().pressCartButton();
//        cartPage.waitOpenAndCheckTShirt();
//        cartPage.isPageOpened();
//        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");
//        Assert.assertEquals(cartPage.getCheckThingInTheCart(), "Test.allTheThings() T-Shirt (Red)");
//        cartPage.removeButton.click();
//        Assert.assertEquals(cartPage.getCart(), "");
//        System.out.println("Retry = " + timeout);
//    }
}
