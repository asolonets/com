package com.Promytheus.test;

import com.Promytheus.modules.Modules;
import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.pages.RegistrationPage;
import com.Promytheus.pages.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = Util.BASE_URL;
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
    }

    @Test
    @Parameters({"firstName", "middleName", "lastName", "signUpAddress", "city", "email", "phone", "state", "postCode", "password"})
    public void registrationTestCase(String firstName, String middleName, String lastName, String signUpAddress,
                                     String city, String email, String phone, String state, String postCode, String password) throws InterruptedException {
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, RegistrationPage.class);
        LoginPage.registerNow.click();
        RegistrationPage.firstName.sendKeys(firstName);
        RegistrationPage.middleName.sendKeys(middleName);
        RegistrationPage.lastName.sendKeys(lastName);
        RegistrationPage.signUpAddress.sendKeys(signUpAddress);
        RegistrationPage.city.sendKeys(city);
        RegistrationPage.email.sendKeys(email);
        RegistrationPage.phone.sendKeys(phone);
        RegistrationPage.state.sendKeys(state);
        RegistrationPage.postCode.sendKeys(postCode);
        RegistrationPage.password.sendKeys(password);
        RegistrationPage.passwordRetype.sendKeys(password);
        RegistrationPage.policyCheckBox.click();
        RegistrationPage.createAccountBtn.click();

    }

    @AfterMethod
    public void tearDown() throws Exception {
        //driver.quit();
    }
}