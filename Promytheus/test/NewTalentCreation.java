package com.Promytheus.test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Promytheus.modules.Modules;
import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.pages.Util;

public class NewTalentCreation {

	private WebDriver driver;
	private String baseUrl;

	@DataProvider(name = "LoginCredentials")
	public Object[][] testData() throws Exception {

		Object[][] data = new Object[4][2];

		// 1st row
		data[0][0] = Util.USER_NAME;
		data[0][1] = Util.PASSWD;
		// 2nd row
		data[1][0] = "invalid";
		data[1][1] = Util.PASSWD;
		// 3rd row
		data[2][0] = Util.USER_NAME;
		data[2][1] = "invalid";
		// 4th row
		data[3][0] = "invalid";
		data[3][1] = "invalid";
		return data;
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = Util.BASE_URL;
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
	}
	@Test
	public void newTalentCreation() throws InterruptedException {
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, MainPage.class);
		// SoftAssert softAccert = new SoftAssert();
		Modules.login(Util.USER_NAME, Util.PASSWD);
		System.out.println(Modules.isLoginSucsessful());
		System.out.println(Util.EXPECT_IN_MAIN_PAGE);
		assertTrue(Modules.isLoginSucsessful().equals(Util.EXPECT_IN_MAIN_PAGE));
		MainPage.createNewTalentBtn.click();
		Thread.sleep(2000);
		MainPage.categoryChouse.click();
		MainPage.categoryChouseEngineering.click();
		MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		// Thread.sleep(2000);
		// MainPage.talentTraits1.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits2.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits3.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits4.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits5.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits6.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits7.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits8.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits9.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits10.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits11.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits12.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits13.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits14.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits15.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits16.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits17.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.talentTraits18.sendKeys(Integer.toHexString(Modules.randGeneration()));
		// MainPage.nextBtnCategory.click();
		// MainPage.personTraits1.click();
		// MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		// MainPage.nextBtnCategory.click();
		//
	}

	@AfterMethod
	public void tearDown() throws Exception {
		// driver.quit();
	}
}