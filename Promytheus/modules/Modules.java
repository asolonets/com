package com.Promytheus.modules;

import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.pages.Util;

import java.util.Random;

public class Modules {
    public static int getFakeEmail() {
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;
        if (x < 10)
            return x;
        else return x - 1;

    }

    public static boolean isLoginSucsessful() {

        return MainPage.mainPageInfo.getText().equals(Util.EXPECT_IN_MAIN_PAGE);

    }

    public void login(String username, String password) {
        LoginPage.login.clear();
		LoginPage.login.sendKeys(username);
		LoginPage.password.clear();
		LoginPage.password.sendKeys(password);
		LoginPage.btnLogin.click();
	}
	public static int randGeneration(){
		Random rand = new Random();
		int x = rand.nextInt(10)+1;
		if(x<10)
			return x;
		else return x-1;
				
	}

    public void signOut() {
        MainPage.userBtn.click();
        MainPage.signOutBtn.click();

    }

}
