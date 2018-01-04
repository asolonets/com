package com.Promytheus.modules;

import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.testdata.Util;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Modules {
    WebDriver driver;

    public Modules(WebDriver driver) {
        this.driver = driver;
    }
    public static int getFakeEmail() {
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        if (x < 10)
            return x;
        else return x - 1;
    }

    public boolean isLoginSucsessful() {
        MainPage mainPage = new MainPage(driver);
        return mainPage.mainPageInfo.getText().equals(Util.getExpectInMainPage());
    }

    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login.clear();
        loginPage.login.sendKeys(username);
        loginPage.password.clear();
        loginPage.password.sendKeys(password);
        loginPage.btnLogin.click();
    }
	public static int randGeneration(){
		Random rand = new Random();
		int x = rand.nextInt(10)+1;
		if(x<10)
			return x;
		else return x-1;
	}

    public void signOut() {
        MainPage mainPage = new MainPage(driver);
        mainPage.userBtn.click();
        mainPage.signOutBtn.click();

    }

}
