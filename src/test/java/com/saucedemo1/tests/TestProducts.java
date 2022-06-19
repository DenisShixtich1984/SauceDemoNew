package com.saucedemo1.tests;

import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class TestProducts extends BaseTest {
    @Test
    @Description("product addition test")
    @TmsLink("SP-7")
    public void testCheckButtonJacketAddToCart() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
        productsPage.addToCartRedTShirt();
        Assert.assertEquals(productsPage.checkPressedButton(), "REMOVE");
    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-8")
    public void testLocationCart() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        productsPage.addToCartRedTShirt().pressCartButton();
        cartPage.waitOpenCartPage();
        Assert.assertEquals(cartPage.getCartTitle(), "YOUR CART");

    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-9")
    public void testSelectSortOfName() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
        productsPage.selectFilterName.click();
        productsPage.selectZtoA.click();
        Assert.assertEquals(productsPage.checkSelectZtoA(), "Name (Z to A)");
    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-10")
    public void testCortOtherWay() {
        loginPage.startLoginPasAndClick();
        productsPage.isPageOpened();
        List initialName = productsPage.getItemName();
        // асерт переставил стачала на 2 строчки выше -или на 1 строчку ниже только так работает !!!!!!!!!!!!!!!!!!!!
        initialName.sort(Comparator.reverseOrder());
        productsPage.selectValueByText("Name (Z to A)");
        productsPage.selectValueByText("Name (A to Z)");
        Assert.assertEquals(productsPage.getItemName(), initialName);
        initialName.sort(Comparator.naturalOrder());
        Assert.assertEquals(productsPage.getItemName(), initialName);
    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-11")
    public void testAddToCartAllThings() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        Assert.assertEquals(productsPage.getPageProdTitle(), "PRODUCTS");
        productsPage.addToCartAllElements();
        Assert.assertEquals(productsPage.checkCart(), "6");
    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-12")
    public void testCheckTwitter() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        productsPage.pressButtonTwitter();
    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-13")
    public void testCheckFacebook() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        productsPage.iconFacebook.click();
    }

    @Test
    @Description("product addition test")
    @TmsLink("SP-14")
    public void testCheckLinkId() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsPage.isPageOpened();
        productsPage.iconLinkedIn.click();
    }
}