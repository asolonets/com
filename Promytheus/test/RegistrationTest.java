package com.Promytheus.test;

import com.Promytheus.modules.Modules;
import com.Promytheus.modules.datadriven.ExcelUtility;
import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.pages.MyProfilePage;
import com.Promytheus.pages.RegistrationPage;
import com.Promytheus.testdata.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    private WebDriver driver;
    private String baseUrl;

    @DataProvider(name = "RegistrationTestData")
    public Object[][] loginTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.TEST_DATA_FILE_PATH, "RegistrationTest");
        Object[][] testData = ExcelUtility.getTestData("RegistrationTestData");
        return testData;
    }

    @DataProvider(name = "RegistrationCheckTest")
    public Object[][] registrationCheckTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.TEST_DATA_FILE_PATH, "RegistrationCheckTest");
        Object[][] testData = ExcelUtility.getTestData("RegistrationCheckTest");
        return testData;
    }
    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = Util.BASE_URL;
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
    }

    @Test(priority = 0, dataProvider = "RegistrationTestData")
    public void registrationTestCase(String firstName,
                                     String middleName,
                                     String lastName,
                                     String signUpAddress,
                                     String city,
                                     String email,
                                     String phone,
                                     String state,
                                     String postCode,
                                     String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        Thread.sleep(2000);
        loginPage.registerNow.click();
        registrationPage.firstName.sendKeys(firstName);
        registrationPage.middleName.sendKeys(middleName);
        registrationPage.lastName.sendKeys(lastName);
        registrationPage.signUpAddress.sendKeys(signUpAddress);
        registrationPage.city.sendKeys(city);
        registrationPage.email.sendKeys(email);
        registrationPage.phone.sendKeys(phone);
        registrationPage.state.sendKeys(state);
        registrationPage.postCode.sendKeys(postCode);
        registrationPage.password.sendKeys(password);
        registrationPage.passwordRetype.sendKeys(password);
        registrationPage.policyCheckBox.click();
        registrationPage.createAccountBtn.click();

    }

    @Test(priority = 1, dataProvider = "RegistrationCheckTest")
    //@Parameters({"firstName", "middleName", "lastName", "signUpAddress", "city", "email", "phone", "state", "postCode", "password"})
    public void registrationCheckTestCase(String firstName,
                                          String middleName,
                                          String lastName,
                                          String dateOfBirth,
                                          String signUpAddress,
                                          String city,
                                          String email,
                                          String phone,
                                          String state,
                                          String postCode,
                                          String password) throws InterruptedException {
        Modules modules = new Modules();
        MainPage mainPage = new MainPage(driver);
        LoginPage login = new LoginPage(driver);
        MyProfilePage myProfilePage = new MyProfilePage(driver);
        modules.login(email, password);
        Thread.sleep(2000);
        mainPage.userBtn.click();
        Thread.sleep(2000);
        mainPage.myProfileBtn.click();
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myProfilePage.firstName.getAttribute("value"), firstName);
        softAssert.assertEquals(myProfilePage.middleName.getAttribute("value"), middleName);
        softAssert.assertEquals(myProfilePage.lastName.getAttribute("value"), lastName);
        softAssert.assertEquals(myProfilePage.address.getAttribute("value"), signUpAddress);
        softAssert.assertEquals(myProfilePage.city.getAttribute("value"), city);
        softAssert.assertEquals(myProfilePage.email.getAttribute("value"), email);
        softAssert.assertEquals(myProfilePage.phone.getAttribute("value"), phone);
        softAssert.assertEquals(myProfilePage.state.getAttribute("value"), state);
        softAssert.assertEquals(myProfilePage.postCode.getAttribute("value"), postCode);
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}