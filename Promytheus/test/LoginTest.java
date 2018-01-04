package com.Promytheus.test;

import com.Promytheus.modules.Modules;
import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.testdata.Util;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

//    private WebDriver driver;
//    private String baseUrl;
//
//    @DataProvider(name = "LoginCredentials")
//    public Object[][] testData() throws Exception {
//
//        Object[][] data = new Object[4][2];
//
//        // 1st row
//        data[0][0] = Util.getUserName();
//        data[0][1] = Util.getPASSWD();
//        // 2nd row
//        data[1][0] = "invalid";
//        data[1][1] = Util.getPASSWD();
//        // 3rd row
//        data[2][0] = Util.getUserName();
//        data[2][1] = "invalid";
//        // 4th row
//        data[3][0] = "invalid";
//        data[3][1] = "invalid";
//        return data;
//    }
//
//    @DataProvider(name = "loginTestData")
//    public Object[][] loginTestData() throws Exception {
//        ExcelUtility.setExcelFile(Util.getTestDataFilePath(), "LoginTests");
//        Object[][] testData = ExcelUtility.getTestData("loginTestData");
//        return testData;
//    }

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = Util.getBaseUrl();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Util.getWaitTime(), TimeUnit.SECONDS);
    }

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

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}