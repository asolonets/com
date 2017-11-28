package com.Promytheus.modules;

import java.util.Random;

import com.Promytheus.pages.LoginPage;
import com.Promytheus.pages.MainPage;
import com.Promytheus.pages.Util;

public class Modules {
	public static void login(String username, String password){
		LoginPage.login.clear();
		LoginPage.login.sendKeys(username);
		LoginPage.password.clear();
		LoginPage.password.sendKeys(password);
		LoginPage.btnLogin.click();
	}
	public static String isLoginSucsessful() {
				
		return MainPage.mainPageInfo.getText();
		
	}
	
	public static void signOut(){
		MainPage.userBtn.click();
		MainPage.signOutBtn.click();
		//GitHub update
		MainPage.signOutBtn.click();
		
	}
	public static int randGeneration(){
		Random rand = new Random();
		int x = rand.nextInt(10)+1;
		if(x<10)
			return x;
		else return x-1;
				
	}
	
}
