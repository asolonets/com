package com.Promytheus;

public class Modules {
	public static void login(String username, String password){
		LoginPage.login.clear();
		LoginPage.login.sendKeys(username);
		LoginPage.password.clear();
		LoginPage.password.sendKeys(password);
		LoginPage.btnLogin.click();
	}
	public static void signOut(){
		MainPage.userBtn.click();
		MainPage.signOutBtn.click();
	}
}
