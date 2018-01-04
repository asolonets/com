package com.Promytheus.test;

import com.Promytheus.modules.Modules;
import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.testdata.Util;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginTestData")
    public void LoginTestCase_new(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);
        SoftAssert softAccert = new SoftAssert();
        Modules modules = new Modules(driver);
        modules.login(userName, password);
        Thread.sleep(2000);
        if (userName.toString().equals("Invalid") || password.toString().equals("Invalid")) {
            softAccert.assertEquals(loginPage.loginError.getText(), Util.getExpectLoginError());
        } else {
            softAccert.assertEquals(mainPage.mainPageInfo.getText(), Util.getExpectInMainPage());
        }
    }

}