package com.Promytheus.test;

import com.Promytheus.modules.Modules;
import com.Promytheus.modules.datadriven.ExcelUtility;
import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.testdata.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NewTalentCreation {

    private WebDriver driver;
    private String baseUrl;

    @DataProvider(name = "NewTalentTestData")
    public Object[][] newTalentTestData() throws Exception {
        ExcelUtility.setExcelFile(Util.getTestDataFilePath(), "NewTalentTest");
        Object[][] testData = ExcelUtility.getTestData("NewTalentTestData");
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

    @Test(dataProvider = "NewTalentTestData")
    public void newTalentCreation(String firstName,
                                  String middleName,
                                  String lastName,
                                  String sex,
                                  String dateOfBirth,
                                  String signUpAddress,
                                  String city,
                                  String email,
                                  String phone,
                                  String state,
                                  String postCode) throws InterruptedException {
        // Modules.login(Util.USER_NAME, Util.PASSWD);
        Modules modules = new Modules(driver);
        LoginPage login = new LoginPage(driver);
        modules.login(Util.getUserName(), Util.getPASSWD());
        MainPage mainPage = new MainPage(driver);
        assertTrue(modules.isLoginSucsessful());

        mainPage.createNewTalentBtn.click();
        Thread.sleep(3000);
        mainPage.categoryChouse.click();
        mainPage.categoryChouseEngineering.click();
        mainPage.nextBtnCategory.click();
        mainPage.firstName.sendKeys(firstName);
        mainPage.middleName.sendKeys(middleName);
        mainPage.lastName.sendKeys(lastName);
        if (sex.equals("Male"))
            mainPage.sexMaleRadioBtn.click();
        else if (sex.equals("Female"))
            mainPage.sexFemaleRadioBtn.click();
        else
            mainPage.sexOtherRadioBtn.click();
        mainPage.dateOfBirth.sendKeys(dateOfBirth);
        mainPage.placeOfBirth.sendKeys(city);
        mainPage.adressL1.sendKeys(signUpAddress);
        mainPage.city.sendKeys(city);
        mainPage.state.sendKeys(state);
        mainPage.postCode.sendKeys(postCode);
        mainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        //Randomly check traits
        for (int i = 1; i <= 20; i++) {
            String Xpath;
            Xpath = mainPage.traitStart + i + mainPage.traitFinish + modules.randGeneration() + mainPage.traitFinishLastSimbol;
            driver.findElement(By.xpath(Xpath)).click();
        }
        mainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        //Check personal traits
        for (int i = 1; i <= 20; i += 2) {
            String Xpath;
            Xpath = mainPage.personalityTraitStart + i + mainPage.personalityTraitFinish;
            driver.findElement(By.xpath(Xpath)).click();
        }
        mainPage.nextBtnCategory.click();
        Select sel = new Select(mainPage.interestLevelStoryPageSelectElement);
        sel.selectByIndex(2);

        mainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        mainPage.nextBtnCategory.click();
        mainPage.nextBtnCategory.click();
        mainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        mainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        mainPage.nextBtnCategory.click();
        Thread.sleep(2000);

        //System.out.print(MainPage.talentCreatedFirstRowName.getText()+"**************************************");
        String fullName = firstName + " " + middleName + " " + lastName;
        assertEquals(mainPage.talentCreatedFirstRowName.getText(), fullName);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}