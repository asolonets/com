package com.Promytheus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {

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
	public void LoginTestCase_new() throws InterruptedException {
		PageFactory.initElements(driver, LoginPage.class);
		PageFactory.initElements(driver, MainPage.class);
		SoftAssert softAccert = new SoftAssert();
		Modules.login(Util.USER_NAME, Util.PASSWD);
		softAccert.assertEquals(Util.EXPECT_IN_MAIN_PAGE, MainPage.mainPageInfo.getText());
		Modules.signOut();
		Modules.login(Util.USER_NAME, "0000000");
		softAccert.assertEquals(Util.EXPECT_LOGIN_ERROR, LoginPage.loginError.getText());
		Modules.login("0000000", Util.PASSWD);
		softAccert.assertEquals(Util.EXPECT_LOGIN_ERROR, LoginPage.loginError.getText());
		Modules.login("0000000", "0000000");
		softAccert.assertEquals(Util.EXPECT_LOGIN_ERROR, LoginPage.loginError.getText());
		}
		
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}