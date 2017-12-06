package com.Promytheus.test;

import com.Promytheus.modules.Modules;
import com.Promytheus.pages.MainPage;
import com.Promytheus.pages.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NewTalentCreation {

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
    @Parameters({"talentFirstName", "talentMiddleName", "talentLastName", "talentSex", "talentDateOfBirth", "talentAddress", "talentCity", "talentEmail", "talentPhone", "talentState", "talentPostCode"})
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
        Modules modules = new Modules();
        modules.login(Util.USER_NAME, Util.PASSWD);
        assertTrue(modules.isLoginSucsessful());
        MainPage.createNewTalentBtn.click();
        Thread.sleep(3000);
        MainPage.categoryChouse.click();
        MainPage.categoryChouseEngineering.click();
        MainPage.nextBtnCategory.click();
        MainPage.firstName.sendKeys(firstName);
        MainPage.middleName.sendKeys(middleName);
        MainPage.lastName.sendKeys(lastName);
        if (sex.equals("Male"))
            MainPage.sexMaleRadioBtn.click();
        else if (sex.equals("Female"))
            MainPage.sexFemaleRadioBtn.click();
        else
            MainPage.sexOtherRadioBtn.click();
        MainPage.dateOfBirth.sendKeys(dateOfBirth);
        MainPage.placeOfBirth.sendKeys(city);
        MainPage.adressL1.sendKeys(signUpAddress);
        MainPage.city.sendKeys(city);
        MainPage.state.sendKeys(state);
        MainPage.postCode.sendKeys(postCode);
        MainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        //Randomly check traits
        for (int i = 1; i <= 20; i++) {
            String Xpath;
            Xpath = MainPage.traitStart + i + MainPage.traitFinish + Modules.randGeneration() + MainPage.traitFinishLastSimbol;
            driver.findElement(By.xpath(Xpath)).click();
        }
        MainPage.nextBtnCategory.click();
        Thread.sleep(2000);
        //Check personal traits
        for (int i = 1; i <= 20; i += 2) {
            String Xpath;
            Xpath = MainPage.personalityTraitStart + i + MainPage.personalityTraitFinish;
            driver.findElement(By.xpath(Xpath)).click();
        }
        MainPage.nextBtnCategory.click();
        Select sel = new Select(MainPage.interestLevelStoryPageSelectElement);
        sel.selectByIndex(2);

        MainPage.nextBtnCategory.click();
        MainPage.nextBtnCategory.click();
        MainPage.nextBtnCategory.click();
        MainPage.nextBtnCategory.click();
        MainPage.nextBtnCategory.click();
        MainPage.nextBtnCategory.click();

        //System.out.print(MainPage.talentCreatedFirstRowName.getText()+"**************************************");
        String fullName = firstName + " " + middleName + " " + lastName;
        assertEquals(MainPage.talentCreatedFirstRowName.getText(), fullName);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}