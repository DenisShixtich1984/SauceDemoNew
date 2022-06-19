package com.saucedemo1.tests;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLeftMenu extends BaseTest {
    @Test
    @TmsLink("SP-22")
    public void testPressLeftMenu() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        menu.pushLeftMenu();
        menu.waitLeftMenuOpened();
        menu.logOutMeted();
        loginPage.isPageOpened();
        Assert.assertEquals(loginPage.getUrl(), "https://www.saucedemo.com/");
    }
    @Test
    @TmsLink("SP-23")
    public void testPressButtonAbout() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        menu.pushLeftMenu();
        menu.waitLeftMenuOpened();
        menu.buttonAbout.click();
        Assert.assertEquals(menu.getUrl(),"https://saucelabs.com/");
    }
}