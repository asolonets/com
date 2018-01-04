package com.Promytheus.test;

import com.Promytheus.modules.datadriven.ExcelUtility;
import com.Promytheus.testdata.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public String baseUrl;

    @DataProvider(name = "LoginCredentials")
    public Object[][] testData() throws Exception {

        Object[][] data = new Object[4][2];

        // 1st row
        data[0][0] = Util.getUserName();
        data[0][1] = Util.getPASSWD();
        // 2nd row
        data[1][0] = "invalid";
        data[1][1] = Util.getPASSWD();
        // 3rd row
        data[2][0] = Util.getUserName();
        data[2][1] = "invalid";
        // 4th row
        data[3][0] = "invalid";
        data[3][1] = "invalid";
        return data;
    }

    @DataProvider(name = "NewTalentTestData")
    public Object[][] newTalentTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.getTestDataFilePath(), "NewTalentTest");
        Object[][] testData = ExcelUtility.getTestData("NewTalentTestData");
        return testData;
    }

    @DataProvider(name = "RegistrationCheckTest")
    public Object[][] registrationCheckTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.getTestDataFilePath(), "RegistrationCheckTest");
        Object[][] testData = ExcelUtility.getTestData("RegistrationCheckTest");
        return testData;
    }

    @DataProvider(name = "RegistrationTestData")
    public Object[][] RegistrationTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.getTestDataFilePath(), "RegistrationTest");
        Object[][] testData = ExcelUtility.getTestData("RegistrationTestData");
        return testData;
    }

    @DataProvider(name = "loginTestData")
    public Object[][] loginTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.getTestDataFilePath(), "LoginTests");
        Object[][] testData = ExcelUtility.getTestData("loginTestData");
        return testData;
    }

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = Util.getBaseUrl();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Util.getWaitTime(), TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}